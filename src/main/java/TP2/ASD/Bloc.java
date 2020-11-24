package TP2.ASD;

import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public class Bloc {
    List<Instruction> sl;
    List<Variable> v;

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

   public Bloc(List<Variable> var, List<Instruction> sl) {
      this.v = var;
      this.sl = sl;
    }
 /*
    public Bloc( List<Statement> sl) {
      this.sl = sl;
    }
*/
    // Pretty-printer
    public String pp() {

      String affiche = "";
      for(Variable vari : v) {
        affiche += vari.pp();
      }

      for(Instruction s : sl) {
        affiche += s.pp();
      }
      return affiche;

    }

    // IR generation
    public RetBloc toIR(SymbolTable st) throws TypeException {
    	
    	
      Llvm.IR irBlock = new  Llvm.IR(Llvm.empty(), Llvm.empty());
      
      Llvm.Instruction commmentBlockD = new Llvm.Bloc("Test Bloc Début");
      irBlock.appendCode(commmentBlockD);
     
      Variable.RetVariable retVar = null;
      
      for(Variable variable : this.v) {
          if(retVar == null) retVar = variable.toIR(st);
          else retVar.ir.append(variable.toIR(st).ir);
      }

      if(retVar != null) irBlock.append(retVar.ir);



      String lastExprRes = "0";
      Type lastTypeRes = new Int();
      

      // computes the IR of the expression

      //For tout les statements
      for (Instruction s : sl) {
    	  Instruction.RetInstruction retStmt = s.toIR(st);
        irBlock.append(retStmt.ir);
        lastExprRes = retStmt.result;
        //lastTypeRes = retStmt.type;
      }
      //Fin du For
      commmentBlockD = new Llvm.Bloc("Test Bloc Fin");
      irBlock.appendCode(commmentBlockD);

      return new RetBloc(irBlock, lastTypeRes, lastExprRes);
    }
  }
