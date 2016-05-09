package de.mchammer.testarea;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import htmlred._parser.*;

//Create testing case on HTML and start testing! (Sensible class division should be done at this point)


public class HTMLRedInjector extends HTMLRedAntlrBaseListener {

	private String injection = new String();

	HTMLRedInjector(String injection)
	{
		this.injection = injection;
	}
	
	public void visitTerminal(TerminalNode node) {
		CommonToken token = (CommonToken)node.getPayload();
	 	if(token.getText().contains("Text")){
		token.setText(token.getText().replace("Text",injection)); //Simulates an injection in the token with text testing of type 8
		}	

	}
}