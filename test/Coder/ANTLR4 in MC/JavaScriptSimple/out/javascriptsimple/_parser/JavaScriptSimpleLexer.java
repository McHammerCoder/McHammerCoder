// Generated from /home/aether/Desktop/JavaScriptSimple/out/javascriptsimple/_parser/JavaScriptSimple.g4 by ANTLR 4.5

package javascriptsimple._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SemiColon=1, EQ=2, KO=3, Var=4, Identifier=5, StringLiteral=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SemiColon", "EQ", "KO", "Var", "Identifier", "StringLiteral", "StringCharacter", 
		"EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", 
		"SingleEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", 
		"DecimalIntegerLiteral", "IdentifierStart", "WS", "UnicodeLetter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "','", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SemiColon", "EQ", "KO", "Var", "Identifier", "StringLiteral", "WS"
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



	// Add additional Java Code to lexer

	private de.monticore.antlr4.MCParser _monticore_parser;
	protected de.monticore.antlr4.MCParser getCompiler() {
	   return _monticore_parser;
	}
	public void setMCParser(de.monticore.antlr4.MCParser in) {
	  this._monticore_parser = in;
	}


	public JavaScriptSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScriptSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tw\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6\65"+
		"\n\6\r\6\16\6\66\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\bE\n\b\3\t\3\t\3\t\5\tJ\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16]\n\16\3\17\3\17\3\20\5\20b\n\20"+
		"\3\21\3\21\3\21\7\21g\n\21\f\21\16\21j\13\21\5\21l\n\21\3\22\3\22\3\23"+
		"\6\23q\n\23\r\23\16\23r\3\24\5\24v\n\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\t\'\2\3\2\b\7\2"+
		"\f\f\17\17$$))^^\13\2$$))^^ddhhppttvvxx\4\2wwzz\5\2\62;CHch\6\2\13\13"+
		"\r\16\"\"\u00a2\u00a2\n\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0221t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2%\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7"+
		"-\3\2\2\2\t/\3\2\2\2\13\64\3\2\2\2\r8\3\2\2\2\17D\3\2\2\2\21I\3\2\2\2"+
		"\23K\3\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31W\3\2\2\2\33\\\3\2\2\2\35^\3\2"+
		"\2\2\37a\3\2\2\2!k\3\2\2\2#m\3\2\2\2%p\3\2\2\2\'u\3\2\2\2)*\7=\2\2*\4"+
		"\3\2\2\2+,\7?\2\2,\6\3\2\2\2-.\7.\2\2.\b\3\2\2\2/\60\7x\2\2\60\61\7c\2"+
		"\2\61\62\7t\2\2\62\n\3\2\2\2\63\65\5#\22\2\64\63\3\2\2\2\65\66\3\2\2\2"+
		"\66\64\3\2\2\2\66\67\3\2\2\2\67\f\3\2\2\28<\7$\2\29;\5\17\b\2:9\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7$\2\2@\16\3\2"+
		"\2\2AE\n\2\2\2BC\7^\2\2CE\5\21\t\2DA\3\2\2\2DB\3\2\2\2E\20\3\2\2\2FJ\5"+
		"\23\n\2GJ\5\25\13\2HJ\5\27\f\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\22\3\2\2"+
		"\2KL\5\31\r\2L\24\3\2\2\2MN\7z\2\2NO\5\37\20\2OP\5\37\20\2P\26\3\2\2\2"+
		"QR\7w\2\2RS\5\37\20\2ST\5\37\20\2TU\5\37\20\2UV\5\37\20\2V\30\3\2\2\2"+
		"WX\t\3\2\2X\32\3\2\2\2Y]\5\31\r\2Z]\5\35\17\2[]\t\4\2\2\\Y\3\2\2\2\\Z"+
		"\3\2\2\2\\[\3\2\2\2]\34\3\2\2\2^_\4\62;\2_\36\3\2\2\2`b\t\5\2\2a`\3\2"+
		"\2\2b \3\2\2\2cl\7\62\2\2dh\4\63;\2eg\5\35\17\2fe\3\2\2\2gj\3\2\2\2hf"+
		"\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2kc\3\2\2\2kd\3\2\2\2l\"\3\2\2\2"+
		"mn\5\'\24\2n$\3\2\2\2oq\t\6\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s&\3\2\2\2tv\t\7\2\2ut\3\2\2\2v(\3\2\2\2\r\2\66<DI\\ahkru\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}