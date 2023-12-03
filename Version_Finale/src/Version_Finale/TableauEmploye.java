package Version_Finale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TableauEmploye {
	private Employe[] Employes= new Employe[5];

	public TableauEmploye() {
		Employes[0]=new Employe("E01", "Moumen", "Islaq",30000.00);
		Employes[1]=new Employe("E02", "meziane", "youness",13000.00);
		Employes[2]=new Employe("E03", "kerbab", "houssam",20000.00);
		Employes[3]=new Employe("E04", "halim", "mehdi",8000.00);
		Employes[4]=new Employe("E05", "hassani", "oussama",67000.00);
	}
	public void trierTabEmploye(Comparator<Employe> cmp) {
		Arrays.sort(Employes,cmp);
	}
	public boolean tester(Employe emp) {
		for(Employe e:Employes) {
			if(e.equals(emp)) 
				return true;
		}
		return false;
	}
	public boolean AjouterEmploye(Employe emp) {
		ArrayList<Employe> list= new ArrayList<Employe>(Arrays.asList(Employes));
		if(this.tester(emp))
			return false;
		list.add(emp);
		Employes = list.toArray(new Employe[list.size()]);
		return true;
	}
	public boolean SupprimerEmploye(Employe emp) {
		if(!this.tester(emp)) {
			return false;
		}
		ArrayList<Employe> list = new ArrayList<Employe>(Arrays.asList(Employes));
		list.remove(emp);
		Employes= list.toArray(new Employe[list.size()]);
		return true;
	}
	public int nbEmploye() {
		return Employes.length;
	}
	public void inverserTableau() {
		ArrayList<Employe> list = new ArrayList<Employe>(Arrays.asList(Employes));
		Collections.reverse(list);
		Employes= list.toArray(new Employe[list.size()]);	
	}
	
	public void afficher() {
		for(Employe e:Employes) {
			System.out.println(e);
		}
	}
	public int salaireMax() {
		Arrays.sort(Employes,new CmpSalaire());
		return (int) Employes[Employes.length-1].getSalaire();
		
	}
	public boolean eqTab(Employe[] e1,Employe[] e2) {
		return Arrays.equals(e1, e2);
	}
}
