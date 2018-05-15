package by.maribo.compiler;

final class Text {

	static final String PROGRAM = "public class Program {\n" +
			"\tpublic static void main(String[] args) {\n" +
			"\t\ttry {\n" +
			"\t\t\tnew Program().start();\n" +
			"\t\t} catch (CompilerException e) {\n" +
			"\t\t\tSystem.err.println(e.getMessage());\n" +
			"\t\t}\n" +
			"\t}\n" +
			"\t\n" +
			"\tprivate void start() ";

	static final String INT_CLASS = "\n" +
			"\n" +
			"\tpublic class Int {\n" +
			"\t\tprivate int intNumber;\n" +
			"\n" +
			"\t\tpublic Int(int intNumber) {\n" +
			"\t\t\tthis.intNumber = intNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic int getIntNumber() {\n" +
			"\t\t\treturn intNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic void setIntNumber(int intNumber) {\n" +
			"\t\t\tthis.intNumber = intNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\t@Override\n" +
			"\t\tpublic String toString() {\n" +
			"\t\t\treturn String.valueOf(intNumber);\n" +
			"\t\t}\n" +
			"\t}";

	static final String FLOAT_CLASS = "\n" +
			"\n" +
			"\tpublic class Float {\n" +
			"\t\tprivate float floatNumber;\n" +
			"\n" +
			"\t\tpublic Float(float floatNumber) {\n" +
			"\t\t\tthis.floatNumber = floatNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic float getDoubleNumber() {\n" +
			"\t\t\treturn floatNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic void setDoubleNumber(float floatNumber) {\n" +
			"\t\t\tthis.floatNumber = floatNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\t@Override\n" +
			"\t\tpublic String toString() {\n" +
			"\t\t\treturn String.valueOf(floatNumber);\n" +
			"\t\t}\n" +
			"\t}";

	static final String DOUBLE_CLASS = "\n" +
			"\t\n" +
			"\tpublic class Double {\n" +
			"\t\tprivate double doubleNumber;\n" +
			"\n" +
			"\t\tpublic Double(double doubleNumber) {\n" +
			"\t\t\tthis.doubleNumber = doubleNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic double getDoubleNumber() {\n" +
			"\t\t\treturn doubleNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\tpublic void setDoubleNumber(double doubleNumber) {\n" +
			"\t\t\tthis.doubleNumber = doubleNumber;\n" +
			"\t\t}\n" +
			"\n" +
			"\t\t@Override\n" +
			"\t\tpublic String toString() {\n" +
			"\t\t\treturn String.valueOf(doubleNumber);\n" +
			"\t\t}\n" +
			"\t}";

	static final String EXCEPTION = "\n" +
			"\n" +
			"\tpublic class CompilerException extends RuntimeException {\n" +
			"\t\tpublic CompilerException(String message) {\n" +
			"\t\t\tsuper(message);\n" +
			"\t\t}\n" +
			"\t}";

	private Text() {
	}
}
