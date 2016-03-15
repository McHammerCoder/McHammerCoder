/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package automaton.prettyprint;

import automaton._ast.ASTAutomaton;
import automaton._ast.ASTState;
import automaton._ast.ASTTransition;
import automaton._visitor.AutomatonVisitor;


/**
 * Pretty prints a JS program. Use {@link #print(ASTProgram)} to start a pretty
 * print and get the result by using {@link #getResult()}.
 *
 * @author PeterStanchev
 */
public class PrettyPrinter implements AutomatonVisitor {
  private String result = "";
  
  /**
   * Prints the JavaScript program
   * 
   * @param automaton
   */
  public void print(ASTAutomaton automaton) {
    handle(automaton);
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
  public void visit(ASTAutomaton node) {
   println("ASTAutomaton");
  }

    @Override
  public void traverse(ASTAutomaton node) {
    // guarantee ordering: states before transitions
    node.getStates().accept(getRealThis());
    node.getTransitions().accept(getRealThis());
  }
  @Override
  public void visit(ASTTransition node) {
   println("ASTTransition");
  } 
  @Override
  public void visit(ASTState node) {
   println("ASTState");
  } 
  
  
    private void println(String s) {
    result += (s + "\n");
	}
	 private void print(String s) {
    result += s;
  }
  
}
