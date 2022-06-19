/**
 * Ce logiciel est distribué à des fins éducatives.
 *
 * Il est fourni "tel quel", sans garantie d’aucune sorte, explicite
 * ou implicite, notamment sans garantie de qualité marchande, d’adéquation
 * à un usage particulier et d’absence de contrefaçon.
 * En aucun cas, les auteurs ou titulaires du droit d’auteur ne seront
 * responsables de tout dommage, réclamation ou autre responsabilité, que ce
 * soit dans le cadre d’un contrat, d’un délit ou autre, en provenance de,
 * consécutif à ou en relation avec le logiciel ou son utilisation, ou avec
 * d’autres éléments du logiciel.
 *
 * (c) 2022 Romain Wallon - Université d'Artois.
 * Tous droits réservés.
 */

package fr.univartois.butinfo.ihm.GestionVentes.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * controller affichant le menu principal
 *
 * @author axel poteau
 *
 * @version 0.1.0
 */
public class GestionVentesController {
 
	/**
	 * appel de la fonction initialise
	 */
	private initialise initialise = new initialise("Carnet", "stock");
	/**
	 * la scene de la fenetre
	 */
    private Scene mainScene;
    
    /**
     * la fenetre de l'appli
     */
    private Stage stage;
    /**
     * mise en place de la fenetre
     * @param stage
     */
    public void setStage(Stage stage) {
    	this.stage = stage;
    }
    /**
     * mise en place de la scene de la fenetre 
     * @param scene
     */
    public void setScene(Scene scene) {
    	this.mainScene = scene;
    }
    
    /**
     * acces au carnet des clients
     * @throws IOException
     */
    @FXML
    protected void acces_carnet_des_clients() throws IOException {
        // En fait, on va simplement afficher un message dans le label de l'application.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/CarnetClient-view.fxml"));
        Parent viewContent = fxmlLoader.load();
        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
        
        CarnetClientController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setMainScene(mainScene);
        controller.setCarnet(initialise.getCarnet());
        
        
    
        
    }
    /**
     * acces au stock des article
     * @throws IOException
     */
    @FXML
    protected void acces_stock_des_articles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/Article-view.fxml"));
        Parent viewContent = fxmlLoader.load();
        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
        
        ArticleController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setMainScene(mainScene);
        controller.setStock(initialise.getStock());
        
    	
    }
    /**
     * acces a la liste des conducteurs
     * @throws IOException
     */
    @FXML
    protected void acces_liste_des_conducteurs() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/Conducteurs-view.fxml"));
        Parent viewContent = fxmlLoader.load();
        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
        
        ConducteursController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setMainScene(mainScene);
        controller.setConducteurs(initialise.getConducteurs());

    }
    /**
     * acces a la liste des vehicule
     * @throws IOException
     */
    @FXML
    protected void acces_liste_des_vehicules() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../view/Vehicules-view.fxml"));
        Parent viewContent = fxmlLoader.load();
        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
        
        VehiculeController controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setMainScene(mainScene);
        controller.setFlotte(initialise.getFlotte());
    }


    /**
     * fermeture du menu
     */
    @FXML
    protected void close_menu() {
    	stage.close();

    }

}
