package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;



public class Commercial extends Conducteur {
	private int nbVisite;
    public Commercial(String nom, String prenom, String numeroPermis, Permis typePermis) {
        super(nom,prenom,numeroPermis,typePermis);
        this.nbVisite=0;
    }
    public void nbVisite() {
        nbVisite+=1;
    }
	public int getNbVisite() {
		return nbVisite;
	}
	public void setNbVisite(int nbVisite) {
		this.nbVisite = nbVisite;
	}
	@Override
	public String toString() {
		return super.toString()+"nbVisite=" + nbVisite ;
	}
	
	
}
