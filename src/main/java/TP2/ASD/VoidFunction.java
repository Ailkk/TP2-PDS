package TP2.ASD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import TP2.Llvm;
import TP2.SymbolTable;
import TP2.SymbolTable.VariableSymbol;
import TP2.TypeException;
import TP2.Utils;
import TP2.ASD.Expression.RetExpression;
import TP2.ASD.Instruction.RetInstruction;

public class VoidFunction extends Function{

	public VoidFunction(String i, List<String> v, Bloc b) {
		super(i, v, b);
	}
	
	@Override
	public String pp() {
		//Print du nom de la fonction
		String res = "FUNC VOID " + super.ident +"(";
		//print des parametre de la fonction
		for(String vari : declaration) {
	        res += vari + ", ";
	      }
		String subRes = res.substring(0, res.length()-2);
		return (subRes + ") \n" + super.bloc.pp());
	}
	
	public RetFunction toIR(SymbolTable st) throws TypeException {
		SymbolTable.FunctionSymbol symbTab = (SymbolTable.FunctionSymbol) st.lookup(super.ident);
		HashMap<String,Llvm.Type> typeAttributs = new HashMap<String,Llvm.Type>();
		
		//verification de la presence de la function dans la map sauf pour main
		if(this.ident.equals("main")) {
			if(symbTab != null) {
				//Function present dans la table
				 
				//Verification des parametre
				for(String param : declaration) {
					if(st.lookup(param)==null) {
						throw new TypeException("Error: this Parametre don't existe in SymbolTable");
					}
					typeAttributs.put(param, ((SymbolTable.VariableSymbol) st.lookup(param)).type.toLlvmType());
				}
			}else {
				//La fonction n'est pas presente dans la table
				throw new TypeException("Error: this function don't existe in SymbolTable");
			}
		} else {
			//sinon on l'ajoute a la table  //TODO
			
			symbTab = new SymbolTable.FunctionSymbol(new VoidType(), super.ident,  symbTab, true);

            if(!st.add(symbTab)) {
            	throw new TypeException("Error : the symbol " + super.ident + " has already exist in SymbolTable");
            }
		}
		
		String name = "@" + super.ident;
		
		
		RetFunction res = new RetFunction((new Llvm.IR(Llvm.empty(), Llvm.empty())), new VoidType(), name);
		
		 Llvm.Instruction def = new Llvm.DefineFunc(res.ident, res.type.toLlvmType(), this.declaration, typeAttributs);
         

         List<Llvm.Instruction> varAttributs = new ArrayList<Llvm.Instruction>();

         for(String attribut : super.declaration) {
             varAttributs.add(new Llvm.AllocationFunc("%" + attribut + "1", ((SymbolTable.VariableSymbol) st.lookup(attribut)).type.toLlvmType()));
         }

         Llvm.Instruction retour = new Llvm.Return(res.type.toLlvmType(), "");

         res.ir.appendCode(def);

         for(Llvm.Instruction attribut : varAttributs) {
             res.ir.appendCode(attribut);
         }

         res.ir.append(super.bloc.toIR(st, super.ident).ir);
         res.ir.appendCode(retour);

         return res;	 
		 
	 }
	

}
