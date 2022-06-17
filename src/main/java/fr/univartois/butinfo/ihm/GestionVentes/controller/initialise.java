package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteurs;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.FlotteVehicule;

public class initialise {
	private CarnetClients carnet;
	private Stock stock;
	private Conducteurs conducteurs;
	private FlotteVehicule flotte;
	
	public initialise(String nom, String stock) {
		carnet = new CarnetClients(nom);
		this.stock = new Stock(stock);
		this.conducteurs = new Conducteurs();
		this.flotte = new FlotteVehicule();
	}
	
	public CarnetClients getCarnet() {
		return this.carnet;
	}
	public Stock getStock() {
		return this.stock;
	}
	public Conducteurs getConducteurs() {
		return this.conducteurs;
	}
	public FlotteVehicule getFlotte() {
		return this.flotte;
	}
}
