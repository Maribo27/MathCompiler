package by.maribo.compiler;

import by.maribo.compiler.implementation.ClassBuilder;
import by.maribo.compiler.implementation.VisitorException;
import by.maribo.compiler.implementation.VisitorImpl;
import by.maribo.compiler.grammar.MathGrammarLexer;
import by.maribo.compiler.grammar.MathGrammarParser;
import by.maribo.compiler.grammar.MathGrammarVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream(args[0]);
			CharStream input = CharStreams.fromStream(inputStream);
			MathGrammarLexer lexer = new MathGrammarLexer(input);
			MathGrammarParser parser = new MathGrammarParser(new CommonTokenStream(lexer));
			ParseTree tree = parser.program();
			MathGrammarVisitor visitor = new VisitorImpl();
			String output = (String) visitor.visit(tree);

			int beginIndex = args[0].lastIndexOf('/') + 1;
			int endIndex = args[0].lastIndexOf('.');
			String name = args[0].substring(beginIndex, endIndex);
			String top = ClassBuilder.createTopOfClass(name);

			FileWriter fileWriter = new FileWriter(name + ".java");
			fileWriter.write(top + output);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Cannot load files: " + e.getMessage());
		} catch (VisitorException e) {
			System.out.println("Compiler error : " + e.getMessage());
		}
	}
}