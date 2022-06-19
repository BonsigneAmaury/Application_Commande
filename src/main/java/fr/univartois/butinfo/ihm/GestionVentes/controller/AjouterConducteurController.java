package fr.univartois.butinfo.ihm.GestionVentes.controller;
/**
 * controller gerant l'ajout de conducteur
 */

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
	/**
	 * fenetre de l'appli
	 */
	private Stage stage;
	/**
	 * scene de la fenetre
	 */

	private Scene mainScene;
	/**
	 * le carnet des condcuteur, contient les conducteurs
	 */
	
	private Conducteurs carnet_conducteur;
	/**
	 * conducteur a modifier ou ajouter 
	 */
	private Conducteur conducteur;
	/**
	 * mise en place du conducteur a modifier
	 * @param conducteur
	 */
	public void setConducteur(Conducteur conducteur) {
		this.conducteur=conducteur;
	}
	/**
	 * mise en place du carnet de conducteur
	 * @param conducteurs
	 */
	public void setConducteurs(Conducteurs conducteurs) {
		this.carnet_conducteur = conducteurs;
	}
	/**
	 * mise en place de la fenetre 
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	/**
	 * mise en place de la scene
	 * @param scene
	 */
	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}
	/**
	 * champs de reponse pour la categorie
	 */
    @FXML
    private ComboBox<String> categorie_answer;
    /**
     * champs de reponse pour le nom
     */
    @FXML
    private TextField nom_answer;
    /**
     * champs de reponse pour le numero
     */

    @FXML
    private TextField num_answer;
    /**
     * champs de reponse pour le prenom
     */

    @FXML
    private TextField prenom_answer;
    /**
     * champs de reponse pour le type
     */

    @FXML
    private ComboBox<Permis> type_answer;
    
    /**
     * initialisation des comboBox
     */
    @FXML
    void initialize() {
    	categorie_answer.setItems(FXCollections.observableArrayList("Commercial", "Livreur"));
    	type_answer.setItems(FXCollections.observableArrayList(Permis.values()));
    }

    /**
     * ajout d'un conducteur a la liste de conducteur
     * @param event
     */
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
    /**
     * annulation et retour a la scene precedente
     * @param event
     */
    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);

    }

	

}
