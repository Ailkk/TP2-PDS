package TP2.ASD;

import TP2.Llvm;
import TP2.TypeException;
import TP2.ASD.Statement.RetStatement;

public class Program {
    Statement e; // What a program contains. TODO : change when you extend the language

    public Program(Statement e) {
      this.e = e;
    }

    // Pretty-printer
    public String pp() {
      return e.pp();
    }

    // IR generation
    public Llvm.IR toIR() throws TypeException {
      // TODO : change when you extend the language

      // computes the IR of the expression
      RetStatement retStat = e.toIR();
      // add a return instruction
      Llvm.Instruction ret = new Llvm.Return(retStat.type.toLlvmType(), retStat.result);
      retStat.ir.appendCode(ret);

      return retStat.ir;
    }
  }