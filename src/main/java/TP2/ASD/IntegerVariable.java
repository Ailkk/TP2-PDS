package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;

public class IntegerVariable extends Variable {

	public IntegerVariable(String n) {
		super(n);

	}

	@Override
	public String pp() {
		return ""+ super.name;
	}

	@Override
	public RetVariable toIR(SymbolTable st) {
		
		SymbolTable.VariableSymbol symbol = new SymbolTable.VariableSymbol(new Int(), super.name);
        String result = "%" + super.name;

        RetVariable ret = new RetVariable(new Llvm.IR(Llvm.empty(), Llvm.empty()), new Int(), result);
        
        st.add(symbol);
        
        Llvm.Instruction alloca = new Llvm.Alloc(new Int().toLlvmType(), result);

        ret.ir.appendCode(alloca);
        
        return ret;
	}

}
