package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

public abstract class Vehicule {

    private String immatriculation;


    private double kilometrage;

    private String modele;

    private int anneeCircu;
    private String marque;
   //TODO mettre la list en ObservalbleList

    public Vehicule(String immatriculatrion, String modele, String marque, double kilometrage, int anneeCircu) {
        this.immatriculation=immatriculatrion;
        this.modele = modele;
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.anneeCircu = anneeCircu;
    }

    private String getMarque() {
        // Automatically generated method. Please do not modify this code.
        return this.marque;
    }

    private void setMarque(String value) {
        // Automatically generated method. Please do not modify this code.
        this.marque = value;
    }

    private String getImmatriculation() {
        // Automatically generated method. Please do not modify this code.
        return this.immatriculation;
    }


    private void setImmatriculation(String value) {
        // Automatically generated method. Please do not modify this code.
        this.immatriculation = value;
    }

    private double getKilometrage() {
        // Automatically generated method. Please do not modify this code.
        return this.kilometrage;
    }


    private void setKilometrage(double value) {
        // Automatically generated method. Please do not modify this code.
        this.kilometrage = value;
    }

    private int getAnneeCircu() {
        // Automatically generated method. Please do not modify this code.
        return this.anneeCircu;
    }


    private void setAnneeCircu(int value) {
        // Automatically generated method. Please do not modify this code.
        this.anneeCircu = value;
    }
    private String getModele() {
        // Automatically generated method. Please do not modify this code.
        return this.modele;
    }


    private void setModele(String value) {
        // Automatically generated method. Please do not modify this code.
        this.modele = value;
    }


    public boolean equals(Vehicule vehicule1) {
        if(immatriculation == null) return false;
        if(this.immatriculation.equals(vehicule1.getImmatriculation()))return true;
        return false;
    }

    @Override
    public String toString() {
        return "FlotteVehicule{" +
                "immatriculation='" + getImmatriculation() + '\'' +
                ", kilometrage=" + getKilometrage() +
                ", modele='" + getModele() + '\'' +
                ", anneeCircu=" + getAnneeCircu() +
                ", marque='" + getMarque() + '\'' +
                '}';
    }
}
