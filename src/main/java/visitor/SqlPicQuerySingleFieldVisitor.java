package visitor;

import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;
import model.SqlFields;
import org.antlr.v4.runtime.tree.ParseTree;

public class SqlPicQuerySingleFieldVisitor extends picsqlBaseVisitor<Double> {

    private final SqlFields sqlFields;

    public SqlPicQuerySingleFieldVisitor(SqlFields sqlFields) {
        this.sqlFields = sqlFields;
    }

    @Override
    public Double visitSingle_field(picsqlParser.Single_fieldContext ctx) {
        ParseTree child = ctx.getChild(0);
        Double childValue = child.accept(this);
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
        Double singleField = visitSingle_field(ctx.single_field());
        return switch (ctx.getChild(0).getText()) {
            case "sin" -> Math.sin(singleField);
            case "cos" -> Math.cos(singleField);
            case "tan" -> Math.tan(singleField);
            default -> null;
        };
    }

    @Override
    public Double visitTwo_params_function(picsqlParser.Two_params_functionContext ctx) {
        return super.visitTwo_params_function(ctx);
    }

    @Override
    public Double visitMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx) {
        return super.visitMultiple_params_function(ctx);
    }
}