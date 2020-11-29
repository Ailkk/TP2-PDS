package TP2.ASD;

import java.util.ArrayList;
import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.SymbolTable.VariableSymbol;
import TP2.TypeException;

public class VoidPrototype extends Prototype {

	public VoidPrototype(String i, List<String> v) {
		super(i, v);
	}

	@Override
	public String pp() {
		String res = "PROTO VOID " + this.ident + "(";
		for (String string : this.declaration) {
			res += string + ",";
		}
		String subRes  = res.substring(0, res.length()-2);
		return subRes + ")\n";
	}

	@Override
	public RetPrototype toIR(SymbolTable st) throws TypeException {
		//Ajout des attributs dans une table des symboles
        List<VariableSymbol> attributsList = new ArrayList<VariableSymbol>();

        SymbolTable.VariableSymbol symbolAttr = null;

        for(String attribut : super.declaration) {
            symbolAttr = new SymbolTable.VariableSymbol(new Int(), attribut);

            if(!attributsList.add(symbolAttr)) {
                System.err.println("Warning: the symbol '" + attribut + "' has already exist in SymbolTable in this scope.");
            }
        }

        SymbolTable.FunctionSymbol symbol = new SymbolTable.FunctionSymbol(new VoidType(), super.ident, attributsList, true);
        String result = "%" + super.ident;//TODO: à enlever si cela ne sert à rien

        SymbolTable attST = new SymbolTable();
        for (VariableSymbol variableSymbol : attributsList) {
			attST.add(variableSymbol);
		}
        
        RetPrototype ret = new RetPrototype(new Llvm.IR(Llvm.empty(), Llvm.empty()), new VoidType(), result, attST);//TODO: à enlever si cela ne sert à rien

        if(!st.add(symbol)) {
            System.err.println("Warning: the symbol '" + super.ident + "' has already exist in SymbolTable in this scope.");
        }

        //TODO: supprimer lors de la mise en production (rendu final)
        if(!symbol.equals(st.lookup(super.ident))) System.err.println("La variable '" + super.ident + "' doit être dans la table des symboles");

        return ret;
    }

}
