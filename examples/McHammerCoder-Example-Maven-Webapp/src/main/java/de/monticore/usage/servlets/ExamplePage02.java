/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.monticore.usage.servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URI;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.upstandinghackers.hammer.ParseResult;

import htmlred._mch_parser.tree.*;
import htmlred._mch_parser.*;
import htmlred._coder.*;
import htmlred._coder.pp.*;

import xmlsimple._coder.*;
import xmlsimple._coder.pp.*;
import xmlsimple._mch_parser.*;
import xmlsimple._mch_parser.tree.*;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class ExamplePage02 extends HttpServlet {
	private ParseTreeWalker walker = new ParseTreeWalker();
	private XMLSimpleEncoderVisitor encoder = new XMLSimpleEncoderVisitor();
	@Override
	 public void init() throws ServletException {
		//Intentionally left blank
	 }
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    resp.setContentType("text/html");
	    String contextPath = getServletContext().getContextPath();
	    String basePath = getServletContext().getRealPath(contextPath);
	    if (contextPath.isEmpty()) {
	      contextPath = "/ex02";
	    }
	    try{
	    PrintWriter out = resp.getWriter();
	    URI templateFile = new URI("file:///" + basePath + File.separator + "WEB-INF" + File.separator + "templates" + File.separator + "xhtmltemplate02.xhtml");
	    Path path = Paths.get(templateFile);
	    byte[] data = Files.readAllBytes(path);
	    XMLSimpleParser parser = new XMLSimpleParser();
		ParseTree pt = parser.parse(data);
		XMLSimplePP pp = new XMLSimplePP();
		walker.walk(new XMLSimpleDecoderVisitor(), pt);
	    String line = new String(pp.prettyPrint(pt));
	    String htmlred = getParam(req, "htmlred");
	    walker.walk(new XMLVisitor(htmlred), pt); //Inject it
	    walker.walk(encoder, pt);
	   // XMLSimpleDecoderVisitor decoder = new XMLSimpleDecoderVisitor();
	   // walker.walk(decoder, pt);
	   
	   String line2 = new String(pp.prettyPrint(pt));	
	   System.out.println(line2);
	  // System.out.println("------------------------------------");
	  // System.out.println(line2);
	  // System.out.println("------------------------------------");
	   out.print(line2); //Print our PT
	   
	   
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	   
	  }
	 private String getParam(HttpServletRequest req, String param) {
		    String[] reqParam = req.getParameterValues(param);
		    if (reqParam != null && reqParam.length > 0) {
		      return reqParam[0];
		    } else {
		      return "";
		    }
		  }
	/* private void doParsing(String basePath, String contextPath, PrintWriter out) throws FileNotFoundException {
		 
		 
		 
		 
		 }*/
	 
	 
	 
	 
	 
	 
		 public static class XMLVisitor  implements ParseTreeListener{
			
			 private String htmlred = "";
			 public XMLVisitor(String h){
				 htmlred = h;
			 }
			 
			public void visitTerminal(TerminalNode node) {
			CommonToken token = (CommonToken)node.getPayload();
			//System.out.println(token.getText() + "TOKEN | TYPE" + token.getType() );
			if(token.getText().equals("#name#") && !htmlred.equals("")){
					token.setText(htmlred);
				}
			
			}

			/**
			 * @see org.antlr.v4.runtime.tree.ParseTreeListener#enterEveryRule(org.antlr.v4.runtime.ParserRuleContext)
			 */
			public void enterEveryRule(ParserRuleContext arg0) {
				// TODO Auto-generated method stub
				
			}

			/**
			 * @see org.antlr.v4.runtime.tree.ParseTreeListener#exitEveryRule(org.antlr.v4.runtime.ParserRuleContext)
			 */
			public void exitEveryRule(ParserRuleContext arg0) {
				// TODO Auto-generated method stub
				
			}

			/**
			 * @see org.antlr.v4.runtime.tree.ParseTreeListener#visitErrorNode(org.antlr.v4.runtime.tree.ErrorNode)
			 */
			public void visitErrorNode(ErrorNode arg0) {
				// TODO Auto-generated method stub
				
			}
		 }	
	}