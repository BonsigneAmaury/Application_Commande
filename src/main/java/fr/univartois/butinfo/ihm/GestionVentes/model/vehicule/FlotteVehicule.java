package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;


import java.util.ArrayList;
import java.util.List;

public abstract class FlotteVehicule {

    private String immatriculation;


    private double kilometrage;

    private String modele;

    private int anneeCircu;
    private String marque;
   //TODO mettre la list en ObservalbleList
    private List<Vehicule> vehicules;

    public FlotteVehicule(String immatriculatrion, String modele, String marque, double kilometrage, int anneeCircu) {
        this.immatriculation=immatriculatrion;
        this.modele = modele;
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.anneeCircu = anneeCircu;
        this.vehicules = new ArrayList<>();

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

    public void ajoutVehicule(Vehicule v) {
        vehicules.add(v);
    }


    public void SupprimerVehicule(Vehicule v) {
        vehicules.remove(v);
    }


    public  String triTypeV() {
        //TODO Tri les vehicules par types de vehicules et affiche les vehicules
        //Pour accomplir des tris, vous utiliserez la méthode sort(List<T> list, Comparator
        //       <? super T> c) de la classe Collections. Au préalable, il vous faudra définir des classes
        //qui implémenteront l’interface Comparator<T>. Le nom de chacune de ces classes débutera par Comparateur.

        return null;
    }

    public String triTypeF(){
        //TODO Tri les vehicules par types de vehicules et affiche les fourgons
        return null;
    }


    public void triAnneeCircu() {
        //TODO tri les vehicules par annee de circulation
    }


    public boolean equals(FlotteVehicule vehicule1) {
        if(immatriculation == null) return false;
        if(vehicule1.getImmatriculation() == this.immatriculation)return true;
        return false;
    }

    @Override
    public String toString() {
        return "FlotteVehicule{" +
                "immatriculation='" + immatriculation + '\'' +
                ", kilometrage=" + kilometrage +
                ", modele='" + modele + '\'' +
                ", anneeCircu=" + anneeCircu +
                ", marque='" + marque + '\'' +
                ", vehicules=" + vehicules +
                '}';
    }
}
