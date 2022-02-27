import grammar.picsqlParser;

import java.util.ArrayList;
import java.util.List;

public class SqlPicQuery {

    private ArrayList<PicPath> pics = new ArrayList<>();
    private ArrayList<picsqlParser.SelectionContext> selections = new ArrayList<>();
    private ArrayList<SqlPicQuery> subQueries = new ArrayList<>();
    private picsqlParser.Where_clauseContext where;

    public SqlPicQuery() {
        super();
    }

    public ArrayList<PicPath> getPics() {
        return pics;
    }

    public List<String> getPicPaths() {
        return  pics.stream().map(PicPath::getPicPath).toList();
    }

    public ArrayList<picsqlParser.SelectionContext> getSelections() {
        return selections;
    }

    public ArrayList<SqlPicQuery> getSubQueries() {
        return subQueries;
    }

    public void setWhere(picsqlParser.Where_clauseContext sqlPicQueryWhere) {
        this.where = sqlPicQueryWhere;
    }

    public picsqlParser.Where_clauseContext getWhere() {
        return where;
    }

    public boolean validWhere(SqlFields sqlFields) {
        if (where == null) {
            return true;
        }
        return new SqlPicQueryWhereVisitor(sqlFields).visitWhere_clause(where);
    }

    public void addPicPath(PicPath picPath) {
        this.pics.add(picPath);
    }

    public void addSubQuery(SqlPicQuery subquery) {
        this.subQueries.add(subquery);
    }

    public void addSelection(picsqlParser.SelectionContext selectionContext) {
        this.selections.add(selectionContext);
    }

    @Override
    public String toString() {
        return "SqlPicQuery{" + "pics=" + pics + ", fields=" + selections + ", subQueries=" + subQueries + ", where=" + where + '}';
    }

}
