package automaton;

/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import java.io.IOException;
import java.util.Optional;

import automaton._ast.ASTAutomaton;
import automaton._cocos.AutomatonCoCoChecker;
import automaton._parser.AutomatonMCParser;
import automaton._symboltable.AutomatonLanguage;
import automaton._symboltable.AutomatonSymbolTableCreator;
import automaton._symboltable.StateSymbol;
import automaton.cocos.AtLeastOneInitialAndFinalState;
import automaton.cocos.AutomatonCoCos;
import automaton.cocos.StateNameStartsWithCapitalLetter;
import automaton.cocos.TransitionSourceExists;
import automaton.prettyprint.PrettyPrinter;
import automaton.visitors.CountStates;
import de.monticore.io.paths.ModelPath;
import de.monticore.symboltable.GlobalScope;
import de.monticore.symboltable.ResolverConfiguration;
import de.monticore.symboltable.Scope;
import de.monticore.symboltable.Symbol;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Main class for the Automaton DSL tool.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 */
public class AutomatonTool {
  
  /**
   * Use the single argument for specifying the single input automaton file.
   * 
   * @param args
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      Log.error("Please specify only one single path to the input model.");
      return;
    }
    Log.info("Automaton DSL Tool", AutomatonTool.class.getName());
    Log.info("------------------", AutomatonTool.class.getName());
    String model = args[0];
    
    // setup the language infrastructure
    final AutomatonLanguage lang = new AutomatonLanguage();
    
    // parse the model and create the AST representation
    final ASTAutomaton ast = parse(model, lang.getParser());
    Log.info(model + " parsed successfully!", AutomatonTool.class.getName());
    
    // setup the symbol table
    Scope modelTopScope = createSymbolTable(lang, ast);
    // can be used for resolving things in the model
    Optional<Symbol> aSymbol = modelTopScope.resolve("Ping", StateSymbol.KIND);
    if (aSymbol.isPresent()) {
      Log.info("Resolved state symbol \"Ping\"; FQN = " + aSymbol.get().toString(),
          AutomatonTool.class.getName());
    }
    
    // execute default context conditions
    runDefaultCoCos(ast);
    
    // execute a custom set of context conditions
    AutomatonCoCoChecker customCoCos = new AutomatonCoCoChecker();
    customCoCos.addCoCo(new StateNameStartsWithCapitalLetter());
    customCoCos.checkAll(ast);
    
    // analyze the model with a visitor
    CountStates cs = new CountStates();
    cs.handle(ast);
    Log.info("The model contains " + cs.getCount() + " states.", AutomatonTool.class.getName());
    
    // execute a pretty printer
    PrettyPrinter pp = new PrettyPrinter();
    pp.handle(ast);
    Log.info("Pretty printing the parsed automaton into console:", AutomatonTool.class.getName());
    System.out.println(pp.getResult());
  }
  
  /**
   * Parse the model contained in the specified file.
   * 
   * @param model - file to parse
   * @param parser
   * @return
   */
  public static ASTAutomaton parse(String model, AutomatonMCParser parser) {
    try {
      Optional<ASTAutomaton> optAutomaton = parser.parse(model);
      
      if (!parser.hasErrors() && optAutomaton.isPresent()) {
        return optAutomaton.get();
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
  public static Scope createSymbolTable(AutomatonLanguage lang, ASTAutomaton ast) {
    final ResolverConfiguration resolverConfiguration = new ResolverConfiguration();
    resolverConfiguration.addTopScopeResolvers(lang.getResolvers());
    
    GlobalScope globalScope = new GlobalScope(new ModelPath(), lang.getModelLoader(),
        resolverConfiguration);
    
    Optional<AutomatonSymbolTableCreator> symbolTable = lang.getSymbolTableCreator(
        resolverConfiguration, globalScope);
    return symbolTable.get().createFromAST(ast);
  }
  
  /**
   * Run the default context conditions {@link AtLeastOneInitialAndFinalState},
   * {@link TransitionSourceExists}, and
   * {@link StateNameStartsWithCapitalLetter}.
   * 
   * @param ast
   */
  public static void runDefaultCoCos(ASTAutomaton ast) {
    new AutomatonCoCos().getCheckerForAllCoCos().checkAll(ast);
  }
  
}
