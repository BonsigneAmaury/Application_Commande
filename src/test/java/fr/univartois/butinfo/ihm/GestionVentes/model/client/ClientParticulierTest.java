package fr.univartois.butinfo.ihm.GestionVentes.model.client;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ClientParticulierTest {

	@Test
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
	void testSetprenom() {
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
