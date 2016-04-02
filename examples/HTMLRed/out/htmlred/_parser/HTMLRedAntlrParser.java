// Generated from /home/aether/Desktop/McHammerCoder/examples/HTMLRed/out/htmlred/_parser/HTMLRedAntlr.g4 by ANTLR 4.5

package htmlred._parser;
import de.monticore.antlr4.MCParser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLRedAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXTB=7;
	public static final int
		RULE_p_eof = 0, RULE_p = 1, RULE_alternatives_eof = 2, RULE_alternatives = 3, 
		RULE_b_eof = 4, RULE_b = 5, RULE_i_eof = 6, RULE_i = 7;
	public static final String[] ruleNames = {
		"p_eof", "p", "alternatives_eof", "alternatives", "b_eof", "b", "i_eof", 
		"i"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<p>'", "'</p>'", "'<b>'", "'</b>'", "'<i>'", "'</i>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TEXTB"
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
	public String getGrammarFileName() { return "HTMLRedAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	// Global actions

	// Convert functions
	  // convert function for TEXTB
	private String convertTEXTB(Token t)  {
	    return t.getText();
	}


	public HTMLRedAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class P_eofContext extends ParserRuleContext {
		public htmlred._ast.ASTP ret =  null;
		public PContext tmp;
		public TerminalNode EOF() { return getToken(HTMLRedAntlrParser.EOF, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public P_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterP_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitP_eof(this);
		}
	}

	public final P_eofContext p_eof() throws RecognitionException {
		P_eofContext _localctx = new P_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((P_eofContext)_localctx).tmp = p();
			((P_eofContext)_localctx).ret =  ((P_eofContext)_localctx).tmp.ret;
			setState(18);
			match(EOF);
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

	public static class PContext extends ParserRuleContext {
		public htmlred._ast.ASTP ret =  null;
		public AlternativesContext tmp0;
		public List<AlternativesContext> alternatives() {
			return getRuleContexts(AlternativesContext.class);
		}
		public AlternativesContext alternatives(int i) {
			return getRuleContext(AlternativesContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_p);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		htmlred._ast.ASTP _aNode = null;
		_aNode=htmlred._ast.HTMLRedNodeFactory.createASTP();
		((PContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(20);
			match(T__0);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << TEXTB))) != 0)) {
				{
				{
				setState(21);
				((PContext)_localctx).tmp0 = alternatives();
				_aNode.getAlternativess().add(_localctx.tmp0.ret);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(29);
			match(T__1);
			}
			}
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
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

	public static class Alternatives_eofContext extends ParserRuleContext {
		public htmlred._ast.ASTAlternatives ret =  null;
		public AlternativesContext tmp;
		public TerminalNode EOF() { return getToken(HTMLRedAntlrParser.EOF, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public Alternatives_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterAlternatives_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitAlternatives_eof(this);
		}
	}

	public final Alternatives_eofContext alternatives_eof() throws RecognitionException {
		Alternatives_eofContext _localctx = new Alternatives_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alternatives_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((Alternatives_eofContext)_localctx).tmp = alternatives();
			((Alternatives_eofContext)_localctx).ret =  ((Alternatives_eofContext)_localctx).tmp.ret;
			setState(33);
			match(EOF);
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

	public static class AlternativesContext extends ParserRuleContext {
		public htmlred._ast.ASTAlternatives ret =  null;
		public PContext tmp0;
		public BContext tmp1;
		public IContext tmp2;
		public Token tmp3;
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public TerminalNode TEXTB() { return getToken(HTMLRedAntlrParser.TEXTB, 0); }
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitAlternatives(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternatives);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		htmlred._ast.ASTAlternatives _aNode = null;
		_aNode=htmlred._ast.HTMLRedNodeFactory.createASTAlternatives();
		((AlternativesContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			setState(46);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((AlternativesContext)_localctx).tmp0 = p();
				_aNode.setP(_localctx.tmp0.ret);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((AlternativesContext)_localctx).tmp1 = b();
				_aNode.setB(_localctx.tmp1.ret);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((AlternativesContext)_localctx).tmp2 = i();
				_aNode.setI(_localctx.tmp2.ret);
				}
				break;
			case TEXTB:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(44);
				((AlternativesContext)_localctx).tmp3 = match(TEXTB);
				_aNode.setTEXTB(convertTEXTB(((AlternativesContext)_localctx).tmp3));
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
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

	public static class B_eofContext extends ParserRuleContext {
		public htmlred._ast.ASTB ret =  null;
		public BContext tmp;
		public TerminalNode EOF() { return getToken(HTMLRedAntlrParser.EOF, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public B_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterB_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitB_eof(this);
		}
	}

	public final B_eofContext b_eof() throws RecognitionException {
		B_eofContext _localctx = new B_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((B_eofContext)_localctx).tmp = b();
			((B_eofContext)_localctx).ret =  ((B_eofContext)_localctx).tmp.ret;
			setState(50);
			match(EOF);
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

	public static class BContext extends ParserRuleContext {
		public htmlred._ast.ASTB ret =  null;
		public Token tmp0;
		public TerminalNode TEXTB() { return getToken(HTMLRedAntlrParser.TEXTB, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_b);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		htmlred._ast.ASTB _aNode = null;
		_aNode=htmlred._ast.HTMLRedNodeFactory.createASTB();
		((BContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			match(T__2);
			}
			{
			setState(53);
			((BContext)_localctx).tmp0 = match(TEXTB);
			_aNode.setText(convertTEXTB(((BContext)_localctx).tmp0));
			}
			{
			setState(56);
			match(T__3);
			}
			}
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
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

	public static class I_eofContext extends ParserRuleContext {
		public htmlred._ast.ASTI ret =  null;
		public IContext tmp;
		public TerminalNode EOF() { return getToken(HTMLRedAntlrParser.EOF, 0); }
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public I_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterI_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitI_eof(this);
		}
	}

	public final I_eofContext i_eof() throws RecognitionException {
		I_eofContext _localctx = new I_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_i_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((I_eofContext)_localctx).tmp = i();
			((I_eofContext)_localctx).ret =  ((I_eofContext)_localctx).tmp.ret;
			setState(60);
			match(EOF);
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

	public static class IContext extends ParserRuleContext {
		public htmlred._ast.ASTI ret =  null;
		public Token tmp0;
		public TerminalNode TEXTB() { return getToken(HTMLRedAntlrParser.TEXTB, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLRedAntlrListener ) ((HTMLRedAntlrListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_i);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		htmlred._ast.ASTI _aNode = null;
		_aNode=htmlred._ast.HTMLRedNodeFactory.createASTI();
		((IContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			match(T__4);
			}
			{
			setState(63);
			((IContext)_localctx).tmp0 = match(TEXTB);
			_aNode.setText(convertTEXTB(((IContext)_localctx).tmp0));
			}
			{
			setState(66);
			match(T__5);
			}
			}
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tG\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\2B\2\22\3\2\2\2\4\26\3\2\2\2\6!\3\2\2\2\b\60\3\2"+
		"\2\2\n\62\3\2\2\2\f\66\3\2\2\2\16<\3\2\2\2\20@\3\2\2\2\22\23\5\4\3\2\23"+
		"\24\b\2\1\2\24\25\7\2\2\3\25\3\3\2\2\2\26\34\7\3\2\2\27\30\5\b\5\2\30"+
		"\31\b\3\1\2\31\33\3\2\2\2\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\4\2\2 \5\3\2\2\2!\"\5\b"+
		"\5\2\"#\b\4\1\2#$\7\2\2\3$\7\3\2\2\2%&\5\4\3\2&\'\b\5\1\2\'\61\3\2\2\2"+
		"()\5\f\7\2)*\b\5\1\2*\61\3\2\2\2+,\5\20\t\2,-\b\5\1\2-\61\3\2\2\2./\7"+
		"\t\2\2/\61\b\5\1\2\60%\3\2\2\2\60(\3\2\2\2\60+\3\2\2\2\60.\3\2\2\2\61"+
		"\t\3\2\2\2\62\63\5\f\7\2\63\64\b\6\1\2\64\65\7\2\2\3\65\13\3\2\2\2\66"+
		"\67\7\5\2\2\678\7\t\2\289\b\7\1\29:\3\2\2\2:;\7\6\2\2;\r\3\2\2\2<=\5\20"+
		"\t\2=>\b\b\1\2>?\7\2\2\3?\17\3\2\2\2@A\7\7\2\2AB\7\t\2\2BC\b\t\1\2CD\3"+
		"\2\2\2DE\7\b\2\2E\21\3\2\2\2\4\34\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}