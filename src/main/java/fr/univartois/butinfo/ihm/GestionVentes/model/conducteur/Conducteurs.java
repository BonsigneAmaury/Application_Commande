package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import javafx.collections.ObservableList;

import java.util.List;
import java.util.Collections;


public abstract class Conducteurs {

    private String nom;
    private String prenom;


    private String typePermis;


    private ObservableList<Conducteurs> conducteurs;

    private String numeroPermis;

    public Conducteurs(String nom, String prenom, String numeroPermis, String typePermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.typePermis = typePermis;

    }


    private String getPrenom() {
        // Automatically generated method. Please do not modify this code.
        return this.prenom;
    }

    private void setPrenom(String value) {
        // Automatically generated method. Please do not modify this code.
        this.prenom = value;
    }


    private String getNumeroPermis() {
        // Automatically generated method. Please do not modify this code.
        return this.numeroPermis;
    }


    private void setNumeroPermis(String value) {
        // Automatically generated method. Please do not modify this code.
        this.numeroPermis = value;
    }




    private String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }
    private String getTypePermis() {
        // Automatically generated method. Please do not modify this code.
        return this.typePermis;
    }
    private void setTypePermis(String value) {
        // Automatically generated method. Please do not modify this code.
        this.typePermis = value;
    }


    private List<Conducteurs> getConducteur() {
        // Automatically generated method. Please do not modify this code.
        return this.conducteurs;
    }




    private void setNom(String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    public void addConducteurs(Conducteurs c) {
        conducteurs.add(c);
        }


    public void delConducteurs(Conducteurs c) {
        conducteurs.remove(c);
    }


    public String triTypeC(Conducteurs c) {
        //TODO tri le  type de conducteurs et affiche les commerciaux
        //Pour accomplir des tris, vous utiliserez la méthode sort(List<T> list, Comparator
         //       <? super T> c) de la classe Collections. Au préalable, il vous faudra définir des classes
        //qui implémenteront l’interface Comparator<T>. Le nom de chacune de ces classes débutera par Comparateur.

        return null;
    }

    public String triTypeL(Conducteurs c){
        //TODO tri le type de conducteur et affiche les livreurs(utilise sort)
        return null;
    }

    public String triAlpha(Conducteurs c) {
        //TODO tri dans l'ordre alphabétique les conducteurs (utilise sort)
        //Collections.sort(conducteurs.sorted(conducteurs.filtered())); tkt c'est pas bon
        return null;
    }

    public boolean equals(Conducteurs personne1){
        if(prenom == null || nom == null)return false;
        if (personne1.getPrenom() == this.prenom && personne1.getNom() == this.nom)
            return true;
        return false;
    }


        @Override
        public String toString() {
            return "Conducteurs{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", typePermis='" + typePermis + '\'' +
                    ", conducteurs=" + conducteurs +
                    ", numeroPermis='" + numeroPermis + '\'' +
                    '}';
        }


}


