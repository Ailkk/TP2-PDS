package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.ASD.Expression.RetExpression;

public class Return extends Instruction {
	
	Expression returned;
	
	public Return(Expression e) {
		this.returned = e;
	}

	@Override
	public String pp() {
		return "RETURN "+ returned.pp();
	}

	@Override
	//TODO verifier que le type returned est bien celui de la fonction (et qu'elle existe)
	public RetInstruction toIR(SymbolTable st, String ident) throws TypeException {
		RetExpression exp = returned.toIR(st, ident);
		
		Llvm.Instruction ret = new Llvm.Return(exp.type.toLlvmType(), exp.result);
		
		exp.ir.appendCode(ret);
		
		
		return new RetInstruction(exp.ir, exp.result);
	}

}
