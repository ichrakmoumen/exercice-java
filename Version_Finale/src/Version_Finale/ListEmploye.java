package Version_Finale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListEmploye {
	ArrayList<Employe> listemp = new ArrayList<Employe>();

	public ListEmploye() {
		listemp.add(new Employe("E01", "Moumen", "Islaq",30000.00));
		listemp.add(new Employe("E02", "Meziane", "Youness",13000.00));
		listemp.add(new Employe("E03", "Kerbab", "Houssam",20000.00));
		listemp.add(new Employe("E04", "Halim", "Mehdi",8000.00));
		listemp.add(new Employe("E05", "Hassani", "Oussama",67000.00));
	}
	
	public void afficher() {
		for(Employe emp:listemp) {
			System.out.println(emp);
		}
	}
	public void parcourIt() {
		Iterator<Employe> it =listemp.iterator();
	    while (it.hasNext()) {
	        System.out.println(it.next());
	      }
	}
	public void ajouterEmploye(Employe emp) {
		listemp.add(0,emp);
	}
	public Employe recuperEmploye(int index) {
		if(index>=0 && index <listemp.size())
			return listemp.get(index);
		 throw new IllegalArgumentException("l indice  doit etre compris entre 0 et la taille");
	}
	public boolean supprimerEmploye(Employe emp) {
		return listemp.remove(emp);
	}
	public boolean rechercheEmploye(Employe emp) {
		return listemp.contains(emp);
	}
	public void trierEmployes(Comparator<Employe> cmp) { // fonction generale pour faire le trie par marque,matricule,modele
		Collections.sort(listemp,cmp);
	}
	public ArrayList<Employe> copierList() {
		ArrayList<Employe> newlist = new ArrayList<Employe>();
		newlist.addAll(listemp);
		return newlist;
		//return new ArrayList<Employe>(listemp);
	}
	public void melangerList() {
		Collections.shuffle(listemp);
	}
	public void inverserList() {
		Collections.reverse(listemp);
	}	
	public ArrayList<Employe> subList(int start, int end){
		if(start >=0 && end<listemp.size() && start<end) {
			return new ArrayList<Employe>(listemp.subList(start, end));
		}
		throw new IllegalArgumentException("start , end invalide");
	}
	public boolean compareList(ArrayList<Employe> list) {
		return listemp.equals(list); 
	}
	public void echangerList(int e1,int e2) {
		Collections.swap(listemp, e1, e2);
	}
	public void viderList() {
		listemp.clear();
	}
	public boolean listEstVide() {
		return listemp.isEmpty();
	}
}
