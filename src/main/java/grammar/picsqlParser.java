// Generated from java-escape by ANTLR 4.11.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class picsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, COMMA=4, OPERATOR_LOGIC=5, STAR=6, DIVIDE=7, 
		PATH_SLASH=8, MIN=9, MAX=10, X=11, Y=12, XY=13, T=14, R=15, G=16, B=17, 
		RAND=18, RANK=19, PI=20, ABS=21, SIN=22, COS=23, TAN=24, LAG=25, LEAD=26, 
		FLIP=27, DISCR=28, BUTTER=29, MODULO=30, PLUS=31, MINUS=32, DIGITS=33, 
		DECIMAL=34, STR=35, SPECIAL_CHAR=36, STR_PATH=37, DOTS=38, LEFT_PARENTHESIS=39, 
		RIGHT_PARENTHESIS=40, LEFT_BRACKET=41, RIGHT_BRACKET=42, OPERATOR_CONDITION=43, 
		DOT=44, IN=45, WS=46;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_pic_source = 2, RULE_from_source_list = 3, 
		RULE_selectionlist = 4, RULE_selection = 5, RULE_col_value = 6, RULE_mask_conv_vals = 7, 
		RULE_mask_conv = 8, RULE_negate_single_field = 9, RULE_single_field = 10, 
		RULE_alias_value = 11, RULE_zero_param_function = 12, RULE_one_params_function = 13, 
		RULE_three_params_function = 14, RULE_multiple_params_function = 15, RULE_flip_function = 16, 
		RULE_discr_function = 17, RULE_butter_function = 18, RULE_bool_expression = 19, 
		RULE_begin_path = 20, RULE_alias = 21, RULE_alias_dot = 22, RULE_path_part = 23, 
		RULE_path = 24, RULE_pic_path = 25, RULE_subquery = 26, RULE_where_clause = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_pic_source", "from_source_list", "selectionlist", 
			"selection", "col_value", "mask_conv_vals", "mask_conv", "negate_single_field", 
			"single_field", "alias_value", "zero_param_function", "one_params_function", 
			"three_params_function", "multiple_params_function", "flip_function", 
			"discr_function", "butter_function", "bool_expression", "begin_path", 
			"alias", "alias_dot", "path_part", "path", "pic_path", "subquery", "where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'where'", "','", null, "'*'", "'/'", "'\\'", 
			"'min'", "'max'", "'x'", "'y'", "'xy'", "'t'", "'r'", "'g'", "'b'", "'rand()'", 
			"'rank()'", "'pi()'", "'abs'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", 
			"'flip'", "'discr'", "'butter'", "'%'", "'+'", "'-'", null, null, null, 
			null, null, "':'", "'('", "')'", "'['", "']'", null, "'.'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "COMMA", "OPERATOR_LOGIC", "STAR", "DIVIDE", 
			"PATH_SLASH", "MIN", "MAX", "X", "Y", "XY", "T", "R", "G", "B", "RAND", 
			"RANK", "PI", "ABS", "SIN", "COS", "TAN", "LAG", "LEAD", "FLIP", "DISCR", 
			"BUTTER", "MODULO", "PLUS", "MINUS", "DIGITS", "DECIMAL", "STR", "SPECIAL_CHAR", 
			"STR_PATH", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "OPERATOR_CONDITION", "DOT", "IN", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
			setState(56);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(58);
			match(SELECT);
			setState(59);
			selectionlist();
			setState(60);
			match(FROM);
			setState(61);
			from_source_list();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				from_source_list();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(69);
				match(WHERE);
				setState(70);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(73);
			match(LEFT_PARENTHESIS);
			setState(74);
			match(DIGITS);
			setState(75);
			match(COMMA);
			setState(76);
			match(DIGITS);
			setState(77);
			match(COMMA);
			setState(78);
			match(DIGITS);
			setState(79);
			match(COMMA);
			setState(80);
			match(DIGITS);
			setState(81);
			match(COMMA);
			setState(82);
			match(DIGITS);
			setState(83);
			match(RIGHT_PARENTHESIS);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(87);
				pic_path();
				}
				break;
			case 2:
				{
				setState(88);
				from_pic_source();
				}
				break;
			case 3:
				{
				setState(89);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(92);
			selection(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				selection(0);
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(106);
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
			case FLIP:
			case DISCR:
			case BUTTER:
			case MINUS:
			case DIGITS:
			case DECIMAL:
			case STR:
			case LEFT_BRACKET:
				{
				setState(101);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(102);
				match(LEFT_PARENTHESIS);
				setState(103);
				selection(0);
				setState(104);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742016L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(118);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R:
			case G:
			case B:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(119);
					alias_dot();
					}
				}

				setState(122);
				alias_value();
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(X);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(Y);
				}
				break;
			case T:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(139);
			match(COMMA);
			setState(140);
			selection(0);
			setState(141);
			match(COMMA);
			setState(142);
			selection(0);
			setState(143);
			match(COMMA);
			setState(144);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(146);
			match(LEFT_BRACKET);
			setState(147);
			mask_conv_vals();
			setState(148);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(150);
			match(MINUS);
			setState(151);
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

	@SuppressWarnings("CheckReturnValue")
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
		public Flip_functionContext flip_function() {
			return getRuleContext(Flip_functionContext.class,0);
		}
		public Discr_functionContext discr_function() {
			return getRuleContext(Discr_functionContext.class,0);
		}
		public Butter_functionContext butter_function() {
			return getRuleContext(Butter_functionContext.class,0);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				negate_single_field();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(DIGITS);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(DECIMAL);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
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
				setState(157);
				col_value();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				mask_conv();
				}
				break;
			case RAND:
			case RANK:
			case PI:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				zero_param_function();
				}
				break;
			case SIN:
			case COS:
			case TAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				one_params_function();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				three_params_function();
				}
				break;
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				multiple_params_function();
				}
				break;
			case FLIP:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				flip_function();
				}
				break;
			case DISCR:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				discr_function();
				}
				break;
			case BUTTER:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				butter_function();
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(168);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(170);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(172);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			match(LEFT_PARENTHESIS);
			setState(174);
			selection(0);
			setState(175);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==LAG || _la==LEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(LEFT_PARENTHESIS);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(179);
				alias_dot();
				}
			}

			setState(182);
			alias_value();
			setState(183);
			match(COMMA);
			setState(184);
			selection(0);
			setState(185);
			match(COMMA);
			setState(186);
			selection(0);
			setState(187);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			match(LEFT_PARENTHESIS);
			setState(191);
			selection(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				selection(0);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Flip_functionContext extends ParserRuleContext {
		public TerminalNode FLIP() { return getToken(picsqlParser.FLIP, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(picsqlParser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode X() { return getToken(picsqlParser.X, 0); }
		public TerminalNode Y() { return getToken(picsqlParser.Y, 0); }
		public TerminalNode XY() { return getToken(picsqlParser.XY, 0); }
		public Flip_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flip_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterFlip_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitFlip_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitFlip_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flip_functionContext flip_function() throws RecognitionException {
		Flip_functionContext _localctx = new Flip_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flip_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FLIP);
			setState(202);
			match(LEFT_PARENTHESIS);
			setState(203);
			selection(0);
			setState(204);
			match(COMMA);
			setState(205);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Discr_functionContext extends ParserRuleContext {
		public TerminalNode DISCR() { return getToken(picsqlParser.DISCR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(picsqlParser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public Discr_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discr_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterDiscr_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitDiscr_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitDiscr_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Discr_functionContext discr_function() throws RecognitionException {
		Discr_functionContext _localctx = new Discr_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_discr_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DISCR);
			setState(209);
			match(LEFT_PARENTHESIS);
			setState(210);
			selection(0);
			setState(211);
			match(COMMA);
			setState(212);
			selection(0);
			setState(213);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Butter_functionContext extends ParserRuleContext {
		public TerminalNode BUTTER() { return getToken(picsqlParser.BUTTER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public Butter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_butter_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterButter_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitButter_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitButter_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Butter_functionContext butter_function() throws RecognitionException {
		Butter_functionContext _localctx = new Butter_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_butter_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(BUTTER);
			setState(216);
			match(LEFT_PARENTHESIS);
			setState(217);
			alias_value();
			setState(218);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 38, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			selection(0);
			setState(221);
			match(OPERATOR_CONDITION);
			setState(222);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 40, RULE_begin_path);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(DOT);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(225);
					match(DOT);
					}
				}

				setState(228);
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
				setState(229);
				match(STR);
				setState(230);
				match(DOTS);
				setState(231);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 42, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 44, RULE_alias_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(STR);
			setState(237);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 46, RULE_path_part);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(DOT);
				setState(240);
				match(DOT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(STR);
				}
				break;
			case SPECIAL_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 48, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(245);
				begin_path();
				}
				break;
			}
			setState(248);
			path_part();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==PATH_SLASH) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==PATH_SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				path_part();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(DOT);
			setState(257);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 50, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(259);
				match(LEFT_PARENTHESIS);
				setState(260);
				path();
				setState(261);
				match(COMMA);
				setState(262);
				match(DIGITS);
				setState(263);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(265);
				match(LEFT_PARENTHESIS);
				setState(266);
				path();
				setState(267);
				match(COMMA);
				setState(268);
				match(DIGITS);
				setState(269);
				match(COMMA);
				setState(270);
				match(DIGITS);
				setState(271);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				{
				setState(273);
				match(LEFT_PARENTHESIS);
				setState(274);
				path();
				setState(275);
				match(COMMA);
				setState(276);
				match(DIGITS);
				setState(277);
				match(COMMA);
				setState(278);
				match(DIGITS);
				setState(279);
				match(COMMA);
				setState(280);
				match(DIGITS);
				setState(281);
				match(COMMA);
				setState(282);
				match(DIGITS);
				setState(283);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				{
				setState(285);
				path();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(288);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 52, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LEFT_PARENTHESIS);
			setState(292);
			selectstmt();
			setState(293);
			match(RIGHT_PARENTHESIS);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(294);
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

	@SuppressWarnings("CheckReturnValue")
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(298);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(299);
				match(LEFT_PARENTHESIS);
				setState(300);
				where_clause(0);
				setState(301);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
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
					setState(305);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(306);
					match(OPERATOR_LOGIC);
					setState(307);
					where_clause(3);
					}
					} 
				}
				setState(312);
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
		case 27:
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
		"\u0004\u0001.\u013a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005\n\u0005\f\u0005v\t\u0005"+
		"\u0001\u0006\u0003\u0006y\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a7\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00c3\b\u000f\n\u000f\f\u000f\u00c6\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00e3\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00e9\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00f4\b\u0017\u0001\u0018\u0003\u0018\u00f7\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00fc\b\u0018\n\u0018\f\u0018"+
		"\u00ff\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u011f\b\u0019\u0001\u0019\u0003\u0019\u0122\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0128"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0130\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0135\b\u001b\n\u001b\f\u001b\u0138\t\u001b\u0001\u001b\u0000\u0002"+
		"\n6\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\t\u0002\u0000\u0006\u0007"+
		"\u001e\u001e\u0001\u0000\u001f \u0001\u0000\u000f\u0011\u0001\u0000\u0012"+
		"\u0014\u0001\u0000\u0016\u0018\u0001\u0000\u0019\u001a\u0001\u0000\t\n"+
		"\u0001\u0000\u000b\r\u0001\u0000\u0007\b\u0145\u00008\u0001\u0000\u0000"+
		"\u0000\u0002:\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006"+
		"Z\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000"+
		"\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000"+
		"\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000"+
		"\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00ac\u0001\u0000\u0000\u0000"+
		"\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000"+
		" \u00c9\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000\u0000\u0000$\u00d7"+
		"\u0001\u0000\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e8\u0001\u0000"+
		"\u0000\u0000*\u00ea\u0001\u0000\u0000\u0000,\u00ec\u0001\u0000\u0000\u0000"+
		".\u00f3\u0001\u0000\u0000\u00000\u00f6\u0001\u0000\u0000\u00002\u011e"+
		"\u0001\u0000\u0000\u00004\u0123\u0001\u0000\u0000\u00006\u012f\u0001\u0000"+
		"\u0000\u000089\u0003\u0002\u0001\u00009\u0001\u0001\u0000\u0000\u0000"+
		":;\u0005\u0001\u0000\u0000;<\u0003\b\u0004\u0000<=\u0005\u0002\u0000\u0000"+
		"=B\u0003\u0006\u0003\u0000>?\u0005\u0004\u0000\u0000?A\u0003\u0006\u0003"+
		"\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0003\u0000\u0000FH\u00036\u001b\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000"+
		"\u0000IJ\u0005\'\u0000\u0000JK\u0005!\u0000\u0000KL\u0005\u0004\u0000"+
		"\u0000LM\u0005!\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0005!\u0000\u0000"+
		"OP\u0005\u0004\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005\u0004\u0000\u0000"+
		"RS\u0005!\u0000\u0000SU\u0005(\u0000\u0000TV\u0003*\u0015\u0000UT\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000"+
		"\u0000W[\u00032\u0019\u0000X[\u0003\u0004\u0002\u0000Y[\u00034\u001a\u0000"+
		"ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\u0007\u0001\u0000\u0000\u0000\\a\u0003\n\u0005\u0000]^\u0005\u0004"+
		"\u0000\u0000^`\u0003\n\u0005\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\t\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0006\u0005\uffff\uffff"+
		"\u0000ek\u0003\u0014\n\u0000fg\u0005\'\u0000\u0000gh\u0003\n\u0005\u0000"+
		"hi\u0005(\u0000\u0000ik\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000"+
		"jf\u0001\u0000\u0000\u0000kt\u0001\u0000\u0000\u0000lm\n\u0002\u0000\u0000"+
		"mn\u0007\u0000\u0000\u0000ns\u0003\n\u0005\u0003op\n\u0001\u0000\u0000"+
		"pq\u0007\u0001\u0000\u0000qs\u0003\n\u0005\u0002rl\u0001\u0000\u0000\u0000"+
		"ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wy\u0003,\u0016\u0000xw\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u007f\u0003\u0016\u000b"+
		"\u0000{\u007f\u0005\u000b\u0000\u0000|\u007f\u0005\f\u0000\u0000}\u007f"+
		"\u0005\u000e\u0000\u0000~x\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\r\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0005\u0004"+
		"\u0000\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\u0004\u0000"+
		"\u0000\u0084\u0085\u0003\n\u0005\u0000\u0085\u0086\u0005\u0004\u0000\u0000"+
		"\u0086\u0087\u0003\n\u0005\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088"+
		"\u0089\u0003\n\u0005\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008b"+
		"\u0003\n\u0005\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u008d\u0003"+
		"\n\u0005\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u008f\u0003\n"+
		"\u0005\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0003\n\u0005"+
		"\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0093\u0005)\u0000\u0000"+
		"\u0093\u0094\u0003\u000e\u0007\u0000\u0094\u0095\u0005*\u0000\u0000\u0095"+
		"\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u0098"+
		"\u0003\u0014\n\u0000\u0098\u0013\u0001\u0000\u0000\u0000\u0099\u00a7\u0003"+
		"\u0012\t\u0000\u009a\u00a7\u0005!\u0000\u0000\u009b\u00a7\u0005\"\u0000"+
		"\u0000\u009c\u00a7\u0005\u0006\u0000\u0000\u009d\u00a7\u0003\f\u0006\u0000"+
		"\u009e\u00a7\u0003\u0010\b\u0000\u009f\u00a7\u0003\u0018\f\u0000\u00a0"+
		"\u00a7\u0003\u001a\r\u0000\u00a1\u00a7\u0003\u001c\u000e\u0000\u00a2\u00a7"+
		"\u0003\u001e\u000f\u0000\u00a3\u00a7\u0003 \u0010\u0000\u00a4\u00a7\u0003"+
		"\"\u0011\u0000\u00a5\u00a7\u0003$\u0012\u0000\u00a6\u0099\u0001\u0000"+
		"\u0000\u0000\u00a6\u009a\u0001\u0000\u0000\u0000\u00a6\u009b\u0001\u0000"+
		"\u0000\u0000\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000"+
		"\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0002"+
		"\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0003"+
		"\u0000\u0000\u00ab\u0019\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0004"+
		"\u0000\u0000\u00ad\u00ae\u0005\'\u0000\u0000\u00ae\u00af\u0003\n\u0005"+
		"\u0000\u00af\u00b0\u0005(\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0007\u0005\u0000\u0000\u00b2\u00b4\u0005\'\u0000\u0000\u00b3"+
		"\u00b5\u0003,\u0016\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0003\u0016\u000b\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u00b9"+
		"\u0003\n\u0005\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000\u00ba\u00bb\u0003"+
		"\n\u0005\u0000\u00bb\u00bc\u0005(\u0000\u0000\u00bc\u001d\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0007\u0006\u0000\u0000\u00be\u00bf\u0005\'\u0000"+
		"\u0000\u00bf\u00c4\u0003\n\u0005\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000"+
		"\u00c1\u00c3\u0003\n\u0005\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005(\u0000\u0000\u00c8\u001f"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001b\u0000\u0000\u00ca\u00cb"+
		"\u0005\'\u0000\u0000\u00cb\u00cc\u0003\n\u0005\u0000\u00cc\u00cd\u0005"+
		"\u0004\u0000\u0000\u00cd\u00ce\u0007\u0007\u0000\u0000\u00ce\u00cf\u0005"+
		"(\u0000\u0000\u00cf!\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u001c\u0000"+
		"\u0000\u00d1\u00d2\u0005\'\u0000\u0000\u00d2\u00d3\u0003\n\u0005\u0000"+
		"\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d5\u0003\n\u0005\u0000\u00d5"+
		"\u00d6\u0005(\u0000\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u001d\u0000\u0000\u00d8\u00d9\u0005\'\u0000\u0000\u00d9\u00da\u0003\u0016"+
		"\u000b\u0000\u00da\u00db\u0005(\u0000\u0000\u00db%\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0003\n\u0005\u0000\u00dd\u00de\u0005+\u0000\u0000\u00de"+
		"\u00df\u0003\n\u0005\u0000\u00df\'\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0005,\u0000\u0000\u00e1\u00e3\u0005,\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e9\u0007\b\u0000\u0000\u00e5\u00e6\u0005#\u0000"+
		"\u0000\u00e6\u00e7\u0005&\u0000\u0000\u00e7\u00e9\u0007\b\u0000\u0000"+
		"\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e9)\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005#\u0000\u0000\u00eb+"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005#\u0000\u0000\u00ed\u00ee\u0005"+
		",\u0000\u0000\u00ee-\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005,\u0000"+
		"\u0000\u00f0\u00f4\u0005,\u0000\u0000\u00f1\u00f4\u0005#\u0000\u0000\u00f2"+
		"\u00f4\u0005$\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4/\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f7\u0003(\u0014\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fd\u0003.\u0017\u0000\u00f9\u00fa\u0007\b\u0000"+
		"\u0000\u00fa\u00fc\u0003.\u0017\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005,\u0000\u0000\u0101"+
		"\u0102\u0003.\u0017\u0000\u01021\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\'\u0000\u0000\u0104\u0105\u00030\u0018\u0000\u0105\u0106\u0005\u0004"+
		"\u0000\u0000\u0106\u0107\u0005!\u0000\u0000\u0107\u0108\u0005(\u0000\u0000"+
		"\u0108\u011f\u0001\u0000\u0000\u0000\u0109\u010a\u0005\'\u0000\u0000\u010a"+
		"\u010b\u00030\u0018\u0000\u010b\u010c\u0005\u0004\u0000\u0000\u010c\u010d"+
		"\u0005!\u0000\u0000\u010d\u010e\u0005\u0004\u0000\u0000\u010e\u010f\u0005"+
		"!\u0000\u0000\u010f\u0110\u0005(\u0000\u0000\u0110\u011f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\'\u0000\u0000\u0112\u0113\u00030\u0018\u0000"+
		"\u0113\u0114\u0005\u0004\u0000\u0000\u0114\u0115\u0005!\u0000\u0000\u0115"+
		"\u0116\u0005\u0004\u0000\u0000\u0116\u0117\u0005!\u0000\u0000\u0117\u0118"+
		"\u0005\u0004\u0000\u0000\u0118\u0119\u0005!\u0000\u0000\u0119\u011a\u0005"+
		"\u0004\u0000\u0000\u011a\u011b\u0005!\u0000\u0000\u011b\u011c\u0005(\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011f\u00030\u0018\u0000"+
		"\u011e\u0103\u0001\u0000\u0000\u0000\u011e\u0109\u0001\u0000\u0000\u0000"+
		"\u011e\u0111\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u0003*\u0015\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"3\u0001\u0000\u0000\u0000\u0123\u0124\u0005\'\u0000\u0000\u0124\u0125"+
		"\u0003\u0002\u0001\u0000\u0125\u0127\u0005(\u0000\u0000\u0126\u0128\u0003"+
		"*\u0015\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u01285\u0001\u0000\u0000\u0000\u0129\u012a\u0006\u001b\uffff"+
		"\uffff\u0000\u012a\u0130\u0003&\u0013\u0000\u012b\u012c\u0005\'\u0000"+
		"\u0000\u012c\u012d\u00036\u001b\u0000\u012d\u012e\u0005(\u0000\u0000\u012e"+
		"\u0130\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f"+
		"\u012b\u0001\u0000\u0000\u0000\u0130\u0136\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\n\u0002\u0000\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133\u0135"+
		"\u00036\u001b\u0003\u0134\u0131\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u01377\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0017BGUZajrtx~\u00a6\u00b4\u00c4\u00e2\u00e8\u00f3\u00f6"+
		"\u00fd\u011e\u0121\u0127\u012f\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}