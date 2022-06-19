package fr.univartois.butinfo.ihm.GestionVentes.model.vehicule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FourgonTest {
	@Mock
	Fourgon Fourgon;
	
	@Test
	@DisplayName("Test du constructeurs")
	void testConstructeur() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		double PoidsMaximal=300;
		double volumeMax=200;
		//When
		Fourgon f=new Fourgon(immatriculation,modele,marque,kilometrage,anneeCircu,PoidsMaximal,volumeMax);
		//Then
		assertThat(f.getImmatriculation()).isEqualTo(immatriculation);
		assertThat(f.getModele()).isEqualTo(modele);
		assertThat(f.getMarque()).isEqualTo(marque);
		assertThat(f.getKilometrage()).isEqualTo(kilometrage);
		assertThat(f.getAnneeCircu()).isEqualTo(anneeCircu);
		assertThat(f.getPoidMaximal()).isEqualTo(PoidsMaximal);
		assertThat(f.getVolumeMax()).isEqualTo(volumeMax);
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
		double PoidsMaximal=300;
		double volumeMax=200;
		//When
		Fourgon f=new Fourgon(immatriculation,modele,marque,kilometrage,anneeCircu,PoidsMaximal,volumeMax);
		f.setImmatriculation("456");
		f.setModele("megane");
		f.setMarque("RenaultV2");
		f.setKilometrage(853.9);
		f.setAnneeCircu(2005);
		f.setPoidMaximal(450.1);
		f.setVolumeMax(360);
		//Then
		assertThat(f.getImmatriculation()).isEqualTo("456");
		assertThat(f.getModele()).isEqualTo("megane");
		assertThat(f.getMarque()).isEqualTo("RenaultV2");
		assertThat(f.getKilometrage()).isEqualTo(853.9);
		assertThat(f.getAnneeCircu()).isEqualTo(2005);
		assertThat(f.getPoidMaximal()).isEqualTo(450.1);
		assertThat(f.getVolumeMax()).isEqualTo(360);
	}
	
	@Test
	@DisplayName("Test de la methodes equals")
	void testEqualsTrue() {
		//Given
		String immatriculation ="1234";
		String modele="clio 2";
		String marque = "Renault";
		double kilometrage=788.5;
		int anneeCircu=2002;
		double PoidsMaximal=300;
		double volumeMax=200;
		when(Fourgon.getImmatriculation()).thenReturn("1234");
		//When
		Fourgon f=new Fourgon(immatriculation,modele,marque,kilometrage,anneeCircu,PoidsMaximal,volumeMax);
		//Then
		assertThat(f.equals(Fourgon)).isEqualTo(true);
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
		double PoidsMaximal=300;
		double volumeMax=200;
		when(Fourgon.getImmatriculation()).thenReturn("12345");
		//When
		Fourgon f=new Fourgon(immatriculation,modele,marque,kilometrage,anneeCircu,PoidsMaximal,volumeMax);
		//Then
		assertThat(f.equals(Fourgon)).isEqualTo(false);
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
		double PoidsMaximal=300;
		double volumeMax=200;
		when(Fourgon.getImmatriculation()).thenReturn(null);
		//When
		Fourgon f=new Fourgon(immatriculation,modele,marque,kilometrage,anneeCircu,PoidsMaximal,volumeMax);
		//Then
		assertThat(f.equals(Fourgon)).isEqualTo(false);
	}

}
