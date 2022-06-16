package fr.univartois.butinfo.ihm.GestionVentes.model.client;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;



class ClientEntrepriseTest {

	@Test
	void testConstructeurParametre() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.getNom()).isEqualTo(nom);
		assertThat(client.getAdresse()).isEqualTo(adresse);
		assertThat(client.getPointsFidelite()).isEqualTo(pointsDeFidelites);
		assertThat(client.getContact()).isEqualTo(contact);
	}
	@Test
	void testConstructeurRef() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		
		String nom2="Jean";
		String adresse2="l'avenue";
		int pointsDeFidelites2=48;
		String contact2="Deux";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		ClientEntreprise client2 = new ClientEntreprise(nom2,adresse2,pointsDeFidelites2,contact2);
		//THEN
		assertThat(client.getReference()).isNotEqualTo(client2.getReference());
	}
	@Test
	void testGetRistourne15() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=1100;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(15);
	}
	@Test
	void testGetRistourne10() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=600;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(10);
	}
	@Test
	void testGetRistourne5() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=200;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(5);
	}
	@Test
	void testGetRistourne0() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.getRistourne()).isEqualTo(0);
	}
	@Test
	void testSetContact() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		client.setContact("Deux");
		//THEN
		assertThat(client.getContact()).isEqualTo("Deux");
	}
	@Test
	void testSetNom() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		client.setNom("Jean");
		//THEN
		assertThat(client.getNom()).isEqualTo("Jean");
	}
	@Test
	void testSetAdresse() {
		//GIVEN
		String nom="Michel";
		String adresse="la rue";
		int pointsDeFidelites=6;
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
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
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
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
		String contact="Feur";
		//WHEN
		ClientEntreprise client = new ClientEntreprise(nom,adresse,pointsDeFidelites,contact);
		//THEN
		assertThat(client.equals(client)).isEqualTo(true);
	}
}
