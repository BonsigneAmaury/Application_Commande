package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;



import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Livreur;


public class Fourgon extends Vehicule {

    private double PoidMaximal;

    public Livreur livreur;

    private double volumeMax;

    public Fourgon(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu, double poidMaximal, double vMChargement) {
        super(immatriculation,modele,marque,kilometrage,anneeCircu);
        this.volumeMax = vMChargement;
        this.PoidMaximal = poidMaximal;
    }
    public double getVolumeMax() {
        return this.volumeMax;
    }

    public void setVolumeMax(double value) {
        this.volumeMax = value;
    }

    public double getPoidMaximal() {
        return this.PoidMaximal;
    }

    public void setPoidMaximal(double value) {
        this.PoidMaximal = value;
    }
	@Override
	public String toString() {
		return super.toString() + "PoidMaximal=" + PoidMaximal + ", livreur=" + livreur + ", volumeMax=" + volumeMax;
	}
    
    
}
