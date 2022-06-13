package vehicule;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import conducteur.Livreur;

@objid ("634d0fbe-4ee9-4adf-85b9-e659194e16e2")
public class Fourgon {
    @mdl.prop
    @objid ("441486e5-49e7-45ba-a782-5fc7e1a66b7b")
    private double PoidMaximal;

    @mdl.propgetter
    private double getPoidMaximal() {
        // Automatically generated method. Please do not modify this code.
        return this.PoidMaximal;
    }

    @mdl.propsetter
    private void setPoidMaximal(double value) {
        // Automatically generated method. Please do not modify this code.
        this.PoidMaximal = value;
    }

    @mdl.prop
    @objid ("e7e29e90-9863-40c7-bcea-153004fbd0bc")
    private double vMChargement;

    @mdl.propgetter
    private double getVMChargement() {
        // Automatically generated method. Please do not modify this code.
        return this.vMChargement;
    }

    @mdl.propsetter
    private void setVMChargement(double value) {
        // Automatically generated method. Please do not modify this code.
        this.vMChargement = value;
    }

    @objid ("ab9073ac-d234-47dd-86d0-078f886cca84")
    public Livreur livreur;

    @objid ("3dc2bec9-a7ee-4587-aead-fb3c9fcdf5f3")
    public Fourgon(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu, double poidMaximal, double vMChargement) {
    }

}
