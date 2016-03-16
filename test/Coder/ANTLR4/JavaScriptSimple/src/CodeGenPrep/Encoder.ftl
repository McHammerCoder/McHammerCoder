import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

//TODO generate encoding to the corresponding type!
//SetMap to enable custom encoding(?)
//Create testing case on HTML and start testing! (Sensible class division should be done at this point)
//lex should be generated and thus moved, type checker and getusable symbols may need to be moved!

public class Encoder{

	private Map<String, String> encodingMap = new HashMap<String, String>(); 
	public String startEncoding = "";


	public JavaScriptSimpleLexer lex(String string){
		ANTLRInputStream input = new ANTLRInputStream(string);
		JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(input);
		return lexer;

	}
	
	public String[] getKeywords(){
	 	Vocabulary voc = lex("").getVocabulary();
		String[] keywords; // final keywords list
		keywords = new String[lex("").getTokenNames().length+2]; //This is market as deprecated but no explanation or alternative has been provided
		String tmp; // temp string for filtering
		for(int i = 0; i < keywords.length ; i++){
		 tmp = voc.getLiteralName(i);
		 if (tmp == "'''"){ //Readd '
		 	keywords[i] = "'";
		 }
		 else if(tmp != null){
		 keywords[i] = tmp.replaceAll("'", "");} //Remove ' ' surronding the keywords
		 if(i == keywords.length-2){
		 	keywords[i] = " ";
		 }
		}

		keywords = Arrays.stream(keywords).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new); //Filtering NULL out
		return keywords;
	}

  
  public boolean check(CommonToken receivedtoken){
/*
Receives a tokens text, lexes the text and compares
the received text with the text of the first token from the lexer
the text should be the same if there was no tampering with the token
returnes false if it is not the same since an injection may have occured there
*/
	 String originaltext = receivedtoken.getText();
	Token nextToken = lex(originaltext).nextToken();

	if((originaltext.equals(nextToken.getText()) && receivedtoken.getType() == nextToken.getType()) && notKeyword(originaltext) ){
		return true;
		}
	
	return false;
}

public boolean notKeyword(String toCheck){ //This returns if a string matches a keyword.
	String[] allKW = getKeywords();
	String res="";
	for(int i=0; i<allKW.length; i++){
		res+= allKW[i];
		}
	return res.contains(toCheck);

}


public boolean typeCheck(int type, String string){
	JavaScriptSimpleLexer lexer = lex(string);
	Token nextToken =lexer.nextToken();

	if(type == nextToken.getType() && lexer.nextToken().getType() == Token.EOF){
		return true;
		}
		return false;
}


public String[] getUsableSymbols(){
	//Each usable symbol should be lexable. No usable symbol should be a keyword.
	//String[] alphanumeric = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	String[] alphanumeric = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	String[] keyword = getKeywords();
	String[] usableSymbols = new String[alphanumeric.length];
	for(int i=0; i< alphanumeric.length; i++){
		for(int j=0; j<keyword.length; j++){
			if(alphanumeric[i].equals(keyword[j])){ 
			break;
		}
	}

		JavaScriptSimpleLexer lexer = lex(alphanumeric[i]);
		lexer.removeErrorListeners(); //Removes strange error output in the console - we dont need it!
		if(lexer.nextToken().getType() != Token.EOF){
			usableSymbols[i] = alphanumeric[i];
		 }
	}
	usableSymbols = Arrays.stream(usableSymbols).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new); 
return usableSymbols;
}


	private void createEncoding(String[] kw, String[] usableSymbols, int first, int second){ //Should create a Map with different encodings
		/*
		Example encoding if a \nin JSsimple
		var -> bcbbbbbb
		=   -> bccbbbbb
		,   -> bcccbbbb
		"   -> bccccbbb
		;   -> bcccccbb
		WS  -> bccccccb
		b   -> bccccccc
		Binär codieren könnte das ganze kleiner machen
		*/
		//int length0 = kw.length;
		//int length1 = 1; //makes for a total length of kw.length+1!
		String encoding = usableSymbols[first];
		for(int j=0; j<(kw.length+1); j++){

			
			
			/*for(int i=0; i<length1; i++){
				encoding += usableSymbols[second];
			}
			for(int k = 0; k < length0; k++){
				encoding += usableSymbols[first];
			}*/

			encoding += convertToString(j, usableSymbols[first], usableSymbols[second], (int) Math.ceil((Math.log10(kw.length+1)/Math.log10(2)))); //[log_2(kw.length+1)]

			if(j != kw.length && !notKeyword(encoding)){
			encodingMap.put(kw[j], encoding);//Save encoding and kw[j] to map
			System.out.println(kw[j] + " = " + encoding);
			}
			else if(notKeyword(encoding)){ //Our created encoding contains a keyword reset and try again //TODO Change type!
				encodingMap.clear();
				second++;
				if(first == second){
					second++;
				}
				if(second == kw.length){
					second = 0;
					first++;
				}
				if(first == kw.length && second == (kw.length+1)){
					System.err.println("No viable encoding could be found, exiting with exit code 1"); //TODO Add exceptions
					System.exit(1);
				}
				createEncoding(kw, usableSymbols, first, second);
			}
			else if(j == kw.length){
				System.out.println(usableSymbols[first] + " = " + encoding);
				
				encodingMap.put(usableSymbols[first], encoding); //Last save the encoding for the start
				startEncoding = encoding;
			}
			encoding = usableSymbols[first]; //Reset first symbol for encoding
			/*	if(length1 != (kw.length+1)){ //Update length of symbols untill we get all usableSymbols[0] followd by n uS[1]
					length0--;
					length1++;
				}*/
		}
	}
	private String convertToString( int number, String first, String second, int length)
	{
		String res = new String();
		int highestBit = 1 << length;
		for( int i = 0; i < (length+1); i++ )
		{
			if( ( (number & (highestBit >> i)) >> (length-i) ) == 1 )
			{
				res += first;
			}
			else
			{
				res += second;
			}
		}
		return res;
	}

	public Map getEncoding(){ //Returns the map if none exists one is created
	if(encodingMap.size() != 0){
 	return encodingMap;
		}
	else {
		createEncoding(getKeywords(), getUsableSymbols(), 0, 1);
		return encodingMap;
	}

	}

	public boolean canBeEncoded(String toTest){ //Checks if a string can be encoded
	String[] kw = getKeywords();
	for(int i=0; i< kw.length; i++){
		if(toTest.contains(kw[i])){
		return true;
		}	
	}
	return false;

}

public String encode (CommonToken toEncode){ //Encodes a token and sets it text to the encoded variant
	String encodedString = toEncode.getText(); //CAREFUL can cause problems use decode method
	//insteadead of contains use a window
	@SuppressWarnings("unchecked")
	Map<String, String> map = (Map<String, String>) getEncoding();

		for(String key: map.keySet()){
			if(startEncoding.equals(map.get(key))){
			encodedString = encodedString.replaceAll(key, map.get(key));
			}
			
		}
	for(String key: map.keySet()){
			if(!startEncoding.equals(map.get(key))){
			encodedString = encodedString.replaceAll(key, map.get(key));
			}
		}
	if(typeCheck(toEncode.getType(), encodedString)){
		toEncode.setText(encodedString);
		return encodedString;
		}
		System.err.println("Type missmatch while encoding [exit code 2]"); //Something has gone horribly wrong
		System.exit(2);
		return null;
}


}
