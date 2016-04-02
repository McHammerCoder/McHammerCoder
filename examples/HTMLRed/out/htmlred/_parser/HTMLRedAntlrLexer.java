// Generated from /home/aether/Desktop/McHammerCoder/examples/HTMLRed/out/htmlred/_parser/HTMLRedAntlr.g4 by ANTLR 4.5

package htmlred._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLRedAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXTB=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TEXTB"
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



	// Add additional Java Code to lexer

	private de.monticore.antlr4.MCParser _monticore_parser;
	protected de.monticore.antlr4.MCParser getCompiler() {
	   return _monticore_parser;
	}
	public void setMCParser(de.monticore.antlr4.MCParser in) {
	  this._monticore_parser = in;
	}


	public HTMLRedAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLRedAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\61\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\6\b.\n\b\r\b\16\b/\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\3\2\3\b\2\"\"%&\62;C\\aac|\61\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\25"+
		"\3\2\2\2\7\32\3\2\2\2\t\36\3\2\2\2\13#\3\2\2\2\r\'\3\2\2\2\17-\3\2\2\2"+
		"\21\22\7>\2\2\22\23\7r\2\2\23\24\7@\2\2\24\4\3\2\2\2\25\26\7>\2\2\26\27"+
		"\7\61\2\2\27\30\7r\2\2\30\31\7@\2\2\31\6\3\2\2\2\32\33\7>\2\2\33\34\7"+
		"d\2\2\34\35\7@\2\2\35\b\3\2\2\2\36\37\7>\2\2\37 \7\61\2\2 !\7d\2\2!\""+
		"\7@\2\2\"\n\3\2\2\2#$\7>\2\2$%\7k\2\2%&\7@\2\2&\f\3\2\2\2\'(\7>\2\2()"+
		"\7\61\2\2)*\7k\2\2*+\7@\2\2+\16\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\20\3\2\2\2\4\2/\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}