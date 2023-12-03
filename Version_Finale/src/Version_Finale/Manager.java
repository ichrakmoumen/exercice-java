package Version_Finale;

public class Manager extends Employe{
    private String niveauHierarchique;//Le niveau hiérarchique du manager dans l'organisation
    private String departement;


	public Manager(String id, String nom, String prenom, double salaire, String niveauHierarchique,
			String departement) {
		super(id, nom, prenom, salaire);
		this.niveauHierarchique = niveauHierarchique;
		this.departement = departement;
	}
	

	public String getNiveauHierarchique() {
		return niveauHierarchique;
	}


	public void setNiveauHierarchique(String niveauHierarchique) {
		this.niveauHierarchique = niveauHierarchique;
	}


	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}
	@Override
	public String toString() {
		return super.toString() + " [niveauHierarchique=" + niveauHierarchique + ", departement=" + departement
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)==false)
			return false;
		if(obj instanceof Manager) {
			Manager m = (Manager) obj;
			return m.getId()==this.getId();
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}

	

	

}
