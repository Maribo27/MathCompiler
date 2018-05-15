import by.maribo.compiler.VisitorImpl;
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

			int beginIndex = args[0].lastIndexOf('/');
			int endIndex = args[0].lastIndexOf('.');
			FileWriter fileWriter = new FileWriter("out/" + args[0].substring(beginIndex, endIndex) + ".java");
			fileWriter.write(output);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
