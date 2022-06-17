package fr.univartois.butinfo.ihm.GestionVentes.model.article;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class StockTest {
	@Mock
	Article article1;
	@Mock
	Article article2;
	@Mock
	Article article3;	
	@Mock
	Article article4;
	@Mock
	Article article5;
	@Mock
	Article article6;
	@Mock
	Article article7;
	@Mock
	Article article8;
	@Mock
	Article article9;
	@Mock
	Article article10;
	@Mock
	Article article11;
	
	
	@Test
	void testConstructeur() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		//Then
		assertThat(stock.getNom()).isEqualTo(nom);
		assertThat(stock.getNbArticles()).isEqualTo(0);
	}
	
	@Test
	void testEstPleinFaux() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		//Then
		assertThat(stock.estPlein()).isEqualTo(false);
	}
	
	@Test
	void testSetNom() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.setNom("test");
		//Then
		assertThat(stock.getNom()).isEqualTo("test");
	}
	
	@Test
	void testEstPleinVrai() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		stock.ajouterArticle(article4);
		stock.ajouterArticle(article5);
		stock.ajouterArticle(article6);
		stock.ajouterArticle(article7);
		stock.ajouterArticle(article8);
		stock.ajouterArticle(article9);
		stock.ajouterArticle(article10);
		//Then
		assertThat(stock.estPlein()).isEqualTo(true);
	}
	
	@Test
	void testEstVideVrai() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		//Then
		assertThat(stock.estVide()).isEqualTo(true);
	}
	
	@Test
	void testEstVideFaux() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		//Then
		assertThat(stock.estVide()).isEqualTo(false);
	}
	
	@Test
	void testAjouter() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		//Then
		assertThat(stock.rechercherArticleParReference(article1.getReference())).isEqualTo(article1);
	}
	
	@Test
	void testAjouterErreurPlein() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		stock.ajouterArticle(article4);
		stock.ajouterArticle(article5);
		stock.ajouterArticle(article6);
		stock.ajouterArticle(article7);
		stock.ajouterArticle(article8);
		stock.ajouterArticle(article9);
		stock.ajouterArticle(article10);
		stock.ajouterArticle(article11);
		//Then
		assertThat(stock.getNbArticles()).isNotEqualTo(11);
	}
	
	@Test
	void testAjouterErreurDejaPresent() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		stock.ajouterArticle(article1);
		//Then
		assertThat(stock.getNbArticles()).isNotEqualTo(2);
	}
	
	@Test
	void testSupprimer() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article1);
		stock.supprimerArticle(article1);
		//Then
		assertThat(stock.rechercherArticleParReference(article1.getReference())).isEqualTo(null);
	}
	
	@Test
	void testSupprimerErreurPasPresent() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		stock.supprimerArticle(article1);
		//Then
		assertThat(stock.getNbArticles()).isNotEqualTo(1);
	}
	
	@Test
	void testRechercherParReferenceErreur() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		//Then
		assertThat(stock.rechercherArticleParReference(999999)).isEqualTo(null);
	}
	
	@Test
	void testRechercherParReference() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		//Then
		assertThat(stock.rechercherArticleParReference(article2.getReference())).isEqualTo(article2);
	}
	
	@Test
	void testArticleDansStock() {
		//GIVEN
		String nom="stock";
		//WHEN
		Stock stock = new Stock(nom);
		stock.ajouterArticle(article2);
		stock.ajouterArticle(article3);
		//Then
		assertThat(stock.articlesDansStock()).isNotEmpty();
		assertThat(stock.articlesDansStock()).isNotNull();
		assertThat((stock.articlesDansStock()).length).isEqualTo(2);
	}
	
	@Test
	void testRechercheParCategorie() {
		//GIVEN
		String nom="stock";
		String designation="Gros vélo";
		double prix=5.3;
		int quantiteStock=6;
		double poids=200;
		int capacite=200;
		//WHEN
		Stock stock = new Stock(nom);
		ArticleCat2 articleC21 =new ArticleCat2(designation,prix,quantiteStock, poids);
		ArticleCat2 articleC22 =new ArticleCat2(designation,prix,quantiteStock, poids);
		ArticleCat2 articleC23 =new ArticleCat2(designation,prix,quantiteStock, poids);
		ArticleCat1 articleC11 =new ArticleCat1(designation,prix,quantiteStock, capacite);
		stock.ajouterArticle(articleC11);
		stock.ajouterArticle(articleC21);
		stock.ajouterArticle(articleC22);
		stock.ajouterArticle(articleC23);
		//THEN
		assertThat(stock.rechercherArticlesCategorie("Vélos")).isNotEmpty();
		assertThat(stock.rechercherArticlesCategorie("Vélos")).isNotNull();
		assertThat((stock.rechercherArticlesCategorie("Vélos")).length).isEqualTo(3);
	}
}
