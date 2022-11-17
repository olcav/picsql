// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link picsqlParser#from_pic_source}.
	 * @param ctx the parse tree
	 */
	void enterFrom_pic_source(picsqlParser.From_pic_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#from_pic_source}.
	 * @param ctx the parse tree
	 */
	void exitFrom_pic_source(picsqlParser.From_pic_sourceContext ctx);
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
	 * Enter a parse tree produced by {@link picsqlParser#col_value}.
	 * @param ctx the parse tree
	 */
	void enterCol_value(picsqlParser.Col_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#col_value}.
	 * @param ctx the parse tree
	 */
	void exitCol_value(picsqlParser.Col_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#mask_conv_vals}.
	 * @param ctx the parse tree
	 */
	void enterMask_conv_vals(picsqlParser.Mask_conv_valsContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#mask_conv_vals}.
	 * @param ctx the parse tree
	 */
	void exitMask_conv_vals(picsqlParser.Mask_conv_valsContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#mask_conv}.
	 * @param ctx the parse tree
	 */
	void enterMask_conv(picsqlParser.Mask_convContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#mask_conv}.
	 * @param ctx the parse tree
	 */
	void exitMask_conv(picsqlParser.Mask_convContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#negate_single_field}.
	 * @param ctx the parse tree
	 */
	void enterNegate_single_field(picsqlParser.Negate_single_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#negate_single_field}.
	 * @param ctx the parse tree
	 */
	void exitNegate_single_field(picsqlParser.Negate_single_fieldContext ctx);
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
	 * Enter a parse tree produced by {@link picsqlParser#zero_param_function}.
	 * @param ctx the parse tree
	 */
	void enterZero_param_function(picsqlParser.Zero_param_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#zero_param_function}.
	 * @param ctx the parse tree
	 */
	void exitZero_param_function(picsqlParser.Zero_param_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#one_params_function}.
	 * @param ctx the parse tree
	 */
	void enterOne_params_function(picsqlParser.One_params_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#one_params_function}.
	 * @param ctx the parse tree
	 */
	void exitOne_params_function(picsqlParser.One_params_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#three_params_function}.
	 * @param ctx the parse tree
	 */
	void enterThree_params_function(picsqlParser.Three_params_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#three_params_function}.
	 * @param ctx the parse tree
	 */
	void exitThree_params_function(picsqlParser.Three_params_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#multiple_params_function}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#multiple_params_function}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#flip_function}.
	 * @param ctx the parse tree
	 */
	void enterFlip_function(picsqlParser.Flip_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#flip_function}.
	 * @param ctx the parse tree
	 */
	void exitFlip_function(picsqlParser.Flip_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link picsqlParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(picsqlParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(picsqlParser.Bool_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link picsqlParser#alias_dot}.
	 * @param ctx the parse tree
	 */
	void enterAlias_dot(picsqlParser.Alias_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link picsqlParser#alias_dot}.
	 * @param ctx the parse tree
	 */
	void exitAlias_dot(picsqlParser.Alias_dotContext ctx);
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