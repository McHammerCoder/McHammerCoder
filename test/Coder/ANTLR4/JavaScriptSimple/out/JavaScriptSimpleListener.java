// Generated from JavaScriptSimple.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptSimpleParser}.
 */
public interface JavaScriptSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#javascriptprogram}.
	 * @param ctx the parse tree
	 */
	void enterJavascriptprogram(JavaScriptSimpleParser.JavascriptprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#javascriptprogram}.
	 * @param ctx the parse tree
	 */
	void exitJavascriptprogram(JavaScriptSimpleParser.JavascriptprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(JavaScriptSimpleParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(JavaScriptSimpleParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(JavaScriptSimpleParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(JavaScriptSimpleParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaScriptSimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaScriptSimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(JavaScriptSimpleParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(JavaScriptSimpleParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(JavaScriptSimpleParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(JavaScriptSimpleParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarations(JavaScriptSimpleParser.VariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#variableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarations(JavaScriptSimpleParser.VariableDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaScriptSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaScriptSimpleParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(JavaScriptSimpleParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(JavaScriptSimpleParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(JavaScriptSimpleParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(JavaScriptSimpleParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(JavaScriptSimpleParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(JavaScriptSimpleParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaScriptSimpleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaScriptSimpleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptSimpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaScriptSimpleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptSimpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaScriptSimpleParser.IdentifierContext ctx);
}