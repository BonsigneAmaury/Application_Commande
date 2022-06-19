package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FlotteVehiculeTest {
	@Mock
	Vehicule v1;
	@Mock
	Vehicule v2;
	@Mock
	Vehicule v3;
	
	
	@Test
	@DisplayName("Test du constructeurs")
	void testContructeur() {
		//GIVEN 
		//WHEN
		FlotteVehicule flotte=new FlotteVehicule();
		//THEN
		assertThat(flotte.getSize()).isEqualTo(0);
	}
	
	@Test
	@DisplayName("Test de la methodes addVehicule")
	void testAddVehicule() {
		//GIVEN 
		//WHEN
		FlotteVehicule flotte=new FlotteVehicule();
		flotte.addVehicule(v1);
		//THEN
		assertThat(flotte.getSize()).isEqualTo(1);
	}
	
	@Test
	@DisplayName("Test de la methodes addVehicule alors qu'il est deja present")
	void testAddVehiculeDejaPresent() {
		//GIVEN 
		//WHEN
		FlotteVehicule flotte=new FlotteVehicule();
		flotte.addVehicule(v1);
		flotte.addVehicule(v1);
		//THEN
		assertThat(flotte.getSize()).isEqualTo(1);
	}
	
	@Test
	@DisplayName("Test de la methodes delVehicule")
	void testDelVehicule() {
		//GIVEN 
		//WHEN
		FlotteVehicule flotte=new FlotteVehicule();
		flotte.addVehicule(v1);
		flotte.delVehicule(v1);
		//THEN
		assertThat(flotte.getSize()).isEqualTo(0);
	}
	
	@Test
	@DisplayName("Test de la methodes delVehicule ou le vehicule n'est pas present")
	void testDelVehiculeNonPresent() {
		//GIVEN 
		//WHEN
		FlotteVehicule flotte=new FlotteVehicule();
		flotte.addVehicule(v1);
		flotte.addVehicule(v2);
		flotte.delVehicule(v3);
		//THEN
		assertThat(flotte.getSize()).isEqualTo(2);
	}

}
