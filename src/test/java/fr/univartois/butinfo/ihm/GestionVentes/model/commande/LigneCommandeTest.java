package fr.univartois.butinfo.ihm.GestionVentes.model.commande;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat1;
import fr.univartois.butinfo.ihm.GestionVentes.model.article.ArticleCat2;



@ExtendWith(MockitoExtension.class)
class LigneCommandeTest {
	@Mock
	Article article;
	@Mock
	ArticleCat1 articleNonLivrable;
	@Mock
	ArticleCat2 articleLivrable;
	@Test
	void testConstructeur() {
		//GIVEN
		int quantite=8;
		//WHEN
		Article article = new Article("article",5.0,8);
		LigneCommande ligneCommande= new LigneCommande(article,quantite);
		//THEN
		assertThat(ligneCommande.getQuantite()).isEqualTo(quantite);
		assertThat(ligneCommande.getArticle()).isEqualTo(article);
		assertThat(ligneCommande.toString()).hasToString("Réf. Art.: 0 (article) | Qté.: 8 | Prix U.: 5.0 | Montant: 40.0 | Montant avec livr.: 40.0");
	}
	@Test
	void testGetMontant() {
		//GIVEN
		int quantite=1;
		//WHEN
		Article article = new Article("test",5.0,1);
		LigneCommande ligneCommande= new LigneCommande(article,quantite);
		//THEN
		assertThat(ligneCommande.getMontant()).isEqualTo(5.0);
	}
}
