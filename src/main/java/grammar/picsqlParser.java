// Generated from C:/Users/olivi/IdeaProjects/picsql/src/main/java/grammar\picsql.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class picsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, DIVIDE=7, 
		PATH_SLASH=8, MIN=9, MAX=10, X=11, Y=12, T=13, R=14, G=15, B=16, RAND=17, 
		RANK=18, PI=19, SIN=20, COS=21, TAN=22, LAG=23, LEAD=24, MODULO=25, PLUS=26, 
		MINUS=27, DIGITS=28, DECIMAL=29, STR=30, SPECIAL_CHAR=31, STR_PATH=32, 
		DOTS=33, LEFT_PARENTHESIS=34, RIGHT_PARENTHESIS=35, LEFT_BRACKET=36, RIGHT_BRACKET=37, 
		OPERATOR_CONDITION=38, DOT=39, IN=40, WS=41;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_pic_source = 2, RULE_from_source_list = 3, 
		RULE_selectionlist = 4, RULE_selection = 5, RULE_col_value = 6, RULE_mask_conv_vals = 7, 
		RULE_mask_conv = 8, RULE_negate_single_field = 9, RULE_single_field = 10, 
		RULE_alias_value = 11, RULE_zero_param_function = 12, RULE_one_params_function = 13, 
		RULE_three_params_function = 14, RULE_multiple_params_function = 15, RULE_bool_expression = 16, 
		RULE_begin_path = 17, RULE_alias = 18, RULE_alias_dot = 19, RULE_path_part = 20, 
		RULE_path = 21, RULE_pic_path = 22, RULE_subquery = 23, RULE_where_clause = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_pic_source", "from_source_list", "selectionlist", 
			"selection", "col_value", "mask_conv_vals", "mask_conv", "negate_single_field", 
			"single_field", "alias_value", "zero_param_function", "one_params_function", 
			"three_params_function", "multiple_params_function", "bool_expression", 
			"begin_path", "alias", "alias_dot", "path_part", "path", "pic_path", 
			"subquery", "where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", "'/'", "'\\'", 
			"'min'", "'max'", "'x'", "'y'", "'t'", "'r'", "'g'", "'b'", "'rand()'", 
			"'rank()'", "'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'%'", 
			"'+'", "'-'", null, null, null, null, null, "':'", "'('", "')'", "'['", 
			"']'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"PATH_SLASH", "MIN", "MAX", "X", "Y", "T", "R", "G", "B", "RAND", "RANK", 
			"PI", "SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", 
			"DIGITS", "DECIMAL", "STR", "SPECIAL_CHAR", "STR_PATH", "DOTS", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", "OPERATOR_CONDITION", 
			"DOT", "IN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "picsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public picsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public SelectstmtContext selectstmt() {
			return getRuleContext(SelectstmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			selectstmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectstmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(picsqlParser.SELECT, 0); }
		public SelectionlistContext selectionlist() {
			return getRuleContext(SelectionlistContext.class,0);
		}
		public TerminalNode FROM() { return getToken(picsqlParser.FROM, 0); }
		public List<From_source_listContext> from_source_list() {
			return getRuleContexts(From_source_listContext.class);
		}
		public From_source_listContext from_source_list(int i) {
			return getRuleContext(From_source_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(picsqlParser.WHERE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public SelectstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelectstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelectstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelectstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectstmtContext selectstmt() throws RecognitionException {
		SelectstmtContext _localctx = new SelectstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(SELECT);
			setState(53);
			selectionlist();
			setState(54);
			match(FROM);
			setState(55);
			from_source_list();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56);
				match(COMMA);
				setState(57);
				from_source_list();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(63);
				match(WHERE);
				setState(64);
				where_clause(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_pic_sourceContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> DIGITS() { return getTokens(picsqlParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(picsqlParser.DIGITS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public From_pic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_pic_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFrom_pic_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFrom_pic_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFrom_pic_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_pic_sourceContext from_pic_source() throws RecognitionException {
		From_pic_sourceContext _localctx = new From_pic_sourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_pic_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LEFT_PARENTHESIS);
			setState(68);
			match(DIGITS);
			setState(69);
			match(COMMA);
			setState(70);
			match(DIGITS);
			setState(71);
			match(COMMA);
			setState(72);
			match(DIGITS);
			setState(73);
			match(COMMA);
			setState(74);
			match(DIGITS);
			setState(75);
			match(COMMA);
			setState(76);
			match(DIGITS);
			setState(77);
			match(RIGHT_PARENTHESIS);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(78);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_source_listContext extends ParserRuleContext {
		public Pic_pathContext pic_path() {
			return getRuleContext(Pic_pathContext.class,0);
		}
		public From_pic_sourceContext from_pic_source() {
			return getRuleContext(From_pic_sourceContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public From_source_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_source_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFrom_source_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFrom_source_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFrom_source_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_source_listContext from_source_list() throws RecognitionException {
		From_source_listContext _localctx = new From_source_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_source_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81);
				pic_path();
				}
				break;
			case 2:
				{
				setState(82);
				from_pic_source();
				}
				break;
			case 3:
				{
				setState(83);
				subquery();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionlistContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public SelectionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelectionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelectionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelectionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionlistContext selectionlist() throws RecognitionException {
		SelectionlistContext _localctx = new SelectionlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			selection(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				selection(0);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(picsqlParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(picsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(picsqlParser.MINUS, 0); }
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		return selection(0);
	}

	private SelectionContext selection(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectionContext _localctx = new SelectionContext(_ctx, _parentState);
		SelectionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_selection, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case MIN:
			case MAX:
			case X:
			case Y:
			case T:
			case R:
			case G:
			case B:
			case RAND:
			case RANK:
			case PI:
			case SIN:
			case COS:
			case TAN:
			case LAG:
			case LEAD:
			case MINUS:
			case DIGITS:
			case DECIMAL:
			case STR:
			case LEFT_BRACKET:
				{
				setState(95);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(96);
				match(LEFT_PARENTHESIS);
				setState(97);
				selection(0);
				setState(98);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(103);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(105);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Col_valueContext extends ParserRuleContext {
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public Alias_dotContext alias_dot() {
			return getRuleContext(Alias_dotContext.class,0);
		}
		public TerminalNode X() { return getToken(picsqlParser.X, 0); }
		public TerminalNode Y() { return getToken(picsqlParser.Y, 0); }
		public TerminalNode T() { return getToken(picsqlParser.T, 0); }
		public Col_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterCol_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitCol_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitCol_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Col_valueContext col_value() throws RecognitionException {
		Col_valueContext _localctx = new Col_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_col_value);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(113);
					alias_dot();
					}
				}

				setState(116);
				alias_value();
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(X);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(Y);
				}
				break;
			case T:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mask_conv_valsContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public Mask_conv_valsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mask_conv_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMask_conv_vals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMask_conv_vals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMask_conv_vals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mask_conv_valsContext mask_conv_vals() throws RecognitionException {
		Mask_conv_valsContext _localctx = new Mask_conv_valsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mask_conv_vals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			selection(0);
			setState(123);
			match(COMMA);
			setState(124);
			selection(0);
			setState(125);
			match(COMMA);
			setState(126);
			selection(0);
			setState(127);
			match(COMMA);
			setState(128);
			selection(0);
			setState(129);
			match(COMMA);
			setState(130);
			selection(0);
			setState(131);
			match(COMMA);
			setState(132);
			selection(0);
			setState(133);
			match(COMMA);
			setState(134);
			selection(0);
			setState(135);
			match(COMMA);
			setState(136);
			selection(0);
			setState(137);
			match(COMMA);
			setState(138);
			selection(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mask_convContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(picsqlParser.LEFT_BRACKET, 0); }
		public Mask_conv_valsContext mask_conv_vals() {
			return getRuleContext(Mask_conv_valsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(picsqlParser.RIGHT_BRACKET, 0); }
		public Mask_convContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mask_conv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMask_conv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMask_conv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMask_conv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mask_convContext mask_conv() throws RecognitionException {
		Mask_convContext _localctx = new Mask_convContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mask_conv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LEFT_BRACKET);
			setState(141);
			mask_conv_vals();
			setState(142);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negate_single_fieldContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(picsqlParser.MINUS, 0); }
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public Negate_single_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_single_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterNegate_single_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitNegate_single_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitNegate_single_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_single_fieldContext negate_single_field() throws RecognitionException {
		Negate_single_fieldContext _localctx = new Negate_single_fieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_negate_single_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(MINUS);
			setState(145);
			single_field();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_fieldContext extends ParserRuleContext {
		public Negate_single_fieldContext negate_single_field() {
			return getRuleContext(Negate_single_fieldContext.class,0);
		}
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public TerminalNode DECIMAL() { return getToken(picsqlParser.DECIMAL, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public Col_valueContext col_value() {
			return getRuleContext(Col_valueContext.class,0);
		}
		public Mask_convContext mask_conv() {
			return getRuleContext(Mask_convContext.class,0);
		}
		public Zero_param_functionContext zero_param_function() {
			return getRuleContext(Zero_param_functionContext.class,0);
		}
		public One_params_functionContext one_params_function() {
			return getRuleContext(One_params_functionContext.class,0);
		}
		public Three_params_functionContext three_params_function() {
			return getRuleContext(Three_params_functionContext.class,0);
		}
		public Multiple_params_functionContext multiple_params_function() {
			return getRuleContext(Multiple_params_functionContext.class,0);
		}
		public Single_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSingle_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSingle_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSingle_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_fieldContext single_field() throws RecognitionException {
		Single_fieldContext _localctx = new Single_fieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_field);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				negate_single_field();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(DIGITS);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(DECIMAL);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(STAR);
				}
				break;
			case X:
			case Y:
			case T:
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				col_value();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				mask_conv();
				}
				break;
			case RAND:
			case RANK:
			case PI:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				zero_param_function();
				}
				break;
			case SIN:
			case COS:
			case TAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				one_params_function();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				three_params_function();
				}
				break;
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				multiple_params_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_valueContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(picsqlParser.R, 0); }
		public TerminalNode G() { return getToken(picsqlParser.G, 0); }
		public TerminalNode B() { return getToken(picsqlParser.B, 0); }
		public Alias_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_valueContext alias_value() throws RecognitionException {
		Alias_valueContext _localctx = new Alias_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alias_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R) | (1L << G) | (1L << B))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zero_param_functionContext extends ParserRuleContext {
		public TerminalNode RAND() { return getToken(picsqlParser.RAND, 0); }
		public TerminalNode RANK() { return getToken(picsqlParser.RANK, 0); }
		public TerminalNode PI() { return getToken(picsqlParser.PI, 0); }
		public Zero_param_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero_param_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterZero_param_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitZero_param_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitZero_param_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zero_param_functionContext zero_param_function() throws RecognitionException {
		Zero_param_functionContext _localctx = new Zero_param_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_zero_param_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RAND) | (1L << RANK) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode SIN() { return getToken(picsqlParser.SIN, 0); }
		public TerminalNode COS() { return getToken(picsqlParser.COS, 0); }
		public TerminalNode TAN() { return getToken(picsqlParser.TAN, 0); }
		public One_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterOne_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitOne_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitOne_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_params_functionContext one_params_function() throws RecognitionException {
		One_params_functionContext _localctx = new One_params_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_one_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			match(LEFT_PARENTHESIS);
			setState(165);
			selection(0);
			setState(166);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Three_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LAG() { return getToken(picsqlParser.LAG, 0); }
		public TerminalNode LEAD() { return getToken(picsqlParser.LEAD, 0); }
		public Alias_dotContext alias_dot() {
			return getRuleContext(Alias_dotContext.class,0);
		}
		public Three_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_three_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterThree_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitThree_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitThree_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Three_params_functionContext three_params_function() throws RecognitionException {
		Three_params_functionContext _localctx = new Three_params_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_three_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==LAG || _la==LEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(LEFT_PARENTHESIS);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(170);
				alias_dot();
				}
			}

			setState(173);
			alias_value();
			setState(174);
			match(COMMA);
			setState(175);
			selection(0);
			setState(176);
			match(COMMA);
			setState(177);
			selection(0);
			setState(178);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode MIN() { return getToken(picsqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(picsqlParser.MAX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public Multiple_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterMultiple_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitMultiple_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitMultiple_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_params_functionContext multiple_params_function() throws RecognitionException {
		Multiple_params_functionContext _localctx = new Multiple_params_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiple_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			match(LEFT_PARENTHESIS);
			setState(182);
			selection(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				selection(0);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expressionContext extends ParserRuleContext {
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode OPERATOR_CONDITION() { return getToken(picsqlParser.OPERATOR_CONDITION, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			selection(0);
			setState(193);
			match(OPERATOR_CONDITION);
			setState(194);
			selection(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_pathContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
		}
		public TerminalNode PATH_SLASH() { return getToken(picsqlParser.PATH_SLASH, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOTS() { return getToken(picsqlParser.DOTS, 0); }
		public Begin_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterBegin_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitBegin_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitBegin_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_pathContext begin_path() throws RecognitionException {
		Begin_pathContext _localctx = new Begin_pathContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_begin_path);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(DOT);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(197);
					match(DOT);
					}
				}

				setState(200);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(STR);
				setState(202);
				match(DOTS);
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_dotContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public Alias_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterAlias_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitAlias_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitAlias_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_dotContext alias_dot() throws RecognitionException {
		Alias_dotContext _localctx = new Alias_dotContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alias_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(STR);
			setState(209);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_partContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
		}
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode SPECIAL_CHAR() { return getToken(picsqlParser.SPECIAL_CHAR, 0); }
		public Path_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPath_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPath_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPath_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_partContext path_part() throws RecognitionException {
		Path_partContext _localctx = new Path_partContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_path_part);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(DOT);
				setState(212);
				match(DOT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(STR);
				}
				break;
			case SPECIAL_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(SPECIAL_CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<Path_partContext> path_part() {
			return getRuleContexts(Path_partContext.class);
		}
		public Path_partContext path_part(int i) {
			return getRuleContext(Path_partContext.class,i);
		}
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public Begin_pathContext begin_path() {
			return getRuleContext(Begin_pathContext.class,0);
		}
		public List<TerminalNode> PATH_SLASH() { return getTokens(picsqlParser.PATH_SLASH); }
		public TerminalNode PATH_SLASH(int i) {
			return getToken(picsqlParser.PATH_SLASH, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(picsqlParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(picsqlParser.DIVIDE, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(217);
				begin_path();
				}
				break;
			}
			setState(220);
			path_part();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==PATH_SLASH) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				path_part();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(DOT);
			setState(229);
			path_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pic_pathContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(picsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(picsqlParser.COMMA, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(picsqlParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(picsqlParser.DIGITS, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Pic_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pic_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterPic_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitPic_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitPic_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pic_pathContext pic_path() throws RecognitionException {
		Pic_pathContext _localctx = new Pic_pathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(231);
				match(LEFT_PARENTHESIS);
				setState(232);
				path();
				setState(233);
				match(COMMA);
				setState(234);
				match(DIGITS);
				setState(235);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(237);
				match(LEFT_PARENTHESIS);
				setState(238);
				path();
				setState(239);
				match(COMMA);
				setState(240);
				match(DIGITS);
				setState(241);
				match(COMMA);
				setState(242);
				match(DIGITS);
				setState(243);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				{
				setState(245);
				match(LEFT_PARENTHESIS);
				setState(246);
				path();
				setState(247);
				match(COMMA);
				setState(248);
				match(DIGITS);
				setState(249);
				match(COMMA);
				setState(250);
				match(DIGITS);
				setState(251);
				match(COMMA);
				setState(252);
				match(DIGITS);
				setState(253);
				match(COMMA);
				setState(254);
				match(DIGITS);
				setState(255);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				setState(257);
				path();
				}
				break;
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(260);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectstmtContext selectstmt() {
			return getRuleContext(SelectstmtContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LEFT_PARENTHESIS);
			setState(264);
			selectstmt();
			setState(265);
			match(RIGHT_PARENTHESIS);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(266);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<Where_clauseContext> where_clause() {
			return getRuleContexts(Where_clauseContext.class);
		}
		public Where_clauseContext where_clause(int i) {
			return getRuleContext(Where_clauseContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode OPERATOR_LOGIC() { return getToken(picsqlParser.OPERATOR_LOGIC, 0); }
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		return where_clause(0);
	}

	private Where_clauseContext where_clause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, _parentState);
		Where_clauseContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(270);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(271);
				match(LEFT_PARENTHESIS);
				setState(272);
				where_clause(0);
				setState(273);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Where_clauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where_clause);
					setState(277);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(278);
					match(OPERATOR_LOGIC);
					setState(279);
					where_clause(3);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return selection_sempred((SelectionContext)_localctx, predIndex);
		case 24:
			return where_clause_sempred((Where_clauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selection_sempred(SelectionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean where_clause_sempred(Where_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4"+
		"\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7"+
		"\3\b\5\bu\n\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ae\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00bc\n\21\f\21"+
		"\16\21\u00bf\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00c9"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00da\n\26\3\27\5\27\u00dd\n\27\3\27\3\27\3\27\7"+
		"\27\u00e2\n\27\f\27\16\27\u00e5\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0105\n\30\3\30"+
		"\5\30\u0108\n\30\3\31\3\31\3\31\3\31\5\31\u010e\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0116\n\32\3\32\3\32\3\32\7\32\u011b\n\32\f\32\16\32"+
		"\u011e\13\32\3\32\2\4\f\62\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\2\n\4\2\b\t\33\33\3\2\34\35\3\2\20\22\3\2\23\25\3\2\26"+
		"\30\3\2\31\32\3\2\13\f\3\2\t\n\2\u012b\2\64\3\2\2\2\4\66\3\2\2\2\6E\3"+
		"\2\2\2\bV\3\2\2\2\nX\3\2\2\2\ff\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\u0092\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3"+
		"\2\2\2\34\u00a5\3\2\2\2\36\u00aa\3\2\2\2 \u00b6\3\2\2\2\"\u00c2\3\2\2"+
		"\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00d9\3\2\2\2,\u00dc"+
		"\3\2\2\2.\u0104\3\2\2\2\60\u0109\3\2\2\2\62\u0115\3\2\2\2\64\65\5\4\3"+
		"\2\65\3\3\2\2\2\66\67\7\3\2\2\678\5\n\6\289\7\4\2\29>\5\b\5\2:;\7\6\2"+
		"\2;=\5\b\5\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?C\3\2\2\2@>\3\2\2"+
		"\2AB\7\5\2\2BD\5\62\32\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7$\2\2FG\7\36"+
		"\2\2GH\7\6\2\2HI\7\36\2\2IJ\7\6\2\2JK\7\36\2\2KL\7\6\2\2LM\7\36\2\2MN"+
		"\7\6\2\2NO\7\36\2\2OQ\7%\2\2PR\5&\24\2QP\3\2\2\2QR\3\2\2\2R\7\3\2\2\2"+
		"SW\5.\30\2TW\5\6\4\2UW\5\60\31\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t\3\2"+
		"\2\2X]\5\f\7\2YZ\7\6\2\2Z\\\5\f\7\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^\13\3\2\2\2_]\3\2\2\2`a\b\7\1\2ag\5\26\f\2bc\7$\2\2cd\5\f\7\2d"+
		"e\7%\2\2eg\3\2\2\2f`\3\2\2\2fb\3\2\2\2gp\3\2\2\2hi\f\4\2\2ij\t\2\2\2j"+
		"o\5\f\7\5kl\f\3\2\2lm\t\3\2\2mo\5\f\7\4nh\3\2\2\2nk\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2su\5(\25\2ts\3\2\2\2tu\3\2\2"+
		"\2uv\3\2\2\2v{\5\30\r\2w{\7\r\2\2x{\7\16\2\2y{\7\17\2\2zt\3\2\2\2zw\3"+
		"\2\2\2zx\3\2\2\2zy\3\2\2\2{\17\3\2\2\2|}\5\f\7\2}~\7\6\2\2~\177\5\f\7"+
		"\2\177\u0080\7\6\2\2\u0080\u0081\5\f\7\2\u0081\u0082\7\6\2\2\u0082\u0083"+
		"\5\f\7\2\u0083\u0084\7\6\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7\6\2\2\u0086"+
		"\u0087\5\f\7\2\u0087\u0088\7\6\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\6"+
		"\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\6\2\2\u008c\u008d\5\f\7\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\7&\2\2\u008f\u0090\5\20\t\2\u0090\u0091\7\'\2"+
		"\2\u0091\23\3\2\2\2\u0092\u0093\7\35\2\2\u0093\u0094\5\26\f\2\u0094\25"+
		"\3\2\2\2\u0095\u00a0\5\24\13\2\u0096\u00a0\7\36\2\2\u0097\u00a0\7\37\2"+
		"\2\u0098\u00a0\7\b\2\2\u0099\u00a0\5\16\b\2\u009a\u00a0\5\22\n\2\u009b"+
		"\u00a0\5\32\16\2\u009c\u00a0\5\34\17\2\u009d\u00a0\5\36\20\2\u009e\u00a0"+
		"\5 \21\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0097\3\2\2\2\u009f"+
		"\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8\5\f\7\2"+
		"\u00a8\u00a9\7%\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\t\7\2\2\u00ab\u00ad\7"+
		"$\2\2\u00ac\u00ae\5(\25\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\5"+
		"\f\7\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\7%\2\2\u00b5"+
		"\37\3\2\2\2\u00b6\u00b7\t\b\2\2\u00b7\u00b8\7$\2\2\u00b8\u00bd\5\f\7\2"+
		"\u00b9\u00ba\7\6\2\2\u00ba\u00bc\5\f\7\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1!\3\2\2\2\u00c2\u00c3\5\f\7\2\u00c3"+
		"\u00c4\7(\2\2\u00c4\u00c5\5\f\7\2\u00c5#\3\2\2\2\u00c6\u00c8\7)\2\2\u00c7"+
		"\u00c9\7)\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cf\t\t\2\2\u00cb\u00cc\7 \2\2\u00cc\u00cd\7#\2\2\u00cd\u00cf"+
		"\t\t\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf%\3\2\2\2\u00d0"+
		"\u00d1\7 \2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\7)\2\2\u00d4"+
		")\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6\u00da\7)\2\2\u00d7\u00da\7 \2\2\u00d8"+
		"\u00da\7!\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da+\3\2\2\2\u00db\u00dd\5$\23\2\u00dc\u00db\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e3\5*\26\2\u00df\u00e0\t\t\2\2\u00e0"+
		"\u00e2\5*\26\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7)\2\2\u00e7\u00e8\5*\26\2\u00e8-\3\2\2\2\u00e9\u00ea\7$\2\2\u00ea"+
		"\u00eb\5,\27\2\u00eb\u00ec\7\6\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\7"+
		"%\2\2\u00ee\u0105\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\5,\27\2\u00f1"+
		"\u00f2\7\6\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\7"+
		"\36\2\2\u00f5\u00f6\7%\2\2\u00f6\u0105\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8"+
		"\u00f9\5,\27\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\7"+
		"\6\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\7\36\2\2\u00ff"+
		"\u0100\7\6\2\2\u0100\u0101\7\36\2\2\u0101\u0102\7%\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0105\5,\27\2\u0104\u00e9\3\2\2\2\u0104\u00ef\3\2\2\2\u0104"+
		"\u00f7\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5&"+
		"\24\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3\2\2\2\u0109\u010a"+
		"\7$\2\2\u010a\u010b\5\4\3\2\u010b\u010d\7%\2\2\u010c\u010e\5&\24\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\61\3\2\2\2\u010f\u0110\b\32\1"+
		"\2\u0110\u0116\5\"\22\2\u0111\u0112\7$\2\2\u0112\u0113\5\62\32\2\u0113"+
		"\u0114\7%\2\2\u0114\u0116\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0111\3\2"+
		"\2\2\u0116\u011c\3\2\2\2\u0117\u0118\f\4\2\2\u0118\u0119\7\7\2\2\u0119"+
		"\u011b\5\62\32\5\u011a\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\63\3\2\2\2\u011e\u011c\3\2\2\2\31>CQ"+
		"V]fnptz\u009f\u00ad\u00bd\u00c8\u00ce\u00d9\u00dc\u00e3\u0104\u0107\u010d"+
		"\u0115\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}