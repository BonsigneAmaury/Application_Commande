package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LivreurTest {

	@Mock
	Livreur l1;
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeur() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		//WHEN
		Livreur l=new Livreur(nom,prenom,numeroPermis,typePermis);
		//THEN 
		assertThat(l.getNom()).isEqualTo(nom);
		assertThat(l.getPrenom()).isEqualTo(prenom);
		assertThat(l.getTypePermis()).isEqualTo(typePermis);
		assertThat(l.getNumeroPermis()).isEqualTo(numeroPermis);
		assertThat(l.getnBHConduite()).isEqualTo(0);
		assertThat(l.getReference()).isEqualTo(0);
	}
	
	@Test
	@DisplayName("Test des methodes set")
	void testSetter() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		//WHEN
		Livreur l=new Livreur(nom,prenom,numeroPermis,typePermis);
		l.setNom("Clooney");
		l.setPrenom("George");
		l.setNumeroPermis("123");
		l.setTypePermis(Permis.AM);
		l.setnBHConduite(5);
		//THEN 
		assertThat(l.getNom()).isEqualTo("Clooney");
		assertThat(l.getPrenom()).isEqualTo("George");
		assertThat(l.getTypePermis()).isEqualTo(Permis.AM);
		assertThat(l.getNumeroPermis()).isEqualTo("123");
		assertThat(l.getnBHConduite()).isEqualTo(5);
	}
	
	@Test
	@DisplayName("Test de la methodes equals")
	void testEqual() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		when(l1.getNom()).thenReturn("Dujardin");
		when(l1.getPrenom()).thenReturn("Jean");
		//WHEN
		Livreur l=new Livreur(nom,prenom,numeroPermis,typePermis);
		//THEN
		assertThat(l.equals(l1)).isEqualTo(true);
	}
	
	@Test
	@DisplayName("Test de la methodes nbHconduite")
	void testNbH() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		//WHEN
		Livreur l=new Livreur(nom,prenom,numeroPermis,typePermis);
		l.nbHConduite();
		//THEN
		assertThat(l.getnBHConduite()).isEqualTo(1);
	}
}
