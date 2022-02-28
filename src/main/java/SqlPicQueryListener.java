import grammar.picsqlBaseListener;
import grammar.picsqlParser;
import model.PicPath;
import model.PicSource;
import model.SqlPicQuery;

import java.awt.*;

public class SqlPicQueryListener extends picsqlBaseListener {

    private SqlPicQuery currentQuery;
    private SqlPicQuery mainQuery;

    @Override
    public void enterSelectstmt(picsqlParser.SelectstmtContext ctx) {
        super.enterSelectstmt(ctx);
        if(currentQuery == null){
            currentQuery = new SqlPicQuery();
            mainQuery = currentQuery;
        } else {
            SqlPicQuery subquery = new SqlPicQuery();
            currentQuery.addSubQuery(subquery);
            mainQuery = currentQuery;
            currentQuery = subquery;
        }
    }

    @Override
    public void exitSelectstmt(picsqlParser.SelectstmtContext ctx) {
        super.exitSelectstmt(ctx);
        currentQuery.setWhere(ctx.where_clause());
        currentQuery = mainQuery;
    }

    @Override
    public void enterPic_path(picsqlParser.Pic_pathContext ctx) {
        super.enterPic_path(ctx);
        currentQuery.addPicPath(
                new PicPath(
                        ctx.path().getText(),
                        ctx.alias() != null ? ctx.alias().getText() : null
                )
        );
    }

    @Override
    public void exitFrom_pic_source(picsqlParser.From_pic_sourceContext ctx) {
        super.exitFrom_pic_source(ctx);
        currentQuery.addPicSource(
            new PicSource(
                    Integer.parseInt(ctx.DIGITS(0).getText()),
                    Integer.parseInt(ctx.DIGITS(1).getText()),
                    new Color(
                            Integer.parseInt(ctx.DIGITS(2).getText()),
                            Integer.parseInt(ctx.DIGITS(3).getText()),
                            Integer.parseInt(ctx.DIGITS(4).getText())
                    ),
                    ctx.alias() == null ? null : ctx.alias().getText()
            )
        );
    }

    @Override
    public void enterSelectionlist(picsqlParser.SelectionlistContext ctx) {
        super.enterSelectionlist(ctx);
        ctx.selection().forEach(s -> currentQuery.addSelection(s));
    }

    @Override
    public void enterFrom_pic_source(picsqlParser.From_pic_sourceContext ctx) {
        super.enterFrom_pic_source(ctx);
    }

    public SqlPicQuery getSqlPicQuery() {
        return mainQuery != null ? mainQuery : currentQuery;
    }
}