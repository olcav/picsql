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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, SELECT=20, FROM=21, WHERE=22, OPERATOR_LOGIC=23, STAR=24, 
		DIVIDE=25, MODULO=26, PLUS=27, MINUS=28, DIGITS=29, DECIMAL=30, STR=31, 
		DOTS=32, LEFT_PARENTHESIS=33, RIGHT_PARENTHESIS=34, OPERATOR_CONDITION=35, 
		DOT=36, WS=37;
	public static final int
		RULE_query = 0, RULE_selectstmt = 1, RULE_from_pic_source = 2, RULE_from_source_list = 3, 
		RULE_selectionlist = 4, RULE_selection = 5, RULE_single_field = 6, RULE_alias_value = 7, 
		RULE_zero_param_function = 8, RULE_one_params_function = 9, RULE_two_params_function = 10, 
		RULE_multiple_params_function = 11, RULE_expression = 12, RULE_begin_path = 13, 
		RULE_alias = 14, RULE_path_part = 15, RULE_path = 16, RULE_tablesample = 17, 
		RULE_pic_path = 18, RULE_subquery = 19, RULE_where_clause = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectstmt", "from_pic_source", "from_source_list", "selectionlist", 
			"selection", "single_field", "alias_value", "zero_param_function", "one_params_function", 
			"two_params_function", "multiple_params_function", "expression", "begin_path", 
			"alias", "path_part", "path", "tablesample", "pic_path", "subquery", 
			"where_clause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'x'", "'y'", "'r'", "'g'", "'b'", "'rand()'", "'rank()'", 
			"'pi()'", "'sin'", "'cos'", "'tan'", "'lag'", "'lead'", "'min'", "'max'", 
			"'tablesample'", "'percent'", "'pixels'", "'select'", "'from'", "'where'", 
			null, "'*'", "'/'", "'%'", "'+'", "'-'", null, null, null, "':'", "'('", 
			"')'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"OPERATOR_LOGIC", "STAR", "DIVIDE", "MODULO", "PLUS", "MINUS", "DIGITS", 
			"DECIMAL", "STR", "DOTS", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OPERATOR_CONDITION", 
			"DOT", "WS"
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
			setState(42);
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
			setState(44);
			match(SELECT);
			setState(45);
			selectionlist();
			setState(46);
			match(FROM);
			setState(47);
			from_source_list();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				match(T__0);
				setState(49);
				from_source_list();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(55);
				match(WHERE);
				setState(56);
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
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TablesampleContext tablesample() {
			return getRuleContext(TablesampleContext.class,0);
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
			setState(59);
			match(LEFT_PARENTHESIS);
			setState(60);
			match(DIGITS);
			setState(61);
			match(T__0);
			setState(62);
			match(DIGITS);
			setState(63);
			match(T__0);
			setState(64);
			match(DIGITS);
			setState(65);
			match(T__0);
			setState(66);
			match(DIGITS);
			setState(67);
			match(T__0);
			setState(68);
			match(DIGITS);
			setState(69);
			match(RIGHT_PARENTHESIS);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(70);
				alias();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(73);
				tablesample();
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(76);
				pic_path();
				}
				break;
			case 2:
				{
				setState(77);
				from_pic_source();
				}
				break;
			case 3:
				{
				setState(78);
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
			setState(81);
			selection(0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(82);
				match(T__0);
				setState(83);
				selection(0);
				}
				}
				setState(88);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case STAR:
			case DIGITS:
			case DECIMAL:
			case STR:
				{
				setState(90);
				single_field();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(91);
				match(LEFT_PARENTHESIS);
				setState(92);
				selection(0);
				setState(93);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(97);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(98);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						selection(3);
						}
						break;
					case 2:
						{
						_localctx = new SelectionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_selection);
						setState(100);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						selection(2);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Single_fieldContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public TerminalNode DECIMAL() { return getToken(picsqlParser.DECIMAL, 0); }
		public Alias_valueContext alias_value() {
			return getRuleContext(Alias_valueContext.class,0);
		}
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(picsqlParser.STAR, 0); }
		public Zero_param_functionContext zero_param_function() {
			return getRuleContext(Zero_param_functionContext.class,0);
		}
		public One_params_functionContext one_params_function() {
			return getRuleContext(One_params_functionContext.class,0);
		}
		public Two_params_functionContext two_params_function() {
			return getRuleContext(Two_params_functionContext.class,0);
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
		enterRule(_localctx, 12, RULE_single_field);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(DIGITS);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(DECIMAL);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				alias_value();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(STR);
				setState(112);
				match(DOT);
				setState(113);
				alias_value();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(STAR);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(T__2);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				zero_param_function();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				one_params_function();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				two_params_function();
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
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
		enterRule(_localctx, 14, RULE_alias_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_zero_param_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 18, RULE_one_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(LEFT_PARENTHESIS);
			setState(129);
			single_field();
			setState(130);
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

	public static class Two_params_functionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public List<Single_fieldContext> single_field() {
			return getRuleContexts(Single_fieldContext.class);
		}
		public Single_fieldContext single_field(int i) {
			return getRuleContext(Single_fieldContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public Two_params_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_two_params_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterTwo_params_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitTwo_params_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitTwo_params_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Two_params_functionContext two_params_function() throws RecognitionException {
		Two_params_functionContext _localctx = new Two_params_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_two_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(LEFT_PARENTHESIS);
			setState(134);
			single_field();
			setState(135);
			match(T__0);
			setState(136);
			single_field();
			setState(137);
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
		public List<Single_fieldContext> single_field() {
			return getRuleContexts(Single_fieldContext.class);
		}
		public Single_fieldContext single_field(int i) {
			return getRuleContext(Single_fieldContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
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
		enterRule(_localctx, 22, RULE_multiple_params_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			match(LEFT_PARENTHESIS);
			setState(141);
			single_field();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(142);
				match(T__0);
				setState(143);
				single_field();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public TerminalNode OPERATOR_CONDITION() { return getToken(picsqlParser.OPERATOR_CONDITION, 0); }
		public Single_fieldContext single_field() {
			return getRuleContext(Single_fieldContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			selection(0);
			setState(152);
			match(OPERATOR_CONDITION);
			setState(153);
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

	public static class Begin_pathContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
		public TerminalNode DOTS() { return getToken(picsqlParser.DOTS, 0); }
		public TerminalNode DIVIDE() { return getToken(picsqlParser.DIVIDE, 0); }
		public TerminalNode DOT() { return getToken(picsqlParser.DOT, 0); }
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
		enterRule(_localctx, 26, RULE_begin_path);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(STR);
				setState(156);
				match(DOTS);
				setState(157);
				match(DIVIDE);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(DOT);
				setState(159);
				match(DIVIDE);
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
		enterRule(_localctx, 28, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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

	public static class Path_partContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(picsqlParser.STR, 0); }
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
		enterRule(_localctx, 30, RULE_path_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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

	public static class PathContext extends ParserRuleContext {
		public List<Path_partContext> path_part() {
			return getRuleContexts(Path_partContext.class);
		}
		public Path_partContext path_part(int i) {
			return getRuleContext(Path_partContext.class,i);
		}
		public Begin_pathContext begin_path() {
			return getRuleContext(Begin_pathContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(picsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(picsqlParser.DOT, i);
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
		enterRule(_localctx, 32, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(166);
				begin_path();
				}
				break;
			}
			setState(169);
			path_part();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(170);
				match(DOT);
				setState(171);
				path_part();
				}
				}
				setState(176);
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

	public static class TablesampleContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(picsqlParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode DIGITS() { return getToken(picsqlParser.DIGITS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(picsqlParser.RIGHT_PARENTHESIS, 0); }
		public TablesampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).enterTablesample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof picsqlListener ) ((picsqlListener)listener).exitTablesample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof picsqlVisitor ) return ((picsqlVisitor<? extends T>)visitor).visitTablesample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesampleContext tablesample() throws RecognitionException {
		TablesampleContext _localctx = new TablesampleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tablesample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__16);
			setState(178);
			match(LEFT_PARENTHESIS);
			setState(179);
			match(DIGITS);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
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

	public static class Pic_pathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TablesampleContext tablesample() {
			return getRuleContext(TablesampleContext.class,0);
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
		enterRule(_localctx, 36, RULE_pic_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			path();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(184);
				alias();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(187);
				tablesample();
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
		public TablesampleContext tablesample() {
			return getRuleContext(TablesampleContext.class,0);
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
		enterRule(_localctx, 38, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LEFT_PARENTHESIS);
			setState(191);
			selectstmt();
			setState(192);
			match(RIGHT_PARENTHESIS);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(193);
				alias();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(196);
				tablesample();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_where_clause, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(200);
				expression();
				}
				break;
			case 2:
				{
				setState(201);
				match(LEFT_PARENTHESIS);
				setState(202);
				where_clause(0);
				setState(203);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Where_clauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_where_clause);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					match(OPERATOR_LOGIC);
					setState(209);
					where_clause(3);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\5\4M\n\4\3\5\3\5\3\5\5\5R\n\5\3"+
		"\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0093\n\r"+
		"\f\r\16\r\u0096\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a3\n\17\3\20\3\20\3\21\3\21\3\22\5\22\u00aa\n\22\3\22\3\22"+
		"\3\22\7\22\u00af\n\22\f\22\16\22\u00b2\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u00bc\n\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00c5\n\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00d0\n\26\3\26\3\26\3\26\7\26\u00d5\n\26\f\26\16\26\u00d8\13\26"+
		"\3\26\2\4\f*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\n\3\2"+
		"\32\34\3\2\35\36\3\2\6\b\3\2\t\13\3\2\f\16\3\2\17\20\3\2\21\22\3\2\24"+
		"\25\2\u00e2\2,\3\2\2\2\4.\3\2\2\2\6=\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fa"+
		"\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u008d\3\2\2\2\32\u0099\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3"+
		"\2\2\2 \u00a6\3\2\2\2\"\u00a9\3\2\2\2$\u00b3\3\2\2\2&\u00b9\3\2\2\2(\u00c0"+
		"\3\2\2\2*\u00cf\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\7\26\2\2/\60\5\n\6\2\60"+
		"\61\7\27\2\2\61\66\5\b\5\2\62\63\7\3\2\2\63\65\5\b\5\2\64\62\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\28\66\3\2\2\29:\7\30\2"+
		"\2:<\5*\26\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\7#\2\2>?\7\37\2\2?@\7\3"+
		"\2\2@A\7\37\2\2AB\7\3\2\2BC\7\37\2\2CD\7\3\2\2DE\7\37\2\2EF\7\3\2\2FG"+
		"\7\37\2\2GI\7$\2\2HJ\5\36\20\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\5$\23\2"+
		"LK\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NR\5&\24\2OR\5\6\4\2PR\5(\25\2QN\3\2\2"+
		"\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2SX\5\f\7\2TU\7\3\2\2UW\5\f\7\2VT\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\b\7\1\2\\"+
		"b\5\16\b\2]^\7#\2\2^_\5\f\7\2_`\7$\2\2`b\3\2\2\2a[\3\2\2\2a]\3\2\2\2b"+
		"k\3\2\2\2cd\f\4\2\2de\t\2\2\2ej\5\f\7\5fg\f\3\2\2gh\t\3\2\2hj\5\f\7\4"+
		"ic\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\r\3\2\2\2mk\3\2\2"+
		"\2n|\7\37\2\2o|\7 \2\2p|\5\20\t\2qr\7!\2\2rs\7&\2\2s|\5\20\t\2t|\7\32"+
		"\2\2u|\7\4\2\2v|\7\5\2\2w|\5\22\n\2x|\5\24\13\2y|\5\26\f\2z|\5\30\r\2"+
		"{n\3\2\2\2{o\3\2\2\2{p\3\2\2\2{q\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2"+
		"{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\17\3\2\2\2}~\t\4\2\2~\21\3\2"+
		"\2\2\177\u0080\t\5\2\2\u0080\23\3\2\2\2\u0081\u0082\t\6\2\2\u0082\u0083"+
		"\7#\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7$\2\2\u0085\25\3\2\2\2\u0086"+
		"\u0087\t\7\2\2\u0087\u0088\7#\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\3"+
		"\2\2\u008a\u008b\5\16\b\2\u008b\u008c\7$\2\2\u008c\27\3\2\2\2\u008d\u008e"+
		"\t\b\2\2\u008e\u008f\7#\2\2\u008f\u0094\5\16\b\2\u0090\u0091\7\3\2\2\u0091"+
		"\u0093\5\16\b\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098\31\3\2\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7%\2\2"+
		"\u009b\u009c\5\16\b\2\u009c\33\3\2\2\2\u009d\u009e\7!\2\2\u009e\u009f"+
		"\7\"\2\2\u009f\u00a3\7\33\2\2\u00a0\u00a1\7&\2\2\u00a1\u00a3\7\33\2\2"+
		"\u00a2\u009d\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5"+
		"\7!\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7!\2\2\u00a7!\3\2\2\2\u00a8\u00aa"+
		"\5\34\17\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00b0\5 \21\2\u00ac\u00ad\7&\2\2\u00ad\u00af\5 \21\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"#\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\7#\2\2"+
		"\u00b5\u00b6\7\37\2\2\u00b6\u00b7\t\t\2\2\u00b7\u00b8\7$\2\2\u00b8%\3"+
		"\2\2\2\u00b9\u00bb\5\"\22\2\u00ba\u00bc\5\36\20\2\u00bb\u00ba\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5$\23\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1"+
		"\u00c2\5\4\3\2\u00c2\u00c4\7$\2\2\u00c3\u00c5\5\36\20\2\u00c4\u00c3\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5$\23\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00ca\b\26\1\2"+
		"\u00ca\u00d0\5\32\16\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce"+
		"\7$\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0"+
		"\u00d6\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d5\5"+
		"*\26\5\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00d6\3\2\2\2\26\66;ILQXaik{\u0094"+
		"\u00a2\u00a9\u00b0\u00bb\u00be\u00c4\u00c7\u00cf\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}