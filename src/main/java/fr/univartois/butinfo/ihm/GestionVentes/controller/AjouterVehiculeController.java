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

public class AjouterVehiculeController {
	private Stage stage;
	private Scene mainScene;
	private FlotteVehicule flotte;
	private Vehicule vehicule;
	
	public void setFlotte(FlotteVehicule flotte) {
		this.flotte = flotte;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public void setMainScene(Scene scene) {
		this.mainScene=scene;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

    @FXML
    private TextField annee_answer;

    @FXML
    private ComboBox<String> categorie_answer;


    @FXML
    private TextField immatriculation_answer;

    @FXML
    private TextField km_answer;

    @FXML
    private TextField marque_answer;

    @FXML
    private TextField modele_answer;
    @FXML
    void initialize() {
    	categorie_answer.setItems(FXCollections.observableArrayList("Voiture", "Fourgon"));
    }


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

    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);

    }

}