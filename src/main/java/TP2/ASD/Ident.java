package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;

public class Ident extends Expression {
	String value;
    public Ident(String value) {
      this.value = value;
    }

    public String pp() {
      return "" + value;
    }

    public RetExpression toIR(SymbolTable st, String ident) {
      // Here we simply return an empty IR
      // the `result' of this expression is the integer itself (as string)
      return new RetExpression(new Llvm.IR(Llvm.empty(), Llvm.empty()), new Int(), "" + value);
    }
}
