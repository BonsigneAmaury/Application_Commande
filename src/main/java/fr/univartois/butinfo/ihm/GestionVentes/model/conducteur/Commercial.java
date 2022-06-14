package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;



public class Commercial extends Conducteurs {


    public Commercial(String nom, String prenom, String numeroPermis, String typePermis) {
        super(nom,prenom,numeroPermis,typePermis);
    }
    public void nbVisite() {
        //TODO a chaque visite chez un client ou autre, nbVisite gagne 1
    }
}
