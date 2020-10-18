package TP2.ASD;

import TP2.Llvm;
import TP2.TypeException;

public abstract class Statement {
    public abstract String pp();
    public abstract RetStatement toIR() throws TypeException;

    static public class RetStatement{
      // The LLVM IR:
      public Llvm.IR ir;
      public Type type;
      public String result;

      public RetStatement(Llvm.IR ir, Type type, String result) {
        this.ir = ir;
        this.type = type;
        this.result = result;
      }

    }
  }