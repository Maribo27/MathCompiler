// Generated from D:/Projects/Java/MathCompiler/grammar\MathGrammar.g4 by ANTLR 4.7
package by.maribo.compiler.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathGrammarParser}.
 */
public interface MathGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(MathGrammarParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(MathGrammarParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(MathGrammarParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(MathGrammarParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MathGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MathGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MathGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MathGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#declarationInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationInt(MathGrammarParser.DeclarationIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#declarationInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationInt(MathGrammarParser.DeclarationIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#declarationFloat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFloat(MathGrammarParser.DeclarationFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#declarationFloat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFloat(MathGrammarParser.DeclarationFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#declarationDouble}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationDouble(MathGrammarParser.DeclarationDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#declarationDouble}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationDouble(MathGrammarParser.DeclarationDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MathGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MathGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(MathGrammarParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(MathGrammarParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MathGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MathGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MathGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MathGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(MathGrammarParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(MathGrammarParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(MathGrammarParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(MathGrammarParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(MathGrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(MathGrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(MathGrammarParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(MathGrammarParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(MathGrammarParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(MathGrammarParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(MathGrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(MathGrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void enterNegationCompare(MathGrammarParser.NegationCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void exitNegationCompare(MathGrammarParser.NegationCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(MathGrammarParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(MathGrammarParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(MathGrammarParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(MathGrammarParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(MathGrammarParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(MathGrammarParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#expressionInBracket}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInBracket(MathGrammarParser.ExpressionInBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#expressionInBracket}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInBracket(MathGrammarParser.ExpressionInBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MathGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MathGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(MathGrammarParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(MathGrammarParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathGrammarParser#mathVariable}.
	 * @param ctx the parse tree
	 */
	void enterMathVariable(MathGrammarParser.MathVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathGrammarParser#mathVariable}.
	 * @param ctx the parse tree
	 */
	void exitMathVariable(MathGrammarParser.MathVariableContext ctx);
}