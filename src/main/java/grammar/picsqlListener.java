// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link picsqlParser}.
 */
public interface picsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link picsqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(picsqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(picsqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#selectstmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectstmt(picsqlParser.SelectstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#selectstmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectstmt(picsqlParser.SelectstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#from_source_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_source_list(picsqlParser.From_source_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#from_source_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_source_list(picsqlParser.From_source_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#selectionlist}.
	 * @param ctx the parse tree
	 */
	void enterSelectionlist(picsqlParser.SelectionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#selectionlist}.
	 * @param ctx the parse tree
	 */
	void exitSelectionlist(picsqlParser.SelectionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(picsqlParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(picsqlParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#single_field}.
	 * @param ctx the parse tree
	 */
	void enterSingle_field(picsqlParser.Single_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#single_field}.
	 * @param ctx the parse tree
	 */
	void exitSingle_field(picsqlParser.Single_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#alias_value}.
	 * @param ctx the parse tree
	 */
	void enterAlias_value(picsqlParser.Alias_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#alias_value}.
	 * @param ctx the parse tree
	 */
	void exitAlias_value(picsqlParser.Alias_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#unary_function}.
	 * @param ctx the parse tree
	 */
	void enterUnary_function(picsqlParser.Unary_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#unary_function}.
	 * @param ctx the parse tree
	 */
	void exitUnary_function(picsqlParser.Unary_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(picsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(picsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#begin_path}.
	 * @param ctx the parse tree
	 */
	void enterBegin_path(picsqlParser.Begin_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#begin_path}.
	 * @param ctx the parse tree
	 */
	void exitBegin_path(picsqlParser.Begin_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(picsqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(picsqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#path_part}.
	 * @param ctx the parse tree
	 */
	void enterPath_part(picsqlParser.Path_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#path_part}.
	 * @param ctx the parse tree
	 */
	void exitPath_part(picsqlParser.Path_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(picsqlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(picsqlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#pic_path}.
	 * @param ctx the parse tree
	 */
	void enterPic_path(picsqlParser.Pic_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#pic_path}.
	 * @param ctx the parse tree
	 */
	void exitPic_path(picsqlParser.Pic_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(picsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(picsqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(picsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(picsqlParser.Where_clauseContext ctx);
}