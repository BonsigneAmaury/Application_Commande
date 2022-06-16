package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import java.util.Comparator;

public class ConducteurComparator implements Comparator<Conducteur> {

	@Override
	public int compare(Conducteur o1, Conducteur o2) {
		return o1.toString().compareTo(o2.toString());
	}

}
