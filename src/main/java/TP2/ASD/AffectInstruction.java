package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;
import TP2.ASD.Expression.RetExpression;
import TP2.ASD.Statement.RetStatement;

public class AffectInstruction extends Instruction {
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
	public RetInstruction toIR(SymbolTable st, String ident) throws TypeException {
		 RetExpression leftRet = left.toIR(st, ident);
	     RetExpression rightRet = right.toIR(st, ident);

	      // We check if the types mismatches
	      if(!leftRet.type.equals(rightRet.type)) {
	        throw new TypeException("type mismatch: have " + leftRet.type + " and " + rightRet.type);
	      }
	      SymbolTable.VariableSymbol symbol = new SymbolTable.VariableSymbol(new Int(), leftRet.result);
	      
	      
	      if(st.add(symbol)) {
	    	  st.remove(leftRet.result);
	    	throw new TypeException("mismatch: " + leftRet.result + " is not in SymbolTable");
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
	      return new RetInstruction(leftRet.ir, result);
	}
}
