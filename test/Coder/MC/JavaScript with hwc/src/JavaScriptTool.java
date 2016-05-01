/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import java.io.IOException;
import java.util.Optional;

import javascript._ast.*;
import javascript._cocos.*;
import javascript._parser.*;
import javascript._symboltable.*;
import prettyprint.*;
import javascript._visitor.*;
import de.monticore.io.paths.ModelPath;
import de.monticore.symboltable.GlobalScope;
import de.monticore.symboltable.ResolverConfiguration;
import de.monticore.symboltable.Scope;
import de.monticore.symboltable.Symbol;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Main class for the JS DSL tool.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 */
public class JavaScriptTool {
  
  /**
   * Use the single argument for specifying the single input JS file.
   * 
   * @param args
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      Log.error("Please specify only one single path to the input model.");
      return;
    }
    Log.info("JavaScript DSL Tool", JavaScriptTool.class.getName());
    Log.info("------------------", JavaScriptTool.class.getName());
    String model = args[0];
    System.out.println(model);
    // setup the language infrastructure
    final JavaScriptLanguage lang = new JavaScriptLanguage();
    
    // parse the model and create the AST representation
    final ASTProgramRoot ast = parse(model, lang.getParser());
    Log.info(model + " parsed successfully!", JavaScriptTool.class.getName());
    
    /* // setup the symbol table
    Scope modelTopScope = createSymbolTable(lang, ast);
    // can be used for resolving things in the model
    Optional<Symbol> aSymbol = modelTopScope.resolve("Ping", StateSymbol.KIND);
    if (aSymbol.isPresent()) {
      Log.info("Resolved state symbol \"Ping\"; FQN = " + aSymbol.get().toString(),
          AutomatonTool.class.getName());
    }
    */
    //execute default context conditions
	Log.info("CoCosChecker checkt CoCos #Party \\(^-^)/", JavaScriptTool.class.getName());
    runDefaultCoCos(ast);
    /*
    // execute a custom set of context conditions
    AutomatonCoCoChecker customCoCos = new AutomatonCoCoChecker();
    customCoCos.addCoCo(new StateNameStartsWithCapitalLetter());
    customCoCos.checkAll(ast);
    
    // analyze the model with a visitor
    CountStates cs = new CountStates();
    cs.handle(ast);
    Log.info("The model contains " + cs.getCount() + " states.", AutomatonTool.class.getName());
    */
    // execute a pretty printer
    PrettyPrinter pp = new PrettyPrinter();
    pp.handle(ast);
    Log.info("Pretty printing the parsed JS into console:", JavaScriptTool.class.getName());
    System.out.println(pp.getResult());
  }
  
  /**
   * Parse the model contained in the specified file.
   * 
   * @param model - file to parse
   * @param parser
   * @return
   */
  public static ASTProgramRoot parse(String model, ProgramRootMCParser parser) {
    try {
      Optional<ASTProgramRoot> optSourceElement = parser.parse(model);
      
      if (!parser.hasErrors() && optSourceElement.isPresent()) {
        return optSourceElement.get();
      }
      Log.error("Model could not be parsed.");
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
    return null;
  }
  
  /**
   * Create the symbol table from the parsed AST.
   * 
   * @param lang
   * @param ast
   * @return
   */
  /*
  public static Scope createSymbolTable(AutomatonLanguage lang, ASTAutomaton ast) {
    final ResolverConfiguration resolverConfiguration = new ResolverConfiguration();
    resolverConfiguration.addTopScopeResolvers(lang.getResolvers());
    
    GlobalScope globalScope = new GlobalScope(new ModelPath(), lang.getModelLoader(),
        resolverConfiguration);
    
    Optional<AutomatonSymbolTableCreator> symbolTable = lang.getSymbolTableCreator(
        resolverConfiguration, globalScope);
    return symbolTable.get().createFromAST(ast);
  }
  */
  /**
   * Run the default context conditions {@link AtLeastOneInitialAndFinalState},
   * {@link TransitionSourceExists}, and
   * {@link StateNameStartsWithCapitalLetter}.
   * 
   * @param ast
   */
  
  public static void runDefaultCoCos(ASTProgramRoot ast) {	  
    new JavaScriptCoCoChecker().checkAll(ast);
  }
  
}
