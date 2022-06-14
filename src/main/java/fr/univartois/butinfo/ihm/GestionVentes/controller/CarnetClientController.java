package fr.univartois.butinfo.ihm.GestionVentes.controller;


import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.client.CarnetClients;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    void Modifier(ActionEvent event) {

    }



    @FXML
    void NouveauClient(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/ajouterClient-view.fxml"));
        Parent viewContent = fxmlLoader.load();
        Scene scene = new Scene(viewContent);
        Scene currentScene = stage.getScene();
        stage.setScene(scene);
        
        ajouterClientController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setMainScene(currentScene);
        controller.setCarnet(carnetClient);
        
    	
    	

    }

    @FXML
    void Supprimer(ActionEvent event) {

    }
    @FXML
    void retour(ActionEvent event){
    	stage.setScene(mainScene);
    }

}
