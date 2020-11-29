package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;
import TP2.ASD.Expression.RetExpression;
import TP2.ASD.Instruction.RetInstruction;

public class WhileInstruction extends Instruction {
	
	Expression cond;
	
	Bloc bloc;
	
	public WhileInstruction(Expression e, Bloc b) {
		this.cond = e;
		this.bloc = b;
	}

	@Override
	public String pp() {
		 //String IF CONDITION + BLOC1
        String ret = /*Utils.indent(level) +*/ "WHILE " + this.cond.pp() + "\n";
        ret += "DO " + this.bloc.pp() + "\n";

        return ret /*+ Utils.indent(level)*/ + "\n DONE";
	}

	@Override
	public RetInstruction toIR(SymbolTable st, String ident) throws TypeException {
		RetExpression condition = this.cond.toIR(st, ident);
		Int typeInt = new Int();
		if(!condition.type.equals(typeInt)) {
			throw new TypeException("type mismatch: have " + condition.type + " and " + typeInt);
		}
		
		
		String res = Utils.newtmp();
		
		String debutWhile = Utils.newlab("while");
		String faireWhile = Utils.newlab("do");
		String finWhile = Utils.newlab("done");
		
		Llvm.Instruction icmp = new Llvm.ConditionWhile(res, condition.type.toLlvmType(), condition.result);
				
        Llvm.Instruction brCond = new Llvm.Redirection(res, "%"+faireWhile, "%"+finWhile);
       
        Llvm.Instruction brFinWhile = new Llvm.RedirectionFin(debutWhile);

        RetInstruction ret = new RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()), res);

        ret.ir.appendCode(new Llvm.Label(debutWhile));
        ret.ir.append(condition.ir);
        ret.ir.appendCode(icmp);
        ret.ir.appendCode(brCond);
        ret.ir.appendCode(new Llvm.Label(faireWhile));
        //je comprends pas comment ajuster cette ligne
        ret.ir.append(this.bloc.toIR(st, ident).ir);
        ret.ir.appendCode(brFinWhile);

        ret.ir.appendCode(new Llvm.Label(finWhile));

        return ret;
	 }
}
