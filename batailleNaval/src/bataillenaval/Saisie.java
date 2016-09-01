package bataillenaval;

import static bataillenaval.constantes.HELP;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import reseau.FileManager;

public class Saisie {

	private int l, c;

	public String gameName = "";
	public FileManager fileManager = new FileManager();
	private boolean inGame = false;

	public String MaSaisie() {
		Scanner zoneSaisie = new Scanner(System.in);
		return zoneSaisie.nextLine().toLowerCase();
	}

	public int Choix() {
		String choix = MaSaisie();
		//if (inGame) {
			switch (choix) {
			case "horizontal":
				return 6;
			case "vertical":
				return 7;
			case "help":
				return 4;
			default:
				if ((choix.charAt(0) >= 'a' && choix.charAt(0) <= 'j')
						&& (choix.charAt(1) >= '1' && choix.charAt(1) <= '9')
						&& choix.length() == 2) {
					l = choix.charAt(0)-96;
					c = choix.charAt(1)-48;
					return 5;
				}
			}

		/*} else {
			switch (choix) {
			case "jouer":
				return 1;
			case "reprendre":
				return 2;
			}
		}*/
		return 0;
	}

	public void affiche() {
		int affichagechoix = Choix();
		String toto = "Vous avez choisi ";
		switch (affichagechoix) {
		case 1:
			System.out.println(toto + "de jouer !");
			inGame = true;
			gameName = fileManager.createNewGame();
			//lancement de la partie            
		case 2:
			System.out.println(toto + "de reprendre une partie");
			// montrer les parties sauvegardés
		case 3:
			System.out.println(toto + "d'abandonner");
			System.out.println("Voulez-vous vraiment abandonner et perdre cette partie ?");
			if (MaSaisie() == "oui") {
				System.out.println("Vous avez abandoné");
				fileManager.delete(gameName);
				inGame = false;
			}
		case 4:
			System.out.println(HELP);
		case 5:
			//action de tir

		}
	}

	public int getLigne() {
		return l;
	}

	public int getCol() {
		return c;
	}

}
