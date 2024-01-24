import java.awt.Font;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

public class Perdu {
	private float x, y;
	private float x_txt, y_txt;
	private float x_txt_start, y_txt_start;
	private float vx;
	private Image perdu;
	private TrueTypeFont font;

	Perdu() throws SlickException {
		x = 0;
		y = 0;
		vx = 6;
		x_txt = 300;
		y_txt = 100;
		x_txt_start = 300;
		y_txt_start = 100;
		perdu = new Image("images/death_screen.png");
		//choix de la police et de sa taille pour le texte
		Font txt = new Font("Arial", Font.BOLD, 50);
		font = new TrueTypeFont(txt, true);
	}
//dessine l'image game over
	void dessiner(Graphics g, GameContainer GC) {
		g.drawImage(perdu, x, y);
	}
//écrit dans le ciel le numéro de l'essai
	void dessinerattempt(Graphics g, GameContainer GC, int essais) {
		g.setFont(font);
		g.drawString("ATTEMPT : " + essais, x_txt, y_txt);
	}
	//donne une vitesse au texte
	void acceleration() {
		x_txt=x_txt-vx;
	}
	//replace le texte au dessus du personnage a chaque essai
	void replacer() {
		x_txt = x_txt_start;
		y_txt = y_txt_start;
	}
}
