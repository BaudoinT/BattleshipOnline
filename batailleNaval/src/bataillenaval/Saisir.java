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
                        System.exit(0);
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
			if ((choix.length() == 2 || choix.length() ==  3) && (choix.charAt(0) >= 'a' && choix.charAt(0) <= 'j') && (choix.charAt(1) >= '1' && choix.charAt(1) <= '9') ) {
				l = choix.charAt(0)-97;
                                if(choix.length() == 2){
                                    c = choix.charAt(1)-49;
                                    choixValide=true;
                                }else if (choix.charAt(2) =='0'){
                                    c=9;
                                    choixValide=true;
                                }else{ 
                                    choixValide=false;
                                }
			}
			if(!choixValide && !choix.equals("")){
				System.out.println("Entrée invalide, recommencez !");
			}
		}while(!choixValide);
	}
	
	public int choixListe(int max){
		String choix;
		String caracMax=""+max;
		do{
			choix = MaSaisie();
			if (choix.length() == 1 && (choix.charAt(0) >= '1' && choix.charAt(0) <= caracMax.charAt(0))) {
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
