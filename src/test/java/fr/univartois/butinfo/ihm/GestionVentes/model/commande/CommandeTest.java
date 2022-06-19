package fr.univartois.butinfo.ihm.GestionVentes.model.commande;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.univartois.butinfo.ihm.GestionVentes.model.article.Article;
import fr.univartois.butinfo.ihm.GestionVentes.model.client.Client;


@ExtendWith(MockitoExtension.class)
class CommandeTest {
	@Mock
	Client client1;
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
	@Mock
	Commande commande1;
	
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeur() {
		//GIVEN
		//WHEN
		Commande commande =new Commande(client1);
		//THEN
		assertThat(commande.estCloturee()).isEqualTo(false);
		assertThat(commande.getReference()).isEqualTo(4);
		assertThat(commande.getNbLignesCommande()).isEqualTo(0);
	}
	
	@Test
	@DisplayName("Test de la methodes estVide qui renvoie true")
	void testEstVideVraie() {
		//GIVEN
		//WHEN
		Commande commande =new Commande(client1);
		//THEN
		assertThat(commande.estVide()).isEqualTo(true);
	}
	
	@Test
	void testEstVideFaux() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(1);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(1);
		assertThat(commande.estVide()).isEqualTo(false);
	}
	
	@Test
	void testEstPleinFaux() {
		//GIVEN
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		//THEN
		assertThat(commande.estPleine()).isEqualTo(false);
	}
	
	@Test
	void testEstPleinVraie() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		when(article2.getQuantiteStock()).thenReturn(2);
		when(article3.getQuantiteStock()).thenReturn(2);
		when(article4.getQuantiteStock()).thenReturn(2);
		when(article5.getQuantiteStock()).thenReturn(2);
		when(article6.getQuantiteStock()).thenReturn(2);
		when(article7.getQuantiteStock()).thenReturn(2);
		when(article8.getQuantiteStock()).thenReturn(2);
		when(article9.getQuantiteStock()).thenReturn(2);
		when(article10.getQuantiteStock()).thenReturn(2);
		when(article2.getReference()).thenReturn(2);
		when(article3.getReference()).thenReturn(3);
		when(article4.getReference()).thenReturn(4);
		when(article5.getReference()).thenReturn(5);
		when(article6.getReference()).thenReturn(6);
		when(article7.getReference()).thenReturn(7);
		when(article8.getReference()).thenReturn(8);
		when(article9.getReference()).thenReturn(9);
		when(article10.getReference()).thenReturn(10);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		commande.commander(article2, 1);
		commande.commander(article3, 1);
		commande.commander(article4, 1);
		commande.commander(article5, 1);
		commande.commander(article6, 1);
		commande.commander(article7, 1);
		commande.commander(article8, 1);
		commande.commander(article9, 1);
		commande.commander(article10, 1);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(10);
		assertThat(commande.estPleine()).isEqualTo(true);
	}
	
	@Test
	void testAjouterDeuxFoisMemeArticle() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 2);
		commande.commander(article1, 2);
		//THEN
		assertThat(commande.getQuantite(0)).isEqualTo(4);
	}
	
	@Test
	void testCommanderErreurQuantité() {
		//GIVEN
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 0);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(0);
	}
	
	@Test
	void testCommanderErreurCloture() {
		//GIVEN
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 0);
		commande.cloturer(false);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(0);
	}
	
	@Test
	void testCommanderErreurQuantiteArt() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(1);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 2);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(0);
	}
	
	@Test
	void testCommanderErreurEstPlein() {
		//GIVEN
		when(commande1.estPleine()).thenReturn(true);
		//WHEN
		commande1.commander(article1, 1);
		//THEN
		assertThat(commande1.getNbLignesCommande()).isNotEqualTo(10);
	}
	
	@Test
	void testSupprErreurCloture() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		commande.cloturer(false);
		commande.supprimerLigneCommande(article1.getReference());
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(1);
	}
	
	@Test
	void testSuppr() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		commande.supprimerLigneCommande(article1.getReference());
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(0);
	}
	
	@Test
	void testSupprErreurLigneNull() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		commande.supprimerLigneCommande(2);
		//THEN
		assertThat(commande.getNbLignesCommande()).isEqualTo(1);
	}
	
	@Test
	void testQuantiteErreur() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		//THEN
		assertThat(commande.getQuantite(-3)).isEqualTo(0);
		assertThat(commande.getQuantite(12)).isEqualTo(0);
	}
	
	@Test
	void testArticle() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		//THEN
		assertThat(commande.getArticle(0)).isEqualTo(article1);
	}
	
	@Test
	void testArticleErreur() {
		//GIVEN
		when(article1.getQuantiteStock()).thenReturn(2);
		//WHEN
		Commande commande =new Commande(client1);
		commande.commander(article1, 1);
		//THEN
		assertThat(commande.getArticle(-3)).isNull();
		assertThat(commande.getArticle(12)).isNull();
	}
}
