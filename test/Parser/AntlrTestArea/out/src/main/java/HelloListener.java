// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void enterHello(HelloParser.HelloContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void exitHello(HelloParser.HelloContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(HelloParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(HelloParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(HelloParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(HelloParser.TransitionContext ctx);
}