package TP2.ASD;

import TP2.Llvm;

  public abstract class Type {
    public abstract String pp();
    public abstract Llvm.Type toLlvmType();
  }