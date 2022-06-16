package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Conducteurs {
	private ObservableList<Conducteur> conducteurs;
	
	public Conducteurs() {
		this.conducteurs= FXCollections.observableList(new LinkedList<Conducteur>());
	}
	
	public void addConducteurs(Conducteur conducteur) {
		if (conducteurs.contains(conducteur) ) {
			return ;
		}
		conducteurs.add(conducteur);
	}
	
	public void delConducteurs(Conducteur conducteur) {
		if (conducteurs.contains(conducteur) ) {
			conducteurs.remove(conducteur);
		}
	}
	
	public ObservableList <Conducteur> getConducteurs(){
		return conducteurs;
	}
	public int getSize() {
		return conducteurs.size();
	}
	
	public void afficher() {
		Iterator<Conducteur> iteratorCommercial=conducteurs.iterator();
		while (iteratorCommercial.hasNext()) {
			Conducteur conducteur=iteratorCommercial.next();
			if (conducteur instanceof Commercial) {
				System.out.println(conducteur.toString());
			}
		}
		Iterator<Conducteur> iteratorLivreur=conducteurs.iterator();
		while (iteratorLivreur.hasNext()) {
			Conducteur conducteur=iteratorLivreur.next();
			if (conducteur instanceof Livreur) {
				System.out.println(conducteur.toString());
			}
		}
	}
	
	public void afficherAlphabetique() {
		Collections.sort(conducteurs, new ConducteurComparator());
		for (int x=0;x<conducteurs.size();x++) {
			System.out.println(conducteurs.get(x));
		}
	}
}
