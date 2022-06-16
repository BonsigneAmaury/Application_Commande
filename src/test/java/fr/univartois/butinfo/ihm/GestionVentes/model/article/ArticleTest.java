package fr.univartois.butinfo.ihm.GestionVentes.model.article;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ArticleTest {

	@Test
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
	// a tester celui sans paramtre 
	
	@Test
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
