parser grammar VSLParser;

options {
  language = Java;
  tokenVocab = VSLLexer;
}

@header {
  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;
  import java.util.List;
}


// TODO : other rules

program returns [TP2.ASD.Program out]
    : e=bloc EOF { $out = new TP2.ASD.Program($e.out); }
    ;
    
bloc returns [TP2.ASD.Bloc out]
	: {List<TP2.ASD.Instruction> l = new ArrayList(); List<TP2.ASD.Variable> r = new ArrayList(); }
	(INT v=variable {r.add($v.out);}  ( VIRG v=variable {r.add($v.out);} )* )?
	(ins=instruction {l.add($ins.out);} )+ { $out = new TP2.ASD.Bloc(r,l);}
	;

instruction returns [TP2.ASD.Instruction out]
    : a=assignment { $out = $a.out; }
    | i=sialors { $out = $i.out; }
    | w = tantque { $out = $w.out; }
    ;

assignment returns [TP2.ASD.AffectInstruction out]
    : l=id EGAL r=expression { $out = new TP2.ASD.AffectInstruction($l.out, $r.out); }
    ;

id returns [TP2.ASD.Ident out]
    : IDENT { $out = new TP2.ASD.Ident($IDENT.text); }
    ;
    
expression returns [TP2.ASD.Expression out]
    : r=expression PLUS l=factor  { $out = new TP2.ASD.AddExpression($l.out, $r.out); }
    | r=expression MOINS l=factor  { $out = new TP2.ASD.SubExpression($l.out, $r.out); }
    | f=factor { $out = $f.out; }
    ;
   

factor returns [TP2.ASD.Expression out]
    : p=primary { $out = $p.out; }
    | LP l=factor MULTI r=expression RP { $out = new TP2.ASD.MulExpression($l.out, $r.out); }
    | LP l=factor DIVI r=expression RP { $out = new TP2.ASD.DivExpression($l.out, $r.out); }
    | l=factor MULTI r=expression  { $out = new TP2.ASD.MulExpression($l.out, $r.out); }
    | l=factor DIVI r=expression  { $out = new TP2.ASD.DivExpression($l.out, $r.out); }
    | LP l=factor PLUS r=expression RP { $out = new TP2.ASD.AddExpression($l.out, $r.out); }
    | LP l=factor MOINS r=expression RP { $out = new TP2.ASD.SubExpression($l.out, $r.out); }
    ;

variable returns [TP2.ASD.Variable out]
	:IDENT { $out = new TP2.ASD.IntegerVariable($IDENT.text);}
	;

sialors returns [TP2.ASD.IfElseInstruction out]
	:IF e=expression THEN b1=bloc ELSE b2=bloc FI { $out = new TP2.ASD.IfElseInstruction($e.out, $b1.out, $b2.out); }
	|IF e=expression THEN b1=bloc FI { $out = new TP2.ASD.IfElseInstruction($e.out, $b1.out,null); }
	;
	
tantque returns [TP2.ASD.WhileInstruction out]
	: WHILE e=expression DO LA b=bloc RA DONE { $out = new TP2.ASD.WhileInstruction($e.out, $b.out); }
	;

primary returns [TP2.ASD.Expression out]
    : INTEGER { $out = new TP2.ASD.IntegerExpression($INTEGER.int); }
    | IDENT { $out = new TP2.ASD.VariableExpression($IDENT.text); }
    // TODO : that's all?
    ;
