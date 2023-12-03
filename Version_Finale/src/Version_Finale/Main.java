package Version_Finale;

public class Main {

	public static void main(String[] args) {
		TableauEmploye te=new TableauEmploye();
		te.afficher(); // correct
		System.out.println(te.nbEmploye()); // correct
		Employe e5=new Employe("E01", "Moumen", "Islaq",30000.00);
		System.out.println(te.AjouterEmploye(e5));// false
		System.out.println(te.SupprimerEmploye(e5)); // true
		te.afficher();
		System.out.println("le salaire max de tous le employe est : " + te.salaireMax());
		
	}

}
