package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ConducteursTest {
	@Mock
	Conducteur c1;
	@Mock
	Conducteur c2;
	@Mock
	Conducteur c3;
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeur() {
		//GIVEN
		//WHEN
		Conducteurs c=new Conducteurs();
		//THEN
		assertThat(c.getSize()).isEqualTo(0);
	}
	@Test
	@DisplayName("Test de la methodes addConducteurs")
	void testAddConducteurs() {
		//GIVEN
		//WHEN
		Conducteurs c=new Conducteurs();
		c.addConducteurs(c1);
		//THEN
		assertThat(c.getSize()).isEqualTo(1);
	}
	@Test
	@DisplayName("Test de la methodes addConducteurs ou le conducteur est deja present")
	void testAddConducteursDejaPresent() {
		//GIVEN
		//WHEN
		Conducteurs c=new Conducteurs();
		c.addConducteurs(c1);
		c.addConducteurs(c1);
		//THEN
		assertThat(c.getSize()).isEqualTo(1);
	}
	@Test
	@DisplayName("Test de la methodes delConducteurs")
	void testDelConducteurs() {
		//GIVEN
		//WHEN
		Conducteurs c=new Conducteurs();
		c.addConducteurs(c1);
		c.delConducteurs(c1);
		//THEN
		assertThat(c.getSize()).isEqualTo(0);
	}
	@Test
	@DisplayName("Test de la methodes delConducteurs ou le conducteur n'est pas present")
	void testDelConducteurNonPresent() {
		//GIVEN
		//WHEN
		Conducteurs c=new Conducteurs();
		c.addConducteurs(c1);
		c.addConducteurs(c2);
		c.delConducteurs(c3);
		//THEN
		assertThat(c.getSize()).isEqualTo(2);
	}
}
