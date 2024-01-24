import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Map {
	private float x, y;
	private Image fond;
	private float vx;
	private float x_start;

	Map() throws SlickException {
		x = 0;
		y = 0;
		vx = 2 ;
		fond = new Image("images/Map.png");
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

	public float getXstart() {
		return x_start;
	}
//dessine deux fois la map pour couvrir la globalité de l'ecran
	public void dessiner(Graphics g, GameContainer GC) {
		g.drawImage(fond, x, y);
		g.drawImage(fond, x+600, y);
	}
//donne la vitesse a la map
	public void acceleration() {
		x = x - vx;
	}
	//replace la map au debut pour tout le temps avoir un fond 
	public void finmap() {
		if (x<=-600) {
			x=0;
		}
	}
}
