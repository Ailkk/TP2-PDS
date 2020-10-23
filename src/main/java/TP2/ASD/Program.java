package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.ASD.Bloc.RetBloc;

public class Program {
    Bloc e; // What a program contains. TODO : change when you extend the language

    public Program(Bloc e) {
      this.e = e;
    }

    // Pretty-printer
    public String pp() {
      return e.pp();
    }

    // IR generation
    public Llvm.IR toIR() throws TypeException {
      SymbolTable st = new SymbolTable();

      // TODO : change when you extend the language

      // computes the IR of the expression
      RetBloc retBloc = e.toIR(st);
      // add a return instruction
      Llvm.Instruction ret = new Llvm.Return(retBloc.type.toLlvmType(), retBloc.result);
      retBloc.ir.appendCode(ret);

      return retBloc.ir;
    }
  }