package bataillenaval;

import java.util.Scanner;

import reseau.FileManager;

public class Saisir {
	int l;
	int c;
	public String gameName = "";
	public FileManager fileManager = new FileManager();

	public String MaSaisie() {
		Scanner zoneSaisie = new Scanner(System.in);
		String choix=zoneSaisie.nextLine().toLowerCase();
		if(choix.equals("aide")){
			System.out.println(constantes.HELP);
			return "";
		}else if (choix.equals("abandon")){
			System.out.println("Vous avez abandoné");
			fileManager.delete(gameName);
			return "";
		}else{
			return choix;
		}
		
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
		do{
			choix = MaSaisie();
			if ((choix.charAt(0) >= '1' && choix.charAt(0) <= caracMax.charAt(0)) && choix.length() == 1) {
				return Integer.parseInt(choix);
			}
			System.out.println("L'entrée saisie est invalide !");
		}while(true);
	}
	
        public int menu(){
            String choix;
		do{
			choix = MaSaisie();
			if (choix.equals("Jouer")) {
                            return 1;
			}else if (choix.equals("Reprendre")) {
                            return 2;
			}else if (choix.equals("Abandon")) {
                            return 3;
			}else if (choix.equals("Aide")) {
                            return 4;
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
