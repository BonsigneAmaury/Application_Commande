package fr.univartois.butinfo.ihm.GestionVentes.controller;
import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class ArticleController {
	private Stock stock;
	
	public void setStock(Stock stock) {
		this.stock = stock;
		
		ListView.setItems(stock.getArticles());
		ListView.setCellFactory(list -> {
			return new ListCell<>() {
			@Override
			public void updateItem(Article article, boolean empty) {
				super.updateItem(article, empty);
				if (empty || (article == null)) {
					setText(null);
					}
				else {
					setText(article.getDesignation());
					}
				}
			};
		});
		ListView.getSelectionModel().selectedItemProperty().addListener((o, p, n) -> {
			if (n != null) {
				affiche_designation.setText(n.getDesignation());
				affiche_categorie.setText(n.getCategorie());
				affiche_prix.setText(Double.toString(n.getPrix()));
				affiche_Quantite.setText(Integer.toString(n.getQuantiteStock()));
				affiche_reference.setText(Integer.toString(n.getReference()));

				if (n instanceof ArticleCat1) {
					affiche_capacite.setText(Integer.toString(((ArticleCat1) n).getCapacite()));
				}
				if (n instanceof ArticleCat2) {
					affiche_poids.setText(Double.toString(((ArticleCat2) n).getPoids()));
				}
			}
		});
	}

    @FXML
    private ListView<Article> ListView;

    @FXML
    private Label affiche_Quantite;

    @FXML
    private Label affiche_capacite;

    @FXML
    private Label affiche_categorie;

    @FXML
    private Label affiche_designation;

    @FXML
    private Label affiche_poids;

    @FXML
    private Label affiche_prix;

    @FXML
    private Label affiche_reference;

    @FXML
    private Label categorie;

    @FXML
    private Label designation;

    @FXML
    private Label poids;

    @FXML
    private Label poids1;

    @FXML
    private Label poids11;

    @FXML
    private Label prix;

    @FXML
    private Label reference;


	Stage stage;
	Scene mainScene;
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}

  

    @FXML
    void ajouter(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterArticle-view.fxml"));
		Parent viewContent = fxmlLoader.load();
		Scene scene = new Scene(viewContent);
		Scene currentScene = stage.getScene();
		stage.setScene(scene);

		AjouterArticleController controller = fxmlLoader.getController();
		controller.setStage(stage);
		controller.setMainScene(currentScene);
		controller.setStock(stock);
		controller.setArticle(null);

    }

    @FXML
    void modifier(ActionEvent event) throws IOException {
		Article modified = ListView.getSelectionModel().getSelectedItem();
		if (modified != null) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/AjouterArticle-view.fxml"));
			Parent viewContent = fxmlLoader.load();
			Scene scene = new Scene(viewContent);
			Scene currentScene = stage.getScene();
			stage.setScene(scene);

			AjouterArticleController controller = fxmlLoader.getController();
			controller.setStage(stage);
			controller.setMainScene(currentScene);
			controller.setArticle(modified);
			controller.setStock(stock);
		}
		setStock(stock);

    }

    @FXML
    void retour(ActionEvent event) {
    	stage.setScene(mainScene);
    }

    @FXML
    void supprimer(ActionEvent event) {
		int id = ListView.getSelectionModel().getSelectedIndex();
		Article deleted = ListView.getSelectionModel().getSelectedItem();
		if (deleted == null) 
			return;
		stock.supprimerArticle(deleted);
		ListView.getItems().remove(id);

    }

}
