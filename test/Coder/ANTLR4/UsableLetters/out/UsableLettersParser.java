// Generated from UsableLetters.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UsableLettersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SingleLetter=13, Capname=14, WS=15, SingleDigit=16, 
		SingleSymbol=17, Name=18, Smt=19, MLComment=20, SLComment=21;
	public static final int
		RULE_baserules = 0, RULE_baserule = 1, RULE_series = 2, RULE_numserie = 3, 
		RULE_ruleserie = 4, RULE_singleQuotedLetter = 5, RULE_singleQuotedDigit = 6, 
		RULE_singleQuotedSymbol = 7, RULE_letterserie = 8;
	public static final String[] ruleNames = {
		"baserules", "baserule", "series", "numserie", "ruleserie", "singleQuotedLetter", 
		"singleQuotedDigit", "singleQuotedSymbol", "letterserie"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fragment'", "'token'", "'='", "'('", "')'", "'*'", "'+'", "'?'", 
		"';'", "'|'", "'''", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "SingleLetter", "Capname", "WS", "SingleDigit", "SingleSymbol", 
		"Name", "Smt", "MLComment", "SLComment"
	};
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
	public String getGrammarFileName() { return "UsableLetters.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UsableLettersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BaserulesContext extends ParserRuleContext {
		public List<BaseruleContext> baserule() {
			return getRuleContexts(BaseruleContext.class);
		}
		public BaseruleContext baserule(int i) {
			return getRuleContext(BaseruleContext.class,i);
		}
		public BaserulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baserules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterBaserules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitBaserules(this);
		}
	}

	public final BaserulesContext baserules() throws RecognitionException {
		BaserulesContext _localctx = new BaserulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_baserules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				baserule();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
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

	public static class BaseruleContext extends ParserRuleContext {
		public TerminalNode Capname() { return getToken(UsableLettersParser.Capname, 0); }
		public List<SeriesContext> series() {
			return getRuleContexts(SeriesContext.class);
		}
		public SeriesContext series(int i) {
			return getRuleContext(SeriesContext.class,i);
		}
		public BaseruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baserule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterBaserule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitBaserule(this);
		}
	}

	public final BaseruleContext baserule() throws RecognitionException {
		BaseruleContext _localctx = new BaseruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_baserule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(23);
				match(T__0);
				}
			}

			setState(26);
			match(T__1);
			setState(27);
			match(Capname);
			setState(28);
			match(T__2);
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(29);
				match(T__3);
				}
				break;
			}
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				series();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << Capname))) != 0) );
			setState(38);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(37);
				match(T__4);
				}
			}

			setState(41);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(43);
			match(T__8);
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

	public static class SeriesContext extends ParserRuleContext {
		public SingleQuotedSymbolContext singleQuotedSymbol() {
			return getRuleContext(SingleQuotedSymbolContext.class,0);
		}
		public List<SingleQuotedDigitContext> singleQuotedDigit() {
			return getRuleContexts(SingleQuotedDigitContext.class);
		}
		public SingleQuotedDigitContext singleQuotedDigit(int i) {
			return getRuleContext(SingleQuotedDigitContext.class,i);
		}
		public List<SingleQuotedLetterContext> singleQuotedLetter() {
			return getRuleContexts(SingleQuotedLetterContext.class);
		}
		public SingleQuotedLetterContext singleQuotedLetter(int i) {
			return getRuleContext(SingleQuotedLetterContext.class,i);
		}
		public List<NumserieContext> numserie() {
			return getRuleContexts(NumserieContext.class);
		}
		public NumserieContext numserie(int i) {
			return getRuleContext(NumserieContext.class,i);
		}
		public List<LetterserieContext> letterserie() {
			return getRuleContexts(LetterserieContext.class);
		}
		public LetterserieContext letterserie(int i) {
			return getRuleContext(LetterserieContext.class,i);
		}
		public List<RuleserieContext> ruleserie() {
			return getRuleContexts(RuleserieContext.class);
		}
		public RuleserieContext ruleserie(int i) {
			return getRuleContext(RuleserieContext.class,i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitSeries(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_series);
		try {
			int _alt;
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				singleQuotedSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				singleQuotedDigit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				singleQuotedLetter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				numserie();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				letterserie();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				ruleserie();
				setState(52);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(51);
					match(T__9);
					}
					break;
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(59);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(54);
							numserie();
							}
							break;
						case 2:
							{
							setState(55);
							letterserie();
							}
							break;
						case 3:
							{
							setState(56);
							ruleserie();
							}
							break;
						case 4:
							{
							setState(57);
							singleQuotedDigit();
							}
							break;
						case 5:
							{
							setState(58);
							singleQuotedLetter();
							}
							break;
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
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

	public static class NumserieContext extends ParserRuleContext {
		public List<TerminalNode> SingleDigit() { return getTokens(UsableLettersParser.SingleDigit); }
		public TerminalNode SingleDigit(int i) {
			return getToken(UsableLettersParser.SingleDigit, i);
		}
		public NumserieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numserie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterNumserie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitNumserie(this);
		}
	}

	public final NumserieContext numserie() throws RecognitionException {
		NumserieContext _localctx = new NumserieContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numserie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(66);
				match(T__9);
				}
			}

			setState(70);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(69);
				match(T__3);
				}
			}

			setState(72);
			match(T__10);
			setState(73);
			match(SingleDigit);
			setState(74);
			match(T__10);
			setState(75);
			match(T__11);
			setState(76);
			match(T__10);
			setState(77);
			match(SingleDigit);
			setState(78);
			match(T__10);
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(79);
				match(T__4);
				}
				break;
			}
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class RuleserieContext extends ParserRuleContext {
		public TerminalNode Capname() { return getToken(UsableLettersParser.Capname, 0); }
		public RuleserieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleserie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterRuleserie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitRuleserie(this);
		}
	}

	public final RuleserieContext ruleserie() throws RecognitionException {
		RuleserieContext _localctx = new RuleserieContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleserie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(85);
				match(T__9);
				}
			}

			setState(89);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(88);
				match(T__3);
				}
			}

			setState(91);
			match(Capname);
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(92);
				match(T__4);
				}
				break;
			}
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(95);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class SingleQuotedLetterContext extends ParserRuleContext {
		public TerminalNode SingleLetter() { return getToken(UsableLettersParser.SingleLetter, 0); }
		public SingleQuotedLetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuotedLetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterSingleQuotedLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitSingleQuotedLetter(this);
		}
	}

	public final SingleQuotedLetterContext singleQuotedLetter() throws RecognitionException {
		SingleQuotedLetterContext _localctx = new SingleQuotedLetterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleQuotedLetter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(98);
				match(T__9);
				}
			}

			setState(101);
			match(T__10);
			setState(102);
			match(SingleLetter);
			setState(103);
			match(T__10);
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

	public static class SingleQuotedDigitContext extends ParserRuleContext {
		public TerminalNode SingleDigit() { return getToken(UsableLettersParser.SingleDigit, 0); }
		public SingleQuotedDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuotedDigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterSingleQuotedDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitSingleQuotedDigit(this);
		}
	}

	public final SingleQuotedDigitContext singleQuotedDigit() throws RecognitionException {
		SingleQuotedDigitContext _localctx = new SingleQuotedDigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleQuotedDigit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(105);
				match(T__9);
				}
			}

			setState(108);
			match(T__10);
			setState(109);
			match(SingleDigit);
			setState(110);
			match(T__10);
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

	public static class SingleQuotedSymbolContext extends ParserRuleContext {
		public TerminalNode SingleSymbol() { return getToken(UsableLettersParser.SingleSymbol, 0); }
		public SingleQuotedSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuotedSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterSingleQuotedSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitSingleQuotedSymbol(this);
		}
	}

	public final SingleQuotedSymbolContext singleQuotedSymbol() throws RecognitionException {
		SingleQuotedSymbolContext _localctx = new SingleQuotedSymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleQuotedSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(112);
				match(T__9);
				}
			}

			setState(115);
			match(T__10);
			setState(116);
			match(SingleSymbol);
			setState(117);
			match(T__10);
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

	public static class LetterserieContext extends ParserRuleContext {
		public List<TerminalNode> SingleLetter() { return getTokens(UsableLettersParser.SingleLetter); }
		public TerminalNode SingleLetter(int i) {
			return getToken(UsableLettersParser.SingleLetter, i);
		}
		public LetterserieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letterserie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).enterLetterserie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UsableLettersListener ) ((UsableLettersListener)listener).exitLetterserie(this);
		}
	}

	public final LetterserieContext letterserie() throws RecognitionException {
		LetterserieContext _localctx = new LetterserieContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_letterserie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(119);
				match(T__9);
				}
			}

			setState(123);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(122);
				match(T__3);
				}
			}

			setState(125);
			match(T__10);
			setState(126);
			match(SingleLetter);
			setState(127);
			match(T__10);
			setState(128);
			match(T__11);
			setState(129);
			match(T__10);
			setState(130);
			match(SingleLetter);
			setState(131);
			match(T__10);
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(132);
				match(T__4);
				}
				break;
			}
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(135);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
		"\2\26\n\2\r\2\16\2\27\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\6\3"+
		"$\n\3\r\3\16\3%\3\3\5\3)\n\3\3\3\5\3,\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\5\4C\n"+
		"\4\3\5\5\5F\n\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5"+
		"\3\5\5\5V\n\5\3\6\5\6Y\n\6\3\6\5\6\\\n\6\3\6\3\6\5\6`\n\6\3\6\5\6c\n\6"+
		"\3\7\5\7f\n\7\3\7\3\7\3\7\3\7\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\t\5\tt\n"+
		"\t\3\t\3\t\3\t\3\t\3\n\5\n{\n\n\3\n\5\n~\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0088\n\n\3\n\5\n\u008b\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\3\3\2\b\n\u00a3\2\25\3\2\2\2\4\32\3\2\2\2\6B\3\2\2\2\bE\3\2\2\2\nX"+
		"\3\2\2\2\fe\3\2\2\2\16l\3\2\2\2\20s\3\2\2\2\22z\3\2\2\2\24\26\5\4\3\2"+
		"\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2"+
		"\31\33\7\3\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\4\2\2"+
		"\35\36\7\20\2\2\36 \7\5\2\2\37!\7\6\2\2 \37\3\2\2\2 !\3\2\2\2!#\3\2\2"+
		"\2\"$\5\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\7"+
		"\7\2\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\t\2\2\2+*\3\2\2\2+,\3\2\2\2,-"+
		"\3\2\2\2-.\7\13\2\2.\5\3\2\2\2/C\5\20\t\2\60C\5\16\b\2\61C\5\f\7\2\62"+
		"C\5\b\5\2\63C\5\22\n\2\64\66\5\n\6\2\65\67\7\f\2\2\66\65\3\2\2\2\66\67"+
		"\3\2\2\2\67?\3\2\2\28>\5\b\5\29>\5\22\n\2:>\5\n\6\2;>\5\16\b\2<>\5\f\7"+
		"\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B/\3\2\2\2B\60\3\2\2\2B\61\3\2\2\2B\62"+
		"\3\2\2\2B\63\3\2\2\2B\64\3\2\2\2C\7\3\2\2\2DF\7\f\2\2ED\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GI\7\6\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\r\2\2KL\7\22"+
		"\2\2LM\7\r\2\2MN\7\16\2\2NO\7\r\2\2OP\7\22\2\2PR\7\r\2\2QS\7\7\2\2RQ\3"+
		"\2\2\2RS\3\2\2\2SU\3\2\2\2TV\t\2\2\2UT\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WY"+
		"\7\f\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\6\2\2[Z\3\2\2\2[\\\3\2\2\2"+
		"\\]\3\2\2\2]_\7\20\2\2^`\7\7\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\t\2\2"+
		"\2ba\3\2\2\2bc\3\2\2\2c\13\3\2\2\2df\7\f\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2"+
		"\2\2gh\7\r\2\2hi\7\17\2\2ij\7\r\2\2j\r\3\2\2\2km\7\f\2\2lk\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2no\7\r\2\2op\7\22\2\2pq\7\r\2\2q\17\3\2\2\2rt\7\f\2\2"+
		"sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\r\2\2vw\7\23\2\2wx\7\r\2\2x\21\3\2"+
		"\2\2y{\7\f\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\7\6\2\2}|\3\2\2\2}~\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\17\2\2\u0081\u0082\7"+
		"\r\2\2\u0082\u0083\7\16\2\2\u0083\u0084\7\r\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0087\7\r\2\2\u0086\u0088\7\7\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\23\3\2\2\2\33\27\32 %(+\66=?BEHRUX[_belsz}\u0087"+
		"\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}