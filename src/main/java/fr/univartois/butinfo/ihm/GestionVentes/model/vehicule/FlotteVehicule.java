package vehicule;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a834d64a-4efb-4326-b809-781662934a6d")
public abstract class FlotteVehicule {
    @mdl.prop
    @objid ("f782c0c3-3715-4ea5-b758-760d331e6382")
    private String immatriculation;

    @mdl.propgetter
    private String getImmatriculation() {
        // Automatically generated method. Please do not modify this code.
        return this.immatriculation;
    }

    @mdl.propsetter
    private void setImmatriculation(String value) {
        // Automatically generated method. Please do not modify this code.
        this.immatriculation = value;
    }

    @mdl.prop
    @objid ("e99a7ab0-ff82-466f-ab90-d299e9e9a420")
    private String modele;

    @mdl.propgetter
    private String getModele() {
        // Automatically generated method. Please do not modify this code.
        return this.modele;
    }

    @mdl.propsetter
    private void setModele(String value) {
        // Automatically generated method. Please do not modify this code.
        this.modele = value;
    }

    @mdl.prop
    @objid ("62edf8ad-7037-475d-a6d1-d3ef8cb4f6de")
    private String marque;

    @mdl.propgetter
    private String getMarque() {
        // Automatically generated method. Please do not modify this code.
        return this.marque;
    }

    @mdl.propsetter
    private void setMarque(String value) {
        // Automatically generated method. Please do not modify this code.
        this.marque = value;
    }

    @mdl.prop
    @objid ("363b1d15-f122-40d5-8487-579c08bee9d9")
    private double kilometrage;

    @mdl.propgetter
    private double getKilometrage() {
        // Automatically generated method. Please do not modify this code.
        return this.kilometrage;
    }

    @mdl.propsetter
    private void setKilometrage(double value) {
        // Automatically generated method. Please do not modify this code.
        this.kilometrage = value;
    }

    @mdl.prop
    @objid ("6c4ef14a-ba40-4b24-8850-3885f7add871")
    private int anneeCircu;

    @mdl.propgetter
    private int getAnneeCircu() {
        // Automatically generated method. Please do not modify this code.
        return this.anneeCircu;
    }

    @mdl.propsetter
    private void setAnneeCircu(int value) {
        // Automatically generated method. Please do not modify this code.
        this.anneeCircu = value;
    }

    @objid ("619fe8e1-3119-4471-8e18-47f834f7cf7c")
    public FlotteVehicule(String immatriculatrion, String modele, String marque, double kilometrage, int anneeCircu) {
    }

    @objid ("ef5533b6-23c8-4161-9453-a1eb948da4ec")
    public void ajoutVehicule() {
    }

    @objid ("3407cabb-bdab-41fc-924f-966455e6bae7")
    public void SupprimerVehicule() {
    }

    @objid ("374e085b-cdd4-49ab-97f6-73aa6c1226e8")
    public void triType() {
    }

    @objid ("e12c72af-be9a-41e7-a52c-e80ba8ad1580")
    public void triAnneeCircu() {
    }

    @objid ("4c81d290-6b71-476c-8280-41eab7a4c19a")
    public void toString() {
    }

    @objid ("7fc0da0f-f443-4001-b948-f6fdfa1060cf")
    public String getImmatriculation() {
    }

    @objid ("17e4df3a-01bb-4376-93ca-7aeb528de45e")
    public String getmodele() {
    }

    @objid ("1af1ad2b-b31e-4354-908b-1f8671b78061")
    public String getMarque() {
    }

    @objid ("0ce1ab7c-18ed-459c-b6ac-407e9f505c6a")
    public double getKilometrage() {
    }

    @objid ("a243bfd4-2225-4db6-8b7c-4377e81c6062")
    public int getAnneeCircu() {
    }

}
