package visitor;

import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;
import model.SqlFields;

public class SqlPicQuerySelectionVisitor extends picsqlBaseVisitor<Double> {

    private final SqlFields sqlFields;

    public SqlPicQuerySelectionVisitor(SqlFields sqlFields) {
        this.sqlFields = sqlFields;
    }

    @Override
    public Double visitSelection(picsqlParser.SelectionContext ctx) {
        if (ctx.single_field() != null) {
            return sqlFields.getFieldValueFromName(ctx.single_field());
        } else if (ctx.selection().size() == 1) {
            return this.visitSelection(ctx.selection(0));
        }
        if (ctx.selection().size() == 2) {
            picsqlParser.SelectionContext selection1 = ctx.selection(0);
            picsqlParser.SelectionContext selection2 = ctx.selection(1);
            Double sel1Val = this.visitSelection(selection1);
            Double sel2Val = this.visitSelection(selection2);
            if (ctx.STAR() != null) {
                return sel1Val * sel2Val;
            } else if (ctx.DIVIDE() != null) {
                return sel1Val / sel2Val;
            } else if (ctx.PLUS() != null) {
                return sel1Val + sel2Val;
            } else if (ctx.MODULO() != null) {
                return sel1Val % sel2Val;
            } else if (ctx.MINUS() != null) {
                return sel1Val - sel2Val;
            }
        }
        return super.visitSelection(ctx);
    }
}