/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package automaton._symboltable;

import java.util.Optional;

public class AutomatonSymbol extends AutomatonSymbolTOP {

  public AutomatonSymbol(final String name) {
    super(name);
  }

  @Override
  protected AutomatonScope createSpannedScope() {
    return new AutomatonScope(Optional.empty());
  }

  public Optional<StateSymbol> getState(final String name) {
    return getSpannedScope().resolveLocally(name, StateSymbol.KIND);
  }

}
