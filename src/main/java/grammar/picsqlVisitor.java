// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link picsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface picsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link picsqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(picsqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#selectstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectstmt(picsqlParser.SelectstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#from_pic_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_pic_source(picsqlParser.From_pic_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#from_source_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_source_list(picsqlParser.From_source_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#selectionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionlist(picsqlParser.SelectionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(picsqlParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#single_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_field(picsqlParser.Single_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#alias_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_value(picsqlParser.Alias_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#zero_param_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero_param_function(picsqlParser.Zero_param_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#one_params_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_params_function(picsqlParser.One_params_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#three_params_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThree_params_function(picsqlParser.Three_params_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#multiple_params_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(picsqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#begin_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_path(picsqlParser.Begin_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(picsqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#alias_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_dot(picsqlParser.Alias_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#path_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_part(picsqlParser.Path_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(picsqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#tablesample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesample(picsqlParser.TablesampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#pic_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPic_path(picsqlParser.Pic_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(picsqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link picsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(picsqlParser.Where_clauseContext ctx);
}