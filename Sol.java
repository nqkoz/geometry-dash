import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Sol {
	private float x, y;
	private float vx;
	private float x_start;
	private float y_start;
	private Image fond;

	Sol() throws SlickException {
		x = 0;
		y = 550;
		vx = 12;
		x_start = 0;
		y_start = 550;
		fond = new Image("images/Sol.png");
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getX_start() {
		return x_start;
	}

	public float getY_start() {
		return y_start;
	}
//dessine le sol 3 fois  pour completer l'écran 
	public void dessiner(Graphics g, GameContainer GC) {
		g.drawImage(fond, x, y);
		g.drawImage(fond, x+600, y);
		g.drawImage(fond, x+1000, y);
	}
//donne une vitesse au sol
	public void acceleration() {
		x = x - vx;
	}
	//replace le sol au debut pour tout le temps avoir un fond 
	void solfin() {
		if (x <= -600) {
			x = 0;
		}

	}

}