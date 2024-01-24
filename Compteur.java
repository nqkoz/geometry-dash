public class Compteur {
	private int nbrSauts;
	private int nbrEssais;
	private int nbrPieces;
	private int temps;
	
	Compteur(){
		nbrSauts=0;
		nbrEssais=1;
		nbrPieces=0;
		temps = 0;
	}
	//compteur( essais,sauts,pieces,temps)
	public void ajouterMort() {
		nbrEssais++;
	}
	public void ajouterSaut() {
		nbrSauts++;
	}
	public void ajouterPiece() {
		nbrPieces= nbrPieces+1;
	}
	public void temps(int delta) {
		temps += delta;
		
	}
	//reinitialise les compteurs
	public void reset() {
		nbrPieces=0;
		temps=0;
		nbrSauts=0;
	}

	public int getNbrSauts() {
		return nbrSauts;
	}

	public int getNbrEssais() {
		return nbrEssais;
	}

	public int getNbrPieces() {
		return nbrPieces;
	}

	public int getTemps() {
		return temps;
	}
}
