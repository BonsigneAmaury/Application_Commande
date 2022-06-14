package conducteur;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ec68fe07-405b-4b00-a482-5d9dd8ddada6")
public abstract class Conducteurs<T> {
    @mdl.prop
    @objid ("bcb063a0-223c-4e87-a1df-7b3bd760a59f")
    private String nom;

    @mdl.propgetter
    private String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    @mdl.propsetter
    private void setNom(String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    @mdl.prop
    @objid ("cd5f0640-2c40-447d-bf69-54fd71143a2e")
    private String prenom;

    @mdl.propgetter
    private String getPrenom() {
        // Automatically generated method. Please do not modify this code.
        return this.prenom;
    }

    @mdl.propsetter
    private void setPrenom(String value) {
        // Automatically generated method. Please do not modify this code.
        this.prenom = value;
    }

    @mdl.prop
    @objid ("59b941a2-2d34-481f-be4a-94e695523d30")
    private String numeroPermis;

    @mdl.propgetter
    private String getNumeroPermis() {
        // Automatically generated method. Please do not modify this code.
        return this.numeroPermis;
    }

    @mdl.propsetter
    private void setNumeroPermis(String value) {
        // Automatically generated method. Please do not modify this code.
        this.numeroPermis = value;
    }

    @mdl.prop
    @objid ("73d5a751-e59b-4e28-b9c7-babeb6c7d21a")
    private String typePermis;

    @mdl.propgetter
    private String getTypePermis() {
        // Automatically generated method. Please do not modify this code.
        return this.typePermis;
    }

    @mdl.propsetter
    private void setTypePermis(String value) {
        // Automatically generated method. Please do not modify this code.
        this.typePermis = value;
    }

    @mdl.prop
    @objid ("59983950-ff1c-4a0b-8cbc-3e5243230c83")
    private List<String> listConducteur = new ArrayList<String> ();

    @mdl.propgetter
    private List<String> getListConducteur() {
        // Automatically generated method. Please do not modify this code.
        return this.listConducteur;
    }

    @mdl.propsetter
    private void setListConducteur(List<String> value) {
        // Automatically generated method. Please do not modify this code.
        this.listConducteur = value;
    }

    @objid ("2d1a551e-c17c-4e02-a8a8-7aced7f326a0")
    public boolean equals(Conducteurs Personne1) {
    }

    @objid ("56ab5213-7e79-4ecb-9945-707df5152826")
    public Conducteurs(String nom, String prenom, String numeroPermis, String typePermis) {
    }

    @objid ("acfad930-0b89-4388-940b-a8063abfd481")
    public void addConducteur(Conducteurs c) {
    }

    @objid ("86679309-1d04-4e0d-9e88-7bfa5445775b")
    public void delConducteur(Conducteurs c) {
    }

    @objid ("55012fec-e852-42a8-aee1-c0eb3f79ba45")
    public void triType(Conducteurs c) {
    }

    @objid ("fabd3161-d341-4ae8-ae10-553b7c28e3da")
    public void triAlpha(Conducteurs c) {
    }

    @objid ("7607cef3-5756-4607-899f-c358651e8263")
    public String toString() {
    }

    @objid ("60e68c94-d5a2-4c21-b06a-28241228f520")
    public String getNom() {
    }

    @objid ("afd18cef-6df4-492a-9e0f-379ddae7620c")
    public String getPrenom() {
    }

    @objid ("dbdf0744-e2e2-4bd7-a62f-b36ce5385b09")
    public String getnumeroPermis() {
    }

    @objid ("8b9604bd-a876-4be1-a74a-851a9952ec1c")
    public String getTypePermis() {
    }

}
