// Generated from /home/aether/Desktop/JavaScriptSimple/out/javascriptsimple/_parser/JavaScriptSimple.g4 by ANTLR 4.5

package javascriptsimple._parser;
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
public class JavaScriptSimpleParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SemiColon=1, EQ=2, KO=3, Var=4, Identifier=5, StringLiteral=6, WS=7, DecimalIntegerLiteral=8;
	public static final int
		RULE_javascriptprogram_eof = 0, RULE_javascriptprogram = 1, RULE_sourceelements_eof = 2, 
		RULE_sourceelements = 3, RULE_sourceelement_eof = 4, RULE_sourceelement = 5, 
		RULE_statement_eof = 6, RULE_statement = 7, RULE_statements_eof = 8, RULE_statements = 9, 
		RULE_variablestatement_eof = 10, RULE_variablestatement = 11, RULE_variabledeclarations_eof = 12, 
		RULE_variabledeclarations = 13, RULE_variabledeclaration_eof = 14, RULE_variabledeclaration = 15, 
		RULE_initialiser_eof = 16, RULE_initialiser = 17, RULE_expressionsequence_eof = 18, 
		RULE_expressionsequence = 19, RULE_singleexpression_eof = 20, RULE_singleexpression = 21, 
		RULE_literal_eof = 22, RULE_literal = 23, RULE_numericliteral_eof = 24, 
		RULE_numericliteral = 25, RULE_eos_eof = 26, RULE_eos = 27;
	public static final String[] ruleNames = {
		"javascriptprogram_eof", "javascriptprogram", "sourceelements_eof", "sourceelements", 
		"sourceelement_eof", "sourceelement", "statement_eof", "statement", "statements_eof", 
		"statements", "variablestatement_eof", "variablestatement", "variabledeclarations_eof", 
		"variabledeclarations", "variabledeclaration_eof", "variabledeclaration", 
		"initialiser_eof", "initialiser", "expressionsequence_eof", "expressionsequence", 
		"singleexpression_eof", "singleexpression", "literal_eof", "literal", 
		"numericliteral_eof", "numericliteral", "eos_eof", "eos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SemiColon", "EQ", "KO", "Var", "Identifier", "StringLiteral", "WS", 
		"DecimalIntegerLiteral"
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
	public String getGrammarFileName() { return "JavaScriptSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	// Global actions

	// Convert functions
	  // convert function for UnicodeEscapeSequence
	private String convertUnicodeEscapeSequence(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for Var
	private String convertVar(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for DecimalDigit
	private String convertDecimalDigit(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for Identifier
	private String convertIdentifier(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for IdentifierStart
	private String convertIdentifierStart(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for KO
	private String convertKO(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for HexEscapeSequence
	private String convertHexEscapeSequence(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for EQ
	private String convertEQ(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for SingleEscapeCharacter
	private String convertSingleEscapeCharacter(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for SemiColon
	private String convertSemiColon(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for DecimalIntegerLiteral
	private String convertDecimalIntegerLiteral(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for StringLiteral
	private String convertStringLiteral(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for UnicodeLetter
	private String convertUnicodeLetter(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for CharacterEscapeSequence
	private String convertCharacterEscapeSequence(Token t)  {
	    return t.getText().intern();
	}

	  // convert function for EscapeCharacter
	private String convertEscapeCharacter(Token t)  {
	    return t.getText().intern();
	}


	public JavaScriptSimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Javascriptprogram_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTJavaScriptProgram ret =  null;
		public JavascriptprogramContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public JavascriptprogramContext javascriptprogram() {
			return getRuleContext(JavascriptprogramContext.class,0);
		}
		public Javascriptprogram_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascriptprogram_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterJavascriptprogram_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitJavascriptprogram_eof(this);
		}
	}

	public final Javascriptprogram_eofContext javascriptprogram_eof() throws RecognitionException {
		Javascriptprogram_eofContext _localctx = new Javascriptprogram_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javascriptprogram_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((Javascriptprogram_eofContext)_localctx).tmp = javascriptprogram();
			((Javascriptprogram_eofContext)_localctx).ret =  ((Javascriptprogram_eofContext)_localctx).tmp.ret;
			setState(58);
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

	public static class JavascriptprogramContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTJavaScriptProgram ret =  null;
		public SourceelementsContext tmp0;
		public SourceelementsContext sourceelements() {
			return getRuleContext(SourceelementsContext.class,0);
		}
		public JavascriptprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascriptprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterJavascriptprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitJavascriptprogram(this);
		}
	}

	public final JavascriptprogramContext javascriptprogram() throws RecognitionException {
		JavascriptprogramContext _localctx = new JavascriptprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javascriptprogram);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTJavaScriptProgram _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTJavaScriptProgram();
		((JavascriptprogramContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(60);
				((JavascriptprogramContext)_localctx).tmp0 = sourceelements();
				_aNode.setSourceElements(_localctx.tmp0.ret);
				}
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

	public static class Sourceelements_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSourceElements ret =  null;
		public SourceelementsContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public SourceelementsContext sourceelements() {
			return getRuleContext(SourceelementsContext.class,0);
		}
		public Sourceelements_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceelements_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSourceelements_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSourceelements_eof(this);
		}
	}

	public final Sourceelements_eofContext sourceelements_eof() throws RecognitionException {
		Sourceelements_eofContext _localctx = new Sourceelements_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceelements_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((Sourceelements_eofContext)_localctx).tmp = sourceelements();
			((Sourceelements_eofContext)_localctx).ret =  ((Sourceelements_eofContext)_localctx).tmp.ret;
			setState(67);
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

	public static class SourceelementsContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSourceElements ret =  null;
		public SourceelementContext tmp0;
		public List<SourceelementContext> sourceelement() {
			return getRuleContexts(SourceelementContext.class);
		}
		public SourceelementContext sourceelement(int i) {
			return getRuleContext(SourceelementContext.class,i);
		}
		public SourceelementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceelements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSourceelements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSourceelements(this);
		}
	}

	public final SourceelementsContext sourceelements() throws RecognitionException {
		SourceelementsContext _localctx = new SourceelementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sourceelements);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTSourceElements _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSourceElements();
		((SourceelementsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				((SourceelementsContext)_localctx).tmp0 = sourceelement();
				_aNode.getSourceElements().add(_localctx.tmp0.ret);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var );
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

	public static class Sourceelement_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSourceElement ret =  null;
		public SourceelementContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public SourceelementContext sourceelement() {
			return getRuleContext(SourceelementContext.class,0);
		}
		public Sourceelement_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceelement_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSourceelement_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSourceelement_eof(this);
		}
	}

	public final Sourceelement_eofContext sourceelement_eof() throws RecognitionException {
		Sourceelement_eofContext _localctx = new Sourceelement_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sourceelement_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((Sourceelement_eofContext)_localctx).tmp = sourceelement();
			((Sourceelement_eofContext)_localctx).ret =  ((Sourceelement_eofContext)_localctx).tmp.ret;
			setState(78);
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

	public static class SourceelementContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSourceElement ret =  null;
		public StatementContext tmp0;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSourceelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSourceelement(this);
		}
	}

	public final SourceelementContext sourceelement() throws RecognitionException {
		SourceelementContext _localctx = new SourceelementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sourceelement);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTSourceElement _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSourceElement();
		((SourceelementContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((SourceelementContext)_localctx).tmp0 = statement();
			_aNode.setStatement(_localctx.tmp0.ret);
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

	public static class Statement_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTStatement ret =  null;
		public StatementContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterStatement_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitStatement_eof(this);
		}
	}

	public final Statement_eofContext statement_eof() throws RecognitionException {
		Statement_eofContext _localctx = new Statement_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((Statement_eofContext)_localctx).tmp = statement();
			((Statement_eofContext)_localctx).ret =  ((Statement_eofContext)_localctx).tmp.ret;
			setState(85);
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

	public static class StatementContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTStatement ret =  null;
		public VariablestatementContext tmp0;
		public VariablestatementContext variablestatement() {
			return getRuleContext(VariablestatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTStatement _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTStatement();
		((StatementContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((StatementContext)_localctx).tmp0 = variablestatement();
			_aNode.setVariableStatement(_localctx.tmp0.ret);
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

	public static class Statements_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTStatements ret =  null;
		public StatementsContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Statements_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterStatements_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitStatements_eof(this);
		}
	}

	public final Statements_eofContext statements_eof() throws RecognitionException {
		Statements_eofContext _localctx = new Statements_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((Statements_eofContext)_localctx).tmp = statements();
			((Statements_eofContext)_localctx).ret =  ((Statements_eofContext)_localctx).tmp.ret;
			setState(92);
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

	public static class StatementsContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTStatements ret =  null;
		public StatementContext tmp0;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTStatements _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTStatements();
		((StatementsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				((StatementsContext)_localctx).tmp0 = statement();
				_aNode.getStatements().add(_localctx.tmp0.ret);
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var );
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

	public static class Variablestatement_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableStatement ret =  null;
		public VariablestatementContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public VariablestatementContext variablestatement() {
			return getRuleContext(VariablestatementContext.class,0);
		}
		public Variablestatement_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablestatement_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariablestatement_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariablestatement_eof(this);
		}
	}

	public final Variablestatement_eofContext variablestatement_eof() throws RecognitionException {
		Variablestatement_eofContext _localctx = new Variablestatement_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variablestatement_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((Variablestatement_eofContext)_localctx).tmp = variablestatement();
			((Variablestatement_eofContext)_localctx).ret =  ((Variablestatement_eofContext)_localctx).tmp.ret;
			setState(103);
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

	public static class VariablestatementContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableStatement ret =  null;
		public Token tmp0;
		public Token tmp1;
		public VariabledeclarationsContext tmp2;
		public EosContext tmp3;
		public VariabledeclarationsContext variabledeclarations() {
			return getRuleContext(VariabledeclarationsContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Var() { return getToken(JavaScriptSimpleParser.Var, 0); }
		public TerminalNode WS() { return getToken(JavaScriptSimpleParser.WS, 0); }
		public VariablestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariablestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariablestatement(this);
		}
	}

	public final VariablestatementContext variablestatement() throws RecognitionException {
		VariablestatementContext _localctx = new VariablestatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variablestatement);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTVariableStatement _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableStatement();
		((VariablestatementContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			((VariablestatementContext)_localctx).tmp0 = match(Var);
			_aNode.setVar(convertVar(((VariablestatementContext)_localctx).tmp0));
			}
			{
			setState(108);
			((VariablestatementContext)_localctx).tmp1 = match(WS);
			_aNode.setWS(convertWS(((VariablestatementContext)_localctx).tmp1));
			}
			setState(111);
			((VariablestatementContext)_localctx).tmp2 = variabledeclarations();
			_aNode.setVariableDeclarations(_localctx.tmp2.ret);
			setState(113);
			((VariablestatementContext)_localctx).tmp3 = eos();
			_aNode.setEOS(_localctx.tmp3.ret);
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

	public static class Variabledeclarations_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableDeclarations ret =  null;
		public VariabledeclarationsContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public VariabledeclarationsContext variabledeclarations() {
			return getRuleContext(VariabledeclarationsContext.class,0);
		}
		public Variabledeclarations_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarations_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariabledeclarations_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariabledeclarations_eof(this);
		}
	}

	public final Variabledeclarations_eofContext variabledeclarations_eof() throws RecognitionException {
		Variabledeclarations_eofContext _localctx = new Variabledeclarations_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variabledeclarations_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((Variabledeclarations_eofContext)_localctx).tmp = variabledeclarations();
			((Variabledeclarations_eofContext)_localctx).ret =  ((Variabledeclarations_eofContext)_localctx).tmp.ret;
			setState(118);
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

	public static class VariabledeclarationsContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableDeclarations ret =  null;
		public VariabledeclarationContext tmp0;
		public Token tmp1;
		public Token tmp2;
		public VariabledeclarationContext tmp3;
		public List<VariabledeclarationContext> variabledeclaration() {
			return getRuleContexts(VariabledeclarationContext.class);
		}
		public VariabledeclarationContext variabledeclaration(int i) {
			return getRuleContext(VariabledeclarationContext.class,i);
		}
		public List<TerminalNode> KO() { return getTokens(JavaScriptSimpleParser.KO); }
		public TerminalNode KO(int i) {
			return getToken(JavaScriptSimpleParser.KO, i);
		}
		public List<TerminalNode> WS() { return getTokens(JavaScriptSimpleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavaScriptSimpleParser.WS, i);
		}
		public VariabledeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariabledeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariabledeclarations(this);
		}
	}

	public final VariabledeclarationsContext variabledeclarations() throws RecognitionException {
		VariabledeclarationsContext _localctx = new VariabledeclarationsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variabledeclarations);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTVariableDeclarations _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableDeclarations();
		((VariabledeclarationsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((VariabledeclarationsContext)_localctx).tmp0 = variabledeclaration();
			_aNode.getVariableDeclaration().add(_localctx.tmp0.ret);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KO) {
				{
				{
				{
				setState(122);
				((VariabledeclarationsContext)_localctx).tmp1 = match(KO);
				if (_aNode.getKOs()==null){_aNode.setKOs(new java.util.ArrayList());};  _aNode.getKOs().add(convertKO(((VariabledeclarationsContext)_localctx).tmp1));
				}
				{
				setState(125);
				((VariabledeclarationsContext)_localctx).tmp2 = match(WS);
				if (_aNode.getWSs()==null){_aNode.setWSs(new java.util.ArrayList());};  _aNode.getWSs().add(convertWS(((VariabledeclarationsContext)_localctx).tmp2));
				}
				setState(128);
				((VariabledeclarationsContext)_localctx).tmp3 = variabledeclaration();
				_aNode.getVariableDeclaration().add(_localctx.tmp3.ret);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Variabledeclaration_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableDeclaration ret =  null;
		public VariabledeclarationContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public Variabledeclaration_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariabledeclaration_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariabledeclaration_eof(this);
		}
	}

	public final Variabledeclaration_eofContext variabledeclaration_eof() throws RecognitionException {
		Variabledeclaration_eofContext _localctx = new Variabledeclaration_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variabledeclaration_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Variabledeclaration_eofContext)_localctx).tmp = variabledeclaration();
			((Variabledeclaration_eofContext)_localctx).ret =  ((Variabledeclaration_eofContext)_localctx).tmp.ret;
			setState(138);
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTVariableDeclaration ret =  null;
		public Token tmp0;
		public InitialiserContext tmp1;
		public TerminalNode Identifier() { return getToken(JavaScriptSimpleParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitVariabledeclaration(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variabledeclaration);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTVariableDeclaration _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableDeclaration();
		((VariabledeclarationContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			((VariabledeclarationContext)_localctx).tmp0 = match(Identifier);
			_aNode.setIdentifier(convertIdentifier(((VariabledeclarationContext)_localctx).tmp0));
			}
			setState(146);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(143);
				((VariabledeclarationContext)_localctx).tmp1 = initialiser();
				_aNode.setInitialiser(_localctx.tmp1.ret);
				}
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

	public static class Initialiser_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTInitialiser ret =  null;
		public InitialiserContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public Initialiser_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterInitialiser_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitInitialiser_eof(this);
		}
	}

	public final Initialiser_eofContext initialiser_eof() throws RecognitionException {
		Initialiser_eofContext _localctx = new Initialiser_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initialiser_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Initialiser_eofContext)_localctx).tmp = initialiser();
			((Initialiser_eofContext)_localctx).ret =  ((Initialiser_eofContext)_localctx).tmp.ret;
			setState(150);
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

	public static class InitialiserContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTInitialiser ret =  null;
		public Token tmp0;
		public Token tmp1;
		public SingleexpressionContext tmp2;
		public SingleexpressionContext singleexpression() {
			return getRuleContext(SingleexpressionContext.class,0);
		}
		public TerminalNode WS() { return getToken(JavaScriptSimpleParser.WS, 0); }
		public TerminalNode EQ() { return getToken(JavaScriptSimpleParser.EQ, 0); }
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitInitialiser(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initialiser);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTInitialiser _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTInitialiser();
		((InitialiserContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			((InitialiserContext)_localctx).tmp0 = match(WS);
			_aNode.setWS(convertWS(((InitialiserContext)_localctx).tmp0));
			}
			{
			setState(155);
			((InitialiserContext)_localctx).tmp1 = match(EQ);
			_aNode.setEQ(convertEQ(((InitialiserContext)_localctx).tmp1));
			}
			setState(158);
			((InitialiserContext)_localctx).tmp2 = singleexpression();
			_aNode.setSingleExpression(_localctx.tmp2.ret);
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

	public static class Expressionsequence_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTExpressionSequence ret =  null;
		public ExpressionsequenceContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public ExpressionsequenceContext expressionsequence() {
			return getRuleContext(ExpressionsequenceContext.class,0);
		}
		public Expressionsequence_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsequence_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterExpressionsequence_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitExpressionsequence_eof(this);
		}
	}

	public final Expressionsequence_eofContext expressionsequence_eof() throws RecognitionException {
		Expressionsequence_eofContext _localctx = new Expressionsequence_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionsequence_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((Expressionsequence_eofContext)_localctx).tmp = expressionsequence();
			((Expressionsequence_eofContext)_localctx).ret =  ((Expressionsequence_eofContext)_localctx).tmp.ret;
			setState(163);
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

	public static class ExpressionsequenceContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTExpressionSequence ret =  null;
		public SingleexpressionContext tmp0;
		public Token tmp1;
		public Token tmp2;
		public SingleexpressionContext tmp3;
		public List<SingleexpressionContext> singleexpression() {
			return getRuleContexts(SingleexpressionContext.class);
		}
		public SingleexpressionContext singleexpression(int i) {
			return getRuleContext(SingleexpressionContext.class,i);
		}
		public List<TerminalNode> KO() { return getTokens(JavaScriptSimpleParser.KO); }
		public TerminalNode KO(int i) {
			return getToken(JavaScriptSimpleParser.KO, i);
		}
		public List<TerminalNode> WS() { return getTokens(JavaScriptSimpleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavaScriptSimpleParser.WS, i);
		}
		public ExpressionsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterExpressionsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitExpressionsequence(this);
		}
	}

	public final ExpressionsequenceContext expressionsequence() throws RecognitionException {
		ExpressionsequenceContext _localctx = new ExpressionsequenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionsequence);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTExpressionSequence _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTExpressionSequence();
		((ExpressionsequenceContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((ExpressionsequenceContext)_localctx).tmp0 = singleexpression();
			_aNode.getSingleExpressions().add(_localctx.tmp0.ret);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KO) {
				{
				{
				{
				setState(167);
				((ExpressionsequenceContext)_localctx).tmp1 = match(KO);
				if (_aNode.getKOs()==null){_aNode.setKOs(new java.util.ArrayList());};  _aNode.getKOs().add(convertKO(((ExpressionsequenceContext)_localctx).tmp1));
				}
				{
				setState(170);
				((ExpressionsequenceContext)_localctx).tmp2 = match(WS);
				if (_aNode.getWSs()==null){_aNode.setWSs(new java.util.ArrayList());};  _aNode.getWSs().add(convertWS(((ExpressionsequenceContext)_localctx).tmp2));
				}
				setState(173);
				((ExpressionsequenceContext)_localctx).tmp3 = singleexpression();
				_aNode.getSingleExpressions().add(_localctx.tmp3.ret);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Singleexpression_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSingleExpression ret =  null;
		public SingleexpressionContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public SingleexpressionContext singleexpression() {
			return getRuleContext(SingleexpressionContext.class,0);
		}
		public Singleexpression_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleexpression_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSingleexpression_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSingleexpression_eof(this);
		}
	}

	public final Singleexpression_eofContext singleexpression_eof() throws RecognitionException {
		Singleexpression_eofContext _localctx = new Singleexpression_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_singleexpression_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((Singleexpression_eofContext)_localctx).tmp = singleexpression();
			((Singleexpression_eofContext)_localctx).ret =  ((Singleexpression_eofContext)_localctx).tmp.ret;
			setState(183);
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

	public static class SingleexpressionContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTSingleExpression ret =  null;
		public Token tmp0;
		public LiteralContext tmp1;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode WS() { return getToken(JavaScriptSimpleParser.WS, 0); }
		public SingleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterSingleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitSingleexpression(this);
		}
	}

	public final SingleexpressionContext singleexpression() throws RecognitionException {
		SingleexpressionContext _localctx = new SingleexpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_singleexpression);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTSingleExpression _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSingleExpression();
		((SingleexpressionContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			((SingleexpressionContext)_localctx).tmp0 = match(WS);
			_aNode.setWS(convertWS(((SingleexpressionContext)_localctx).tmp0));
			}
			setState(188);
			((SingleexpressionContext)_localctx).tmp1 = literal();
			_aNode.setLiteral(_localctx.tmp1.ret);
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

	public static class Literal_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTLiteral ret =  null;
		public LiteralContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(193);
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

	public static class LiteralContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTLiteral ret =  null;
		public Token tmp0;
		public TerminalNode StringLiteral() { return getToken(JavaScriptSimpleParser.StringLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTLiteral _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTLiteral();
		((LiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			((LiteralContext)_localctx).tmp0 = match(StringLiteral);
			_aNode.setStringLiteral(convertStringLiteral(((LiteralContext)_localctx).tmp0));
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

	public static class Numericliteral_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTNumericLiteral ret =  null;
		public NumericliteralContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public NumericliteralContext numericliteral() {
			return getRuleContext(NumericliteralContext.class,0);
		}
		public Numericliteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericliteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterNumericliteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitNumericliteral_eof(this);
		}
	}

	public final Numericliteral_eofContext numericliteral_eof() throws RecognitionException {
		Numericliteral_eofContext _localctx = new Numericliteral_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numericliteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((Numericliteral_eofContext)_localctx).tmp = numericliteral();
			((Numericliteral_eofContext)_localctx).ret =  ((Numericliteral_eofContext)_localctx).tmp.ret;
			setState(200);
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

	public static class NumericliteralContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTNumericLiteral ret =  null;
		public Token tmp0;
		public TerminalNode DecimalIntegerLiteral() { return getToken(JavaScriptSimpleParser.DecimalIntegerLiteral, 0); }
		public NumericliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterNumericliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitNumericliteral(this);
		}
	}

	public final NumericliteralContext numericliteral() throws RecognitionException {
		NumericliteralContext _localctx = new NumericliteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numericliteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTNumericLiteral _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTNumericLiteral();
		((NumericliteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			((NumericliteralContext)_localctx).tmp0 = match(DecimalIntegerLiteral);
			_aNode.setDecimalIntegerLiteral(convertDecimalIntegerLiteral(((NumericliteralContext)_localctx).tmp0));
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

	public static class Eos_eofContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTEOS ret =  null;
		public EosContext tmp;
		public TerminalNode EOF() { return getToken(JavaScriptSimpleParser.EOF, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Eos_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterEos_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitEos_eof(this);
		}
	}

	public final Eos_eofContext eos_eof() throws RecognitionException {
		Eos_eofContext _localctx = new Eos_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eos_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((Eos_eofContext)_localctx).tmp = eos();
			((Eos_eofContext)_localctx).ret =  ((Eos_eofContext)_localctx).tmp.ret;
			setState(207);
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

	public static class EosContext extends ParserRuleContext {
		public javascriptsimple._ast.ASTEOS ret =  null;
		public Token tmp0;
		public TerminalNode SemiColon() { return getToken(JavaScriptSimpleParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptSimpleListener ) ((JavaScriptSimpleListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eos);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		javascriptsimple._ast.ASTEOS _aNode = null;
		_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTEOS();
		((EosContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			((EosContext)_localctx).tmp0 = match(SemiColon);
			_aNode.setSemiColon(convertSemiColon(((EosContext)_localctx).tmp0));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3B\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5K\n\5\r\5\16\5L\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\6\13d\n\13\r\13\16\13e\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00b3\n\25"+
		"\f\25\16\25\u00b6\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\u00c0\2:\3\2\2\2\4A\3\2\2"+
		"\2\6C\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16U\3\2\2\2\20Y\3\2\2\2"+
		"\22\\\3\2\2\2\24c\3\2\2\2\26g\3\2\2\2\30k\3\2\2\2\32v\3\2\2\2\34z\3\2"+
		"\2\2\36\u008a\3\2\2\2 \u008e\3\2\2\2\"\u0096\3\2\2\2$\u009a\3\2\2\2&\u00a3"+
		"\3\2\2\2(\u00a7\3\2\2\2*\u00b7\3\2\2\2,\u00bb\3\2\2\2.\u00c1\3\2\2\2\60"+
		"\u00c5\3\2\2\2\62\u00c8\3\2\2\2\64\u00cc\3\2\2\2\66\u00cf\3\2\2\28\u00d3"+
		"\3\2\2\2:;\5\4\3\2;<\b\2\1\2<=\7\2\2\3=\3\3\2\2\2>?\5\b\5\2?@\b\3\1\2"+
		"@B\3\2\2\2A>\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\5\b\5\2DE\b\4\1\2EF\7\2\2"+
		"\3F\7\3\2\2\2GH\5\f\7\2HI\b\5\1\2IK\3\2\2\2JG\3\2\2\2KL\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2M\t\3\2\2\2NO\5\f\7\2OP\b\6\1\2PQ\7\2\2\3Q\13\3\2\2\2RS"+
		"\5\20\t\2ST\b\7\1\2T\r\3\2\2\2UV\5\20\t\2VW\b\b\1\2WX\7\2\2\3X\17\3\2"+
		"\2\2YZ\5\30\r\2Z[\b\t\1\2[\21\3\2\2\2\\]\5\24\13\2]^\b\n\1\2^_\7\2\2\3"+
		"_\23\3\2\2\2`a\5\20\t\2ab\b\13\1\2bd\3\2\2\2c`\3\2\2\2de\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\25\3\2\2\2gh\5\30\r\2hi\b\f\1\2ij\7\2\2\3j\27\3\2\2\2"+
		"kl\7\6\2\2lm\b\r\1\2mn\3\2\2\2no\7\t\2\2op\b\r\1\2pq\3\2\2\2qr\5\34\17"+
		"\2rs\b\r\1\2st\58\35\2tu\b\r\1\2u\31\3\2\2\2vw\5\34\17\2wx\b\16\1\2xy"+
		"\7\2\2\3y\33\3\2\2\2z{\5 \21\2{\u0087\b\17\1\2|}\7\5\2\2}~\b\17\1\2~\177"+
		"\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\b\17\1\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\5 \21\2\u0083\u0084\b\17\1\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\35"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5 \21\2\u008b\u008c\b\20\1\2"+
		"\u008c\u008d\7\2\2\3\u008d\37\3\2\2\2\u008e\u008f\7\7\2\2\u008f\u0090"+
		"\b\21\1\2\u0090\u0094\3\2\2\2\u0091\u0092\5$\23\2\u0092\u0093\b\21\1\2"+
		"\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095!\3"+
		"\2\2\2\u0096\u0097\5$\23\2\u0097\u0098\b\22\1\2\u0098\u0099\7\2\2\3\u0099"+
		"#\3\2\2\2\u009a\u009b\7\t\2\2\u009b\u009c\b\23\1\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\7\4\2\2\u009e\u009f\b\23\1\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\5,\27\2\u00a1\u00a2\b\23\1\2\u00a2%\3\2\2\2\u00a3\u00a4\5(\25\2\u00a4"+
		"\u00a5\b\24\1\2\u00a5\u00a6\7\2\2\3\u00a6\'\3\2\2\2\u00a7\u00a8\5,\27"+
		"\2\u00a8\u00b4\b\25\1\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\b\25\1\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\b\25\1\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00b0\5,\27\2\u00b0\u00b1\b\25\1\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5)\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9"+
		"\b\26\1\2\u00b9\u00ba\7\2\2\3\u00ba+\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc"+
		"\u00bd\b\27\1\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5\60\31\2\u00bf\u00c0"+
		"\b\27\1\2\u00c0-\3\2\2\2\u00c1\u00c2\5\60\31\2\u00c2\u00c3\b\30\1\2\u00c3"+
		"\u00c4\7\2\2\3\u00c4/\3\2\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\b\31\1\2"+
		"\u00c7\61\3\2\2\2\u00c8\u00c9\5\64\33\2\u00c9\u00ca\b\32\1\2\u00ca\u00cb"+
		"\7\2\2\3\u00cb\63\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\b\33\1\2\u00ce"+
		"\65\3\2\2\2\u00cf\u00d0\58\35\2\u00d0\u00d1\b\34\1\2\u00d1\u00d2\7\2\2"+
		"\3\u00d2\67\3\2\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\b\35\1\2\u00d59\3"+
		"\2\2\2\bALe\u0087\u0094\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}