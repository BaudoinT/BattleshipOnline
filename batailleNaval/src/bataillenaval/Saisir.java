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
			if (choix.length() == 2 && (choix.charAt(0) >= 'a' && choix.charAt(0) <= 'j') && (choix.charAt(1) >= '1' && choix.charAt(1) <= '9') ) {
				l = choix.charAt(0)-97;
				c = choix.charAt(1)-49;
				choixValide=true;
			}
			if(!choixValide){
				System.out.println("Entrée invalide, recommencez !");
			}
		}while(!choixValide);
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
			if (choix.equals("jouer")) {
                            return 1;
			}else if (choix.equals("reprendre")) {
                            return 2;
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
