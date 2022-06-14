package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;



import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Livreur;


public class Fourgon extends FlotteVehicule {

    private double PoidMaximal;

    public Livreur livreur;

    private double vMChargement;

    public Fourgon(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu, double poidMaximal, double vMChargement) {
        super(immatriculation,modele,marque,kilometrage,anneeCircu);
        this.vMChargement = vMChargement;
        this.PoidMaximal = poidMaximal;
    }
    private double getVMChargement() {
        // Automatically generated method. Please do not modify this code.
        return this.vMChargement;
    }


    private void setVMChargement(double value) {
        // Automatically generated method. Please do not modify this code.
        this.vMChargement = value;
    }



    private double getPoidMaximal() {
        // Automatically generated method. Please do not modify this code.
        return this.PoidMaximal;
    }

    private void setPoidMaximal(double value) {
        // Automatically generated method. Please do not modify this code.
        this.PoidMaximal = value;
    }
}
