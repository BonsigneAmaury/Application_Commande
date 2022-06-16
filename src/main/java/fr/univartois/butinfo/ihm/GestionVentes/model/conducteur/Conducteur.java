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


    private String getPrenom() {
        return this.prenom;
    }

    private void setPrenom(String value) {
        this.prenom = value;
    }
    
    private void setNumeroPermis(String value) {
        this.nom = value;
    }

    private String getNumeroPermis() {
        return this.numeroPermis;
    }
    
    private void setNom(String value) {
        this.nom = value;
    }

    private String getNom() {
        return this.nom;
    }
    private Permis getTypePermis() {
        return this.typePermis;
    }
    private void setTypePermis(Permis value) {
        this.typePermis = value;
    }
    private int getReference() {
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


