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
/**
 * controller gerant l'ajout d'un client au carnet
 * @author axelp
 *
 */
public class ajouterClientController {
	/**
	 * la fenetre de l'appli
	 */
	private Stage stage;
	/**
	 * la scene de la fenetre precedente 
	 */
	private Scene mainScene;
	/**
	 * le client a ajouter ou modifier
	 */
	private Client client;
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
		this.mainScene = scene;
	}
	/**
	 * le carnet de clients
	 */
	private CarnetClients carnetClient;
	/**
	 * mise en place du carnet de client
	 * @param carnet
	 */
	public void setCarnet(CarnetClients carnet) {
		this.carnetClient = carnet;
	}
	/**
	 * mise en place du client a ajouter ou modifieir
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * champs de reponse pour l'adresse
	 */
	@FXML
	private TextField adresse_answer;
	/**
	 * champs de reponse pour le contact
	 */
	@FXML
	private TextField contact_answer;
	/**
	 * champs de reponse pour le genre
	 */
	@FXML
	private ComboBox<Genre> genre_answer;
	/**
	 * champs de reponse pour le type
	 */
	@FXML
	private ComboBox<String> type_answer;
	/**
	 * champs de reponse pour l'id
	 */

	@FXML
	private TextField id_answer;
	/**
	 * champs de reponse pour le nom
	 */
	@FXML
	private TextField nom_answer;
	/**
	 * champs de reponse pour les point de fidelite
	 */
	@FXML
	private TextField pointFid_answer;
	/**
	 * champs de reponse pour le prenom
	 */
	@FXML
	private TextField prenom_answer;
	/**
	 * initialisation des comboBox
	 */
	@FXML
	void initialize() {
		genre_answer.setItems(FXCollections.observableArrayList(Genre.values()));
		type_answer.setItems(FXCollections.observableArrayList("Particulier", "Entreprise"));
	}
	/**
	 * ajout du client dans le carnet
	 * @param event
	 */
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
	/**
	 * annulation, on retourne a la scene precedente
	 * @param event
	 */
	@FXML
	void annuler(ActionEvent event) {
		stage.setScene(mainScene);

	}

}
