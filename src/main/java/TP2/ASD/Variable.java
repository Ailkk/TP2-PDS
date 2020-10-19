package TP2.ASD;

import java.util.List;

import TP2.Llvm;

public class Variable {
    List<Ident> l;

    public Variable (List<Ident> a){
      this.l = a;
    }

    public String pp() {
      String affiche = "";
      for(Ident a : l) {
        affiche += a.pp();
      }
      return affiche;
    }
    
    public class RetVariable {
        /**
         * LLVM instruction
         */
        public Llvm.IR ir;

        /**
         * Type de la variable (synthesized)
         */
        public Type type;

        /**
         * Identifiant de la variable (synthesized)
         */
        public String result;

        /**
         * Constructeur
         * @param ir L'instruction LLVM
         * @param type Le type de la variable
         * @param result Le nom de la variable
         */
        public RetVariable(Llvm.IR ir, Type type, String result) {
            this.ir = ir;
            this.type = type;
            this.result = result;
        }
    }
  }
