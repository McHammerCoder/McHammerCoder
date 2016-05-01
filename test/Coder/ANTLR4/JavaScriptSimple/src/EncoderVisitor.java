import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;

public class EncoderVisitor extends JavaScriptSimpleBaseListener {

private Encoder encoder = new Encoder();


@Override public void visitTerminal(TerminalNode node) {
		CommonToken token = (CommonToken)node.getPayload();
	
		if(encoder.check(token)){
			System.out.print(token.getText());
		}
		else{
			System.out.print(encoder.encode(token));
		}
	}	

}
