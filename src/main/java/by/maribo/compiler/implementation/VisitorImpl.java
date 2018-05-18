package by.maribo.compiler.implementation;

import by.maribo.compiler.grammar.MathGrammarBaseVisitor;
import by.maribo.compiler.grammar.MathGrammarParser;
import by.maribo.compiler.variable.Type;
import by.maribo.compiler.variable.Variable;
import by.maribo.compiler.variable.VariableNotFoundException;
import by.maribo.compiler.variable.Variables;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VisitorImpl extends MathGrammarBaseVisitor<String> {

	private Variables variables = new Variables();
	private Map<String, String> functions = new HashMap<>();
	private Map<String, MathGrammarParser.FunctionSignatureContext> functionSignatures = new HashMap<>();

	@Override
	public String visitProgram(MathGrammarParser.ProgramContext ctx) {
		StringBuilder functions = new StringBuilder();
		for (MathGrammarParser.FunctionReturnContext context : ctx.functionReturn()) {
			functions.append(visitFunctionReturn(context));
		}

		for (MathGrammarParser.FunctionNonReturnContext context : ctx.functionNonReturn()) {
			functions.append(visitFunctionNonReturn(context));
		}

		return visitBlock(ctx.block()) +
				functions.toString() +
				ClassBuilder.createEndOfClass();
	}

	@Override
	public String visitBlock(MathGrammarParser.BlockContext ctx) {
		variables.increase();

		StringBuilder buffer = new StringBuilder("{\n");
		for (MathGrammarParser.ContentContext context : ctx.content()) {
			buffer.append(visitContent(context)).append("\n");
		}
		buffer.append("}");

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
		}
		throw new WrongContentException("Wrong type of content");
	}

	@Override
	public String visitMathExpression(MathGrammarParser.MathExpressionContext ctx) {
		if (ctx.getChildCount() == 3) {
			return ctx.getChild(0).getText() +
					ctx.getChild(1).getText() +
					ctx.getChild(2).getText();
		}
		throw new WrongExpressionException("Cannot get math expression " + ctx.getText());
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
		String text = ctx.getChild(1).getText();
		if (!text.startsWith("(")) {
			text = "(" + text + ")";
		}
		return text;
	}

	@Override
	public String visitMathVariable(MathGrammarParser.MathVariableContext ctx) {
		if (ctx.NAME() != null) {
			variables.get(ctx.NAME().getText());
			return ctx.NAME().getText();
		} else if (ctx.NUMBER() != null) {
			return ctx.NUMBER().getText();
		} else if (ctx.mathExpression() != null) {
			return visitMathExpression(ctx.mathExpression());
		} else if (ctx.expressionInBracket() != null) {
			return visitExpressionInBracket(ctx.expressionInBracket());
		}
		throw new MathVariableNotFoundException("Cannot get variable " + ctx.getChild(0).getText());
	}

	@Override
	public String visitDeclarationInt(MathGrammarParser.DeclarationIntContext ctx) {
		if (ctx.getChildCount() > 5) {
			throw new DeclarationException("Wrong variable name or value");
		}
		String buffer = "";
		String variable = ctx.NAME().getText();

		try {
			Variable var = variables.get(variable);
			if (ctx.INT() != null) {
				throw new DeclarationException("Initialize error: variable " + variable + " is exist");
			} else {
				boolean castError = var.getType() != Type.INT &&
						(ctx.expression() == null || ctx.expression().math() == null || ctx.expression().math().EXPONENTIATION() == null);
				if (castError) {
					throw new DeclarationException("Cast error: variable " + variable + " is not int");
				}
			}
		} catch (VariableNotFoundException e) {
			variables.put(Type.INT, variable);
			buffer += "int ";
		}
		buffer += variable;
		if (ctx.expression() != null) {
			if (ctx.expression().functionCall() != null) {
				MathGrammarParser.FunctionCallContext functionCallContext = ctx.expression().functionCall();
				String functionCallName = functionCallContext.NAME().getText();
				if (functions.get(functionCallName) != null) {
					if (!functions.get(functionCallName).equalsIgnoreCase("int")) {
						throw new DeclarationException("Cast error: function " + functionCallName + " return not int");
					}
				}
			}
			buffer += " = " + visitExpression(ctx.expression());
		}
		buffer += ";";
		return buffer;
	}

	@Override
	public String visitDeclarationDouble(MathGrammarParser.DeclarationDoubleContext ctx) {
		String buffer = "";
		String variable = ctx.NAME().getText();

		try {
			Variable var = variables.get(variable);
			if (ctx.DOUBLE() != null) {
				throw new DeclarationException("Initialize error: variable " + variable + " is exist");
			} else if (var.getType() != Type.DOUBLE) {
				throw new DeclarationException("Cast error: variable " + variable + " is not double");
			}
		} catch (VariableNotFoundException e) {
			variables.put(Type.DOUBLE, variable);
			buffer += "double ";
		}
		buffer += variable;
		if (ctx.expression() != null) {
			if (ctx.expression().functionCall() != null) {
				MathGrammarParser.FunctionCallContext functionCallContext = ctx.expression().functionCall();
				if (functionCallContext != null) {
					String functionCallName = functionCallContext.NAME().getText();
					if (functions.get(functionCallName) != null) {
						if (!functions.get(functionCallName).equalsIgnoreCase("double")) {
							throw new DeclarationException("Cast error: function " + functionCallName + " return not double");
						}
					}
				}
			}
			buffer += " = " + visitExpression(ctx.expression());
		}
		buffer += ";";
		return buffer;

	}

	@Override
	public String visitDeclarationFloat(MathGrammarParser.DeclarationFloatContext ctx) {
		String buffer = "";
		String variable = ctx.NAME().getText();

		try {
			Variable var = variables.get(variable);
			if (ctx.FLOAT() != null) {
				throw new DeclarationException("Initialize error: variable " + variable + " is exist");
			} else if (var.getType() != Type.FLOAT) {
				throw new DeclarationException("Cast error: variable " + variable + " is not float");
			}
		} catch (VariableNotFoundException e) {
			variables.put(Type.FLOAT, variable);
			buffer += "float ";
		}
		buffer += variable;
		if (ctx.expression() != null) {
			if (ctx.expression().functionCall() != null) {
				MathGrammarParser.FunctionCallContext functionCallContext = ctx.expression().functionCall();
				if (functionCallContext != null) {
					String functionCallName = functionCallContext.NAME().getText();
					if (functions.get(functionCallName) != null) {
						if (!functions.get(functionCallName).equalsIgnoreCase("float")) {
							throw new DeclarationException("Cast error: function " + functionCallName + " return not float");
						}
					}
				}
			}
			buffer += " = " + visitExpression(ctx.expression());
		}
		buffer += ";";
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
		}
		throw new PrintException("Cannot print this information: " + ctx.getText());
	}

	@Override
	public String visitInputSignature(MathGrammarParser.InputSignatureContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitFunctionCall(MathGrammarParser.FunctionCallContext ctx) {
		String buffer = "";
		String name = ctx.NAME().getText();
		if (functions.get(name) == null) {
			throw new FunctionException("Initialize error: cannot find function " + name);
		} else if (!checkSignatures(ctx.inputSignature(), functionSignatures.get(name))) {
			throw new FunctionException("Error: cant find such arguments in function " + name);
		}
		if (ctx.inputSignature() != null) {
			buffer += name + "(" + visitInputSignature(ctx.inputSignature())+ ")";
		} else {
			buffer += name + "()";
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
		String name = ctx.NAME().getText();
		MathGrammarParser.TypeContext type = ctx.type();
		if (functions.get(name) == null) {
			functions.put(name, visitType(type));
		} else {
			throw new FunctionException("Function name " + name + " already used");
		}
		buffer += "\nprivate " + visitType(type) + " " + name;
		MathGrammarParser.FunctionSignatureContext functionSignatureContext = ctx.functionSignature();
		if (functionSignatureContext != null) {
			buffer += visitFunctionSignature(functionSignatureContext) + "throws CompilerException";
			functionSignatures.put(name, functionSignatureContext);
		} else {
			buffer += "() throws CompilerException";
		}
		variables.increase();
		if (functionSignatureContext != null) {
			for (int i = 0; i < functionSignatureContext.type().size(); i++) {
				String typeString = functionSignatureContext.type(i).getText();
				Type varType = Type.valueOf(typeString.toUpperCase());
				String varName = functionSignatureContext.NAME(i).getText();
				variables.put(varType, varName);
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
			throw new FunctionException("Function name " + ctx.NAME().getText() + " already used");
		}
		buffer += "private void " + ctx.NAME().getText();
		MathGrammarParser.FunctionSignatureContext functionSignatureContext = ctx.functionSignature();
		if (functionSignatureContext != null) {
			buffer += visitFunctionSignature(functionSignatureContext) + "throws CompilerException";
			functionSignatures.put(ctx.NAME().getText(), functionSignatureContext);
		} else {
			buffer += "() throws CompilerException";
		}
		variables.increase();
		for (int i = 0; i < Objects.requireNonNull(functionSignatureContext).type().size(); i++) {
			String typeString = functionSignatureContext.type(i).getText();
			Type type = Type.valueOf(typeString.toUpperCase());
			String name = functionSignatureContext.NAME(i).getText();
			variables.put(type, name);
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
			throw new BlockException("Error: cannot find variable " + ctx.NAME().getText() + " at return");
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
		buffer.append("}\n");

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
		} else if (ctx.NAME() != null) {
			String variable = ctx.NAME().getText();
			try {
				variables.get(variable);
			} catch (VariableNotFoundException e) {
				throw new WrongExpressionException("Error: cannot find variable " + variable);
			}
			return variable;
		} else if (ctx.getChildCount() == 1) {
			return ctx.getChild(0).getText();
		} else {
			return "";
		}
	}

	private boolean checkSignatures(MathGrammarParser.InputSignatureContext
			                                in, MathGrammarParser.FunctionSignatureContext sig) {
		boolean check = true;
		if (sig == null && in == null) {
			return true;
		} else if (sig == null || in == null) {
			return false;
		} else if (in.NAME().size() == sig.NAME().size()) {
			for (int i = 0; i < sig.type().size(); i++) {
				String name = in.NAME(i).getText();
				String visitType = visitType(sig.type(i));
				Type type = variables.get(name).getType();
				if (variables.get(name) == null || type != Type.valueOf(visitType.toUpperCase())) {
					check = false;
				}
			}
		} else {
			check = false;
		}
		return check;
	}
}