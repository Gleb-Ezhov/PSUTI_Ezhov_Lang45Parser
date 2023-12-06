grammar model_lang45;

// PARSER -------------------------
program // starter rule
  : ((declaration | statement) (COLON)?)+ END;

declaration
  : DIM identifier (COMMA identifier)* type;

type
  : (INT | FLOAT | BOOL);

statement
  : compound_st | assignment_st | conditional_st |
    fixed_loop_st | conditional_loop_st |
    input_st | output_st;

compound_st
  : BEGIN statement (SEMICOLON statement)* END;

assignment_st
  : identifier ASSIGNMENT expression;

conditional_st
  : IF OPEN_BRACKET expression CLOSE_BRACKET
    statement (ELSE statement)?;

fixed_loop_st
  : FOR assignment_st TO expression
    (STEP expression)? statement NEXT;

conditional_loop_st
  : WHILE OPEN_BRACKET expression CLOSE_BRACKET statement;

input_st
  : READLN identifier (COMMA identifier)*;

output_st
  : WRITELN expression (COMMA expression);

// Expression related
expression
  : operand (COMPARISON_OPS operand)*;

operand
  : term (addition_ops term)*;

addition_ops
  : ADD | SUB | OR;

term
  : factor (MULTIPLICATION_OPS factor)*;

number
  : INT_NUMBER | REAL_NUMBER;

logic_value
  : TRUE | FALSE;

factor
  : identifier | number | logic_value |
    (UNARY_OP factor) | (OPEN_BRACKET expression CLOSE_BRACKET);

identifier
  : ID;

// ------ LEXER (order of rules matters!) -----
// Keywords Literals
BEGIN
  : 'begin';

END
  : 'end';

DIM
  : 'dim';

INT
  : 'int';

FLOAT
  : 'float';

BOOL
  : 'bool';

IF
  : 'if';

ELSE
  : 'else';

FOR
  : 'for';

TO
  : 'to';

STEP
  : 'step';

NEXT
  : 'next';

WHILE
  : 'while';

READLN
  : 'readln';

WRITELN
  : 'writeln';

TRUE
  : 'true';

FALSE
  : 'false';

// Operations
COMPARISON_OPS
  : 'NE' | 'EQ' | 'LT' | 'LE' | 'GT' | 'GE';

MULTIPLICATION_OPS
  : 'mult' | 'div' | 'and';

ADD
  : 'plus';

SUB
  : 'min';

OR
  : 'or';

UNARY_OP
  : '~';

// Identifier
ID
  : LETTER (LETTER | INT_NUMBER)*;

// Letters
LETTER
  : ('a'..'z') | ('A'..'Z');

// Delimiters Literals
OPEN_BRACKET
  : '(';

CLOSE_BRACKET
  : ')';

COLON
  : ':';

SEMICOLON
  : ';';

ASSIGNMENT
  : ':=';

COMMA
  : ',';
  
// Number Literals
REAL_NUMBER
  : DIGIT+ EXP
  | (DIGIT+)? '.' DIGIT+ EXP?;

EXP
  : EXP_LETTER (ADD | SUB)? DIGIT+;

INT_NUMBER
  : HEX_NUMBER | OCT_NUMBER | DEC_NUMBER;

BIN_NUMBER
  : BIN_DIGIT+ BIN_LETTER;

OCT_NUMBER
  : OCT_DIGIT+ OCT_LETTER;

DEC_NUMBER
  : DIGIT+ DEC_LETTER?;

HEX_NUMBER
  : DIGIT HEX_DIGIT* HEX_LETTER;

fragment DIGIT
  : ('0'..'9');

fragment BIN_DIGIT
  : ('0'..'1');

fragment OCT_DIGIT
  : ('0'..'7');

fragment HEX_DIGIT
  : ('a'..'f') | ('A'..'F') | DIGIT;

fragment BIN_LETTER
  : ('B' | 'b');

fragment OCT_LETTER
  : ('O' | 'o');

fragment HEX_LETTER
  : ('H' | 'h');

fragment DEC_LETTER
  : ('D' | 'd');

fragment EXP_LETTER
  : ('E' | 'e');

// Skip blank characters
WHITE_SPACE
  : [ \r\n\t]+ -> skip;

COMMENTARY
  : '(*' .*? '*)' -> skip;

