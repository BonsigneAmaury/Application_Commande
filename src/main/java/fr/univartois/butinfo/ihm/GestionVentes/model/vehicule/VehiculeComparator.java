package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import java.util.Comparator;

public class VehiculeComparator implements Comparator<Vehicule> {

	@Override
	public int compare(Vehicule o1, Vehicule o2) {
		return o1.toString().compareTo(o2.toString());
	}

}
