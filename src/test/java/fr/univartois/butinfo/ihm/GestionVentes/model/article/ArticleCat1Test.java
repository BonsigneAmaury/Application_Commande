package fr.univartois.butinfo.ihm.GestionVentes.model.article;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class ArticleCat1Test {

	@Test
	@DisplayName("Test du constructeur avec parametre")
	void testConstructeurParametre() {
		//GIVEN
		String designation="Grosse sacoche";
		double prix=5.3;
		int quantiteStock=6;
		int capacite=200;
		//WHEN
		ArticleCat1 article =new ArticleCat1(designation,prix,quantiteStock, capacite);
		//Then
		assertThat(article.getDesignation()).isEqualTo(designation);
		assertThat(article.getPrix()).isEqualTo(prix);
		assertThat(article.getQuantiteStock()).isEqualTo(quantiteStock);
		assertThat(article.getCapacite()).isEqualTo(capacite);
	}
	@Test
	@DisplayName("Test de la methode setCapacite")
	void testSetCapacite() {
		//GIVEN
		String designation="Grosse sacoche";
		double prix=5.3;
		int quantiteStock=6;
		int capacite=200;
		//WHEN
		ArticleCat1 article =new ArticleCat1(designation,prix,quantiteStock, capacite);
		article.setCapacite(250);
		//Then
		assertThat(article.getCapacite()).isEqualTo(250);
	}
	@Test
	@DisplayName("Test de la condition que la veleur de setCapacite doit etre superieure a 0")
	void testSetCapaciteInfZero() {
		//GIVEN
		String designation="Grosse sacoche";
		double prix=5.3;
		int quantiteStock=6;
		int capacite=200;
		//WHEN
		ArticleCat1 article =new ArticleCat1(designation,prix,quantiteStock, capacite);
		article.setCapacite(-250);
		//Then
		assertThat(article.getCapacite()).isEqualTo(0);
	}
}
