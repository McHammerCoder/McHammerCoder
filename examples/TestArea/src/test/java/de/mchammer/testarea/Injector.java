package de.mchammer.testarea;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Create testing case on HTML and start testing! (Sensible class division should be done at this point)


public class Injector implements ParseTreeListener {

	private String injection = new String();

	Injector(String injection)
	{
		this.injection = injection;
	}
	
	public void visitTerminal(TerminalNode node) {
			CommonToken token = (CommonToken)node.getPayload();
			if(token.getText().contains("Text")){
		 		token.setText(token.getText().replace("Text",injection)); //Simulates an injection in the token with text testing of type 8
			}
	}
	
	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}