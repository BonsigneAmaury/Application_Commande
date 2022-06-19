package fr.univartois.butinfo.ihm.GestionVentes.model.article;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArticleCat2Test {
	
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeurParametre() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		//Then
		assertThat(article.getDesignation()).isEqualTo(designation);
		assertThat(article.getPrix()).isEqualTo(prix);
		assertThat(article.getQuantiteStock()).isEqualTo(quantiteStock);
		assertThat(article.getPoids()).isEqualTo(poids);
	}
	@Test
	@DisplayName("Test de la methode setPoids")
	void testSetPoids() {
		//GIVEN
		String designation="Gros velo";
		double prix=5.3;
		int quantiteStock=6;
		int poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		article.setPoids(250);
		//Then
		assertThat(article.getPoids()).isEqualTo(250);
	}
	@Test
	@DisplayName("Test de la condition que la valeur de setPoids doit etre superieure a 0")
	void testSetPoidsInfZero() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		int poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		article.setPoids(-250);
		//Then
		assertThat(article.getPoids()).isEqualTo(15.0);
	}
	@Test
	@DisplayName("Test de la methode getLargeurColis")
	void testLargeurColis() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		//Then
		assertThat(article.getLargeurColis()).isEqualTo(170);
	}
	@Test
	@DisplayName("Test de la methode getProfondeurColis")
	void testProfondeurColis() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		//Then
		assertThat(article.getProfondeurColis()).isEqualTo(40);
	}
	@Test
	@DisplayName("Test de la methode getKGColis")
	void testKGColis() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		//Then
		assertThat(article.getPoidsKgColis()).isEqualTo(201);
	}
	@Test
	@DisplayName("Test de la methode getHauteurColis")
	void testHauteurColis() {
		//GIVEN
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		//WHEN
		ArticleCat2 article =new ArticleCat2(designation,prix,quantiteStock, poids);
		//Then
		assertThat(article.getHauteurColis()).isEqualTo(90);
	}
}
