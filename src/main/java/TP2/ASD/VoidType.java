package TP2.ASD;

import TP2.Llvm;

public class VoidType extends Type {
    public String pp() {
        return "VOID";
      }

      @Override public boolean equals(Object obj) {
        return obj instanceof VoidType;
      }

      public Llvm.Type toLlvmType() {
        return new Llvm.VoidType();
      }
    }
