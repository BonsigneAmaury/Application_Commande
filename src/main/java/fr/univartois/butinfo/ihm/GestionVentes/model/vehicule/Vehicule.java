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



    public String getImmatriculation() {
		return immatriculation;
	}



	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}



	public double getKilometrage() {
		return kilometrage;
	}



	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}



	public String getModele() {
		return modele;
	}



	public void setModele(String modele) {
		this.modele = modele;
	}



	public int getAnneeCircu() {
		return anneeCircu;
	}



	public void setAnneeCircu(int anneeCircu) {
		this.anneeCircu = anneeCircu;
	}



	public String getMarque() {
		return marque;
	}



	public void setMarque(String marque) {
		this.marque = marque;
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
