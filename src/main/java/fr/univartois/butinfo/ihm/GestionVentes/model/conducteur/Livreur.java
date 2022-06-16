package fr.univartois.butinfo.ihm.GestionVentes.model.conducteur;




public class Livreur extends Conducteur {
	private int nBHConduite;
	
    public Livreur(String nom, String prenom, String numeroPermis, Permis typePermis) {
        super(nom,prenom,numeroPermis,typePermis);
        this.nBHConduite=0;

    }
    public void nbHConduite() {
        this.nBHConduite+=1;
    }
	public int getnBHConduite() {
		return nBHConduite;
	}
	public void setnBHConduite(int nBHConduite) {
		this.nBHConduite = nBHConduite;
	}
	@Override
	public String toString() {
		return super.toString()+"nbHeureConduite=" + nBHConduite ;
	}

}
