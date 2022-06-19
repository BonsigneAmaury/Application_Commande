package fr.univartois.butinfo.ihm.GestionVentes.model.article;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArticleTest {

	@Test
	@DisplayName("Test du constructeur avec paramètre")
	void testConstructeurParametre() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		//THEN
		assertThat(article.getCategorie()).isEqualTo(categorie);
		assertThat(article.getDesignation()).isEqualTo(designation);
		assertThat(article.getPrix()).isEqualTo(prix);
		assertThat(article.getQuantiteStock()).isEqualTo(quantiteStock);
	}

	@Test
	@DisplayName("Verification que deux articles ne peuvent pas la meme reference")
	void testConstructeurReference() {
		//GIVEN
		String categorie="Tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		
		String categorie2="Velo";
		String designation2="Velo cool";
		double prix2=5.3;
		int quantiteStock2=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		Article article2 =new Article(categorie2,designation2,prix2,quantiteStock2);
		//THEN
		assertThat(article.getReference()).isNotEqualTo(article2.getReference());
	}
	
	@Test
	@DisplayName("Test du constructeur avec parametre sans categorie")
	void testConstructeurParametreSansCategorie() {
		//GIVEN
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(designation,prix,quantiteStock);
		//THEN
		assertThat(article.getDesignation()).isEqualTo(designation);
		assertThat(article.getPrix()).isEqualTo(prix);
		assertThat(article.getQuantiteStock()).isEqualTo(quantiteStock);
	}
	
	@Test
	@DisplayName("Test de la methode setPrix")
	void testSetPrix() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.setPrix(7.8);
		//THEN
		assertThat(article.getPrix()).isEqualTo(7.8);
	}
	
	@Test
	@DisplayName("Test de la condition que la valeur de setPrix doit etre superieure a 0")
	void testSetPrixInfZero() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.setPrix(-0.5);
		//THEN
		assertThat(article.getPrix()).isEqualTo(0.0);
	}
	
	@Test
	@DisplayName("Test de la methode setQuantiteStock")
	void testSetQuantiteStock() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.setQuantiteStock(8);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(8);
	}
	
	@Test
	@DisplayName("Test de la condition que la valeur de setQuantiteStock doit etre superieure a 0")
	void testSetQuantiteStockInfZero() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.setQuantiteStock(-3);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(0);
	}
	
	@Test
	@DisplayName("Test de la methode estDisponible")

	void testEstDisponible() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		
		//THEN
		assertThat(article.estDisponible()).isEqualTo(true);
	}
	
	@Test
	@DisplayName("Test de la condition de sortie de la methode EstDisponiblz")
	void testPasDisponible() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=0;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		
		//THEN
		assertThat(article.estDisponible()).isEqualTo(false);
	}
	
	@Test
	@DisplayName("Test de la methode ajoutQuantite")
	void testAjoutQuantite() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.ajouterQuantiteStock(4);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(10);
	}
	
	@Test
	@DisplayName("Test de la condition que la valeur de ajoutQuantite doit etre superieure a 0")
	void testAjoutQuantiteInfZero() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.ajouterQuantiteStock(-3);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(6);
	}
	
	@Test
	@DisplayName("Test de la methode enleverQuantite")
	void testEnleverQuantite() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.enleverQuantiteStock(4);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(2);
	}
	
	@Test
	@DisplayName("Test de la condition que la valeur de enleverQuantite doit etre superieure a 0")
	void testEnleverQuantiteInfZero() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.enleverQuantiteStock(-3);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(6);
	}
	
	@Test
	@DisplayName("Test de la condition que la valeur de setPrix doit etre superieure a la quantite de l'article")
	void testEnleverQuantiteSupQuantite() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		article.enleverQuantiteStock(8);
		//THEN
		assertThat(article.getQuantiteStock()).isEqualTo(0);
	}
	@Test
	@DisplayName("Test de la methode equals")
	void testEquals() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		//THEN
		assertThat(article.equals(article)).isEqualTo(true);
	}
	@Test
	@DisplayName("Test de la methode equals dans le cas ou ce n'est pas egales")
	void testNotEquals() {
		//GIVEN
		String categorie="tasse";
		String designation="Grosse tasse";
		double prix=5.3;
		int quantiteStock=6;
		
		String categorie2="Velo";
		String designation2="Velo cool";
		double prix2=5.3;
		int quantiteStock2=6;
		//WHEN
		Article article =new Article(categorie,designation,prix,quantiteStock);
		Article article2 =new Article(categorie2,designation2,prix2,quantiteStock2);
		//THEN
		assertThat(article.equals(article2)).isEqualTo(false);
	}
}
