package fr.univartois.butinfo.ihm.GestionVentes.controller;
import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Commercial;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteur;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteurs;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Livreur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
/**
 * controller gerant l'affichage des conducteur
 * @author axelp
 *
 */
public class ConducteursController {
	/**
	 * fenetre de l'application
	 */
	private Stage stage;
	/**
	 * scene de la fenetre 
	 */
	private Scene mainScene;
	/**
	 * carnet stockant les conducteurs
	 */
	private Conducteurs carnet_conducteurs;
	/**
	 * mise en place des conducteur et de leur affichage
	 * @param conducteurs
	 */
	public void setConducteurs(Conducteurs conducteurs) {
		this.carnet_conducteurs = conducteurs;
		Listview.setItems(carnet_conducteurs.getConducteurs());
		Listview.setCellFactory(list -> {
			return new ListCell<>() {
			@Override
			public void updateItem(Conducteur conducteur, boolean empty) {
				super.updateItem(conducteur, empty);
				if (empty || (conducteur == null)) {
					setText(null);
					}
				else {
					setText(conducteur.getNom());
					}
				}
			};
		});
		Listview.getSelectionModel().selectedItemProperty().addListener((o, p, n) -> {
			if (n != null) {
				affiche_nom.setText(n.getNom());
				affiche_prenom.setText(n.getPrenom());
				affiche_numero_permis.setText(n.getNumeroPermis());
				affiche_type_permis.setText(n.getTypePermis().toString());
				

				if (n instanceof Commercial) {
					affiche_type_conducteur.setText("Commercial");
				}
				if (n instanceof Livreur) {
					affiche_type_conducteur.setText("Livreur");
				}
			}
		});
	}
	/**
	 * mise en place de la fenetre de l'appli
	 * @param stage
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	/**
	 * mise en place de la scene de la fenetre
	 * @param scene
	 */
	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}
	/**
	 * liste stockant les conduteurs
	 */
    @FXML
    private ListView<Conducteur> Listview;
    /**
     * affichage du nom
     */
    @FXML
    private Label affiche_nom;
    /**
     * affichage du numero de permis
     */
    @FXML
    private Label affiche_numero_permis;
    /**
     * affichage du prenom
     */
    @FXML
    private Label affiche_prenom;
    /**
     * affichage du type de conducteur
     */
    @FXML
    private Label affiche_type_conducteur;
    /**
     * affichage du type de permis
     */
    @FXML
    private Label affiche_type_permis;
    /**
     * modification du conducteur
     * @param event
     * @throws IOException
     */
    @FXML
    void modifier(ActionEvent event) throws IOException {
		Conducteur modified = Listview.getSelectionModel().getSelectedItem();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterConducteur-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		AjouterConducteurController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setConducteurs(carnet_conducteurs);
		controller.setConducteur(modified);


    }
    /**
     * ajout du conducteur
     * @param event
     * @throws IOException
     */
    @FXML
    void ajouter(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterConducteur-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		AjouterConducteurController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setConducteurs(carnet_conducteurs);
		controller.setConducteur(null);

    }
    /**
     * retour a la scene precedente
     * @param event
     */
    @FXML
    void retour(ActionEvent event) {
    	stage.setScene(mainScene);
    }
    /**
     * supression du conducteur
     * @param event
     */
    @FXML
    void supprimer(ActionEvent event) {
		int id = Listview.getSelectionModel().getSelectedIndex();
		Conducteur deleted = Listview.getSelectionModel().getSelectedItem();
		if (deleted == null) 
			return;
		carnet_conducteurs.delConducteurs(deleted);
		Listview.getItems().remove(id);


    }

}
