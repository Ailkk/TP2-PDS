package TP2.ASD;

import java.util.List;

import TP2.Llvm;
import TP2.TypeException;

public class Bloc {
    List<Statement> sl;
    //List<Declaration> dl;

    static public class RetBloc {
      // The LLVM IR:
      public Llvm.IR ir;
      public Type type;
      public String result;

      public RetBloc(Llvm.IR ir, Type type, String result) {
        this.ir = ir;
        this.type = type;
        this.result = result;
      }

    }
/*
 *     public Bloc(List<Declaration> dl, List<Statement> sl) {
      this.dl = dl;
      this.sl = sl;
    }*/
 
    public Bloc( List<Statement> sl) {
      this.sl = sl;
    }

    // Pretty-printer
    public String pp() {

      String affiche = "";
      /*for(Declaration d : dl) {
        affiche += d.pp();
      }*/

      for(Statement s : sl) {
        affiche += s.pp();
      }
      return affiche;

    }

    // IR generation
    public RetBloc toIR() throws TypeException {
      Llvm.IR irBlock = new  Llvm.IR(Llvm.empty(), Llvm.empty());

      Llvm.Instruction commmentBlockD = new Llvm.Bloc("Bloc Début");
      irBlock.appendCode(commmentBlockD);

      String lastExprRes = "0";
      Type lastTypeRes = new Int();
      // TODO : change when you extend the language

      // computes the IR of the expression

      //For tout les statements
      for (Statement s : sl) {
        Statement.RetStatement retStmt = s.toIR();
        irBlock.append(retStmt.ir);
        lastExprRes = retStmt.result;
        lastTypeRes = retStmt.type;
      }
      //Fin du For
      commmentBlockD = new Llvm.Bloc("Bloc Fin");
      irBlock.appendCode(commmentBlockD);

      return new RetBloc(irBlock, lastTypeRes, lastExprRes);
    }
  }
