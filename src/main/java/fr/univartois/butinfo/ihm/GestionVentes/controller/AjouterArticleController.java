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

/**
 * controller gérant l'ajout d'article
 * @author axelp
 *
 */
public class AjouterArticleController {
	/**
	 * La fenetre de l'aplication
	 */
	private Stage stage;
	/**
	 * Scene de la page prescedente
	 */
	private Scene mainScene;
	/**
	 * article a modifier ou creer
	 */
	private Article article;
	/**
	 * stock d'article dans lequel on ajoute ou modifie un article
	 */
	private Stock stock;
	
	/**
	 * mise en place du stock
	 * @param stock
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	/**
	 * mise en place de la fenetre
	 * @param stage
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	/**
	 * mise en place de l'article a modifier
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
	/**
	 * mise en place de la scene
	 * @param scene
	 */
	public void setMainScene(Scene scene) {
		this.mainScene = scene;
	}
	
	/**
	 * champ de reponse pour la capacite
	 */
    @FXML
    private TextField capacite_answer;
    /**
     * champs de reponse pour la categorie
     */
    @FXML
    private ComboBox<String> categorie_answer;
    /**
     * champs de reponse pour la designation
     */
    @FXML
    private TextField designation_answer;

    @FXML
    private TextField poids_answer;
    /**
     * champs de reponse pour le prix
     */
    @FXML
    private TextField prix_answer;
    /**
     * champs de reponse pour la quantité
     */
    @FXML
    private TextField quantite_answer;
    /**
     * initialisation des comboBox
     */
    @FXML
	void initialize() {

		categorie_answer.setItems(FXCollections.observableArrayList("Velo", "Sacoche pour velo"));
	}
    /**
     * ajouts d'un article dans le stock
     * @param event
     */
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
    /**
     * annulation de l'ajout
     */
    @FXML
    void annuler(ActionEvent event) {
    	stage.setScene(mainScene);
    }

}