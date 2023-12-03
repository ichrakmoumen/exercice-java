package Version_Finale;

public class Employe implements Comparable<Employe>{
	private String id;
	private String nom;
	private String prenom;
	private double salaire;

	public Employe(String id, String nom, String prenom, double salaire) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Employe) {
			Employe E = (Employe) obj;
			return E.id==this.id;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
