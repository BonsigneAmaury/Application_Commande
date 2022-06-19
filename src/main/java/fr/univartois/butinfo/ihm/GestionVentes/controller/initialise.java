package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteurs;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.FlotteVehicule;
/**
 * initialisation des classes stockans les objet necessaire a l'interface
 * @author axelp
 *
 */
public class initialise {
	/**
	 * le carnet de client
	 */
	private CarnetClients carnet;
	/**
	 * le stock des article
	 */
	private Stock stock;
	/**
	 * le carnet des conducteur
	 */
	private Conducteurs conducteurs;
	/**
	 * la flotte de vehicule
	 */
	private FlotteVehicule flotte;
	/**
	 * initialisation des variable de la classe
	 * @param nom
	 * @param stock
	 */
	public initialise(String nom, String stock) {
		carnet = new CarnetClients(nom);
		this.stock = new Stock(stock);
		this.conducteurs = new Conducteurs();
		this.flotte = new FlotteVehicule();
	}
	/**
	 * 
	 * @return le carnet
	 */
	public CarnetClients getCarnet() {
		return this.carnet;
	}
	/**
	 * 
	 * @return le stock
	 */
	public Stock getStock() {
		return this.stock;
	}
	/**
	 * 
	 * @return la liste des conducteur
	 */
	public Conducteurs getConducteurs() {
		return this.conducteurs;
	}
	/**
	 * 
	 * @return la flotte des vehicule
	 */
	public FlotteVehicule getFlotte() {
		return this.flotte;
	}
}
