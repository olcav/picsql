import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;

import java.util.Objects;

public class SqlPicQuerySelectionVisitor extends picsqlBaseVisitor<Double> {

    private final SqlFields sqlFields;

    public SqlPicQuerySelectionVisitor(SqlFields sqlFields) {
        this.sqlFields = sqlFields;
    }

    @Override
    public Double visitSelection(picsqlParser.SelectionContext ctx) {
        if (ctx.single_field() != null) {
            String singleFieldValue = ctx.single_field().getText();
            if(Objects.equals(singleFieldValue, "rand()")){
                return Math.random();
            }
            if(Objects.equals(singleFieldValue, "*")){
                return -1d;
            }
            try {
                return Double.parseDouble(singleFieldValue);
            } catch (Exception e) {
                return sqlFields.getField(singleFieldValue);
            }
        } else if(ctx.selection().size() == 1){
            return this.visitSelection(ctx.selection(0));
        } if(ctx.selection().size() == 2){
            picsqlParser.SelectionContext selection1 = ctx.selection(0);
            picsqlParser.SelectionContext selection2 = ctx.selection(1);
            if(ctx.STAR() != null){
                return this.visitSelection(selection1) *
                        this.visitSelection(selection2);
            }else if(ctx.DIVIDE() != null){
                return this.visitSelection(selection1) /
                        this.visitSelection(selection2);
            }else if(ctx.PLUS() != null){
                return this.visitSelection(selection1) +
                        this.visitSelection(selection2);
            }else if(ctx.MODULO() != null){
                return this.visitSelection(selection1) %
                        this.visitSelection(selection2);
            }else if(ctx.MINUS() != null){
                return this.visitSelection(selection1) -
                        this.visitSelection(selection2);
            }
        }
        return super.visitSelection(ctx);
    }
}