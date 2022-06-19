package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class VoitureTest {
	@Mock
	Voiture voiture;
	
	@Test
	@DisplayName("Test du constructeur")
	void testConstructeur() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		//When
		Voiture v=new Voiture(immatriculation,modele,marque,kilometrage,anneeCircu);
		//Then
		assertThat(v.getImmatriculation()).isEqualTo(immatriculation);
		assertThat(v.getModele()).isEqualTo(modele);
		assertThat(v.getMarque()).isEqualTo(marque);
		assertThat(v.getKilometrage()).isEqualTo(kilometrage);
		assertThat(v.getAnneeCircu()).isEqualTo(anneeCircu);
	}

	@Test
	@DisplayName("Test des methodes set")
	void testSetter() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		//When
		Voiture v=new Voiture(immatriculation,modele,marque,kilometrage,anneeCircu);
		v.setImmatriculation("456");
		v.setModele("megane");
		v.setMarque("RenaultV2");
		v.setKilometrage(853.9);
		v.setAnneeCircu(2005);
		//Then
		assertThat(v.getImmatriculation()).isEqualTo("456");
		assertThat(v.getModele()).isEqualTo("megane");
		assertThat(v.getMarque()).isEqualTo("RenaultV2");
		assertThat(v.getKilometrage()).isEqualTo(853.9);
		assertThat(v.getAnneeCircu()).isEqualTo(2005);
	}
	
	@Test
	@DisplayName("Test de la methodes equals quand elle renvoie true")
	void testEqualsTrue() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		when(voiture.getImmatriculation()).thenReturn("1234");
		//When
		Voiture v=new Voiture(immatriculation,modele,marque,kilometrage,anneeCircu);
		//Then
		assertThat(v.equals(voiture)).isEqualTo(true);
	}
	
	@Test
	@DisplayName("Test de la methodes equals quand elle renvoie false")
	void testEqualsFalseDiff() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		when(voiture.getImmatriculation()).thenReturn("12345");
		//When
		Voiture v=new Voiture(immatriculation,modele,marque,kilometrage,anneeCircu);
		//Then
		assertThat(v.equals(voiture)).isEqualTo(false);
	}
	
	@Test
	@DisplayName("Test de la methodes equals quand elle renvoie false")
	void testEqualsFalseNull() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		when(voiture.getImmatriculation()).thenReturn(null);
		//When
		Voiture v=new Voiture(immatriculation,modele,marque,kilometrage,anneeCircu);
		//Then
		assertThat(v.equals(voiture)).isEqualTo(false);
	}
}
