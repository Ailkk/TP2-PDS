package TP2.ASD;

import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;
import TP2.ASD.Statement.RetStatement;

public abstract class Variable {
    String name;

    public Variable (String n){
      this.name = n;
    }

    public abstract String pp();
    public abstract RetVariable toIR(SymbolTable st) throws TypeException;
    
    
    public class RetVariable {
        
        public Llvm.IR ir;
        public Type type;
        public String result;

        
        
        public RetVariable(Llvm.IR ir, Type type, String result) {
            this.ir = ir;
            this.type = type;
            this.result = result;
        }
        //Llvm.Instruction alloc = new Llvm.Alloc(leftRet.type.toLlvmType(), leftRet.result, rightRet.result, result);

        // append this instruction
        //leftRet.ir.appendCode(alloc);
        
	     /*
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
    */
        
  }
}
