package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;

// Concrete class for Expression: add case
  public class DivExpression extends Expression {
    Expression left;
    Expression right;

    public DivExpression(Expression left, Expression right) {
      this.left = left;
      this.right = right;
    }

    // Pretty-printer
    public String pp() {
      return "(" + left.pp() + " / " + right.pp() + ")";
    }

    // IR generation
    public RetExpression toIR(SymbolTable st, String ident) throws TypeException {
    	RetExpression leftRet = left.toIR(st, ident);
    	RetExpression rightRet = right.toIR(st, ident);

      if(!leftRet.type.equals(rightRet.type)) {
        throw new TypeException("type mismatch: have " + leftRet.type + " and " + rightRet.type);
      }

      leftRet.ir.append(rightRet.ir);

      String result = Utils.newtmp();

      Llvm.Instruction div = new Llvm.Div(leftRet.type.toLlvmType(), leftRet.result, rightRet.result, result);

      leftRet.ir.appendCode(div);

      return new RetExpression(leftRet.ir, leftRet.type, result);
    }
  }