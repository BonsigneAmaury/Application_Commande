package fr.univartois.butinfo.ihm.GestionVentes.controller;

import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.ClientEntreprise;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.ClientParticulier;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class CarnetClientController {

	private Stage stage;

	private Scene mainScene;

	private Scene sceneCarnet;

	private CarnetClients carnetClient;

	public void setCarnet(CarnetClients carnet) {
		this.carnetClient = carnet;
		ListView.setItems(carnetClient.getClient());
		ListView.setCellFactory(list -> {
			return new ListCell<>() {
			@Override
			public void updateItem(Client client, boolean empty) {
				super.updateItem(client, empty);
				if (empty || (client == null)) {
					setText(null);
					}
				else {
					setText(client.getNom());
					}
				}
			};
		});
		ListView.getSelectionModel().selectedItemProperty().addListener((o, p, n) -> {
			if (n != null) {
				nom_answer.setText(n.getNom());
				id_answer.setText(Integer.toString(n.getReference()));
				adresse_answer.setText(n.getAdresse());
				PointFid_answer.setText(Integer.toString(n.getPointsFidelite()));

				if (n instanceof ClientEntreprise) {
					contact_answer.setText(((ClientEntreprise) n).getContact());
				}
				if (n instanceof ClientParticulier) {
					prenom_answer.setText(((ClientParticulier) n).getPrenom());
					genre_answer.setText(((ClientParticulier) n).getGenre().toString());
				}
			}
		});
		

	}

	@FXML
	private Label Genre;

	@FXML
	private ListView<Client> ListView;

	@FXML
	private Label PointFid_answer;

	@FXML
	private Label adresse;

	@FXML
	private Label adresse_answer;

	@FXML
	private Label contact;

	@FXML
	private Label contact_answer;

	@FXML
	private Label genre_answer;

	@FXML
	private Label id;

	@FXML
	private Label id_answer;

	@FXML
	private Label nom;

	@FXML
	private Label nom_answer;

	@FXML
	private Label pointFid;

	@FXML
	private Label prenom;

	@FXML
	private Label prenom_answer;

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}

	@FXML
	void Modifier(ActionEvent event) throws IOException {
		Client modified = ListView.getSelectionModel().getSelectedItem();
		if (modified != null) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterClient-view.fxml"));
			Parent viewContent = fxmlLoader.load();
			Scene scene = new Scene(viewContent);
			Scene currentScene = stage.getScene();
			stage.setScene(scene);

			ajouterClientController controller = fxmlLoader.getController();
			controller.setStage(stage);
			controller.setMainScene(currentScene);
			controller.setCarnet(carnetClient);
			controller.setClient(modified);
		}
		setCarnet(carnetClient);


	}

	@FXML
	void NouveauClient(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterClient-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		ajouterClientController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setCarnet(carnetClient);
		controller.setClient(null);

	}

	@FXML
	void Supprimer(ActionEvent event) {
		int id = ListView.getSelectionModel().getSelectedIndex();
		Client deleted = ListView.getSelectionModel().getSelectedItem();
		if (deleted == null) 
			return;
		carnetClient.supprimerClient(deleted);
		ListView.getItems().remove(id);
	}

	@FXML
	void retour(ActionEvent event) {
		stage.setScene(mainScene);
	}

}
