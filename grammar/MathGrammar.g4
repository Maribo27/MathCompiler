grammar MathGrammar;

BEGIN_PROGRAM : 'begin';

BEGIN : '{';
END : '}';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';

INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';

PRINT: 'print';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
FUNCTION: 'function';
SIZE: 'size';
GET: 'get';
SET: 'set';
INDEX_OF: 'indexOf';

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
ASSIGNMENT : '=';
RESIDUAL : '%';
EXPONENTIATION : '^';

NEGATION: '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';
LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';

COMMA : ',';
DOT_COMMA : ';';

SPACE :   [ \n\t\r]+ -> skip;

NUMBER : ([-]?[0-9]+(.[0-9]+)* | [-]?[0-9].[0-9]([e][-])?[0-9]+[f]) ;
NAME : [a-zA-Z_][a-zA-Z_0-9]* ;
LINE : '"'(.)+?'"';

mathExpression : (NUMBER | NAME) (PLUS | MINUS | MULTIPLY | DIVIDE | RESIDUAL | EXPONENTIATION) (NUMBER | NAME);

math : mathVariable (PLUS | MINUS | MULTIPLY | DIVIDE | RESIDUAL | EXPONENTIATION) mathVariable;

program : BEGIN_PROGRAM block (functionReturn|functionNonReturn)*;

block : BEGIN content* END;

declarationInt: (INT? NAME ASSIGNMENT expression | INT NAME) DOT_COMMA;
declarationFloat: (FLOAT? NAME ASSIGNMENT expression | FLOAT NAME) DOT_COMMA;
declarationDouble: (DOUBLE? NAME ASSIGNMENT expression | DOUBLE NAME) DOT_COMMA;

print: PRINT OPEN_BRACKET (NUMBER | NAME | LINE | math) CLOSE_BRACKET DOT_COMMA;

inputSignature: OPEN_BRACKET NAME (COMMA NAME)* CLOSE_BRACKET;
functionCall: NAME OPEN_BRACKET (inputSignature)? CLOSE_BRACKET DOT_COMMA;

type: INT | FLOAT | DOUBLE;
functionSignature: OPEN_BRACKET (type NAME (COMMA (type NAME))*)? CLOSE_BRACKET;
functionReturn : FUNCTION type NAME functionSignature blockReturn;
functionNonReturn : FUNCTION NAME functionSignature blockNonReturn;

blockReturn : BEGIN content* RETURN NAME END;
blockNonReturn : BEGIN content* RETURN END;

compare : expression (EQUAL | NON_EQUAL | LESS | GREATER | LESS_OR_EQUAL | GREATER_OR_EQUAL) expression;
negationCompare : NEGATION OPEN_BRACKET compare CLOSE_BRACKET;

ifBlock : IF OPEN_BRACKET (compare|negationCompare) CLOSE_BRACKET block elseBlock?;
elseBlock: ELSE block;

whileBlock: WHILE OPEN_BRACKET (compare|negationCompare) CLOSE_BRACKET block;

expressionInBracket : OPEN_BRACKET (math | NUMBER) CLOSE_BRACKET DOT_COMMA;

expression:
        math
    |   NUMBER
    |   NAME
    |   functionCall
    ;

content :
        print
    |   declarationInt
    |   declarationFloat
    |   declarationDouble
    |   functionCall
    |   ifBlock
    |   whileBlock
    ;

mathVariable :
        NUMBER
    |   NAME
    |   mathExpression
    |   expressionInBracket;