package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;

public class initialise {
	private CarnetClients carnet;
	
	public initialise(String nom) {
		carnet = new CarnetClients(nom);
	}
	
	public CarnetClients getCarnet() {
		return this.carnet;
	}
}
