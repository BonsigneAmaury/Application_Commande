package fr.univartois.butinfo.ihm.GestionVentes.controller;
import java.io.IOException;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
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
 * controller de la vue de gestion des article
 * @author axelp
 *
 */
public class ArticleController {
	/**
	 * stock des article
	 */
	private Stock stock;
	/**
	 * mise en place du stock et de l'affichage des article
	 * @param stock
	 */
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
	/**
	 * affichage des article
	 */
    @FXML
    private ListView<Article> ListView;
    /**
     * affichage de la quantite
     */
    @FXML
    private Label affiche_Quantite;
    /**
     * affichage de la capacite
     */
    @FXML
    private Label affiche_capacite;
    /**
     * affichage de la categorie
     */
    @FXML
    private Label affiche_categorie;
    /**
     * affichage de la designation
     */
    @FXML
    private Label affiche_designation;
    /**
     * affichage du poids
     */
    @FXML
    private Label affiche_poids;
    /**
     * affichage du prix
     */

    @FXML
    private Label affiche_prix;
    /**
     * affichage de la reference
     */
    @FXML
    private Label affiche_reference;

    /**
     * fenetre de l'appli
     */
	Stage stage;
	/**
	 * scene de la fenetre 
	 */
	Scene mainScene;
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
	 * ajout d'un article
	 * @param event
	 * @throws IOException
	 */
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
    /**
     * modification du article sur lequel on clique
     * @param event
     * @throws IOException
     */
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
    /**
     * retour a la scene precedente
     * @param event
     */
    @FXML
    void retour(ActionEvent event) {
    	stage.setScene(mainScene);
    }
    /**
     * supression du article selectionner
     * @param event
     */
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
