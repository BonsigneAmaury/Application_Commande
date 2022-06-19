package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.FlotteVehicule;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Fourgon;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Vehicule;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Voiture;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * controller gerant l'ajout des vehicule
 * @author axelp
 *
 */
public class AjouterVehiculeController {
	/**
	 * la fenetre de l'appli 
	 */
	private Stage stage;
	/**
	 * la scene de la fenetre
	 */
	private Scene mainScene;
	/**
	 * la flotte de vehicule
	 */
	private FlotteVehicule flotte;
	/**
	 * le vehicule a ajouter ou modifier
	 */
	private Vehicule vehicule;
	/**
	 * mise en place de la flotte de vehicule
	 * @param flotte
	 */
	public void setFlotte(FlotteVehicule flotte) {
		this.flotte = flotte;
	}
	/**
	 * mise en place de la fenetre
	 * @param stage
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	/**
	 * mise en place de la scene
	 * @param scene
	 */
	public void setMainScene(Scene scene) {
		this.mainScene=scene;
	}
	/**
	 * mise en place du vehicule a creer ou modifier
	 * @param vehicule
	 */
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	/**
	 * champs de reponse pour l'année
	 */
    @FXML
    private TextField annee_answer;
    /**
     * champs de reponse pour la categorie
     */
    @FXML
    private ComboBox<String> categorie_answer;

    /**
     * champs de reponse pour l'immatriculation
     */
    @FXML
    private TextField immatriculation_answer;
    /**
     * champs de reponse pour le kilometrage
     */
    @FXML
    private TextField km_answer;
    /**
     * champs de reponse pour la marque
     */
    @FXML
    private TextField marque_answer;
    /**
     * champs de reponse pour le modele
     */
    @FXML
    private TextField modele_answer;
    /**
     * initialisation des comboBox
     */
    @FXML
    void initialize() {
    	categorie_answer.setItems(FXCollections.observableArrayList("Voiture", "Fourgon"));
    }

    /**
     * ajout d'un vehicule
     * @param event
     */
    @FXML
    void ajouter(ActionEvent event) {
		int annee = Integer.parseInt(annee_answer.getText());
		String immatriculation = immatriculation_answer.getText();
		double km = Double.parseDouble(km_answer.getText());
		String marque = marque_answer.getText();
		String modele = modele_answer.getText();
		
		String categorie = categorie_answer.getValue();
		if (vehicule != null) {
			vehicule.setAnneeCircu(annee);
			vehicule.setImmatriculation(immatriculation);
			vehicule.setKilometrage(km);
			vehicule.setMarque(marque);
			vehicule.setModele(modele);
		} else {
			if (categorie.equals("Voiture"))
				vehicule = new Voiture(immatriculation, modele, marque, km, annee);
			else
				vehicule = new Fourgon(immatriculation, modele, marque, km, annee, 100, 100);
			flotte.addVehicule(vehicule);
		}
		stage.setScene(mainScene);

    }
    /**
     * annulation est retour a la scene precedente
     * @param event
     */
    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);

    }

}