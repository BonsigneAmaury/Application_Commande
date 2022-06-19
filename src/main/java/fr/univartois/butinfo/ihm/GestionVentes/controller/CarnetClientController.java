package fr.univartois.butinfo.ihm.GestionVentes.controller;
/**
 * controller du carnet de client
 */
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
	/**
	 * la fenetre de l'apli 
	 */
	private Stage stage;
	/**
	 * scene de la fenetre 
	 */
	private Scene mainScene;
	/**
	 * carnet contenant les client
	 */
	private CarnetClients carnetClient;
	/**
	 *mise en place du carnet de client ainsi que de l'affichage de ce ci
	 * @param carnet
	 */
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
	/**
	 * le Genre
	 */
	@FXML
	private Label Genre;
	/**
	 * liste des clients
	 */
	@FXML
	private ListView<Client> ListView;
	/**
	 * affichage des point de fidelite
	 */
	@FXML
	private Label PointFid_answer;
	@FXML
	private Label adresse;
	/**
	 * affichage de l'adresse
	 */
	@FXML
	private Label adresse_answer;

	@FXML
	private Label contact;
	/**
	 * affichage des contact
	 */
	@FXML
	private Label contact_answer;
	/**
	 * affichage du genre
	 */
	@FXML
	private Label genre_answer;

	@FXML
	private Label id;
	/**
	 * affichage de l'id
	 */
	@FXML
	private Label id_answer;

	@FXML
	private Label nom;
	/**
	 * affichage du nom
	 */
	@FXML
	private Label nom_answer;

	@FXML
	private Label pointFid;

	@FXML
	private Label prenom;
	/**
	 * affichage du prenom
	 */
	@FXML
	private Label prenom_answer;
	/**
	 * mise en place de la fenetre de l'appli
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
		this.mainScene = scene;
	}
	/**
	 * modification du client
	 * @param event
	 * @throws IOException
	 */
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
	/**
	 * ajout du client
	 * @param event
	 * @throws IOException
	 */
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
	/**
	 * suppression du client
	 * @param event
	 */
	@FXML
	void Supprimer(ActionEvent event) {
		int id = ListView.getSelectionModel().getSelectedIndex();
		Client deleted = ListView.getSelectionModel().getSelectedItem();
		if (deleted == null) 
			return;
		carnetClient.supprimerClient(deleted);
		ListView.getItems().remove(id);
	}
	/**
	 * retour a la scene precedente
	 * @param event
	 */
	@FXML
	void retour(ActionEvent event) {
		stage.setScene(mainScene);
	}

}
