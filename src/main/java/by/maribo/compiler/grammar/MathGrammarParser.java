// Generated from D:/Projects/Java/MathCompiler/grammar\MathGrammar.g4 by ANTLR 4.7
package by.maribo.compiler.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_PROGRAM=1, BEGIN=2, END=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, OPEN_SQUARE_BRACKET=6, 
		CLOSE_SQUARE_BRACKET=7, INT=8, FLOAT=9, DOUBLE=10, PRINT=11, IF=12, ELSE=13, 
		FOR=14, WHILE=15, RETURN=16, FUNCTION=17, SIZE=18, GET=19, SET=20, INDEX_OF=21, 
		PLUS=22, MINUS=23, MULTIPLY=24, DIVIDE=25, ASSIGNMENT=26, RESIDUAL=27, 
		EXPONENTIATION=28, NEGATION=29, EQUAL=30, NON_EQUAL=31, LESS=32, GREATER=33, 
		LESS_OR_EQUAL=34, GREATER_OR_EQUAL=35, COMMA=36, DOT_COMMA=37, SPACE=38, 
		NUMBER=39, NAME=40, LINE=41;
	public static final int
		RULE_mathExpression = 0, RULE_math = 1, RULE_program = 2, RULE_block = 3, 
		RULE_declarationInt = 4, RULE_declarationFloat = 5, RULE_declarationDouble = 6, 
		RULE_print = 7, RULE_inputSignature = 8, RULE_functionCall = 9, RULE_type = 10, 
		RULE_functionSignature = 11, RULE_functionReturn = 12, RULE_functionNonReturn = 13, 
		RULE_blockReturn = 14, RULE_blockNonReturn = 15, RULE_compare = 16, RULE_negationCompare = 17, 
		RULE_ifBlock = 18, RULE_elseBlock = 19, RULE_whileBlock = 20, RULE_expressionInBracket = 21, 
		RULE_expression = 22, RULE_content = 23, RULE_mathVariable = 24;
	public static final String[] ruleNames = {
		"mathExpression", "math", "program", "block", "declarationInt", "declarationFloat", 
		"declarationDouble", "print", "inputSignature", "functionCall", "type", 
		"functionSignature", "functionReturn", "functionNonReturn", "blockReturn", 
		"blockNonReturn", "compare", "negationCompare", "ifBlock", "elseBlock", 
		"whileBlock", "expressionInBracket", "expression", "content", "mathVariable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'int'", "'float'", 
		"'double'", "'print'", "'if'", "'else'", "'for'", "'while'", "'return'", 
		"'function'", "'size'", "'get'", "'set'", "'indexOf'", "'+'", "'-'", "'*'", 
		"'/'", "'='", "'%'", "'^'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN_PROGRAM", "BEGIN", "END", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "FLOAT", "DOUBLE", 
		"PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", "SIZE", "GET", 
		"SET", "INDEX_OF", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ASSIGNMENT", 
		"RESIDUAL", "EXPONENTIATION", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", 
		"GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "COMMA", "DOT_COMMA", 
		"SPACE", "NUMBER", "NAME", "LINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MathGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MathExpressionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MathGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MathGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> NAME() { return getTokens(MathGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MathGrammarParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(MathGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MathGrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(MathGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MathGrammarParser.DIVIDE, 0); }
		public TerminalNode RESIDUAL() { return getToken(MathGrammarParser.RESIDUAL, 0); }
		public TerminalNode EXPONENTIATION() { return getToken(MathGrammarParser.EXPONENTIATION, 0); }
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << RESIDUAL) | (1L << EXPONENTIATION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathContext extends ParserRuleContext {
		public List<MathVariableContext> mathVariable() {
			return getRuleContexts(MathVariableContext.class);
		}
		public MathVariableContext mathVariable(int i) {
			return getRuleContext(MathVariableContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MathGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MathGrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(MathGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MathGrammarParser.DIVIDE, 0); }
		public TerminalNode RESIDUAL() { return getToken(MathGrammarParser.RESIDUAL, 0); }
		public TerminalNode EXPONENTIATION() { return getToken(MathGrammarParser.EXPONENTIATION, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			mathVariable();
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << RESIDUAL) | (1L << EXPONENTIATION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(56);
			mathVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN_PROGRAM() { return getToken(MathGrammarParser.BEGIN_PROGRAM, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FunctionReturnContext> functionReturn() {
			return getRuleContexts(FunctionReturnContext.class);
		}
		public FunctionReturnContext functionReturn(int i) {
			return getRuleContext(FunctionReturnContext.class,i);
		}
		public List<FunctionNonReturnContext> functionNonReturn() {
			return getRuleContexts(FunctionNonReturnContext.class);
		}
		public FunctionNonReturnContext functionNonReturn(int i) {
			return getRuleContext(FunctionNonReturnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BEGIN_PROGRAM);
			setState(59);
			block();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(61);
					functionNonReturn();
					}
					break;
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MathGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MathGrammarParser.END, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(BEGIN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(68);
				content();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationIntContext extends ParserRuleContext {
		public TerminalNode DOT_COMMA() { return getToken(MathGrammarParser.DOT_COMMA, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MathGrammarParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(MathGrammarParser.INT, 0); }
		public DeclarationIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterDeclarationInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitDeclarationInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitDeclarationInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationIntContext declarationInt() throws RecognitionException {
		DeclarationIntContext _localctx = new DeclarationIntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(76);
					match(INT);
					}
				}

				setState(79);
				match(NAME);
				setState(80);
				match(ASSIGNMENT);
				setState(81);
				expression();
				}
				break;
			case 2:
				{
				setState(82);
				match(INT);
				setState(83);
				match(NAME);
				}
				break;
			}
			setState(86);
			match(DOT_COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationFloatContext extends ParserRuleContext {
		public TerminalNode DOT_COMMA() { return getToken(MathGrammarParser.DOT_COMMA, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MathGrammarParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(MathGrammarParser.FLOAT, 0); }
		public DeclarationFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterDeclarationFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitDeclarationFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitDeclarationFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFloatContext declarationFloat() throws RecognitionException {
		DeclarationFloatContext _localctx = new DeclarationFloatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLOAT) {
					{
					setState(88);
					match(FLOAT);
					}
				}

				setState(91);
				match(NAME);
				setState(92);
				match(ASSIGNMENT);
				setState(93);
				expression();
				}
				break;
			case 2:
				{
				setState(94);
				match(FLOAT);
				setState(95);
				match(NAME);
				}
				break;
			}
			setState(98);
			match(DOT_COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationDoubleContext extends ParserRuleContext {
		public TerminalNode DOT_COMMA() { return getToken(MathGrammarParser.DOT_COMMA, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MathGrammarParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(MathGrammarParser.DOUBLE, 0); }
		public DeclarationDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterDeclarationDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitDeclarationDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitDeclarationDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationDoubleContext declarationDouble() throws RecognitionException {
		DeclarationDoubleContext _localctx = new DeclarationDoubleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLE) {
					{
					setState(100);
					match(DOUBLE);
					}
				}

				setState(103);
				match(NAME);
				setState(104);
				match(ASSIGNMENT);
				setState(105);
				expression();
				}
				break;
			case 2:
				{
				setState(106);
				match(DOUBLE);
				setState(107);
				match(NAME);
				}
				break;
			}
			setState(110);
			match(DOT_COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MathGrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode DOT_COMMA() { return getToken(MathGrammarParser.DOT_COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(MathGrammarParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode LINE() { return getToken(MathGrammarParser.LINE, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PRINT);
			setState(113);
			match(OPEN_BRACKET);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(114);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(115);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(116);
				match(LINE);
				}
				break;
			case 4:
				{
				setState(117);
				math();
				}
				break;
			}
			setState(120);
			match(CLOSE_BRACKET);
			setState(121);
			match(DOT_COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputSignatureContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(MathGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MathGrammarParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathGrammarParser.COMMA, i);
		}
		public InputSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterInputSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitInputSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitInputSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSignatureContext inputSignature() throws RecognitionException {
		InputSignatureContext _localctx = new InputSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inputSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(NAME);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				match(NAME);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode DOT_COMMA() { return getToken(MathGrammarParser.DOT_COMMA, 0); }
		public InputSignatureContext inputSignature() {
			return getRuleContext(InputSignatureContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(NAME);
			setState(132);
			match(OPEN_BRACKET);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(133);
				inputSignature();
				}
			}

			setState(136);
			match(CLOSE_BRACKET);
			setState(137);
			match(DOT_COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MathGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MathGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MathGrammarParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(MathGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MathGrammarParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathGrammarParser.COMMA, i);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(OPEN_BRACKET);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) {
				{
				setState(142);
				type();
				setState(143);
				match(NAME);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					{
					setState(145);
					type();
					setState(146);
					match(NAME);
					}
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(155);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MathGrammarParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public BlockReturnContext blockReturn() {
			return getRuleContext(BlockReturnContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FUNCTION);
			setState(158);
			type();
			setState(159);
			match(NAME);
			setState(160);
			functionSignature();
			setState(161);
			blockReturn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNonReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MathGrammarParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public BlockNonReturnContext blockNonReturn() {
			return getRuleContext(BlockNonReturnContext.class,0);
		}
		public FunctionNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterFunctionNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitFunctionNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitFunctionNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNonReturnContext functionNonReturn() throws RecognitionException {
		FunctionNonReturnContext _localctx = new FunctionNonReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FUNCTION);
			setState(164);
			match(NAME);
			setState(165);
			functionSignature();
			setState(166);
			blockNonReturn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockReturnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MathGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(MathGrammarParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public TerminalNode END() { return getToken(MathGrammarParser.END, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterBlockReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitBlockReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitBlockReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockReturnContext blockReturn() throws RecognitionException {
		BlockReturnContext _localctx = new BlockReturnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(BEGIN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(169);
				content();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(RETURN);
			setState(176);
			match(NAME);
			setState(177);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockNonReturnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MathGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(MathGrammarParser.RETURN, 0); }
		public TerminalNode END() { return getToken(MathGrammarParser.END, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterBlockNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitBlockNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitBlockNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNonReturnContext blockNonReturn() throws RecognitionException {
		BlockNonReturnContext _localctx = new BlockNonReturnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(BEGIN);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(180);
				content();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(RETURN);
			setState(187);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MathGrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(MathGrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(MathGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(MathGrammarParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(MathGrammarParser.LESS_OR_EQUAL, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(MathGrammarParser.GREATER_OR_EQUAL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expression();
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationCompareContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(MathGrammarParser.NEGATION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public NegationCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterNegationCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitNegationCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitNegationCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationCompareContext negationCompare() throws RecognitionException {
		NegationCompareContext _localctx = new NegationCompareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negationCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(NEGATION);
			setState(194);
			match(OPEN_BRACKET);
			setState(195);
			compare();
			setState(196);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MathGrammarParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public NegationCompareContext negationCompare() {
			return getRuleContext(NegationCompareContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IF);
			setState(199);
			match(OPEN_BRACKET);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case NUMBER:
			case NAME:
				{
				setState(200);
				compare();
				}
				break;
			case NEGATION:
				{
				setState(201);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			match(CLOSE_BRACKET);
			setState(205);
			block();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(206);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MathGrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ELSE);
			setState(210);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MathGrammarParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public NegationCompareContext negationCompare() {
			return getRuleContext(NegationCompareContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(WHILE);
			setState(213);
			match(OPEN_BRACKET);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case NUMBER:
			case NAME:
				{
				setState(214);
				compare();
				}
				break;
			case NEGATION:
				{
				setState(215);
				negationCompare();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			match(CLOSE_BRACKET);
			setState(219);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionInBracketContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MathGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MathGrammarParser.CLOSE_BRACKET, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MathGrammarParser.NUMBER, 0); }
		public ExpressionInBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterExpressionInBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitExpressionInBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitExpressionInBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInBracketContext expressionInBracket() throws RecognitionException {
		ExpressionInBracketContext _localctx = new ExpressionInBracketContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionInBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(OPEN_BRACKET);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(222);
				math();
				}
				break;
			case 2:
				{
				setState(223);
				match(NUMBER);
				}
				break;
			}
			setState(226);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MathGrammarParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				math();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationIntContext declarationInt() {
			return getRuleContext(DeclarationIntContext.class,0);
		}
		public DeclarationFloatContext declarationFloat() {
			return getRuleContext(DeclarationFloatContext.class,0);
		}
		public DeclarationDoubleContext declarationDouble() {
			return getRuleContext(DeclarationDoubleContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_content);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				declarationInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				declarationFloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				declarationDouble();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				whileBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathVariableContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MathGrammarParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(MathGrammarParser.NAME, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionInBracketContext expressionInBracket() {
			return getRuleContext(ExpressionInBracketContext.class,0);
		}
		public MathVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).enterMathVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathGrammarListener ) ((MathGrammarListener)listener).exitMathVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathGrammarVisitor ) return ((MathGrammarVisitor<? extends T>)visitor).visitMathVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathVariableContext mathVariable() throws RecognitionException {
		MathVariableContext _localctx = new MathVariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mathVariable);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				mathExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				expressionInBracket();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4A\n\4\f"+
		"\4\16\4D\13\4\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\5\6P\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\7\3\7\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0081\n\n\f"+
		"\n\16\n\u0084\13\n\3\13\3\13\3\13\5\13\u0089\n\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\5\r\u009c"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\7\20\u00ad\n\20\f\20\16\20\u00b0\13\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00cd"+
		"\n\24\3\24\3\24\3\24\5\24\u00d2\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00db\n\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00e3\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\5\30\u00eb\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00f4\n\31\3\32\3\32\3\32\3\32\5\32\u00fa\n\32\3\32\2\2\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2)*\4\2\30"+
		"\33\35\36\3\2\n\f\3\2 %\2\u0104\2\64\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bE"+
		"\3\2\2\2\nV\3\2\2\2\fb\3\2\2\2\16n\3\2\2\2\20r\3\2\2\2\22}\3\2\2\2\24"+
		"\u0085\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2\2\32\u009f\3\2\2\2\34\u00a5"+
		"\3\2\2\2\36\u00aa\3\2\2\2 \u00b5\3\2\2\2\"\u00bf\3\2\2\2$\u00c3\3\2\2"+
		"\2&\u00c8\3\2\2\2(\u00d3\3\2\2\2*\u00d6\3\2\2\2,\u00df\3\2\2\2.\u00ea"+
		"\3\2\2\2\60\u00f3\3\2\2\2\62\u00f9\3\2\2\2\64\65\t\2\2\2\65\66\t\3\2\2"+
		"\66\67\t\2\2\2\67\3\3\2\2\289\5\62\32\29:\t\3\2\2:;\5\62\32\2;\5\3\2\2"+
		"\2<=\7\3\2\2=B\5\b\5\2>A\5\32\16\2?A\5\34\17\2@>\3\2\2\2@?\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EI\7\4\2\2FH\5\60\31\2"+
		"GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\5\2\2"+
		"M\t\3\2\2\2NP\7\n\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7*\2\2RS\7\34\2"+
		"\2SW\5.\30\2TU\7\n\2\2UW\7*\2\2VO\3\2\2\2VT\3\2\2\2WX\3\2\2\2XY\7\'\2"+
		"\2Y\13\3\2\2\2Z\\\7\13\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7*\2\2^_"+
		"\7\34\2\2_c\5.\30\2`a\7\13\2\2ac\7*\2\2b[\3\2\2\2b`\3\2\2\2cd\3\2\2\2"+
		"de\7\'\2\2e\r\3\2\2\2fh\7\f\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7*\2\2"+
		"jk\7\34\2\2ko\5.\30\2lm\7\f\2\2mo\7*\2\2ng\3\2\2\2nl\3\2\2\2op\3\2\2\2"+
		"pq\7\'\2\2q\17\3\2\2\2rs\7\r\2\2sx\7\6\2\2ty\7)\2\2uy\7*\2\2vy\7+\2\2"+
		"wy\5\4\3\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\7\7\2\2"+
		"{|\7\'\2\2|\21\3\2\2\2}\u0082\7*\2\2~\177\7&\2\2\177\u0081\7*\2\2\u0080"+
		"~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7*\2\2\u0086\u0088\7"+
		"\6\2\2\u0087\u0089\5\22\n\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u008c\7\'\2\2\u008c\25\3\2\2"+
		"\2\u008d\u008e\t\4\2\2\u008e\27\3\2\2\2\u008f\u009b\7\6\2\2\u0090\u0091"+
		"\5\26\f\2\u0091\u0098\7*\2\2\u0092\u0093\7&\2\2\u0093\u0094\5\26\f\2\u0094"+
		"\u0095\7*\2\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\7\7\2\2\u009e\31\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1"+
		"\5\26\f\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\5\36\20"+
		"\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7*\2\2\u00a7\u00a8"+
		"\5\30\r\2\u00a8\u00a9\5 \21\2\u00a9\35\3\2\2\2\u00aa\u00ae\7\4\2\2\u00ab"+
		"\u00ad\5\60\31\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7\22\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b4\7\5\2\2\u00b4\37\3\2\2"+
		"\2\u00b5\u00b9\7\4\2\2\u00b6\u00b8\5\60\31\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\7\5\2\2\u00be"+
		"!\3\2\2\2\u00bf\u00c0\5.\30\2\u00c0\u00c1\t\5\2\2\u00c1\u00c2\5.\30\2"+
		"\u00c2#\3\2\2\2\u00c3\u00c4\7\37\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5"+
		"\"\22\2\u00c6\u00c7\7\7\2\2\u00c7%\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9"+
		"\u00cc\7\6\2\2\u00ca\u00cd\5\"\22\2\u00cb\u00cd\5$\23\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf"+
		"\u00d1\5\b\5\2\u00d0\u00d2\5(\25\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5\b\5\2\u00d5)\3"+
		"\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00da\7\6\2\2\u00d8\u00db\5\"\22\2\u00d9"+
		"\u00db\5$\23\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00de\5\b\5\2\u00de+\3\2\2\2\u00df\u00e2"+
		"\7\6\2\2\u00e0\u00e3\5\4\3\2\u00e1\u00e3\7)\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5-\3\2\2\2"+
		"\u00e6\u00eb\5\4\3\2\u00e7\u00eb\7)\2\2\u00e8\u00eb\7*\2\2\u00e9\u00eb"+
		"\5\24\13\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00f4\5\20\t\2\u00ed\u00f4\5"+
		"\n\6\2\u00ee\u00f4\5\f\7\2\u00ef\u00f4\5\16\b\2\u00f0\u00f4\5\24\13\2"+
		"\u00f1\u00f4\5&\24\2\u00f2\u00f4\5*\26\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed"+
		"\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\61\3\2\2\2\u00f5\u00fa\7)\2\2"+
		"\u00f6\u00fa\7*\2\2\u00f7\u00fa\5\2\2\2\u00f8\u00fa\5,\27\2\u00f9\u00f5"+
		"\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\63\3\2\2\2\31@BIOV[bgnx\u0082\u0088\u0098\u009b\u00ae\u00b9\u00cc\u00d1"+
		"\u00da\u00e2\u00ea\u00f3\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}