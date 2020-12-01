package TP2.ASD;

import java.util.ArrayList;
import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.SymbolTable.VariableSymbol;
import TP2.TypeException;

public class Prototype {
	//nom de la fonction
	String ident;
	
	//type
	Type type;

	//declaration / attribut
	List<String> declaration;



	public Prototype(String i, List<String> v, Type t) {
		this.declaration=v;
		this.ident=i;
		this.type = t;
	}

	public String pp() {
		String res = "PROTO "+ type.pp() + "(";
		for (String string : this.declaration) {
			res += string + ",";
		}
		String subRes  = res.substring(0, res.length()-2);
		return subRes + ")\n";
	}
	
	public RetPrototype toIR(SymbolTable st) throws TypeException {
		//Ajout des attributs dans une table des symboles
        List<VariableSymbol> attributsList = new ArrayList<VariableSymbol>();

        SymbolTable.VariableSymbol symbolAttr = null;

        for(String attribut : declaration) {
        	//TODO changer le type Int() pour un type global
            symbolAttr = new SymbolTable.VariableSymbol(new Int(), attribut);

            if(!attributsList.add(symbolAttr)) {
                System.err.println("Warning: the symbol '" + attribut + "' has already exist in SymbolTable in this scope.");
            }
        }

        SymbolTable.FunctionSymbol symbol = new SymbolTable.FunctionSymbol(type, ident, attributsList, false);
        String result = "%" + ident;//TODO: à enlever si cela ne sert à rien
        
        RetPrototype ret = new RetPrototype(new Llvm.IR(Llvm.empty(), Llvm.empty()), new VoidType(), result, attributsList);//TODO: à enlever si cela ne sert à rien

        if(!st.add(symbol)) {
            System.err.println("Warning: the symbol '" + ident + "' has already exist in SymbolTable in this scope.");
        }

        //TODO: supprimer lors de la mise en production (rendu final)
        if(!symbol.equals(st.lookup(ident))) System.err.println("La variable '" + ident + "' doit être dans la table des symboles");

        return ret;
	}


	static public class RetPrototype{
		public Llvm.IR ir;
		public Type type;
		public String ident;
		public List<VariableSymbol> attributs;


		public RetPrototype(Llvm.IR ir,Type type,String ident, List<VariableSymbol> at) {
			this.ir = ir;
			this.ident = ident;
			this.type=type;
			this.attributs = at;
		}
	}
}
