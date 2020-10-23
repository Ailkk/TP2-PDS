package TP2.ASD;

import TP2.Llvm;
import TP2.TypeException;
import TP2.Utils;

public class AffectInstruction extends Statement {
	Ident left;
	Expression right;

	public AffectInstruction(Ident l, Expression r) {
		this.left = l;
		this.right = r;
	}

	@Override
	public String pp() {
		return "(" + left.pp() + ":=" + right.pp() + ")";
	}

	@Override
	public RetStatement toIR() throws TypeException {
		 RetStatement leftRet = left.toIR();
	     RetStatement rightRet = right.toIR();

	      // We check if the types mismatches
	      if(!leftRet.type.equals(rightRet.type)) {
	        throw new TypeException("type mismatch: have " + leftRet.type + " and " + rightRet.type);
	      }

	      // We base our build on the left generated IR:
	      // append right code
	      leftRet.ir.append(rightRet.ir);

	      // allocate a new identifier for the result
	      String result = Utils.newtmp();

	      // new add instruction result = left + right
	      Llvm.Instruction aff = new Llvm.Affectation(leftRet.type.toLlvmType(), leftRet.result, rightRet.result);

	      // append this instruction
	      leftRet.ir.appendCode(aff);

	      // return the generated IR, plus the type of this expression
	      // and where to find its result
	      return new RetStatement(leftRet.ir, leftRet.type, result);
	}
}
