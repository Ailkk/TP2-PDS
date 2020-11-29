package TP2.ASD;

import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.ASD.Bloc.RetBloc;

public class Program {
	List<Prototype> prototypes;
	List<Function> functions;

	// What a program contains. TODO : change when you extend the language

    public Program(List<Prototype> p, List<Function> f) {
      this.functions = f;
      this.prototypes = p;
    }

    // Pretty-printer
    public String pp() {
		String res = "";
		for (Prototype p : prototypes) {
			res += p.pp();
		}
		for (Function f : functions) {
			res += f.pp();
		}
		return res;
    }

    // IR generation
    public Llvm.IR toIR() throws TypeException {
      SymbolTable st = new SymbolTable();

      for(Prototype p : prototypes) {
    	  p.toIR(st);
      }
      // TODO : change when you extend the language

      Function.RetFunction ret = null;
      // computes the IR of the expression
      for (Function function : functions) {
		if(ret == null)
			ret = function.toIR(st);
		else
			ret.ir.append(function.toIR(st).ir);
	}
     
      return ret.ir;
    }
  }