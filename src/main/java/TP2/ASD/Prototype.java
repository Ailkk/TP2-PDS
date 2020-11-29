package TP2.ASD;

import java.util.HashMap;
import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public abstract class Prototype {
	//nom de la fonction
	String ident;

	//declaration / attribut
	List<String> declaration;
	
	//association attributs/types
	HashMap<String, Type> typesAttributs;



	public Prototype(String i, List<String> v) {
		this.declaration=v;
		this.ident=i;
	}

	public abstract String pp();
	
	public abstract RetPrototype toIR(SymbolTable st) throws TypeException;


	static public class RetPrototype{
		public Llvm.IR ir;
		public Type type;
		public String ident;
		public SymbolTable attributs;


		public RetPrototype(Llvm.IR ir,Type type,String ident, SymbolTable at) {
			this.ir = ir;
			this.ident = ident;
			this.type=type;
			this.attributs = at;
		}
	}
}
