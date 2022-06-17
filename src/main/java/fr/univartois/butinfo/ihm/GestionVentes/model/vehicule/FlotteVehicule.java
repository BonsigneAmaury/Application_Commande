package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FlotteVehicule {

	private ObservableList<Vehicule> flotte;
	
	public FlotteVehicule() {
		this.flotte=FXCollections.observableList(new ArrayList<Vehicule>());
	}
	
	public void addVehicule(Vehicule vehicule){
		if (flotte.contains(vehicule)) {
			return;
		}
		flotte.add(vehicule);
	}
	public void delVehicule(Vehicule vehicule){
		if (flotte.contains(vehicule)) {
			flotte.remove(vehicule);
		}
	}
	
	
	public ObservableList<Vehicule> getFlotte() {
		return flotte;
	}

	public void afficher() {
		Iterator<Vehicule> iteratorFourgon=flotte.iterator();
		while (iteratorFourgon.hasNext()) {
			Vehicule vehicule=iteratorFourgon.next();
			if (vehicule instanceof Fourgon) {
				System.out.println(vehicule.toString());
			}
		}
		Iterator<Vehicule> iteratorVoiture=flotte.iterator();
		while (iteratorVoiture.hasNext()) {
			Vehicule vehicule=iteratorVoiture.next();
			if (vehicule instanceof Voiture) {
				System.out.println(vehicule.toString());
			}
		}
	}
	
	public void afficherAlphabetique() {
		Collections.sort(flotte, new VehiculeComparator());
		for (int x=0;x<flotte.size();x++) {
			System.out.println(flotte.get(x));
		}
	}
	
	@Override
	public String toString() {
		return "FlotteVehicule [flotte=" + flotte + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(flotte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlotteVehicule other = (FlotteVehicule) obj;
		return Objects.equals(flotte, other.flotte);
	}
	
	
}
