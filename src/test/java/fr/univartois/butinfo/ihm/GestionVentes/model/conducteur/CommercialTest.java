package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CommercialTest {
	@Mock
	Commercial c1;
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeur() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		//WHEN
		Commercial c=new Commercial(nom,prenom,numeroPermis,typePermis);
		//THEN 
		assertThat(c.getNom()).isEqualTo(nom);
		assertThat(c.getPrenom()).isEqualTo(prenom);
		assertThat(c.getTypePermis()).isEqualTo(typePermis);
		assertThat(c.getNumeroPermis()).isEqualTo(numeroPermis);
		assertThat(c.getNbVisite()).isEqualTo(0);
		assertThat(c.getReference()).isEqualTo(0);
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
		Commercial c=new Commercial(nom,prenom,numeroPermis,typePermis);
		c.setNom("Clooney");
		c.setPrenom("George");
		c.setNumeroPermis("123");
		c.setTypePermis(Permis.AM);
		c.setNbVisite(5);
		//THEN 
		assertThat(c.getNom()).isEqualTo("Clooney");
		assertThat(c.getPrenom()).isEqualTo("George");
		assertThat(c.getTypePermis()).isEqualTo(Permis.AM);
		assertThat(c.getNumeroPermis()).isEqualTo("123");
		assertThat(c.getNbVisite()).isEqualTo(5);
	}
	
	@Test
	@DisplayName("Test de la methodes equals")
	void testEsqual() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		when(c1.getNom()).thenReturn("Dujardin");
		when(c1.getPrenom()).thenReturn("Jean");
		//WHEN
		Commercial c=new Commercial(nom,prenom,numeroPermis,typePermis);
		//THEN
		assertThat(c.equals(c1)).isEqualTo(true);
	}
	@DisplayName("Test de la methodes nbVisite")
	void testNbH() {
		//GIVEN
		String nom="Dujardin";
		String prenom="Jean";
		Permis typePermis= Permis.A;
		String numeroPermis="456";
		//WHEN
		Commercial c=new Commercial(nom,prenom,numeroPermis,typePermis);
		c.nbVisite();
		//THEN
		assertThat(c.getNbVisite()).isEqualTo(1);
	}
}
