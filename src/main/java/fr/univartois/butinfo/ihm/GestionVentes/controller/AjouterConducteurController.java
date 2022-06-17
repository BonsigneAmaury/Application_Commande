package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.Livrable;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Commercial;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteur;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteurs;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Livreur;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Permis;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AjouterConducteurController {
	private Stage stage;

	private Scene mainScene;
	
	private Conducteurs carnet_conducteur;
	
	private Conducteur conducteur;
	
	public void setConducteur(Conducteur conducteur) {
		this.conducteur=conducteur;
	}
	
	public void setConducteurs(Conducteurs conducteurs) {
		this.carnet_conducteur = conducteurs;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}
    @FXML
    private ComboBox<String> categorie_answer;

    @FXML
    private TextField nom_answer;

    @FXML
    private TextField num_answer;

    @FXML
    private TextField prenom_answer;

    @FXML
    private ComboBox<Permis> type_answer;
    
    
    @FXML
    void initialize() {
    	categorie_answer.setItems(FXCollections.observableArrayList("Commercial", "Livreur"));
    	type_answer.setItems(FXCollections.observableArrayList(Permis.values()));
    }


    @FXML
    void ajouter(ActionEvent event) {
		String nom = nom_answer.getText();
		String prenom = prenom_answer.getText();
		String num = num_answer.getText();
		Permis type_permis = type_answer.getValue();
		String categorie = categorie_answer.getValue();
		if (conducteur != null) {
			conducteur.setNom(nom);
			conducteur.setPrenom(prenom);
			conducteur.setNumeroPermis(num);
			conducteur.setTypePermis(type_permis);
		} else {
			if (categorie.equals("Commercial"))
				conducteur = new Commercial(nom, prenom, num, type_permis);
			else
				conducteur = new Livreur(nom, prenom, num, type_permis);
			carnet_conducteur.addConducteurs(conducteur);;
		}
		stage.setScene(mainScene);

    }

    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);

    }

	

}
