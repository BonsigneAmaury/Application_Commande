package fr.univartois.butinfo.ihm.GestionVentes.controller;

import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.conducteur.Conducteur;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.FlotteVehicule;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Fourgon;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Vehicule;
import fr.univartois.butinfo.ihm.GestionVentes.model.vehicule.Voiture;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class VehiculeController {
	private Stage stage;
	private Scene mainScene;
	private FlotteVehicule flotte;
	
	public void setFlotte(FlotteVehicule flotte) {
		this.flotte = flotte;
		listview.setItems(flotte.getFlotte());
		listview.setCellFactory(list -> {
			return new ListCell<>() {
			@Override
			public void updateItem(Vehicule vehicule, boolean empty) {
				super.updateItem(vehicule, empty);
				if (empty || (vehicule == null)) {
					setText(null);
					}
				else {
					setText(vehicule.getImmatriculation());
					}
				}
			};
		});
		listview.getSelectionModel().selectedItemProperty().addListener((o, p, n) -> {
			if (n != null) {
				affiche_annee_circulation.setText(Integer.toString(n.getAnneeCircu()));
				affiche_immatriculation.setText(n.getImmatriculation());
				affiche_kilometrage.setText(Double.toString(n.getKilometrage()));
				affiche_marque.setText(n.getMarque());
				affiche_modele.setText(n.getModele());
				

				if (n instanceof Fourgon) {
					affiche_type_vehicule.setText("Fourgon");
				}
				if (n instanceof Voiture) {
					affiche_type_vehicule.setText("Voiture");
				}
			}
		});
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}

    @FXML
    private Label affiche_annee_circulation;

    @FXML
    private Label affiche_immatriculation;

    @FXML
    private Label affiche_kilometrage;

    @FXML
    private Label affiche_marque;

    @FXML
    private Label affiche_modele;

    @FXML
    private Label affiche_type_vehicule;

    @FXML
    private ListView<Vehicule> listview;

    @FXML
    void ajouter(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterVehicule-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		AjouterVehiculeController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setFlotte(flotte);
		controller.setVehicule(null);


    }

    @FXML
    void modifier(ActionEvent event) throws IOException {
    	Vehicule modified = listview.getSelectionModel().getSelectedItem();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterVehicule-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		AjouterVehiculeController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setFlotte(flotte);
		controller.setVehicule(modified);

    }

    @FXML
    void retour(ActionEvent event) {
    	stage.setScene(mainScene);

    }

    @FXML
    void supprimer(ActionEvent event) {
		int id = listview.getSelectionModel().getSelectedIndex();
		Vehicule deleted = listview.getSelectionModel().getSelectedItem();
		if (deleted == null) 
			return;
		flotte.delVehicule(deleted);
		listview.getItems().remove(id);

    }

}