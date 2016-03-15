/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer;

import java.nio.file.Path;

import org.antlr.v4.Tool;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.ast.GrammarRootAST;

/**
 * ANTLR parser generator
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 */
public class AntlrTool extends Tool 
{
  public AntlrTool( Path outputDir ) 
  {
    super();
    if( !outputDir.toFile().exists() )
    {
    	System.out.println("The output directory for AntlrTool " + outputDir + " doesn't exist.");
    	this.haveOutputDir = false;
    }
    else
    {
    	this.outputDirectory = outputDir.toString();
        this.haveOutputDir = true;
        //handleArgs();
    }    
  }
  
  /**
   * Parses the given ANTLR grammar and generates parser
   * 
   * @param inputFile - ANTLR grammar
   */
  public void createParser(String inputFile) {
    Grammar grammar = parseAntlrFile(inputFile);
    generateParser(grammar);
  }
  
  /**
   * Creates a grammar object associated with the ANTLR grammar AST.
   * 
   * @param inputFile - ANTLR grammar
   * @return a grammar object associated with the ANTLR grammar AST
   */
  public Grammar parseAntlrFile(String inputFile) {
    GrammarRootAST ast = parseGrammar(inputFile);
    Grammar grammar = createGrammar(ast);
    grammar.fileName = inputFile;
    return grammar;
  }
  
  /**
   * Generates ANTLR Parser
   * 
   * @param antlrGrammar
   */
  public void generateParser(Grammar antlrGrammar) {
    process(antlrGrammar, true);
  }
  
}
