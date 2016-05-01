import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import javascriptsimple._parser.JavaScriptSimpleLexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class KwTester {
	
	public static String[] getKeywords(){
		ANTLRInputStream input = new ANTLRInputStream(""); //launching lexer on empty input to get keywordslist
		JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(input);
	 	Vocabulary voc = lexer.getVocabulary();
		String[] keywords; // final keywords list
		keywords = new String[lexer.getTokenNames().length];
		String tmp; // temp string for filtering
		for(int i = 0; i < keywords.length ; i++){
		 tmp = voc.getLiteralName(i);
		 if (tmp == "'''"){ //Readd '
		 	keywords[i] = "'";
		 }
		 else if(tmp != null){
		 keywords[i] = tmp.replaceAll("'", "");} //Remove ' ' surronding the keywords
		}

		keywords = Arrays.stream(keywords).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new); //Filtering NULL out
		return keywords;
	}

public static boolean check(Token receivedtoken){
//Receives a token, lexes the text and compares
//the received text with the text of the first token from the lexer
//the text should be the same if there was no tampering with the token
//returnes false if it is not the same since an injection may have occured there
	 String originaltext = receivedtoken.getText();
	//String originaltext = "var line"; //Simulates an injection in the given token - JUST FOR TESTING!
	ANTLRInputStream input = new ANTLRInputStream(originaltext);
	JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(input);


	if(originaltext.equals(lexer.nextToken().getText())){
		return true;
	}
	return false;
}
 

public static void main(String[] args) {
	String[] keywords = getKeywords();
	ANTLRInputStream input = new ANTLRInputStream("var line = text;");
	JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(input);
	

	System.out.println("Printing all keywords:");

	for(int i = 0; i < keywords.length ; i++){
		System.out.print(keywords[i] + " ");
	}
System.out.println();
System.out.println("Calling Checker");
for(Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()){ //Iterates through all tokens created from "var"
		System.out.println("Current token to be checked:" + token.getText());
		System.out.println("Result of the check:" + check(token));
		System.out.println();
	}
}
}