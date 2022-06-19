package fr.univartois.butinfo.ihm.GestionVentes.model.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClientParticulierTest {

	@Test
	@DisplayName("Test du contrusteur avec parametre")
	void testConstructeurParametre() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.getNom()).isEqualTo(nom);
		assertThat(client.getAdresse()).isEqualTo(adresse);
		assertThat(client.getPointsFidelite()).isEqualTo(pointsDeFidelites);
		assertThat(client.getPrenom()).isEqualTo(prenom);
		assertThat(client.getGenre()).isEqualTo(genre);
	}
	@Test
	@DisplayName("Test que deux clients ne peuvent avoir la meme ref")
	void testConstructeurRef() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		
		String nom2="Jean";
		String adresse2="l'avenue";
		int pointsDeFidelites2=48;
		String prenom2="Deux";
		Genre genre2=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		ClientParticulier client2 = new ClientParticulier(nom2,adresse2,pointsDeFidelites2,prenom2,genre2);
		//THEN
		assertThat(client.getReference()).isNotEqualTo(client2.getReference());
	}
	@Test
	@DisplayName("Test de la methode setRistourne qui renvoie 15")
	void testGetRistourne15() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=1100;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(15);
	}
	@Test
	@DisplayName("Test de la methode setRistourne qui renvoie 10")
	void testGetRistourne10() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=600;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(10);
	}
	@Test
	@DisplayName("Test de la methode setRistourne qui renvoie 5")
	void testGetRistourne5() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=200;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(5);
	}
	@Test
	@DisplayName("Test de la methode setRistourne qui renvoie 0")
	void testGetRistourne0() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(0);
	}
	@Test
	@DisplayName("Test de la methode setgenre")
	void testSetgenre() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		client.setGenre(Genre.Femme);
		//THEN
		assertThat(client.getGenre()).isEqualTo(Genre.Femme);
	}
	@Test
	@DisplayName("Test de la methode setNom")
	void testSetNom() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		client.setNom("Jean");
		//THEN
		assertThat(client.getNom()).isEqualTo("Jean");
	}
	@Test
	@DisplayName("Test de la methode setPrenom")
	void testSetPrenom() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		client.setPrenom("Jean");
		//THEN
		assertThat(client.getPrenom()).isEqualTo("Jean");
	}

	@Test
	@DisplayName("Test de la methode setAdresse")
	void testSetAdresse() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		client.setAdresse("l'avenue");
		//THEN
		assertThat(client.getAdresse()).isEqualTo("l'avenue");
	}
	@Test
	@DisplayName("Test de la methode setPointsFidelite")
	void testSetPointsFidelite() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		client.setPointsFidelite(48);
		//THEN
		assertThat(client.getPointsFidelite()).isEqualTo(48);
	}
	@Test
	@DisplayName("Test de la methode equals")
	void testEquals() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String prenom="Feur";
		Genre genre=Genre.Homme;
		//WHEN
		ClientParticulier client = new ClientParticulier(nom,adresse,pointsDeFidelites,prenom,genre);
		//THEN
		assertThat(client.equals(client)).isEqualTo(true);
	}

}
