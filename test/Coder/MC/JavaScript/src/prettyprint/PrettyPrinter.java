/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package prettyprint;

import javascript._ast.*;
import javascript._visitor.*;

import de.monticore.ast.ASTNode;

/**
 * Pretty prints a JS program. Use {@link #print(ASTProgram)} to start a pretty
 * print and get the result by using {@link #getResult()}.
 *
 * @author PeterStanchev
 */
public class PrettyPrinter implements JavaScriptVisitor {
  private String result = "#\n";
  
  /**
   * Prints the JavaScript program
   * 
   * @param automaton
   */
  public void print(ASTSourceElement program) {
    handle(program);
  }
  
  /**
   * Gets the printed result.
   * 
   * @return the result of the pretty print.
   */
  public String getResult() {
    return this.result;
  }
  @Override
  public void visit(ASTProgram node) {
    print("ASTProgram\n");
  }
  @Override
  public void visit(ASTSourceElement node) {
    print("ASTSourceElement\n");
  }
  
  @Override
  public void visit(ASTStatement node) {
    print("ASTStatement\n");
  }
  
  @Override
  public void visit(ASTFormalParameters node) {
    print("ASTFormalParameters\n");
  }
  
  @Override
  public void visit(ASTFunctionBody node) {
    print("ASTFunctionBody\n");
  }
  
  @Override
  public void visit(ASTFunctionDeclaration node) {
    print("ASTFunctionDeclaration\n");
  }
  
  private void print(String str)
  {
	  result += str;
  }
}
