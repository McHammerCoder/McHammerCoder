// Generated from Hello.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(HelloParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(HelloParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#subdomain}.
	 * @param ctx the parse tree
	 */
	void enterSubdomain(HelloParser.SubdomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#subdomain}.
	 * @param ctx the parse tree
	 */
	void exitSubdomain(HelloParser.SubdomainContext ctx);
}