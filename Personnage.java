import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Personnage {
	private Image image;
	private float x;
	private float y;
	private float vy;
	private float timer;
	private float saut;
	private float angle;
	private boolean sautdispo;
	
	public Personnage() throws SlickException {
		x = 50;
		y = 500;
		saut = 120;
		vy = 0;
		timer = 0;
		angle = 0;
		image = new Image("images/Personnage.jpg");
		sautdispo=true;
	}
//dessine le personnage et effectue la rotation 
	public void dessiner(Graphics g, GameContainer GC) {
		g.rotate(x + 25, y + 25, angle);
		g.drawImage(image, x, y);
		g.resetTransform();
	}

	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public boolean isSautdispo() {
		return sautdispo;
	}

	public void setSautdispo(boolean sautdispo) {
		this.sautdispo = sautdispo;
	}
	public void setTimer(float timer) {
		this.timer = timer;
	}
	//timer pour la gravité qui se renitialise si on touche le sol
	public void timer(int delta) {
		timer = timer + delta / 1000f;
		if (y >= 500) {
			timer = 0;
		}
	}
//donne la gravité au personnage
	public void gravite(int delta) {
		vy = 20f * timer;
		y = y + vy;
	}
	// saut du personnage  et donne un angle pour effectuer une rotation quand on saute 
	public void saut(Graphics g, GameContainer GC) {
		vy = -saut;
		y = y + vy;
		angle+=90;
		sautdispo=false;
	}
}
