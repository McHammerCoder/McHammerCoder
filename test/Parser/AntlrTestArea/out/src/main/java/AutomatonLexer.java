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
public class AutomatonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Name=1, Automaton=2, State=3, Transition=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Name", "Automaton", "State", "Transition"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Name", "Automaton", "State", "Transition"
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


	public AutomatonLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\5\2\r\n\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3\4\3\4\5"+
		"\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3\2\4\6\2&&"+
		"C\\aac|\7\2&&\62;C\\aac|g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\3\f\3\2\2\2\5\24\3\2\2\2\7)\3\2\2\2\tY\3\2\2\2\13\r\t\2\2\2\f\13"+
		"\3\2\2\2\r\21\3\2\2\2\16\20\t\3\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17"+
		"\3\2\2\2\21\22\3\2\2\2\22\4\3\2\2\2\23\21\3\2\2\2\24\25\7c\2\2\25\26\7"+
		"w\2\2\26\27\7v\2\2\27\30\7q\2\2\30\31\7o\2\2\31\32\7c\2\2\32\33\7v\2\2"+
		"\33\34\7q\2\2\34\35\7p\2\2\35\36\3\2\2\2\36\37\5\3\2\2\37$\7}\2\2 #\5"+
		"\7\4\2!#\5\t\5\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\'\3\2\2\2&$\3\2\2\2\'(\7\177\2\2(\6\3\2\2\2)*\7u\2\2*+\7v\2\2+,\7c\2"+
		"\2,-\7v\2\2-.\7g\2\2./\3\2\2\2/J\5\3\2\2\60\61\7>\2\2\61\62\7>\2\2\62"+
		"\63\3\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7k\2\2\66\67\7v\2\2\678\7"+
		"k\2\289\7c\2\29:\7n\2\2:;\3\2\2\2;<\7@\2\2<I\7@\2\2=>\7>\2\2>?\7>\2\2"+
		"?@\3\2\2\2@A\7h\2\2AB\7k\2\2BC\7p\2\2CD\7c\2\2DE\7n\2\2EF\3\2\2\2FG\7"+
		"@\2\2GI\7@\2\2H\60\3\2\2\2H=\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KW\3"+
		"\2\2\2LJ\3\2\2\2MR\7}\2\2NQ\5\7\4\2OQ\5\t\5\2PN\3\2\2\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UX\7\177\2\2VX\7=\2\2WM"+
		"\3\2\2\2WV\3\2\2\2X\b\3\2\2\2YZ\5\3\2\2Z[\7/\2\2[\\\5\3\2\2\\]\7@\2\2"+
		"]^\5\3\2\2^_\7=\2\2_\n\3\2\2\2\r\2\f\17\21\"$HJPRW\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}