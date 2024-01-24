import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Plateforme {
	private float x, y;
	private float vx;
	private float x_start;
	private float y_start;
	private Image plateforme;
	private static int n_plateformes = 0;

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getX_start() {
		return x_start;
	}

	public static int getnplateformes() {
		return n_plateformes;
	}
	Plateforme() throws SlickException {
		x = 2500;
		x_start = 2500;
		y = 500;
		y_start=500;
		vx = 12;
		plateforme = new Image("images/carrée.png");
		n_plateformes++;
	}
	//constructeur pour palcer la plateforme au coordonnées voulu
	Plateforme(float x,float y) throws SlickException {
		this.x = x;
		x_start = x;
		this.y = y;
		y_start= y;
		vx = 12;
		plateforme = new Image("images/carrée.png");
		n_plateformes++;
	}
//permet de dessiner la plateforme
	void dessiner(Graphics g, GameContainer GC) {
		g.drawImage(plateforme, x, y);
	}
//donne une  vitesse a la plateforme
	public void acceleration() {
		x = x - vx;
	}
	//booléen pour savoir si il y a eu une collison entre le haut  de plateforme et le personnage
	public boolean collisionHaut(float x_personnage, float y_personnage) {
		return (y_personnage + 50 >= y && y_personnage + 50 <= y + 50 && x_personnage + 50 >= x
				&& x_personnage + 50 <= x + 50
				|| y_personnage + 50 >= y && y_personnage + 50 <= y + 50 && x_personnage >= x
						&& x_personnage <= x + 50);
	}
	//booléen pour savoir si il y a eu une collison entre le cote gauche de la  plateforme et le personnage
	public boolean collisionGauche(float x_personnage, float y_personnage) {
		return (x_personnage + 50 >= x && x_personnage + 50 <= x + 50 && y_personnage >= y
				&& y_personnage  <= y + 50);
	}
	//booléen pour savoir si il y a eu une collison entre le bas  de plateforme et le personnage
	public boolean collisionBas(float x_personnage, float y_personnage) {
		return (y_personnage>= y && y_personnage <= y + 50 && x_personnage + 50 >= x
				&& x_personnage + 50 <= x + 50
				|| y_personnage >= y && y_personnage  <= y + 50 && x_personnage >= x
						&& x_personnage <= x + 50);
	}
	//permet de replacer la plateforme qd on perd
	public void replacer() {
		x = x_start;
	}

}
