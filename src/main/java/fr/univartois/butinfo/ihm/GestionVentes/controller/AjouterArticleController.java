package fr.univartois.butinfo.ihm.GestionVentes.controller;



import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.Stock;
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

public class AjouterArticleController {
	private Stage stage;
	private Scene mainScene;
	private Article article;
	private Stock stock;
	
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public void setArticle(Article article) {
		this.article = article;
	}

	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}

    @FXML
    private TextField capacite_answer;

    @FXML
    private ComboBox<String> categorie_answer;

    @FXML
    private TextField designation_answer;

    @FXML
    private TextField poids_answer;

    @FXML
    private TextField prix_answer;

    @FXML
    private TextField quantite_answer;
    @FXML
	void initialize() {

		categorie_answer.setItems(FXCollections.observableArrayList("Velo", "Sacoche pour velo"));
	}

    @FXML
    void ajouter(ActionEvent event) {
		String designation = designation_answer.getText();
		double prix = Double.parseDouble(prix_answer.getText());
		int quantite = Integer.parseInt(quantite_answer.getText());
		int capacite = Integer.parseInt(capacite_answer.getText());
		double poids  = Double.parseDouble(poids_answer.getText());
		if (article != null) {
			article.setDesignation(designation);
			article.setPrix(prix);
			article.setQuantiteStock(quantite);
			if (categorie_answer.getValue().equals("Velo")) {
				((ArticleCat2) article).setPoids(poids);
			}
			else
				((ArticleCat1) article).setCapacite(capacite);
		} else {
			if (categorie_answer.getValue().equals("Sacoche pour velo"))
				article = new ArticleCat1(designation,prix,quantite,capacite);
			else
				article = new ArticleCat2(designation,prix,quantite,poids);
			stock.ajouterArticle(article);
		}
		stage.setScene(mainScene);

    }

    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);
    }

}