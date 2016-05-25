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

import javax.servlet.ServletConfig;
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
/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class ExamplePage01 extends HttpServlet{
	private ParseTreeWalker walker = new ParseTreeWalker();
	private String test;
	public String templateFileName = "xhtmltemplate.xhtml";
	public String url = "/ex01";
	private XMLSimpleEncoder encoder = new XMLSimpleEncoder();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		templateFileName = config.getInitParameter("templateFileName");
	    url = config.getInitParameter("url");
	    super.init(config);
	 }
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    resp.setContentType("text/html");
	    resp.addHeader("X-Content-Type-Options", "nosniff");
	    resp.addHeader("X-Frame-Options", "deny");
	    String contextPath = getServletContext().getContextPath();
	    String basePath = getServletContext().getRealPath(contextPath);
	    if (contextPath.isEmpty()) {
	      contextPath = "/ex01";
	    }
	    try{
	    PrintWriter out = resp.getWriter();
	    URI templateFile = new URI("file:///" + basePath + File.separator + "WEB-INF" + File.separator + "templates" + File.separator + "xhtmltemplate.xhtml");
	    Path path = Paths.get(templateFile);
	    BufferedReader br = new BufferedReader(new FileReader(path.toString()));
	    String line = null;
	    while ((line = br.readLine()) != null) {
	    	out.print(line);
	    }
	    
	    
	    String htmlred = getParam(req, "htmlred");

	    doParsing(basePath, htmlred, contextPath, out);
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
	 private void doParsing(String basePath, String htmlred, String contextPath, PrintWriter out) throws FileNotFoundException {
		 try{
		    URI templateFile = new URI("file:///" + basePath + File.separator + "WEB-INF" + File.separator + "templates" + File.separator + "xhtmltemplate.xhtml");
		   Path path = Paths.get(templateFile);
		   if(htmlred != ""){
			byte[] data = htmlred.getBytes();
			HTMLRedParser parser = new HTMLRedParser();
			ParseTree pt = parser.parse(data);
			walker.walk(new XMLVisitor(), pt); 
			HTMLRedPP pp = new HTMLRedPP();
			out.print(new String(pp.prettyPrint(pt)));
			
			
		   }
			//walker.walk(encoder, pt); 
			//HTMLRedPP pp = new HTMLRedPP();
		   
			
			//out.print(token.getText());
			//HTMLRedDecoder decoder = new HTMLRedDecoder();
			//decoder.decode(token);
			//out.print(token.getText());
		 }
		 catch(Exception e){
			 out.print("ERROR");
			 e.printStackTrace();
		 }
		   // out.print("IT WORKS " + test + " " + templateFile);
		    //TODO parsing
	 }
	 public static class XMLVisitor  implements ParseTreeListener{
		 private XMLSimpleEncoder encoder = new XMLSimpleEncoder();
		 
		public void visitTerminal(TerminalNode node) {
		Token token = (Token)node.getPayload();
			encoder.encode(token);
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
