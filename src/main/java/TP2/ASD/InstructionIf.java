package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public abstract class InstructionIf {

	public abstract String pp();
	public abstract RetInstructionIf toIR(SymbolTable st) throws TypeException;;

	static public class RetInstructionIf {

		public Llvm.IR ir;
		public String result;

		public RetInstructionIf(Llvm.IR ir,String result) {
			this.ir = ir;
			this.result = result;
		}

	}
}
