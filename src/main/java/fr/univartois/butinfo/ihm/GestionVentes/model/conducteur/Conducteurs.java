package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import java.util.ArrayList;
import java.util.List;


public abstract class Conducteurs {

    private String nom;
    private String prenom;


    private String typePermis;

    //TODO mettre la list en ObservalbleList
    private List<Conducteurs> conducteurs;

    private String numeroPermis;

    public Conducteurs(String nom, String prenom, String numeroPermis, String typePermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.typePermis = typePermis;
        this.conducteurs = new ArrayList<>();
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
        //TODO tri le type de conducteur et affiche les livreurs
        return null;
    }

    public void triAlpha(Conducteurs c) {
        //TODO tri dans l'ordre alphabétique les conducteurs
    }

    public boolean equals(Conducteurs Personne1){
        //TODO est égale une personne avec le meme prenom et nom qu'une autre personne
        return true;
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


