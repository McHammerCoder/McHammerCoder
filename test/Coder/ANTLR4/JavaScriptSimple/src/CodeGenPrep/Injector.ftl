${tc.signature("ast")}
<#assign parserName = ast.getName()?cap_first>

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//Create testing case on HTML and start testing! (Sensible class division should be done at this point)


public class Injector extends ${parserName}BaseListener {


@Override public void visitTerminal(TerminalNode node) {
		CommonToken token = (CommonToken)node.getPayload();
	 if(token.getType() == 8 && token.getText().equals("replceme")){
		token.setText("clr\", newr \"=\";varbcccc"); //Simulates an injection in the token with text testing of type 8
	}	

}
}
