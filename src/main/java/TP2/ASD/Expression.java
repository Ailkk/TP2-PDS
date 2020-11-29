package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public abstract class Expression {


	    public abstract String pp();
	    public abstract RetExpression toIR(SymbolTable st, String ident) throws TypeException;

	    static public class RetExpression{

	      public Llvm.IR ir;
	      public Type type;
	      public String result;

	      public RetExpression(Llvm.IR ir, Type type, String result) {
	        this.ir = ir;
	        this.type = type;
	        this.result = result;
	      }
	    
	  }
	
	
	
	
	
	
}