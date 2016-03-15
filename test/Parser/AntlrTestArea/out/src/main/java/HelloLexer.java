// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dot=1, WS=2, Label=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Dot", "WS", "Label", "Letter", "Digit", "Let_dig", "Let_dig_hyp", "Ldh_string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dot", "WS", "Label"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\60\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\5\5\37\n\5\3\6\3\6\3\7\3\7\5\7%\n\7"+
		"\3\b\3\b\5\b)\n\b\3\t\3\t\3\t\3\t\5\t/\n\t\2\2\n\3\3\5\4\7\5\t\2\13\2"+
		"\r\2\17\2\21\2\3\2\4\4\2C\\c|\3\2\62;.\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\33\3\2\2\2\t\36\3\2\2\2\13 \3\2\2\2\r"+
		"$\3\2\2\2\17(\3\2\2\2\21.\3\2\2\2\23\24\7\60\2\2\24\4\3\2\2\2\25\26\7"+
		"\"\2\2\26\6\3\2\2\2\27\30\5\r\7\2\30\31\5\21\t\2\31\34\3\2\2\2\32\34\5"+
		"\r\7\2\33\27\3\2\2\2\33\32\3\2\2\2\34\b\3\2\2\2\35\37\t\2\2\2\36\35\3"+
		"\2\2\2\37\n\3\2\2\2 !\t\3\2\2!\f\3\2\2\2\"%\5\t\5\2#%\5\13\6\2$\"\3\2"+
		"\2\2$#\3\2\2\2%\16\3\2\2\2&)\5\r\7\2\')\7/\2\2(&\3\2\2\2(\'\3\2\2\2)\20"+
		"\3\2\2\2*+\5\17\b\2+,\5\21\t\2,/\3\2\2\2-/\5\r\7\2.*\3\2\2\2.-\3\2\2\2"+
		"/\22\3\2\2\2\b\2\33\36$(.\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}