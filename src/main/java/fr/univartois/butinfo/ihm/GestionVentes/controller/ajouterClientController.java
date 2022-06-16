package fr.univartois.butinfo.ihm.GestionVentes.controller;

import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.ClientEntreprise;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.ClientParticulier;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Genre;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ajouterClientController {
	private Stage stage;

	private Scene mainScene;

	private Client client;

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}

	private CarnetClients carnetClient;

	public void setCarnet(CarnetClients carnet) {
		this.carnetClient = carnet;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@FXML
	private TextField adresse_answer;

	@FXML
	private TextField contact_answer;

	@FXML
	private ComboBox<Genre> genre_answer;

	@FXML
	private ComboBox<String> type_answer;

	@FXML
	private TextField id_answer;

	@FXML
	private TextField nom_answer;

	@FXML
	private TextField pointFid_answer;

	@FXML
	private TextField prenom_answer;

	@FXML
	void initialize() {
		genre_answer.setItems(FXCollections.observableArrayList(Genre.values()));
		type_answer.setItems(FXCollections.observableArrayList("Particulier", "Entreprise"));
	}

	@FXML
	void ajouter(ActionEvent event) {

		String adresse = adresse_answer.getText();
		String contact = contact_answer.getText();
		Genre genre = genre_answer.getValue();
		String nom = nom_answer.getText();
		String prenom = prenom_answer.getText();
		int pointFid = Integer.parseInt(pointFid_answer.getText());
		if (client != null) {
			client.setNom(nom);
			client.setAdresse(adresse);
			client.setPointsFidelite(pointFid);
			if (type_answer.getValue().equals("Particulier")) {
				((ClientParticulier) client).setPrenom(prenom);
				((ClientParticulier) client).setGenre(genre);
			}
			else
				((ClientEntreprise) client).setContact(contact);
		} else {
			if (type_answer.getValue().equals("Particulier"))
				client = new ClientParticulier(nom, adresse, pointFid, prenom, genre);
			else
				client = new ClientEntreprise(nom, adresse, pointFid, contact);
			carnetClient.ajouterClient(client);
		}
		stage.setScene(mainScene);
	}

	@FXML
	void annuler(ActionEvent event) {
		stage.setScene(mainScene);

	}

}
