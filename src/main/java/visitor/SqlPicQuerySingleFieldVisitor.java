package visitor;

import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;
import model.SqlFields;
import org.antlr.v4.runtime.tree.ParseTree;

import static model.SqlFields.NO_ALIAS;

public class SqlPicQuerySingleFieldVisitor extends picsqlBaseVisitor<Double> {

    private final SqlFields sqlFields;

    public SqlPicQuerySingleFieldVisitor(SqlFields sqlFields) {
        this.sqlFields = sqlFields;
    }

    @Override
    public Double visitSingle_field(picsqlParser.Single_fieldContext ctx) {
        Double childValue;
        ParseTree child = ctx.getChild(0);
        if(ctx.alias_value() == null){
            childValue = child.accept(this);
        }else{
            return sqlFields.getField(ctx.getText());
        }
        if(childValue == null){
            try {
                return Double.parseDouble(child.getText());
            } catch (Exception e) {
                return sqlFields.getField(child.getText());
            }
        }
        return childValue;
    }

    @Override
    public Double visitZero_param_function(picsqlParser.Zero_param_functionContext ctx) {
        String text = ctx.getText();
        switch (text) {
            case "rand()":
                return Math.random();
            case "pi()":
                return Math.PI;
            case "*":
                return -1d;
            default:
            try {
                return Double.parseDouble(text);
            } catch (Exception e) {
                return sqlFields.getField(text);
            }
        }
    }

    @Override
    public Double visitOne_params_function(picsqlParser.One_params_functionContext ctx) {
        SqlPicQuerySelectionVisitor sqlPicQuerySelectionVisitor = new SqlPicQuerySelectionVisitor(sqlFields);
        Double singleField = sqlPicQuerySelectionVisitor.visitSelection(ctx.selection());

        return switch (ctx.getChild(0).getText()) {
            case "sin" -> Math.sin(singleField);
            case "cos" -> Math.cos(singleField);
            case "tan" -> Math.tan(singleField);
            default -> null;
        };
    }

    @Override
    public Double visitThree_params_function(picsqlParser.Three_params_functionContext ctx) {
        SqlPicQuerySelectionVisitor sqlPicQuerySelectionVisitor = new SqlPicQuerySelectionVisitor(sqlFields);
        Double singleField1 = sqlPicQuerySelectionVisitor.visitSelection(ctx.selection(0));
        Double singleField2 = sqlPicQuerySelectionVisitor.visitSelection(ctx.selection(1));
        picsqlParser.Alias_dotContext alias_dotContext = ctx.alias_dot();
        String tableName;
        if(alias_dotContext == null) {
            tableName = NO_ALIAS;
        }else{
            tableName = alias_dotContext.STR().getText();

        }
        String field = ctx.alias_value().getText();

        final int x = sqlFields.getField("x").intValue();
        final int y = sqlFields.getField("y").intValue();

        return switch (ctx.getChild(0).getText()) {
            case "lag" -> sqlFields.getXYAtPosition(
                    tableName,
                    field,
                    x - singleField1.intValue(),
                    y - singleField2.intValue()
            );
            case "lead" ->sqlFields.getXYAtPosition(
                    tableName,
                    field,
                    x + singleField1.intValue(),
                    y + singleField2.intValue()
            );
            default -> null;
        };
    }

    @Override
    public Double visitMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx) {
        return super.visitMultiple_params_function(ctx);
    }
}