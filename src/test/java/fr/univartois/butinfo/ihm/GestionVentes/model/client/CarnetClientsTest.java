package fr.univartois.butinfo.ihm.GestionVentes.model.client;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
class CarnetClientsTest {
	@Mock
	Client client1;
	@Mock
	Client client2;
	@Mock
	Client client3;	
	@Mock
	Client client4;
	@Mock
	Client client5;
	@Mock
	Client client6;
	@Mock
	Client client7;
	@Mock
	Client client8;
	@Mock
	Client client9;
	@Mock
	Client client10;
	@Mock
	Client client11;
	@Mock
	ClientEntreprise clientE1;
	@Mock
	ClientEntreprise clientE2;
	@Mock
	ClientEntreprise clientE3;
	@Mock
	ClientParticulier clientP1;
	@Mock
	ClientParticulier clientP2;
	@Mock
	ClientParticulier clientP3;
	
	@Test
	void testConstructeur() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		//Then
		assertThat(carnet.getNom()).isEqualTo(nom);
		assertThat(carnet.getNbClients()).isEqualTo(0);
	}
	
	@Test
	void testSetNom() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.setNom("carnet2");
		//Then
		assertThat(carnet.getNom()).isEqualTo("carnet2");
	}
	
	@Test
	void testEstPleinFaux() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		//Then
		assertThat(carnet.estPlein()).isEqualTo(false);
	}
	
	@Test
	void testEstPleinVrai() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.ajouterClient(client2);
		carnet.ajouterClient(client3);
		carnet.ajouterClient(client4);
		carnet.ajouterClient(client5);
		carnet.ajouterClient(client6);
		carnet.ajouterClient(client7);
		carnet.ajouterClient(client8);
		carnet.ajouterClient(client9);
		carnet.ajouterClient(client10);		
		//Then
		assertThat(carnet.estPlein()).isEqualTo(true);
	}
	
	@Test
	void testEstVideFaux() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.ajouterClient(client2);
		carnet.ajouterClient(client3);
		carnet.ajouterClient(client4);
		carnet.ajouterClient(client5);
		carnet.ajouterClient(client6);
		carnet.ajouterClient(client7);
		carnet.ajouterClient(client8);
		carnet.ajouterClient(client9);
		carnet.ajouterClient(client10);		
		//Then
		assertThat(carnet.estVide()).isEqualTo(false);
	}
	
	@Test
	void testEstVideVrai() {
		//GIVEN
		String nom="Carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		//Then
		assertThat(carnet.estVide()).isEqualTo(true);
	}
	
	@Test
	void testAjouter() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		//Then
		assertThat(carnet.rechercherClientParReference(client1.getReference())).isEqualTo(client1);
	}
	
	@Test
	void testAjouterErreurPlein() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.ajouterClient(client2);
		carnet.ajouterClient(client3);
		carnet.ajouterClient(client4);
		carnet.ajouterClient(client5);
		carnet.ajouterClient(client6);
		carnet.ajouterClient(client7);
		carnet.ajouterClient(client8);
		carnet.ajouterClient(client9);
		carnet.ajouterClient(client10);
		carnet.ajouterClient(client11);
		//Then
		assertThat(carnet.getNbClients()).isNotEqualTo(11);
	}
	
	@Test
	void testAjouterErreurDejaPresent() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.ajouterClient(client1);
		//Then
		assertThat(carnet.getNbClients()).isNotEqualTo(2);
	}
	
	@Test
	void testSupprimer() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.supprimerClient(client1);
		//Then
		assertThat(carnet.rechercherClientParReference(client1.getReference())).isEqualTo(null);
	}
	
	@Test
	void testSupprimerErreurPasPresent() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client1);
		carnet.ajouterClient(client2);
		carnet.supprimerClient(client3);
		//Then
		assertThat(carnet.getNbClients()).isNotEqualTo(1);
	}
	
	@Test
	void testRechercherParReferenceErreur() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client2);
		carnet.ajouterClient(client3);
		//Then
		assertThat(carnet.rechercherClientParReference(5)).isEqualTo(null);
	}
	
	@Test
	void testClientsDansCarnet() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(client2);
		carnet.ajouterClient(client3);
		//Then
		assertThat(carnet.clientsDansCarnet()).isNotEmpty();
		assertThat(carnet.clientsDansCarnet()).isNotNull();
		assertThat((carnet.clientsDansCarnet()).length).isEqualTo(2);
	}
	
	@Test
	void testClientsParticulierDansCarnet() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(clientE1);
		carnet.ajouterClient(clientE2);
		carnet.ajouterClient(clientE3);
		carnet.ajouterClient(clientP1);
		carnet.ajouterClient(clientP2);
		carnet.ajouterClient(clientP3);
		//Then
		assertThat(carnet.clientsParticulierDansCarnet()).isNotEmpty();
		assertThat(carnet.clientsParticulierDansCarnet()).isNotNull();
		assertThat((carnet.clientsParticulierDansCarnet()).length).isEqualTo(3);
	}
	
	@Test
	void testClientsEntrepriseDansCarnet() {
		//GIVEN
		String nom="carnet";
		//WHEN
		CarnetClients carnet = new CarnetClients(nom);
		carnet.ajouterClient(clientE1);
		carnet.ajouterClient(clientE2);
		carnet.ajouterClient(clientE3);
		carnet.ajouterClient(clientP1);
		carnet.ajouterClient(clientP2);
		carnet.ajouterClient(clientP3);
		//Then
		assertThat(carnet.clientsEntrepriseDansCarnet()).isNotEmpty();
		assertThat(carnet.clientsEntrepriseDansCarnet()).isNotNull();
		assertThat((carnet.clientsEntrepriseDansCarnet()).length).isEqualTo(3);
	}
}
