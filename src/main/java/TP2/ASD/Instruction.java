package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public abstract class Instruction {

	public abstract String pp();
	public abstract RetInstruction toIR(SymbolTable st, String ident) throws TypeException;;

	static public class RetInstruction {

		public Llvm.IR ir;
		public String result;

		public RetInstruction(Llvm.IR ir,String result) {
			this.ir = ir;
			this.result = result;
		}

	}
}
