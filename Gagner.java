import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

import java.awt.Font;

public class Gagner {
	private Image Gagner;
	private Image Portailfin;
	private float px, py;
	private float gx, gy;
	private float vpx;
	private float px_start;
	private float py_start;
	private TrueTypeFont font;

	Gagner() throws SlickException {
		Gagner = new Image("images/win_screen.png");
		Portailfin = new Image("images/portail.png");
		vpx = 12;
		px = 20000;
		px_start = 20000;
		py = 200;
		py_start = 200;
		gx = 0;
		gy = 0;
		//donne la taille et la police voulu 
		Font txt = new Font("Arial", Font.BOLD, 30);
		font = new TrueTypeFont(txt, true);
	}
//dessine le portail de fin
	void dessiner(Graphics g, GameContainer GC) {
		g.drawImage(Portailfin, px, py);
	}
//dessine l'ecran de fin avec les valeur de chaque compteur
	void dessinerfin(Graphics g, GameContainer GC, int saut, int essais, int temps, int pieces) {
		g.drawImage(Gagner, gx, gy);
		g.setColor(Color.white);
		g.setFont(font);
		g.drawString("" + essais, 150, 300);
		g.drawString("" + saut, 800, 300);
		g.drawString(temps / 1000 + " sec", 150, 580);
		g.drawString(pieces+"/3", 800, 580);
	}
// boolen pour savoir si le personnage a atteint le portail de fin
	boolean gagnant(float x) {
		return (px <= x);
	}
//donne une vitesse au portail
	void acceleration() {
		px = px - vpx;
	}
//replace le portail après avoir perdu
	void replacer() {
		px = px_start;
		py = py_start;
	}
}
