package bataillenaval;

import java.util.Scanner;

public class Saisir {
	int l;
	int c;


	public String MaSaisie() {
		Scanner zoneSaisie = new Scanner(System.in);
		return zoneSaisie.nextLine().toLowerCase();
	}

	public void choixCase(){
		String choix;
		boolean choixValide=false;
		do{
			choix= MaSaisie();
			if ((choix.charAt(0) >= 'a' && choix.charAt(0) <= 'j') && (choix.charAt(1) >= '1' && choix.charAt(1) <= '9') && choix.length() == 2) {
				l = choix.charAt(0)-96;
				c = choix.charAt(1)-48;
				choixValide=true;
			}
		}while(choixValide==false);
	}
	
	public int choixListe(int max){
		String choix;
		String caracMax=""+max;
		boolean choixValide=false;
		do{
			choix = MaSaisie();
			if ((choix.charAt(0) >= '1' && choix.charAt(0) <= caracMax.charAt(0)) && choix.length() == 1) {
				return Integer.parseInt(choix);
			}
			System.out.println("L'entrée saisie est invalide !");
		}while(true);
	}
	
	public int getLigne() {
		return l;
	}

	public int getCol() {
		return c;
	}

}
