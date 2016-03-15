// Generated from UsableLetters.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UsableLettersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SingleLetter=13, Capname=14, WS=15, SingleDigit=16, 
		SingleSymbol=17, Name=18, Smt=19, MLComment=20, SLComment=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "SingleLetter", "Capname", "WS", "SingleDigit", 
		"SingleSymbol", "Name", "Smt", "MLComment", "SLComment"
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


	public UsableLettersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UsableLetters.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16S\n\16\3"+
		"\17\3\17\7\17W\n\17\f\17\16\17Z\13\17\3\20\6\20]\n\20\r\20\16\20^\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\6\23h\n\23\r\23\16\23i\3\24\6\24m\n\24"+
		"\r\24\16\24n\3\25\3\25\3\25\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0084\n\26\f\26\16\26\u0087"+
		"\13\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\t\4\2C\\c|"+
		"\3\2C\\\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2\62;\n\2$$))..\60\60==^^~~"+
		"\u0080\u0080\4\2\f\f\17\17\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\3-\3\2\2\2\5\66\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2"+
		"\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2"+
		"\2\31N\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37\\\3\2\2\2!b\3\2\2\2#d\3\2\2"+
		"\2%g\3\2\2\2\'l\3\2\2\2)p\3\2\2\2+\177\3\2\2\2-.\7h\2\2./\7t\2\2/\60\7"+
		"c\2\2\60\61\7i\2\2\61\62\7o\2\2\62\63\7g\2\2\63\64\7p\2\2\64\65\7v\2\2"+
		"\65\4\3\2\2\2\66\67\7v\2\2\678\7q\2\289\7m\2\29:\7g\2\2:;\7p\2\2;\6\3"+
		"\2\2\2<=\7?\2\2=\b\3\2\2\2>?\7*\2\2?\n\3\2\2\2@A\7+\2\2A\f\3\2\2\2BC\7"+
		",\2\2C\16\3\2\2\2DE\7-\2\2E\20\3\2\2\2FG\7A\2\2G\22\3\2\2\2HI\7=\2\2I"+
		"\24\3\2\2\2JK\7~\2\2K\26\3\2\2\2LM\7)\2\2M\30\3\2\2\2NO\7\60\2\2OP\7\60"+
		"\2\2P\32\3\2\2\2QS\t\2\2\2RQ\3\2\2\2S\34\3\2\2\2TX\t\3\2\2UW\t\4\2\2V"+
		"U\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\36\3\2\2\2ZX\3\2\2\2[]\t\5\2"+
		"\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\20\2\2a \3"+
		"\2\2\2bc\t\6\2\2c\"\3\2\2\2de\t\7\2\2e$\3\2\2\2fh\t\4\2\2gf\3\2\2\2hi"+
		"\3\2\2\2ig\3\2\2\2ij\3\2\2\2j&\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2n"+
		"l\3\2\2\2no\3\2\2\2o(\3\2\2\2pq\7\61\2\2qr\7,\2\2rs\7,\2\2sw\3\2\2\2t"+
		"v\13\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z{\7,\2\2{|\7\61\2\2|}\3\2\2\2}~\b\25\2\2~*\3\2\2\2\177\u0080\7\61\2\2"+
		"\u0080\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n\b\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\26\2\2\u0089,\3\2\2\2"+
		"\n\2RX^inw\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}