// Generated from D:/Projects/Java/MathCompiler/grammar\MathGrammar.g4 by ANTLR 4.7
package by.maribo.compiler.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(MathGrammarParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(MathGrammarParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MathGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MathGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#declarationInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationInt(MathGrammarParser.DeclarationIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#declarationFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationFloat(MathGrammarParser.DeclarationFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#declarationDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationDouble(MathGrammarParser.DeclarationDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MathGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(MathGrammarParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MathGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MathGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(MathGrammarParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(MathGrammarParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(MathGrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(MathGrammarParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(MathGrammarParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(MathGrammarParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#negationCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCompare(MathGrammarParser.NegationCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(MathGrammarParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(MathGrammarParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(MathGrammarParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#expressionInBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBracket(MathGrammarParser.ExpressionInBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MathGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(MathGrammarParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathGrammarParser#mathVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathVariable(MathGrammarParser.MathVariableContext ctx);
}