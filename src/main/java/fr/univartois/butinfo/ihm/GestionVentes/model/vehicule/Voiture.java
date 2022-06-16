package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Commercial;


public class Voiture extends Vehicule {

    public Commercial commercial;


    public Voiture(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu) {
        super(immatriculation,modele,marque,kilometrage,anneeCircu);
    }

}
