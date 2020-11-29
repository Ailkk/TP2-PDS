package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;
import TP2.ASD.Expression.RetExpression;
import TP2.ASD.Instruction.RetInstruction;
import TP2.ASD.Statement.RetStatement;
//import sun.tools.tree.TypeExpression;

public class IfElseInstruction extends Instruction {

	//La condition
	Expression expr;
	
	//les deux bloc
	
	Bloc bloc1;
	Bloc bloc2;
	
	//Constructeur
	public IfElseInstruction(Expression e, Bloc b1, Bloc b2) {
		this.bloc1=b1;
		this.bloc2=b2;
		this.expr=e;
	}
	
	 public String pp() {
		 //String IF CONDITION + BLOC1
         String ret = /*Utils.indent(level) +*/ "IF " + this.expr.pp() + "\n";
         ret += /*Utils.indent(level) +*/ "THEN\n";
         ret += this.bloc1.pp();

         //String Bloc2 
         if(bloc2 != null) {//Si il y a un else
             ret += /*Utils.indent(level) +*/ "ELSE\n";
             ret += this.bloc2.pp();
         }

         return ret /*+ Utils.indent(level)*/ + "\n FI";
     }
	 
	 
	 
	 
	 public RetInstruction toIR(SymbolTable st, String ident) throws TypeException {	 
		 
		RetExpression condition = this.expr.toIR(st, ident);
		Int typeInt = new Int();
		if(!condition.type.equals(typeInt)) {
			throw new TypeException("type mismatch: have " + condition.type + " and " + typeInt);
		}
		
		
		String res = Utils.newtmp();
		
		String debutSi =Utils.newlab("if");
		String sinon = Utils.newlab("sinon");
		String finSi = Utils.newlab("fi");
		
		
		Llvm.Instruction icmp = new Llvm.ConditionIf(res, condition.type.toLlvmType(), condition.result);
				

        Llvm.Instruction brCond = null;

        if(this.bloc2 != null) {//Si il y a un else
            brCond = new Llvm.Redirection(res, "%" + debutSi, "%" + sinon);
        } else {
            brCond = new Llvm.Redirection(res, "%" + debutSi, "%" + finSi);
        }

        Llvm.Instruction brFinSi = new Llvm.RedirectionFin(finSi);

        RetInstruction ret = new RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()), res);

        ret.ir.append(condition.ir);
        ret.ir.appendCode(icmp);
        ret.ir.appendCode(brCond);
        ret.ir.appendCode(new Llvm.Label(debutSi));
        //je comprends pas comment ajuster cette ligne
        ret.ir.append(this.bloc1.toIR(st, ident).ir);
        ret.ir.appendCode(brFinSi);

        if(this.bloc2 != null) {//Si il y a un else
            //Pareil
        	ret.ir.appendCode(new Llvm.Label(sinon));
            ret.ir.append(this.bloc2.toIR(st, ident).ir);
            ret.ir.appendCode(brFinSi);
        }

        ret.ir.appendCode(new Llvm.Label(finSi));

        return ret;
	 }
}
