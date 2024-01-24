	import org.newdawn.slick.GameContainer;
	import java.awt.image.BufferedImage;
	import org.newdawn.slick.Color;
	import org.newdawn.slick.Graphics;
	import org.newdawn.slick.Image;
	import org.newdawn.slick.SlickException;
	
	public class Triangle {
		private float x;
		private float y;
		private float vx;
		private float x_start;
		private float y_start;
		private Image image;
		private static int n_triangle = 0;
	
		public Triangle() throws SlickException {
			x = 1000;
			y = 507;
			vx = 12;
			x_start = 1000;
			y_start = 507;
			image = new Image("images/Triangle.png");
			n_triangle++;
		}
//constructeur pour placer le triangle au coordonnées voulu	
		public Triangle(float x,float y) throws SlickException {
			this.x = x;
			this.y = y;
			x_start = x;
			y_start = y;
			vx = 12;
			image = new Image ("images/Triangle.png");
			n_triangle++;
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
	
		public float x_start() {
			return x_start;
		}
		//permet de renvoyer le nombre de triangles créer pour éviter le out of range du tableau de triangle
		public static int getNombreTriangles() {
		    return n_triangle;
		}
	
	//permet de dessiner l'image de triangle
		public void dessiner(Graphics g, GameContainer GC) {
			g.drawImage(image, x, y);
			//g.drawRect(x + 15f, y + 10f, 20, 30);
		}
	//donne une vitesse au triangle
		public void acceleration() {
			x = x - vx;
		}
	//booléen pour savoir si il y a eu une collison entre le triangle et le personnage
		public boolean colision(float x1, float y1) {
			if (x + 15 < x1 + 50 && x + 35 > x1) {
				if (y + 10 < y1 + 50 && y + 40 > y1) {
					return true;
				}
			}
			return false;
		}
		//permet de replacer le triangle  quand on perd
		public void replacer() {
			x=x_start;
			y=y_start;
		}
	}
