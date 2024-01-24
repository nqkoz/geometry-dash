import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class AdminTriangles {
	private Triangle[] Triangles;
	private int i;

	AdminTriangles(int n) {
		Triangles = new Triangle[n];
	}
//ajouter les triangles dans le tableau
	public void ajouter(Triangle triangle) {
		Triangles[i] = triangle;
		i++;
	}
//booléen pour savoir si il y a eu une collison entre un triangle et le personnage
	public boolean CollisonTriangles(int n, float x, float y) {
		for (int i = 0; i < n; i++) {
			if (Triangles[i].colision(x, y) == true) {
				return true;
			}
		}
		return false;
	}
//permet de dessiner tout les triangles
	public void DessinerTriangles(Graphics g, GameContainer GC, int n) {
		for (int i = 0; i < n; i++) {
			Triangles[i].dessiner(g, GC);
		}
	}
//donne une vitesse a tout les triangles
	public void AccelerationTriangles(int n) {
		for (int i = 0; i < n; i++) {
			Triangles[i].acceleration();
		}
	}
	//replace tout les triangles quand on perd
	public void ReplacerTriangles(int n) {
		for (int i = 0; i < n; i++) {
			Triangles[i].replacer();;
		}
		
	}
}
