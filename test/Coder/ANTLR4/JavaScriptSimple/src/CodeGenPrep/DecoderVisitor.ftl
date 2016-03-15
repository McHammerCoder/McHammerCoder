${tc.signature("ast")}
<#assign parserName = glex.getGlobalValue("ast").getSimpleName()?cap_first>


import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;

public class DecoderVisitor extends ${parserName}BaseListener {


private Decoder decoder = new Decoder();

@Override public void visitTerminal(TerminalNode node) {
		CommonToken token = (CommonToken)node.getPayload();
	 		System.out.print(decoder.decode(token));
		}

}

