package Version_Finale;

import java.util.ArrayList;

public class MainList {

	public static void main(String[] args) {
		ListEmploye le = new ListEmploye();
		//le.afficher();
		Employe E0 = new Employe("E01", "Moumen", "Islaq",30000.00);
		le.ajouterEmploye(E0);
		le.parcourIt();
		System.out.println("");
		le.melangerList();
		le.parcourIt();
		System.out.println("");
		le.inverserList();
		le.parcourIt();
		System.out.println("");
		ArrayList<Employe> le2 =le.subList(1, 4); 
		le.echangerList(0, 5);
		System.out.println("");
		le.parcourIt();
		System.out.println("la comparaison des 2 liste L1 et L2 : "+ le.compareList(le2));
		ArrayList<Employe> le3 =le.copierList(); 
		System.out.println("la comparaison des 2 liste L1 et L3 : "+ le.compareList(le3));
		le.trierEmployes(new CmpSalaire()); 
		le.afficher();
		System.out.println(le.listEstVide());	
		le.viderList();
		System.out.println(le.listEstVide());	
		le.parcourIt();
	}

}
