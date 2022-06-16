package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;

public class initialise {
	private CarnetClients carnet;
	private Stock stock;
	
	public initialise(String nom, String stock) {
		carnet = new CarnetClients(nom);
		this.stock = new Stock(stock);
	}
	
	public CarnetClients getCarnet() {
		return this.carnet;
	}
	public Stock getStock() {
		return this.stock;
	}
}
