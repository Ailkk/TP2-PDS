package TP2.ASD;

import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

public abstract class Function {

	//nom de la fonction
	String ident;
	
	//declaration / attribut
	List<String> declaration;
	
	//contenu de la fonction
	Bloc bloc;
	
	public Function(String i, List<String> v , Bloc b) {
		this.bloc=b;
		this.declaration=v;
		this.ident=i;
	}
	
	public abstract String pp();
	
	public abstract RetFunction toIR(SymbolTable st) throws TypeException;
	
	
	static public class RetFunction{
		public Llvm.IR ir;
		public Type type;
		public String ident;

		
		public RetFunction(Llvm.IR ir,Type type,String ident) {
			this.ir = ir;
			this.ident = ident;
			this.type=type;
		}
	}
}