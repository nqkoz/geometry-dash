import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class Musique {
	private Sound Musique;

	Musique() throws SlickException {
		Musique = new Sound("Geometrydash.wav");
	}
// joue la musique mais ne marche pas
	void joue() {
		Musique.play();
		Musique.loop();
	}

}
