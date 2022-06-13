package vehicule;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import conducteur.Commercial;

@objid ("9cf834d8-2e90-478b-9784-c7da5932c010")
public class Vehicule {
    @objid ("d88dea35-d619-4d3b-873f-427108df2096")
    public Commercial commercial;

    @objid ("ccc6e574-36b6-462b-a0b0-08de67636f74")
    public Vehicule(String immatriculation, String modele, String marque, double kilometrage, int anneeCircu) {
    }

}
