package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;

public class VariableExpression extends Expression {

	String value;

	public VariableExpression(String value) {
		this.value = value;
	}

	public String pp() {
		return "" + value;
	}

	public RetExpression toIR(SymbolTable st, String ident) throws TypeException {
		// Here we simply return an empty IR
		// the `result' of this expression is the integer itself (as string)
		SymbolTable.VariableSymbol identSymbol = (SymbolTable.VariableSymbol) st.lookup(this.value);
		//SymbolTable.VariableSymbol verif = VariableSymbol(new Int(), pp());
		
		String identExp = "";
		//La variable existe ?
		
		if(identSymbol == null) {
			throw new TypeException("type mismatch: this variable don't existe in SymbolTable");
		}else {
		
		/*
		SymbolTable.VariableSymbol symbol = new SymbolTable.VariableSymbol(new Int(), pp());
	

		if(st.add(symbol)) {
			st.remove(pp());
		}else {*/
			identExp = "%" + value;
			
			String result = Utils.newtmp();

			//return new RetStatement(new Llvm.IR(Llvm.empty(), Llvm.empty()), new Int(), "" + value);
			
			RetExpression ret = new RetExpression(new Llvm.IR(Llvm.empty(), Llvm.empty()), new Int(), result);

            Llvm.Instruction load = new Llvm.Load(result, identSymbol.type.toLlvmType(),  identExp, identSymbol.type.toLlvmType());

            ret.ir.appendCode(load);

            return ret;
		}
	}
}
