import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Piece {
	private float x,y;
	private float vx;
	private float x_start,y_start;
	private Image piece;
	private boolean vie;
	
	Piece(float x, float y) throws SlickException{
	this.x = x;
	this.y = y;
	x_start=x;
	y_start=y;
	vx=12;
	vie = true;
	piece = new Image("images/Piece.png");
	}
	//dessine la piece tant qu'elle n'as pas éte attrapée
	public void dessiner(Graphics g, GameContainer GC,boolean vie) {
		if(vie==true) {
		g.drawImage(piece, x, y);
		}
	}
	//donne une vitesse a la pièce
	public void acceleration() {
		x=x-vx;
	}
	//replace le piece et la remet en "vie"pour pouvoir la voir quand on perd
	public void replacer() {
		x=x_start;
		y=y_start;
		vie = true;
	}
	//booleen pour savoir si la piece et en collision avec le personnage
	public boolean colision(float x1, float y1) {
		if (x  < x1 + 50 && x + 75 > x1) {
			if (y  < y1 + 50 && y + 75 > y1) {
				return true;
			}
		}
		return false;
	}
	public boolean isVie() {
		return vie;
	}
	public void setVie(boolean vie) {
		this.vie = vie;
	}
}
