lexer grammar VSLLexer;

options {
  language = Java;
}

@header {
  package TP2;
}

WS : (' '|'\n'|'\t'|'\r'|'{'|'}') -> skip
   ;

COMMENT : '//' (~'\n')* -> skip
        ;

fragment LETTER : 'a'..'z' ;
fragment DIGIT  : '0'..'9' ;
fragment ASCII  : ~('\n'|'"');


// keywords
LP    : '('      ;
RP    : ')'      ;

PLUS  : '+'      ;
MOINS : '-'      ;
MULTI : '*'      ;
DIVI  : '/'      ;
EGAL  : ':='     ;
INT	  : 'INT'    ;
VOID  : 'VOID'   ;
VIRG  : ','      ;
PVIRG : ';'      ;
IF	  : 'IF'     ;
THEN  : 'THEN'   ;
ELSE  : 'ELSE'   ;
FI	  : 'FI'	 ;
WHILE : 'WHILE'  ;
DO    : 'DO'     ;
DONE  : 'DONE'   ;
FUNC  : 'FUNC'   ;
PROTO : 'PROTO'  ;
RETURN: 'RETURN' ;


// TODO : other keywords

// other tokens (no conflict with keywords in VSL)
IDENT   : LETTER (LETTER|DIGIT)*;
TEXT    : '"' (ASCII)* '"' { setText(getText().substring(1, getText().length() - 1)); };
INTEGER : (DIGIT)+ ;
