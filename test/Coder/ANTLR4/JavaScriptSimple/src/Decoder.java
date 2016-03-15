import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Visit functions need to be generated - move them to a seperate part e.g. DecodeVisitor and EncodeVisitor
*/

public class Decoder{

	private Encoder encoder = new Encoder();

/*public boolean canBeDecoded(String toTest){ //Checks if a string can be decoded
	@SuppressWarnings("unchecked")
	Map<String, String> map = (Map<String, String>) encoder.getEncoding();
	for(String key: map.keySet()){
		if(toTest.contains(map.get(key))){
		return true;
		}	
	}
	return false;

}*/

public String decode(CommonToken toDecode){ //Decodes a token and sets it text to the decoded variant
	String decodedString = toDecode.getText();
	int elength = encoder.startEncoding.length();
	@SuppressWarnings("unchecked")
	Map<String, String> map = (Map<String, String>) encoder.getEncoding();
	
	if(! (decodedString.length() < elength) ){
		for(int i = 0; i < decodedString.length()-elength; i++){
			for(String key: map.keySet()){
				if(encoder.startEncoding.equals(map.get(key))){
					if(i+elength < decodedString.length() && decodedString.substring(i,elength+i).equals(map.get(key))){
							
						decodedString =	decodedString.substring(0, i) + decodedString.substring(i).replaceFirst(map.get(key), key);
						break;
	
					}
					
				}
				else if(!encoder.startEncoding.equals(map.get(key))){
					if(i+elength < decodedString.length() && decodedString.substring(i,elength+i).equals(map.get(key))){
							
						decodedString =	decodedString.substring(0, i) + decodedString.substring(i).replaceFirst(map.get(key), key);
	
					}
					
				}
			}
		}
			
	} 


		
	/*
	
	for(String key: map.keySet()){
			if(map.containsKey(key) && !encoder.startEncoding.equals(map.get(key))){
			decodedString = decodedString.replaceAll(map.get(key), key);
			}
		}
	
	for(String key: map.keySet()){
		if(map.containsKey(key) && encoder.startEncoding.equals(map.get(key))){
		decodedString = decodedString.replaceAll(map.get(key), key);
		}
	} */	
	
	toDecode.setText(decodedString);
		return decodedString;
}

}

