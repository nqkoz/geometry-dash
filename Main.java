import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) throws SlickException {
		MonJeu monjeu = new MonJeu("Geometry Runner");
		AppGameContainer app = new AppGameContainer(monjeu);
		app.setDisplayMode(1024, 720, false);
		app.setTargetFrameRate(60);
		app.start();

	}

}
