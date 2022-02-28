package model;

import grammar.picsqlParser;
import visitor.SqlPicQueryWhereVisitor;

import java.util.ArrayList;

public class SqlPicQuery {

    private final ArrayList<PicPath> pics = new ArrayList<>();
    private final ArrayList<PicSource> picSources = new ArrayList<>();
    private final ArrayList<picsqlParser.SelectionContext> selections = new ArrayList<>();
    private final ArrayList<SqlPicQuery> subQueries = new ArrayList<>();
    private picsqlParser.Where_clauseContext where;

    public SqlPicQuery() {
        super();
    }

    public ArrayList<PicPath> getPics() {
        return pics;
    }

    public ArrayList<PicSource> getPicSources() {
        return picSources;
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

    public void addPicSource(PicSource picSource) {
        this.picSources.add(picSource);
    }

    public void addSubQuery(SqlPicQuery subquery) {
        this.subQueries.add(subquery);
    }

    public void addSelection(picsqlParser.SelectionContext selectionContext) {
        this.selections.add(selectionContext);
    }

    @Override
    public String toString() {
        return "model.SqlPicQuery{" + "pics=" + pics + ", fields=" + selections + ", subQueries=" + subQueries + ", where=" + where + '}';
    }

}
