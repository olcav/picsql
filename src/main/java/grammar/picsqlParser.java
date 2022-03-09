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
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, PATH_SLASH=7, 
		DIVIDE=8, MIN=9, MAX=10, X=11, Y=12, R=13, G=14, B=15, RAND=16, RANK=17, 
		PI=18, SIN=19, COS=20, TAN=21, LAG=22, LEAD=23, MODULO=24, PLUS=25, MINUS=26, 
		DIGITS=27, DECIMAL=28, STR=29, SPECIAL_CHAR=30, STR_PATH=31, DOTS=32, 
		LEFT_PARENTHESIS=33, RIGHT_PARENTHESIS=34, OPERATOR_CONDITION=35, DOT=36, 
		IN=37, WS=38;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_pic_source = 2, RULE_from_source_list = 3, 
		RULE_selectionlist = 4, RULE_selection = 5, RULE_col_value = 6, RULE_single_field = 7, 
		RULE_alias_value = 8, RULE_zero_param_function = 9, RULE_one_params_function = 10, 
		RULE_three_params_function = 11, RULE_multiple_params_function = 12, RULE_bool_expression = 13, 
		RULE_begin_path = 14, RULE_alias = 15, RULE_alias_dot = 16, RULE_path_part = 17, 
		RULE_path = 18, RULE_pic_path = 19, RULE_subquery = 20, RULE_where_clause = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_pic_source", "from_source_list", "selectionlist", 
			"selection", "col_value", "single_field", "alias_value", "zero_param_function", 
			"one_params_function", "three_params_function", "multiple_params_function", 
			"bool_expression", "begin_path", "alias", "alias_dot", "path_part", "path", 
			"pic_path", "subquery", "where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", null, "'/'", 
			"'min'", "'max'", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'%'", "'+'", 
			"'-'", null, null, null, null, null, "':'", "'('", "')'", null, "'.'", 
			"'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "PATH_SLASH", 
			"DIVIDE", "MIN", "MAX", "X", "Y", "R", "G", "B", "RAND", "RANK", "PI", 
			"SIN", "COS", "TAN", "LAG", "LEAD", "MODULO", "PLUS", "MINUS", "DIGITS", 
			"DECIMAL", "STR", "SPECIAL_CHAR", "STR_PATH", "DOTS", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "OPERATOR_CONDITION", "DOT", "IN", "WS"
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
			setState(44);
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
			setState(46);
			match(SELECT);
			setState(47);
			selectionlist();
			setState(48);
			match(FROM);
			setState(49);
			from_source_list();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				from_source_list();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(57);
				match(WHERE);
				setState(58);
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
			setState(61);
			match(LEFT_PARENTHESIS);
			setState(62);
			match(DIGITS);
			setState(63);
			match(COMMA);
			setState(64);
			match(DIGITS);
			setState(65);
			match(COMMA);
			setState(66);
			match(DIGITS);
			setState(67);
			match(COMMA);
			setState(68);
			match(DIGITS);
			setState(69);
			match(COMMA);
			setState(70);
			match(DIGITS);
			setState(71);
			match(RIGHT_PARENTHESIS);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(72);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75);
				pic_path();
				}
				break;
			case 2:
				{
				setState(76);
				from_pic_source();
				}
				break;
			case 3:
				{
				setState(77);
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
			setState(80);
			selection(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				selection(0);
				}
				}
				setState(87);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case MIN:
			case MAX:
			case X:
			case Y:
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
			case DIGITS:
			case DECIMAL:
			case STR:
				{
				setState(89);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(90);
				match(LEFT_PARENTHESIS);
				setState(91);
				selection(0);
				setState(92);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(106);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(107);
					alias_dot();
					}
				}

				setState(110);
				alias_value();
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(X);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(Y);
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

	public static class Single_fieldContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public TerminalNode DECIMAL() { return getToken(picsqlParser.DECIMAL, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public Col_valueContext col_value() {
			return getRuleContext(Col_valueContext.class,0);
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
		enterRule(_localctx, 14, RULE_single_field);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(DIGITS);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(DECIMAL);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(STAR);
				}
				break;
			case X:
			case Y:
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				col_value();
				}
				break;
			case RAND:
			case RANK:
			case PI:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				zero_param_function();
				}
				break;
			case SIN:
			case COS:
			case TAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				one_params_function();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				three_params_function();
				}
				break;
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
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
		enterRule(_localctx, 16, RULE_alias_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 18, RULE_zero_param_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 20, RULE_one_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			match(LEFT_PARENTHESIS);
			setState(131);
			selection(0);
			setState(132);
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
		enterRule(_localctx, 22, RULE_three_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==LAG || _la==LEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(LEFT_PARENTHESIS);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(136);
				alias_dot();
				}
			}

			setState(139);
			alias_value();
			setState(140);
			match(COMMA);
			setState(141);
			selection(0);
			setState(142);
			match(COMMA);
			setState(143);
			selection(0);
			setState(144);
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
		enterRule(_localctx, 24, RULE_multiple_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			match(LEFT_PARENTHESIS);
			setState(148);
			selection(0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				selection(0);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
		enterRule(_localctx, 26, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			selection(0);
			setState(159);
			match(OPERATOR_CONDITION);
			setState(160);
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
		enterRule(_localctx, 28, RULE_begin_path);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(DOT);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(163);
					match(DOT);
					}
				}

				setState(166);
				match(PATH_SLASH);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(STR);
				setState(168);
				match(DOTS);
				setState(169);
				match(PATH_SLASH);
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
		enterRule(_localctx, 30, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 32, RULE_alias_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STR);
			setState(175);
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
		enterRule(_localctx, 34, RULE_path_part);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(DOT);
				setState(178);
				match(DOT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(STR);
				}
				break;
			case SPECIAL_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
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
		enterRule(_localctx, 36, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(183);
				begin_path();
				}
				break;
			}
			setState(186);
			path_part();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH_SLASH) {
				{
				{
				setState(187);
				match(PATH_SLASH);
				setState(188);
				path_part();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(DOT);
			setState(195);
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
		enterRule(_localctx, 38, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(197);
				match(LEFT_PARENTHESIS);
				setState(198);
				path();
				setState(199);
				match(COMMA);
				setState(200);
				match(DIGITS);
				setState(201);
				match(COMMA);
				setState(202);
				match(DIGITS);
				setState(203);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(205);
				match(LEFT_PARENTHESIS);
				setState(206);
				path();
				setState(207);
				match(COMMA);
				setState(208);
				match(DIGITS);
				setState(209);
				match(COMMA);
				setState(210);
				match(DIGITS);
				setState(211);
				match(COMMA);
				setState(212);
				match(DIGITS);
				setState(213);
				match(COMMA);
				setState(214);
				match(DIGITS);
				setState(215);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				{
				setState(217);
				path();
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(220);
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
		enterRule(_localctx, 40, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LEFT_PARENTHESIS);
			setState(224);
			selectstmt();
			setState(225);
			match(RIGHT_PARENTHESIS);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(226);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(230);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(231);
				match(LEFT_PARENTHESIS);
				setState(232);
				where_clause(0);
				setState(233);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
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
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					match(OPERATOR_LOGIC);
					setState(239);
					where_clause(3);
					}
					} 
				}
				setState(244);
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
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\5\5Q\n\5\3\6\3"+
		"\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\5\bo\n\b\3\b\3\b\3\b\5"+
		"\bt\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00a7\n\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00ad\n\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00b8"+
		"\n\23\3\24\5\24\u00bb\n\24\3\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3"+
		"\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00dd\n\25"+
		"\3\25\5\25\u00e0\n\25\3\26\3\26\3\26\3\26\5\26\u00e6\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\27\3\27\3\27\7\27\u00f3\n\27\f\27"+
		"\16\27\u00f6\13\27\3\27\2\4\f,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\t\5\2\b\b\n\n\32\32\3\2\33\34\3\2\17\21\3\2\22\24\3\2\25"+
		"\27\3\2\30\31\3\2\13\f\2\u0102\2.\3\2\2\2\4\60\3\2\2\2\6?\3\2\2\2\bP\3"+
		"\2\2\2\nR\3\2\2\2\f`\3\2\2\2\16s\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24"+
		"\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0088\3\2\2\2\32\u0094\3\2\2\2\34\u00a0"+
		"\3\2\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00b7\3\2\2"+
		"\2&\u00ba\3\2\2\2(\u00dc\3\2\2\2*\u00e1\3\2\2\2,\u00ed\3\2\2\2./\5\4\3"+
		"\2/\3\3\2\2\2\60\61\7\3\2\2\61\62\5\n\6\2\62\63\7\4\2\2\638\5\b\5\2\64"+
		"\65\7\6\2\2\65\67\5\b\5\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2"+
		"\2\29=\3\2\2\2:8\3\2\2\2;<\7\5\2\2<>\5,\27\2=;\3\2\2\2=>\3\2\2\2>\5\3"+
		"\2\2\2?@\7#\2\2@A\7\35\2\2AB\7\6\2\2BC\7\35\2\2CD\7\6\2\2DE\7\35\2\2E"+
		"F\7\6\2\2FG\7\35\2\2GH\7\6\2\2HI\7\35\2\2IK\7$\2\2JL\5 \21\2KJ\3\2\2\2"+
		"KL\3\2\2\2L\7\3\2\2\2MQ\5(\25\2NQ\5\6\4\2OQ\5*\26\2PM\3\2\2\2PN\3\2\2"+
		"\2PO\3\2\2\2Q\t\3\2\2\2RW\5\f\7\2ST\7\6\2\2TV\5\f\7\2US\3\2\2\2VY\3\2"+
		"\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YW\3\2\2\2Z[\b\7\1\2[a\5\20\t\2\\"+
		"]\7#\2\2]^\5\f\7\2^_\7$\2\2_a\3\2\2\2`Z\3\2\2\2`\\\3\2\2\2aj\3\2\2\2b"+
		"c\f\4\2\2cd\t\2\2\2di\5\f\7\5ef\f\3\2\2fg\t\3\2\2gi\5\f\7\4hb\3\2\2\2"+
		"he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2\2\2mo\5\"\22"+
		"\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\5\22\n\2qt\7\r\2\2rt\7\16\2\2sn\3\2"+
		"\2\2sq\3\2\2\2sr\3\2\2\2t\17\3\2\2\2u~\7\35\2\2v~\7\36\2\2w~\7\b\2\2x"+
		"~\5\16\b\2y~\5\24\13\2z~\5\26\f\2{~\5\30\r\2|~\5\32\16\2}u\3\2\2\2}v\3"+
		"\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\21"+
		"\3\2\2\2\177\u0080\t\4\2\2\u0080\23\3\2\2\2\u0081\u0082\t\5\2\2\u0082"+
		"\25\3\2\2\2\u0083\u0084\t\6\2\2\u0084\u0085\7#\2\2\u0085\u0086\5\f\7\2"+
		"\u0086\u0087\7$\2\2\u0087\27\3\2\2\2\u0088\u0089\t\7\2\2\u0089\u008b\7"+
		"#\2\2\u008a\u008c\5\"\22\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\6\2\2\u008f\u0090\5"+
		"\f\7\2\u0090\u0091\7\6\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7$\2\2\u0093"+
		"\31\3\2\2\2\u0094\u0095\t\b\2\2\u0095\u0096\7#\2\2\u0096\u009b\5\f\7\2"+
		"\u0097\u0098\7\6\2\2\u0098\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7$\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\f\7\2"+
		"\u00a1\u00a2\7%\2\2\u00a2\u00a3\5\f\7\2\u00a3\35\3\2\2\2\u00a4\u00a6\7"+
		"&\2\2\u00a5\u00a7\7&\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ad\7\t\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\7"+
		"\"\2\2\u00ab\u00ad\7\t\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad"+
		"\37\3\2\2\2\u00ae\u00af\7\37\2\2\u00af!\3\2\2\2\u00b0\u00b1\7\37\2\2\u00b1"+
		"\u00b2\7&\2\2\u00b2#\3\2\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b8\7&\2\2\u00b5"+
		"\u00b8\7\37\2\2\u00b6\u00b8\7 \2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8%\3\2\2\2\u00b9\u00bb\5\36\20\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c1\5$\23\2\u00bd"+
		"\u00be\7\t\2\2\u00be\u00c0\5$\23\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\5$\23\2\u00c6\'\3\2\2\2"+
		"\u00c7\u00c8\7#\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb"+
		"\7\35\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7$\2\2"+
		"\u00ce\u00dd\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2"+
		"\7\6\2\2\u00d2\u00d3\7\35\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\35\2\2"+
		"\u00d5\u00d6\7\6\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9"+
		"\7\35\2\2\u00d9\u00da\7$\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5&\24\2\u00dc"+
		"\u00c7\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00e0\5 \21\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		")\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\5\4\3\2\u00e3\u00e5\7$\2\2\u00e4"+
		"\u00e6\5 \21\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6+\3\2\2\2"+
		"\u00e7\u00e8\b\27\1\2\u00e8\u00ee\5\34\17\2\u00e9\u00ea\7#\2\2\u00ea\u00eb"+
		"\5,\27\2\u00eb\u00ec\7$\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7\7"+
		"\2\2\u00f1\u00f3\5,\27\5\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5-\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\318=KPW`hjns}\u008b\u009b\u00a6\u00ac\u00b7\u00ba\u00c1\u00dc\u00df\u00e5"+
		"\u00ed\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}