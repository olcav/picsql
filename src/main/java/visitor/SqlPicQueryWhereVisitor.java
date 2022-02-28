package visitor;

import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;
import model.SqlFields;

public class SqlPicQueryWhereVisitor extends picsqlBaseVisitor<Boolean> {

    private final SqlFields sqlFields;

    public SqlPicQueryWhereVisitor(SqlFields sqlFields) {
        this.sqlFields = sqlFields;
    }

    @Override
    public Boolean visitExpression(picsqlParser.ExpressionContext ctx) {
        double value = sqlFields.getFieldValueFromName(ctx.single_field());
        SqlPicQuerySelectionVisitor sqlPicQuerySelectionVisitor = new SqlPicQuerySelectionVisitor(sqlFields);
        double field = sqlPicQuerySelectionVisitor.visitSelection(ctx.selection());

        return switch (ctx.OPERATOR_CONDITION().getText()) {
            case "=" -> field == value;
            case "!=" -> field != value;
            case "<" -> field < value;
            case ">" -> field > value;
            case "<=" -> field <= value;
            case ">=" -> field >= value;
            default -> super.visitExpression(ctx);
        };
    }

    @Override
    public Boolean visitWhere_clause(picsqlParser.Where_clauseContext ctx) {
        if (ctx.where_clause().size() == 2) {
            Boolean whereCondition = this.visitWhere_clause(ctx.where_clause(0));
            switch (ctx.OPERATOR_LOGIC().getText()) {
                case "and":
                    return whereCondition && this.visitWhere_clause(ctx.where_clause(1));
                case "or":
                    return whereCondition || this.visitWhere_clause(ctx.where_clause(1));
            }
        }else if(ctx.where_clause().size() == 1){
            return this.visitWhere_clause(ctx.where_clause(0));
        }else{
            return this.visitExpression(ctx.expression());
        }
        return super.visitWhere_clause(ctx);
    }
}