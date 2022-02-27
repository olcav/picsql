import grammar.picsqlBaseListener;
import grammar.picsqlParser;

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
    public void enterSelectionlist(picsqlParser.SelectionlistContext ctx) {
        super.enterSelectionlist(ctx);
        ctx.selection().forEach(s -> currentQuery.addSelection(s));
    }

    public SqlPicQuery getSqlPicQuery() {
        return mainQuery != null ? mainQuery : currentQuery;
    }
}