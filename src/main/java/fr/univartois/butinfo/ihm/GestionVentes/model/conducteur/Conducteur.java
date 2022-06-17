package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

public abstract class Conducteur {

    private String nom;
    private String prenom;
    private static int nbConducteurs=0;
    private int reference;
    private Permis typePermis;
    private String numeroPermis;

    public Conducteur(String nom, String prenom, String numeroPermis, Permis typePermis) {
        reference=nbConducteurs++;
    	this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.typePermis = typePermis;

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





	public Permis getTypePermis() {
		return typePermis;
	}





	public void setTypePermis(Permis typePermis) {
		this.typePermis = typePermis;
	}





	public String getNumeroPermis() {
		return numeroPermis;
	}





	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}





	public int getReference() {
		return reference;
	}





	public boolean equals(Conducteur personne1){
        if(prenom == null || nom == null)return false;
        if (this.prenom.equals(personne1.getPrenom()) && this.nom.equals(personne1.getNom()))
            return true;
        return false;
    }


        @Override
        public String toString() {
            return "Conducteurs{" +
                    "nom='" + getNom() + '\'' +
                    ", prenom='" + getPrenom() + '\'' +
                    ", typePermis='" + getTypePermis() + '\'' +
                    ", numeroPermis='" + getNumeroPermis() + '\'' +
                    '}';
        }


}


