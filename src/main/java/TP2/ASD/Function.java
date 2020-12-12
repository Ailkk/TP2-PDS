package TP2.ASD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.SymbolTable.FunctionSymbol;
import TP2.SymbolTable.VariableSymbol;
import TP2.TypeException;

public class Function {

	//nom de la fonction
	String ident;
	
	//type
	Type type;
	
	//declaration / attribut
	List<String> declaration;
	
	//contenu de la fonction
	Bloc bloc;
	
	public Function(String i, Type t, List<String> v , Bloc b) {
		this.bloc=b;
		this.type = t;
		this.declaration=v;
		this.ident=i;
	}
	
	public String pp() {
		String res = "FUNC " + type.pp() + "(";
		for (String string : declaration) {
			res += string + ",";
		}
		String subRes  = res.substring(0, res.length()-2);
		return subRes + ")\n" + bloc.pp();
	}
	
	public RetFunction toIR(SymbolTable st) throws TypeException{
		SymbolTable.FunctionSymbol symbTab = (SymbolTable.FunctionSymbol) st.lookup(ident);
		
		HashMap<String,Llvm.Type> typeAttributs = new HashMap<String,Llvm.Type>();
		
		List<Llvm.Type> typesAttr = new ArrayList<Llvm.Type>();
		for(String var : declaration) {
			if(var.contains("["))
				System.out.println("tablo");
			else
				typesAttr.add(new Llvm.Int());
		}
		
		
		//TODO changer une fois qu'on met les tableaux d'entiers !
		List<VariableSymbol> lVarSymb = new ArrayList<VariableSymbol>();
		for (String var : declaration) {
			lVarSymb.add(new VariableSymbol(new Int(), var));
			typeAttributs.put(var, new Llvm.Int());
		}
		
		SymbolTable.FunctionSymbol mock = new SymbolTable.FunctionSymbol(type, ident, lVarSymb, false);
		
		//FIXME problème on passe dans le else et on throw alors que l'on devrait pas
		//on verifie que la fonction correspond au proto
		if(mock.equals(symbTab)) {
			symbTab = new SymbolTable.FunctionSymbol(type, ident, lVarSymb, true);
			st.remove(ident);
			st.add(symbTab);
			for(SymbolTable.VariableSymbol D: lVarSymb)
				st.add(D);
		}
		else {
			if(!ident.equals("main"))
				throw new TypeException("Error," + this.ident + "function isn't declared as a prototype");
		}
		
		String name = "@" + ident;
		
		
		RetFunction res = new RetFunction((new Llvm.IR(Llvm.empty(), Llvm.empty())), type, name);
		
		Llvm.Instruction def = new Llvm.DefineFunc(res.ident, res.type.toLlvmType(), this.declaration, typeAttributs);
         

         List<Llvm.Instruction> varAttributs = new ArrayList<Llvm.Instruction>();

         for(String attribut : declaration) {
             varAttributs.add(new Llvm.AllocationFunc("%" + attribut + "1", ((SymbolTable.VariableSymbol) st.lookup(attribut)).type.toLlvmType()));
         }

         Llvm.Instruction retour = new Llvm.Return(res.type.toLlvmType(), "");

         res.ir.appendCode(def);

         for(Llvm.Instruction attribut : varAttributs) {
             res.ir.appendCode(attribut);
         }

         res.ir.append(bloc.toIR(st, ident).ir);
         if(res.type instanceof VoidType)
        	 res.ir.appendCode(retour);

         return res;	
	}
	
	
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
