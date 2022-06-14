package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;




public class Livreur extends Conducteurs {

    public Livreur(String nom, String prenom, String numeroPermis, String typePermis) {
        super(nom,prenom,numeroPermis,typePermis);

    }


    public void nbHConduite() {
        //TODO a chaque heure la methode prend +1
    }

}
