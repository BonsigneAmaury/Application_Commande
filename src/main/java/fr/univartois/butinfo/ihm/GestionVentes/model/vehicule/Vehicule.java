package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Commercial;


public class Vehicule extends FlotteVehicule {

    public Commercial commercial;


    public Vehicule(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu) {
        super(immatriculation,modele,marque,kilometrage,anneeCircu);
    }

}
