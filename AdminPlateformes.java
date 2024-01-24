import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class AdminPlateformes {
	private Plateforme[] Plateformes;
	private int i;

	AdminPlateformes(int n) {
		Plateformes = new Plateforme[n];
	}
	//ajouter les plateformes dans le tableau
	public void ajouter(Plateforme plateforme) {
		Plateformes[i] = plateforme;
		i++;
	}
	//booléen pour savoir si il y a eu une collison entre le haut d'une plateforme et le personnage
	public boolean CollisionHautPlateformes(int n, float x, float y) {
		for (int i = 0; i < n; i++) {
			if (Plateformes[i].collisionHaut(x, y) == true) {
				return true;
			}
		}
		return false;
	}
	//booléen pour savoir si il y a eu une collison entre un cote gauche d'une plateforme et le personnage
	public boolean CollisionGauchePlateformes(int n, float x, float y) {
		for (int i = 0; i < n; i++) {
			if (Plateformes[i].collisionGauche(x, y) == true) {
				return true;
			}
		}
		return false;
	}

	//booléen pour savoir si il y a eu une collison entre le bas d'une plateforme et le personnage
	public boolean CollisionBasPlateformes(int n, float x, float y) {
		for (int i = 0; i < n; i++) {
			if (Plateformes[i].collisionBas(x, y) == true) {
				return true;
			}
		}
		return false;
	}

//donne la vitesse au plateformes
	public void accelerationPlateforme(int n) {
		for (int i = 0; i < n; i++) {
			Plateformes[i].acceleration();
		}

	}
	//replace les plateformes aprés avoir perdu
	public void replcerPlateformes(int n) {
		for (int i = 0; i < n; i++) {
			Plateformes[i].replacer();
		}
		
	}
	//dessine toutes les plateformes
	public void DessinerPlateformes(Graphics g, GameContainer GC, int n) {
		for (int i = 0; i < n; i++) {
			Plateformes[i].dessiner(g, GC);
		}
		
	}
}
