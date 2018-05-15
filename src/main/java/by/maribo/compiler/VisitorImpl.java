package by.maribo.compiler;

import by.maribo.compiler.grammar.MathGrammarBaseVisitor;
import by.maribo.compiler.grammar.MathGrammarParser;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static by.maribo.compiler.Text.*;

public class VisitorImpl extends MathGrammarBaseVisitor<String> {

	private List<String> errors = new ArrayList<>();
	private Variables variables = new Variables();
	private Map<String, String> functions = new HashMap<>();
	private Map<String, MathGrammarParser.FunctionSignatureContext> functionSignatures = new HashMap<>();

	@Override
	public String visitProgram(MathGrammarParser.ProgramContext ctx) {

		StringBuilder buffer1 = new StringBuilder();
		for (MathGrammarParser.FunctionReturnContext context : ctx.functionReturn()) {
			buffer1.append(visitFunctionReturn(context));
		}
		for (MathGrammarParser.FunctionNonReturnContext context : ctx.functionNonReturn()) {
			buffer1.append(visitFunctionNonReturn(context));
		}

		StringBuilder error = new StringBuilder();

		if (errors.size() > 0) {
			for (String string : errors) {
				error.append(string).append("\n");
			}
			JOptionPane.showMessageDialog(null, error.toString());
		}

		return PROGRAM +
				visitBlock(ctx.block()) +
				buffer1 +
				INT_CLASS +
				FLOAT_CLASS +
				DOUBLE_CLASS +
				EXCEPTION +
				"\n}";
	}

	@Override
	public String visitBlock(MathGrammarParser.BlockContext ctx) {
		variables.increase();

		StringBuilder buffer = new StringBuilder("{\n");
		for (MathGrammarParser.ContentContext context : ctx.content()) {
			buffer.append(visitContent(context)).append("\n");
		}
		buffer.append("}\n");

		variables.decrease();
		return buffer.toString();
	}


	@Override
	public String visitContent(MathGrammarParser.ContentContext ctx) {
		if (ctx.print() != null) {
			return visitPrint(ctx.print());
		} else if (ctx.declarationInt() != null) {
			return visitDeclarationInt(ctx.declarationInt());
		} else if (ctx.declarationFloat() != null) {
			return visitDeclarationFloat(ctx.declarationFloat());
		} else if (ctx.declarationDouble() != null) {
			return visitDeclarationDouble(ctx.declarationDouble());
		} else if (ctx.functionCall() != null) {
			return visitFunctionCall(ctx.functionCall()) + ";";
		} else if (ctx.ifBlock() != null) {
			return visitIfBlock(ctx.ifBlock());
		} else if (ctx.whileBlock() != null) {
			return visitWhileBlock(ctx.whileBlock());
		} else {
			return "";
		}
	}

	@Override
	public String visitMathExpression(MathGrammarParser.MathExpressionContext ctx) {
		StringBuilder stringBuilder = new StringBuilder();
		if (ctx.getChildCount() == 3) {
			stringBuilder.append(ctx.getChild(0).getText());
			stringBuilder.append(ctx.getChild(1).getText());
			stringBuilder.append(ctx.getChild(2).getText());
		}
		return stringBuilder.toString();
	}

	@Override
	public String visitMath(MathGrammarParser.MathContext ctx) {
		StringBuilder stringBuilder = new StringBuilder();
		if (ctx.EXPONENTIATION() != null) {
			stringBuilder.append("Math.pow(");
			stringBuilder.append(visitMathVariable(ctx.mathVariable(0)));
			stringBuilder.append(", ");
			stringBuilder.append(visitMathVariable(ctx.mathVariable(1)));
			stringBuilder.append(")");
		} else {
			stringBuilder.append(visitMathVariable(ctx.mathVariable(0)));
			stringBuilder.append(ctx.getChild(1).getText());
			stringBuilder.append(visitMathVariable(ctx.mathVariable(1)));
		}
		return stringBuilder.toString();
	}

	@Override
	public String visitExpressionInBracket(MathGrammarParser.ExpressionInBracketContext ctx) {
		StringBuilder s = new StringBuilder();
		s.append("(");
		if (ctx.getChildCount() == 1) {
			if (variables.get(ctx.getChild(0).getText()) == null) {
				errors.add("Error: cant find variable " + ctx.getChild(0).getText());
			}
			s.append(ctx.getChild(0).getText());
		} else if (ctx.math() != null) {
			s.append(visitMath(ctx.math()));
		} else {
			return "";
		}
		s.append(")");
		return s.toString();
	}

	@Override
	public String visitMathVariable(MathGrammarParser.MathVariableContext ctx) {
		if (ctx.getChildCount() == 1) {
			if (variables.get(ctx.getChild(0).getText()) == null) {
				errors.add("Error: cant find variable " + ctx.getChild(0).getText());
			}
			return ctx.getChild(0).getText();
		} else if (ctx.mathExpression() != null) {
			return visitMathExpression(ctx.mathExpression());
		} else if (ctx.expressionInBracket() != null) {
			return visitExpressionInBracket(ctx.expressionInBracket());
		} else {
			return "";
		}
	}

	@Override
	public String visitDeclarationInt(MathGrammarParser.DeclarationIntContext ctx) {
		String buffer = "";
		if (variables.get(ctx.NAME().getText()) != null) {
			if (ctx.INT() != null) {
				errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
			} else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("int")) {
				errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not int");
			}
		} else {
			variables.put(ctx.NAME().getText(), "int");
			buffer += "int ";
		}
		if (ctx.expression().functionCall() != null) {
			if (functions.get(ctx.expression().functionCall().NAME().getText()) != null) {
				if (!functions.get(ctx.expression().functionCall().NAME().getText()).equalsIgnoreCase("int")) {
					errors.add("Cast error: function " + ctx.expression().functionCall().NAME().getText() + " return not int");
				}
			}
		}
		buffer += ctx.NAME().getText() + " = " + visitExpression(ctx.expression()) + ";";
		return buffer;
	}

	@Override
	public String visitDeclarationDouble(MathGrammarParser.DeclarationDoubleContext ctx) {
		String buffer = "";
		if (variables.get(ctx.NAME().getText()) != null) {
			if (ctx.DOUBLE() != null) {
				errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
			} else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("double")) {
				errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not double");
			}
		} else {
			variables.put(ctx.NAME().getText(), "double");
			buffer += "double ";
		}
		if (ctx.expression().functionCall() != null) {
			if (functions.get(ctx.expression().functionCall().NAME().getText()) != null) {
				if (!functions.get(ctx.expression().functionCall().NAME().getText()).equalsIgnoreCase("double")) {
					errors.add("Cast error: function " + ctx.expression().functionCall().NAME().getText() + " return not double");
				}
			}
		}
		buffer += ctx.NAME().getText() + " = " + visitExpression(ctx.expression()) + ";";
		return buffer;

	}

	@Override
	public String visitDeclarationFloat(MathGrammarParser.DeclarationFloatContext ctx) {
		String buffer = "";
		if (variables.get(ctx.NAME().getText()) != null) {
			if (ctx.FLOAT() != null) {
				errors.add("Initialize error: Variable " + ctx.NAME().getText() + " already used");
			} else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("float")) {
				errors.add("Cast error:  variable " + ctx.NAME().getText() + " is not float");
			}
		} else {
			variables.put(ctx.NAME().getText(), "float");
			buffer += "float ";
		}
		if (ctx.expression().functionCall() != null) {
			if (functions.get(ctx.expression().functionCall().NAME().getText()) != null) {
				if (!functions.get(ctx.expression().functionCall().NAME().getText()).equalsIgnoreCase("float")) {
					errors.add("Cast error: function " + ctx.expression().functionCall().NAME().getText() + " return not float");
				}
			}
		}
		buffer += ctx.NAME().getText() + " = " + visitExpression(ctx.expression()) + ";";
		return buffer;
	}

	@Override
	public String visitPrint(MathGrammarParser.PrintContext ctx) {
		if (ctx.NAME() != null) {
			return "\tSystem.out.println(" + ctx.NAME().getText() + ");";
		} else if (ctx.NUMBER() != null) {
			return "\tSystem.out.println(\"" + ctx.NUMBER().getText() + "\");";
		} else if (ctx.LINE() != null) {
			return "\tSystem.out.println(" + ctx.LINE().getText() + ");";
		} else if (ctx.math() != null) {
			return "\tSystem.out.println(" + visitMath(ctx.math()) + ");";
		} else {
			return "";
		}
	}

	@Override
	public String visitInputSignature(MathGrammarParser.InputSignatureContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitFunctionCall(MathGrammarParser.FunctionCallContext ctx) {
		String buffer = "";
		if (functions.get(ctx.NAME().getText()) == null) {
			errors.add("Initialize error: cant find function " + ctx.NAME().getText());
		} else if (!checkSignatures(ctx.inputSignature(), functionSignatures.get(ctx.NAME().getText()))) {
			errors.add("Error: cant find such arguments in function " + ctx.NAME().getText());
		}
		if (ctx.inputSignature() != null) {
			buffer += ctx.NAME().getText() + visitInputSignature(ctx.inputSignature());
		} else {
			buffer += ctx.NAME().getText() + "()";
		}
		return buffer;
	}

	@Override
	public String visitType(MathGrammarParser.TypeContext ctx) {
		if (ctx.INT() != null) {
			return "int";
		}
		if (ctx.FLOAT() != null) {
			return "float";
		}
		return "";
	}

	@Override
	public String visitFunctionSignature(MathGrammarParser.FunctionSignatureContext ctx) {
		StringBuilder buffer = new StringBuilder("(");
		for (int i = 0; i < ctx.NAME().size(); i++) {
			buffer.append(visitType(ctx.type(i))).append(" ").append(ctx.NAME(i).getText());
			if (i != (ctx.NAME().size() - 1)) {
				buffer.append(", ");
			}
		}
		buffer.append(")");
		return buffer.toString();
	}

	@Override
	public String visitFunctionReturn(MathGrammarParser.FunctionReturnContext ctx) {
		String buffer = "";
		if (functions.get(ctx.NAME().getText()) == null) {
			functions.put(ctx.NAME().getText(), visitType(ctx.type()));
		} else {
			errors.add("Function name " + ctx.NAME().getText() + " already used");
		}
		buffer += "\nprivate " + visitType(ctx.type()) + " " + ctx.NAME().getText();
		if (ctx.functionSignature() != null) {
			buffer += visitFunctionSignature(ctx.functionSignature()) + "throws Exception";
			functionSignatures.put(ctx.NAME().getText(), ctx.functionSignature());
		} else {
			buffer += "() throws Exception";
		}
		variables.increase();
		if (ctx.functionSignature() != null) {
			for (int i = 0; i < ctx.functionSignature().type().size(); i++) {
				variables.put(ctx.functionSignature().NAME(i).getText(), ctx.functionSignature().type(i).getText());
			}
		}
		buffer += visitBlockReturn(ctx.blockReturn());
		return buffer;
	}

	@Override
	public String visitFunctionNonReturn(MathGrammarParser.FunctionNonReturnContext ctx) {
		String buffer = "";
		if (functions.get(ctx.NAME().getText()) == null) {
			functions.put(ctx.NAME().getText(), "void");
		} else {
			errors.add("Function name " + ctx.NAME().getText() + " already used");
		}
		buffer += "private void " + ctx.NAME().getText();
		if (ctx.functionSignature() != null) {
			buffer += visitFunctionSignature(ctx.functionSignature()) + "throws Exception";
			functionSignatures.put(ctx.NAME().getText(), ctx.functionSignature());
		} else {
			buffer += "() throws Exception";
		}
		variables.increase();
		for (int i = 0; i < ctx.functionSignature().type().size(); i++) {
			variables.put(ctx.functionSignature().NAME(i).getText(), ctx.functionSignature().type(i).getText());
		}
		buffer += visitBlockNonReturn(ctx.blockNonReturn());
		return buffer;
	}

	@Override
	public String visitBlockReturn(MathGrammarParser.BlockReturnContext ctx) {
		StringBuilder buffer = new StringBuilder("{\n");
		for (MathGrammarParser.ContentContext context : ctx.content()) {
			buffer.append(visitContent(context)).append("\n");
		}
		buffer.append("return ").append(ctx.NAME().getText()).append(";").append("\n}\n");

		if (variables.get(ctx.NAME().getText()) == null) {
			errors.add("Error: cant find variable " + ctx.NAME().getText() + " at return");
		}
		variables.decrease();
		return buffer.toString();

	}

	@Override
	public String visitBlockNonReturn(MathGrammarParser.BlockNonReturnContext ctx) {
		StringBuilder buffer = new StringBuilder("{\n");
		for (MathGrammarParser.ContentContext context : ctx.content()) {
			buffer.append(visitContent(context)).append("\n");
		}
		buffer.append("return;\n}\n");

		variables.decrease();
		return buffer.toString();
	}

	@Override
	public String visitCompare(MathGrammarParser.CompareContext ctx) {
		String buffer = "";
		buffer += visitExpression(ctx.expression(0)) + ctx.getChild(1).getText() + visitExpression(ctx.expression(1));
		return buffer;
	}

	@Override
	public String visitNegationCompare(MathGrammarParser.NegationCompareContext ctx) {
		return "!(" + visitCompare(ctx.compare()) + ")";
	}

	@Override
	public String visitElseBlock(MathGrammarParser.ElseBlockContext ctx) {
		String buffer = "";
		buffer += "else" + visitBlock(ctx.block());
		return buffer;
	}

	@Override
	public String visitIfBlock(MathGrammarParser.IfBlockContext ctx) {
		String buffer = "";
		if (ctx.compare() != null) {
			buffer += "if(" + visitCompare(ctx.compare()) + ")";
		} else if (ctx.negationCompare() != null) {
			buffer += "if(" + visitNegationCompare(ctx.negationCompare()) + ")";
		}
		buffer += visitBlock(ctx.block());
		if (ctx.elseBlock() != null) {
			buffer += visitElseBlock(ctx.elseBlock());
		}
		return buffer;
	}

	@Override
	public String visitWhileBlock(MathGrammarParser.WhileBlockContext ctx) {
		StringBuilder buffer = new StringBuilder();
		if (ctx.compare() != null) {
			buffer.append("while(");
			buffer.append(visitCompare(ctx.compare()));
			buffer.append(")");
		} else if (ctx.negationCompare() != null) {
			buffer.append("while(");
			buffer.append(visitNegationCompare(ctx.negationCompare()));
			buffer.append(")");
		}
		buffer.append(visitBlock(ctx.block()));
		return buffer.toString();
	}

	@Override
	public String visitExpression(MathGrammarParser.ExpressionContext ctx) {
		if (ctx.functionCall() != null) {
			return visitFunctionCall(ctx.functionCall());
		} else if (ctx.math() != null) {
			return visitMath(ctx.math());
		} else if (ctx.getChildCount() == 1) {
			if (variables.get(ctx.getChild(0).getText()) == null) {
				errors.add("Error: cant find variable " + ctx.getChild(0).getText());
			}
			return ctx.getChild(0).getText();
		} else {
			return "";
		}
	}

	private boolean checkSignatures(MathGrammarParser.InputSignatureContext in, MathGrammarParser.FunctionSignatureContext sig) {
		boolean check = true;
		if (sig == null && in == null) {
			return true;
		} else if (sig == null || in == null) {
			return false;
		} else if (in.NAME().size() == sig.NAME().size()) {
			for (int i = 0; i < sig.type().size(); i++) {
				if (variables.get(in.NAME(i).getText()) == null
						|| !variables.get(in.NAME(i).getText()).equalsIgnoreCase(visitType(sig.type(i)))) {
					check = false;
				}
			}
		} else {
			check = false;
		}
		return check;
	}
}