package TP2;

import java.util.List;
import java.util.ArrayList;

// This file contains a simple LLVM IR representation
// and methods to generate its string representation

public class Llvm {
  static public class IR {
    List<Instruction> header; // IR instructions to be placed before the code (global definitions)
    List<Instruction> code;   // main code

    public IR(List<Instruction> header, List<Instruction> code) {
      this.header = header;
      this.code = code;
    }

    // append an other IR
    public IR append(IR other) {
      header.addAll(other.header);
      code.addAll(other.code);
      return this;
    }

    // append a code instruction
    public IR appendCode(Instruction inst) {
      code.add(inst);
      return this;
    }

    // append a code header
    public IR appendHeader(Instruction inst) {
      header.add(inst);
      return this;
    }

    // Final string generation
    public String toString() {
      // This header describe to LLVM the target
      // and declare the external function printf
      StringBuilder r = new StringBuilder("; Target\n" +
        "target triple = \"x86_64-unknown-linux-gnu\"\n" +
        "; External declaration of the printf function\n" +
        "declare i32 @printf(i8* noalias nocapture, ...)\n" +
        "\n; Actual code begins\n\n");

      for(Instruction inst: header)
        r.append(inst);

      r.append("\n\n");

      // We create the function main
      // TODO : remove this when you extend the language
      r.append("define i32 @main() {\n");


      for(Instruction inst: code)
        r.append(inst);

      // TODO : remove this when you extend the language
      r.append("}\n");

      return r.toString();
    }
  }

  // Returns a new empty list of instruction, handy
  static public List<Instruction> empty() {
    return new ArrayList<Instruction>();
  }


  // LLVM Types
  static public abstract class Type {
    public abstract String toString();
  }

  static public class Int extends Type {
    public String toString() {
      return "i32";
    }
  }
  
  
  static public class ArrayType extends Type {

      /**
       * Type Llvm des éléments du tableau
       */
      Type type;

      /**
       * Taille du tableau
       */
      int size;

      /**
       * Constructeur
       * @param type Type Llvm des éléments du tableau
       * @param size Taille des éléments du tableau
       */
      public ArrayType(Type type, int size) {
          this.type = type;
          this.size = size;
      }

      @Override
      public String toString() {
          return this.type + "*";
      }
  }

  // TODO : other types


  // LLVM IR Instructions
  static public abstract class Instruction {
    public abstract String toString();
  }

  static public class Add extends Instruction {
    Type type;
    String left;
    String right;
    String lvalue;

    public Add(Type type, String left, String right, String lvalue) {
      this.type = type;
      this.left = left;
      this.right = right;
      this.lvalue = lvalue;
    }

    public String toString() {
      return lvalue + " = add " + type + " " + left + ", " + right +  "\n";
    }
  }
  
  
  static public class Sub extends Instruction {
	    Type type;
	    String left;
	    String right;
	    String lvalue;

	    public Sub(Type type, String left, String right, String lvalue) {
	      this.type = type;
	      this.left = left;
	      this.right = right;
	      this.lvalue = lvalue;
	    }

	    public String toString() {
	      return lvalue + " = sub " + type + " " + left + ", " + right +  "\n";
	    }
	  }
  
  static public class Mul extends Instruction {
	    Type type;
	    String left;
	    String right;
	    String lvalue;

	    public Mul(Type type, String left, String right, String lvalue) {
	      this.type = type;
	      this.left = left;
	      this.right = right;
	      this.lvalue = lvalue;
	    }

	    public String toString() {
	      return lvalue + " = mul " + type + " " + left + ", " + right +  "\n";
	    }
	  }
  
  static public class Div extends Instruction {
	    Type type;
	    String left;
	    String right;
	    String lvalue;

	    public Div(Type type, String left, String right, String lvalue) {
	      this.type = type;
	      this.left = left;
	      this.right = right;
	      this.lvalue = lvalue;
	    }

	    public String toString() {
	      return lvalue + " = div " + type + " " + left + ", " + right +  "\n";
	    }
	  }
  

  static public class Return extends Instruction {
    Type type;
    String value;

    public Return(Type type, String value) {
      this.type = type;
      this.value = value;
    }

    public String toString() {
      return "ret " + type + " " + value + "\n";
    }
  }
  
  
  static public class Affectation extends Instruction {
	Type type;
    String left;
    String right;
    
    public Affectation(Type t, String l, String r) {
    	this.type = t;
    	this.left = l;
    	this.right = r;
    }

	public String toString() {
		return "store " + type + " " + left + ", " + type + " " + right + "\n";
	}
	  
  }
  
  
  static public class Bloc extends Instruction{
	  String value;
	  
	  public Bloc(String v) {
		  this.value=v;
	  }

	public String toString() {
		return value + "\n";
	}
  }
  
  static public class Alloca extends Instruction {
      /**
       * Type de la variable
       */
      Type type;

      /**
       * Nom de la variable
       */
      String ident;

      /**
       * Constructeur
       */
      public Alloca(Type type, String ident) {
          this.type = type;
          this.ident = ident;
      }

      @Override
      public String toString() {
          String ret = this.ident + " = alloca ";

          ret += (this.type instanceof ArrayType) ? ((ArrayType) this.type).type + ", " + ((ArrayType) this.type).type + " " + ((ArrayType) this.type).size : "" + this.type;

          return ret + "\n";
      }
  }

  // TODO : other instructions
}
