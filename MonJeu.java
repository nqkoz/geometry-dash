import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class MonJeu extends BasicGame {
	private Personnage cube;
	private Triangle triangle;
	private Triangle triangle1;
	private Triangle triangle2;
	private Triangle triangle3;
	private Triangle triangle4;
	private Triangle triangle5;
	private Triangle triangle6;
	private Triangle triangle7;
	private Triangle triangle8;
	private Triangle triangle9;
	private Triangle triangle10;
	private Triangle triangle11;
	private Triangle triangle12;
	private Triangle triangle13;
	private Triangle triangle14;
	private Triangle triangle15;
	private Triangle triangle16;
	private Triangle triangle17;
	private Triangle triangle18;
	private Triangle triangle19;
	private Triangle triangle20;
	private Triangle triangle21;
	private Triangle triangle22;
	private Triangle triangle23;
	private Triangle triangle24;
	private Triangle triangle25;
	private Triangle triangle26;
	private Triangle triangle27;
	private Triangle triangle28;
	private Triangle triangle29;
	private Triangle triangle30;
	private Triangle triangle31;
	private Triangle triangle32;
	private Triangle triangle33;
	private Map Map;
	private Musique musique;
	private Sol sol;
	private Perdu perdu;
	private boolean gameOver;
	private Gagner gagner;
	private Plateforme plateforme;
	private Plateforme plateforme1;
	private Plateforme plateforme2;
	private Plateforme plateforme3;
	private Plateforme plateforme4;
	private Plateforme plateforme5;
	private Plateforme plateforme6;
	private Plateforme plateforme7;
	private Plateforme plateforme8;
	private Plateforme plateforme9;
	private Plateforme plateforme10;
	private Plateforme plateforme11;
	private Plateforme plateforme12;
	private Plateforme plateforme13;
	private Plateforme plateforme14;
	private Plateforme plateforme15;
	private Plateforme plateforme16;
	private Plateforme plateforme17;
	private Plateforme plateforme18;
	private Plateforme plateforme19;
	private Plateforme plateforme20;
	private Plateforme plateforme21;
	private Plateforme plateforme22;
	private Plateforme plateforme23;
	private Plateforme plateforme24;
	private Plateforme plateforme25;
	private Plateforme plateforme26;
	private Plateforme plateforme27;
	private Plateforme plateforme28;
	private Plateforme plateforme29;
	private Plateforme plateforme30;
	private Plateforme plateforme31;
	private Plateforme plateforme32;
	private Plateforme plateforme33;
	private Plateforme plateforme34;
	private Plateforme plateforme35;
	private Plateforme plateforme36;
	private Plateforme plateforme37;
	private Plateforme plateforme38;
	private Plateforme plateforme39;
	private Plateforme plateforme40;
	private Plateforme plateforme41;
	private Plateforme plateforme42;
	private Plateforme plateforme43;
	private Plateforme plateforme44;
	private Plateforme plateforme45;
	private Plateforme plateforme46;
	private Plateforme plateforme47;
	private Plateforme plateforme48;
	private Plateforme plateforme49;
	private Plateforme plateforme50;
	private Plateforme plateforme51;
	private Plateforme plateforme52;
	private Plateforme plateforme53;
	private Plateforme plateforme54;
	private Plateforme plateforme55;
	private Plateforme plateforme56;
	private Plateforme plateforme57;
	private Plateforme plateforme58;
	private Plateforme plateforme59;
	private Plateforme plateforme60;
	private Plateforme plateforme61;
	private Plateforme plateforme62;
	private Plateforme plateforme63;
	private Plateforme plateforme64;
	private Plateforme plateforme65;
	private Plateforme plateforme66;
	private Plateforme plateforme67;
	private Plateforme plateforme68;
	private Plateforme plateforme69;
	private Plateforme plateforme70;
	private Plateforme plateforme71;
	private Plateforme plateforme72;
	private Plateforme plateforme73;
	private Plateforme plateforme74;
	private Plateforme plateforme75;
	private Plateforme plateforme76;
	private Plateforme plateforme77;
	private Plateforme plateforme78;
	private Plateforme plateforme79;
	private Plateforme plateforme80;
	private Plateforme plateforme81;
	private Plateforme plateforme82;
	private Plateforme plateforme83;
	private Plateforme plateforme84;
	private Plateforme plateforme85;
	private Plateforme plateforme86;
	private Plateforme plateforme87;
	private Plateforme plateforme88;
	private Plateforme plateforme89;
	private Plateforme plateforme90;
	private Plateforme plateforme91;
	private Plateforme plateforme92;
	private Plateforme plateforme93;
	private Plateforme plateforme94;
	private Plateforme plateforme95;
	private Plateforme plateforme96;
	private Plateforme plateforme97;
	private Plateforme plateforme98;
	private Plateforme plateforme99;
	private Plateforme plateforme100;
	private Plateforme plateforme101;
	private Plateforme plateforme102;
	private Plateforme plateforme103;
	private Plateforme plateforme104;
	private Plateforme plateforme105;
	private Plateforme plateforme106;
	private Plateforme plateforme107;
	private Plateforme plateforme108;
	private Plateforme plateforme109;
	private Plateforme plateforme110;
	private Plateforme plateforme111;
	private Plateforme plateforme112;
	private Plateforme plateforme113;
	private Plateforme plateforme114;
	private Plateforme plateforme115;
	private Plateforme plateforme116;
	private Plateforme plateforme117;
	private Plateforme plateforme118;
	private Plateforme plateforme119;
	private Plateforme plateforme120;
	private Plateforme plateforme121;
	private Plateforme plateforme122;
	private Plateforme plateforme123;
	private Plateforme plateforme124;
	private Plateforme plateforme125;
	private Plateforme plateforme126;
	private Plateforme plateforme127;
	private Plateforme plateforme128;
	private Plateforme plateforme129;
	private Piece piece;
	private Piece piece2;
	private Piece piece3;
	private Compteur compteur;
	private AdminTriangles Triangles;
	private AdminPlateformes Plateformes;

	public MonJeu(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// Dessiner toutes les images dont on a besoin(Personnage,obstacles,map...)
		Map.dessiner(g, container);
		cube.dessiner(g, container);
		sol.dessiner(g, container);
		gagner.dessiner(g, container);
		perdu.dessinerattempt(g, container, compteur.getNbrEssais());
		piece.dessiner(g, container, piece.isVie());
		piece2.dessiner(g, container, piece2.isVie());
		piece3.dessiner(g, container, piece3.isVie());
		Plateformes.DessinerPlateformes(g, container, Plateforme.getnplateformes());
		Triangles.DessinerTriangles(g, container, Triangle.getNombreTriangles());
		// Condition qui permet d'afficher l'écran de victoire Victoire
		if (gagner.gagnant(cube.getX())) {
			gagner.dessinerfin(g, container, compteur.getNbrSauts(), compteur.getNbrEssais(), compteur.getTemps(),
					compteur.getNbrPieces());
		}
		// Condition qui permet d'afficher l'écran de mort
		if (gameOver) {
			perdu.dessiner(g, container);

		}
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		cube = new Personnage();
		sol = new Sol();
		// Création de l'obstacle Triangle et donner leurs positions
		triangle = new Triangle();
		triangle1 = new Triangle(1350, 507);
		triangle2 = new Triangle(2600, 507);
		triangle3 = new Triangle(2650, 507);
		triangle4 = new Triangle(2700, 507);
		triangle5 = new Triangle(1400, 507);
		triangle6 = new Triangle(4000, 507);
		triangle7 = new Triangle(4050, 507);
		triangle8 = new Triangle(4100, 507);
		triangle9 = new Triangle(4700, 507);
		triangle10 = new Triangle(4750, 507);
		triangle11 = new Triangle(4800, 507);
		triangle12 = new Triangle(4850, 507);
		triangle13 = new Triangle(4900, 507);
		triangle14 = new Triangle(4950, 507);
		triangle15 = new Triangle(5000, 507);
		triangle16 = new Triangle(5050, 507);
		triangle17 = new Triangle(5350, 307);
		triangle18 = new Triangle(8200, 507);
		triangle19 = new Triangle(8250, 507);
		triangle20 = new Triangle(9650, 507);
		triangle21 = new Triangle(9700, 507);
		triangle22 = new Triangle(10700, 507);
		triangle23 = new Triangle(10750, 507);
		triangle24 = new Triangle(10800, 507);
		triangle25 = new Triangle(11200, 507);
		triangle26 = new Triangle(11250, 507);
		triangle27 = new Triangle(11800, 507);
		triangle28 = new Triangle(12250, 507);
		triangle29 = new Triangle(15650, 457);
		triangle30 = new Triangle(15850, 507);
		triangle31 = new Triangle(16550, 507);
		triangle32 = new Triangle(16600, 507);

		Map = new Map();
		gameOver = false;
		musique = new Musique();
		perdu = new Perdu();
		gagner = new Gagner();
		// Création de l'obstacle Plateforme et donner leurs positions
		plateforme = new Plateforme(2500, 500);
		plateforme1 = new Plateforme(2550, 500);
		plateforme2 = new Plateforme(2700, 400);
		plateforme3 = new Plateforme(2750, 400);
		plateforme4 = new Plateforme(2900, 300);
		plateforme5 = new Plateforme(2950, 300);
		plateforme6 = new Plateforme(3250, 400);
		plateforme7 = new Plateforme(3300, 400);
		plateforme8 = new Plateforme(4600, 500);
		plateforme9 = new Plateforme(4650, 500);
		plateforme10 = new Plateforme(4800, 400);
		plateforme11 = new Plateforme(4850, 400);
		plateforme12 = new Plateforme(5000, 300);
		plateforme13 = new Plateforme(5050, 300);
		plateforme14 = new Plateforme(5100, 350);
		plateforme15 = new Plateforme(5150, 350);
		plateforme16 = new Plateforme(5200, 350);
		plateforme17 = new Plateforme(5250, 350);
		plateforme18 = new Plateforme(5300, 350);
		plateforme19 = new Plateforme(5350, 350);
		plateforme20 = new Plateforme(5400, 350);
		plateforme21 = new Plateforme(5450, 350);
		plateforme22 = new Plateforme(5500, 350);
		plateforme23 = new Plateforme(5550, 350);
		plateforme24 = new Plateforme(5600, 350);
		plateforme25 = new Plateforme(5650, 350);
		plateforme26 = new Plateforme(5700, 350);
		plateforme27 = new Plateforme(5750, 350);
		plateforme28 = new Plateforme(5800, 300);
		plateforme29 = new Plateforme(5850, 300);
		plateforme30 = new Plateforme(6200, 300);
		plateforme31 = new Plateforme(6250, 300);
		plateforme32 = new Plateforme(6600, 300);
		plateforme33 = new Plateforme(6650, 300);
		plateforme34 = new Plateforme(7000, 300);
		plateforme35 = new Plateforme(7050, 300);
		plateforme36 = new Plateforme(7500, 400);
		plateforme37 = new Plateforme(7850, 400);
		plateforme38 = new Plateforme(6200, 350);
		plateforme39 = new Plateforme(6200, 400);
		plateforme40 = new Plateforme(6200, 450);
		plateforme41 = new Plateforme(6200, 500);
		plateforme42 = new Plateforme(6250, 350);
		plateforme43 = new Plateforme(6250, 400);
		plateforme44 = new Plateforme(6250, 450);
		plateforme45 = new Plateforme(6250, 500);
		plateforme46 = new Plateforme(6600, 350);
		plateforme47 = new Plateforme(6600, 400);
		plateforme48 = new Plateforme(6600, 450);
		plateforme49 = new Plateforme(6600, 500);
		plateforme50 = new Plateforme(6650, 350);
		plateforme51 = new Plateforme(6650, 400);
		plateforme52 = new Plateforme(6650, 450);
		plateforme53 = new Plateforme(6650, 500);
		plateforme54 = new Plateforme(7000, 350);
		plateforme55 = new Plateforme(7000, 400);
		plateforme56 = new Plateforme(7000, 450);
		plateforme57 = new Plateforme(7000, 500);
		plateforme58 = new Plateforme(7050, 350);
		plateforme59 = new Plateforme(7050, 400);
		plateforme60 = new Plateforme(7050, 450);
		plateforme61 = new Plateforme(7050, 500);
		plateforme62 = new Plateforme(7500, 450);
		plateforme63 = new Plateforme(7500, 500);
		plateforme64 = new Plateforme(7850, 450);
		plateforme65 = new Plateforme(7850, 500);
		plateforme66 = new Plateforme(9000, 500);
		plateforme67 = new Plateforme(9200, 400);
		plateforme68 = new Plateforme(9200, 450);
		plateforme69 = new Plateforme(9200, 500);
		plateforme70 = new Plateforme(9400, 300);
		plateforme71 = new Plateforme(9600, 200);
		plateforme72 = new Plateforme(9800, 100);
		plateforme73 = new Plateforme(10200, 500);
		plateforme74 = new Plateforme(10400, 400);
		plateforme75 = new Plateforme(11000, 449);
		plateforme76 = new Plateforme(9800, 100);
		plateforme77 = new Plateforme(10200, 500);
		plateforme78 = new Plateforme(10400, 400);
		plateforme79 = new Plateforme(11000, 449);
		plateforme80 = new Plateforme(11700, 500);
		plateforme81 = new Plateforme(11900, 400);
		plateforme82 = new Plateforme(11900, 450);
		plateforme83 = new Plateforme(11900, 500);
		plateforme84 = new Plateforme(12700, 500);
		plateforme85 = new Plateforme(12750, 500);
		plateforme86 = new Plateforme(12900, 400);
		plateforme87 = new Plateforme(12900, 450);
		plateforme88 = new Plateforme(12900, 500);
		plateforme89 = new Plateforme(13150, 300);
		plateforme90 = new Plateforme(13500, 300);
		plateforme91 = new Plateforme(13850, 300);
		plateforme92 = new Plateforme(13900, 300);
		plateforme93 = new Plateforme(14250, 300);
		plateforme94 = new Plateforme(14300, 300);
		plateforme95 = new Plateforme(14650, 300);
		plateforme96 = new Plateforme(14700, 300);
		plateforme97 = new Plateforme(15500, 500);
		plateforme98 = new Plateforme(15550, 500);
		plateforme99 = new Plateforme(15600, 500);
		plateforme100 = new Plateforme(15650, 500);
		plateforme101 = new Plateforme(15700, 500);
		plateforme102 = new Plateforme(15750, 500);
		plateforme103 = new Plateforme(15800, 500);
		plateforme104 = new Plateforme(15900, 500);
		plateforme105 = new Plateforme(15950, 500);
		plateforme106 = new Plateforme(16000, 500);
		plateforme107 = new Plateforme(16050, 500);
		plateforme108 = new Plateforme(16100, 500);
		plateforme109 = new Plateforme(16150, 500);
		plateforme110 = new Plateforme(16200, 500);
		plateforme111 = new Plateforme(16400, 400);
		plateforme112 = new Plateforme(16400, 450);
		plateforme113 = new Plateforme(16400, 500);
		plateforme114 = new Plateforme(16600, 300);
		plateforme115 = new Plateforme(16650, 300);
		plateforme116 = new Plateforme(17500, 500);
		plateforme117 = new Plateforme(17700, 400);
		plateforme118 = new Plateforme(17700, 450);
		plateforme119 = new Plateforme(17700, 500);
		plateforme120 = new Plateforme(17900, 300);
		plateforme121 = new Plateforme(17900, 350);
		plateforme122 = new Plateforme(17900, 400);
		plateforme123 = new Plateforme(17900, 450);
		plateforme124 = new Plateforme(17900, 500);
		plateforme125 = new Plateforme(18250, 500);
		plateforme126 = new Plateforme(18250, 450);
		plateforme127 = new Plateforme(18250, 400);
		plateforme128 = new Plateforme(18250, 350);
		plateforme129 = new Plateforme(18250, 300);

		// creation de la piece
		piece = new Piece(9800, 25);
		piece2 = new Piece(13500, 225);
		piece3 = new Piece(16650, 125);
		compteur = new Compteur();
		// creation du tableau permettant de gérer les triangles
		Triangles = new AdminTriangles(Triangle.getNombreTriangles());
		// ajout des triangles dans le tableau
		Triangles.ajouter(triangle);
		Triangles.ajouter(triangle1);
		Triangles.ajouter(triangle2);
		Triangles.ajouter(triangle3);
		Triangles.ajouter(triangle4);
		Triangles.ajouter(triangle5);
		Triangles.ajouter(triangle6);
		Triangles.ajouter(triangle7);
		Triangles.ajouter(triangle8);
		Triangles.ajouter(triangle9);
		Triangles.ajouter(triangle10);
		Triangles.ajouter(triangle11);
		Triangles.ajouter(triangle12);
		Triangles.ajouter(triangle13);
		Triangles.ajouter(triangle14);
		Triangles.ajouter(triangle15);
		Triangles.ajouter(triangle16);
		Triangles.ajouter(triangle17);
		Triangles.ajouter(triangle18);
		Triangles.ajouter(triangle19);
		Triangles.ajouter(triangle20);
		Triangles.ajouter(triangle21);
		Triangles.ajouter(triangle22);
		Triangles.ajouter(triangle23);
		Triangles.ajouter(triangle24);
		Triangles.ajouter(triangle25);
		Triangles.ajouter(triangle26);
		Triangles.ajouter(triangle27);
		Triangles.ajouter(triangle28);
		Triangles.ajouter(triangle29);
		Triangles.ajouter(triangle30);
		Triangles.ajouter(triangle31);
		Triangles.ajouter(triangle32);

		// creation tableau permettant de gérer les plateformes
		Plateformes = new AdminPlateformes(Plateforme.getnplateformes());
		// ajout des plateformes dans le tableau
		Plateformes.ajouter(plateforme);
		Plateformes.ajouter(plateforme1);
		Plateformes.ajouter(plateforme2);
		Plateformes.ajouter(plateforme3);
		Plateformes.ajouter(plateforme4);
		Plateformes.ajouter(plateforme5);
		Plateformes.ajouter(plateforme6);
		Plateformes.ajouter(plateforme7);
		Plateformes.ajouter(plateforme8);
		Plateformes.ajouter(plateforme9);
		Plateformes.ajouter(plateforme10);
		Plateformes.ajouter(plateforme11);
		Plateformes.ajouter(plateforme12);
		Plateformes.ajouter(plateforme13);
		Plateformes.ajouter(plateforme14);
		Plateformes.ajouter(plateforme15);
		Plateformes.ajouter(plateforme16);
		Plateformes.ajouter(plateforme17);
		Plateformes.ajouter(plateforme18);
		Plateformes.ajouter(plateforme19);
		Plateformes.ajouter(plateforme20);
		Plateformes.ajouter(plateforme21);
		Plateformes.ajouter(plateforme22);
		Plateformes.ajouter(plateforme23);
		Plateformes.ajouter(plateforme24);
		Plateformes.ajouter(plateforme25);
		Plateformes.ajouter(plateforme26);
		Plateformes.ajouter(plateforme27);
		Plateformes.ajouter(plateforme28);
		Plateformes.ajouter(plateforme29);
		Plateformes.ajouter(plateforme30);
		Plateformes.ajouter(plateforme31);
		Plateformes.ajouter(plateforme32);
		Plateformes.ajouter(plateforme33);
		Plateformes.ajouter(plateforme34);
		Plateformes.ajouter(plateforme35);
		Plateformes.ajouter(plateforme36);
		Plateformes.ajouter(plateforme37);
		Plateformes.ajouter(plateforme38);
		Plateformes.ajouter(plateforme39);
		Plateformes.ajouter(plateforme40);
		Plateformes.ajouter(plateforme41);
		Plateformes.ajouter(plateforme42);
		Plateformes.ajouter(plateforme43);
		Plateformes.ajouter(plateforme44);
		Plateformes.ajouter(plateforme45);
		Plateformes.ajouter(plateforme46);
		Plateformes.ajouter(plateforme47);
		Plateformes.ajouter(plateforme48);
		Plateformes.ajouter(plateforme49);
		Plateformes.ajouter(plateforme50);
		Plateformes.ajouter(plateforme51);
		Plateformes.ajouter(plateforme52);
		Plateformes.ajouter(plateforme53);
		Plateformes.ajouter(plateforme54);
		Plateformes.ajouter(plateforme55);
		Plateformes.ajouter(plateforme56);
		Plateformes.ajouter(plateforme57);
		Plateformes.ajouter(plateforme58);
		Plateformes.ajouter(plateforme59);
		Plateformes.ajouter(plateforme60);
		Plateformes.ajouter(plateforme61);
		Plateformes.ajouter(plateforme62);
		Plateformes.ajouter(plateforme63);
		Plateformes.ajouter(plateforme64);
		Plateformes.ajouter(plateforme65);
		Plateformes.ajouter(plateforme66);
		Plateformes.ajouter(plateforme67);
		Plateformes.ajouter(plateforme68);
		Plateformes.ajouter(plateforme69);
		Plateformes.ajouter(plateforme70);
		Plateformes.ajouter(plateforme71);
		Plateformes.ajouter(plateforme72);
		Plateformes.ajouter(plateforme73);
		Plateformes.ajouter(plateforme74);
		Plateformes.ajouter(plateforme75);
		Plateformes.ajouter(plateforme76);
		Plateformes.ajouter(plateforme77);
		Plateformes.ajouter(plateforme78);
		Plateformes.ajouter(plateforme79);
		Plateformes.ajouter(plateforme80);
		Plateformes.ajouter(plateforme81);
		Plateformes.ajouter(plateforme82);
		Plateformes.ajouter(plateforme83);
		Plateformes.ajouter(plateforme84);
		Plateformes.ajouter(plateforme85);
		Plateformes.ajouter(plateforme86);
		Plateformes.ajouter(plateforme87);
		Plateformes.ajouter(plateforme88);
		Plateformes.ajouter(plateforme89);
		Plateformes.ajouter(plateforme90);
		Plateformes.ajouter(plateforme91);
		Plateformes.ajouter(plateforme92);
		Plateformes.ajouter(plateforme93);
		Plateformes.ajouter(plateforme94);
		Plateformes.ajouter(plateforme95);
		Plateformes.ajouter(plateforme96);
		Plateformes.ajouter(plateforme97);
		Plateformes.ajouter(plateforme98);
		Plateformes.ajouter(plateforme99);
		Plateformes.ajouter(plateforme100);
		Plateformes.ajouter(plateforme101);
		Plateformes.ajouter(plateforme102);
		Plateformes.ajouter(plateforme103);
		Plateformes.ajouter(plateforme104);
		Plateformes.ajouter(plateforme105);
		Plateformes.ajouter(plateforme106);
		Plateformes.ajouter(plateforme107);
		Plateformes.ajouter(plateforme108);
		Plateformes.ajouter(plateforme109);
		Plateformes.ajouter(plateforme110);
		Plateformes.ajouter(plateforme111);
		Plateformes.ajouter(plateforme112);
		Plateformes.ajouter(plateforme113);
		Plateformes.ajouter(plateforme114);
		Plateformes.ajouter(plateforme115);
		Plateformes.ajouter(plateforme116);
		Plateformes.ajouter(plateforme117);
		Plateformes.ajouter(plateforme118);
		Plateformes.ajouter(plateforme119);
		Plateformes.ajouter(plateforme120);
		Plateformes.ajouter(plateforme121);
		Plateformes.ajouter(plateforme122);
		Plateformes.ajouter(plateforme123);
		Plateformes.ajouter(plateforme124);
		Plateformes.ajouter(plateforme125);
		Plateformes.ajouter(plateforme126);
		Plateformes.ajouter(plateforme127);
		Plateformes.ajouter(plateforme128);
		Plateformes.ajouter(plateforme129);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// condition qui permet que le jeu marche tant qu'il n'a pas atteint le portail
		// fin
		if (!gagner.gagnant(cube.getX())) {
			// condition qui permet qui pemet de faire marcher le jeu tant que le personnage
			// est en vie
			if (!gameOver) {
				cube.timer(delta);
				Map.acceleration();
				cube.gravite(delta);
				sol.acceleration();
				gagner.acceleration();
				piece.acceleration();
				piece2.acceleration();
				piece3.acceleration();
				Triangles.AccelerationTriangles(Triangle.getNombreTriangles());
				Plateformes.accelerationPlateforme(Plateforme.getnplateformes());
				musique.joue();
				sol.solfin();
				Map.finmap();
				compteur.temps(delta);
				perdu.acceleration();

				Input inp = container.getInput();
				// Permet de réaliser le saut
				if (inp.isKeyPressed(Input.KEY_SPACE) && cube.isSautdispo()) {
					cube.saut(container.getGraphics(), container);
					compteur.ajouterSaut();
				}
				// collision avec tout les triangles
				if (Triangles.CollisonTriangles(Triangle.getNombreTriangles(), cube.getX(), cube.getY())) {
					//gameOver = true;
				}
				// collison avec toutes les plateformes
				if (Plateformes.CollisionBasPlateformes(Plateforme.getnplateformes(), cube.getX(), cube.getY())) {
					//gameOver = true;
				}
				// collision avec toutes les olateformes
				if (Plateformes.CollisionGauchePlateformes(Plateforme.getnplateformes(), cube.getX(), cube.getY())) {
					//gameOver = true;
				}
				// permet de reset le saut
				if (cube.getY() + 50 >= sol.getY()) {
					cube.setSautdispo(true);
				}
				// permet de reset le saut
				if (Plateformes.CollisionHautPlateformes(Plateforme.getnplateformes(), cube.getX(), cube.getY())) {
					cube.setTimer(0);
					cube.setSautdispo(true);

				}
				// collision avec toutes les pieces
				if (piece.colision(cube.getX(), cube.getY()) && piece.isVie()) {
					piece.setVie(false);
					compteur.ajouterPiece();
				}
				if (piece2.colision(cube.getX(), cube.getY()) && piece2.isVie()) {
					piece2.setVie(false);
					compteur.ajouterPiece();
				}
				if (piece3.colision(cube.getX(), cube.getY()) && piece3.isVie()) {
					piece3.setVie(false);
					compteur.ajouterPiece();
				}
			}
			// condition qui permet de relancer le jeu en cas de defaite
			Input inp = container.getInput();
			if (inp.isKeyPressed(Input.KEY_ENTER)) {
				gameOver = false;
				Map.setX(Map.getXstart());
				Plateformes.replcerPlateformes(Plateforme.getnplateformes());
				;
				Triangles.ReplacerTriangles(Triangle.getNombreTriangles());
				sol.setX(sol.getX_start());
				sol.setY(sol.getY_start());
				gagner.replacer();
				piece.replacer();
				piece2.replacer();
				piece3.replacer();
				perdu.replacer();
				compteur.ajouterMort();
				compteur.reset();
			}

		}
	}
}
