/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package javascript._symboltable;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.Optional;

import javascript._ast.*;
import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.ResolverConfiguration;
import de.monticore.symboltable.Scope;

public class JavaScriptSymbolTableCreator extends JavaScriptSymbolTableCreatorTOP {
  
  public JavaScriptSymbolTableCreator(
      final ResolverConfiguration resolverConfig,
      final MutableScope enclosingScope) {
    super(resolverConfig, enclosingScope);
  }

  public Scope createFromAST(ASTProgram rootNode) {
      requireNonNull(rootNode);

      final ArtifactScope artifactScope = new ArtifactScope(Optional.empty(), "", new ArrayList<>());
      putOnStack(artifactScope);

      rootNode.accept(this);

      return artifactScope;
  }

  @Override
  public void visit(final ASTProgram programNode) {
    final ProgramSymbol program = new ProgramSymbol("Program");
    putInScopeAndLinkWithAst(program, programNode);
  }
  
  @Override
  public void endVisit(final ASTProgram programNode) {
    removeCurrentScope();
  }
}
