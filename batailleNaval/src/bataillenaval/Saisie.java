package bataillenaval;

import static bataillenaval.constantes.HELP;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Saisie {
    
    public String MaSaisie(){
        Scanner zoneSaisie = new Scanner(System.in);
         return zoneSaisie.nextLine();
    }
    
    public int Choix(){
        String choix = MaSaisie();
        switch (choix) {
            case "Jouer":
                return 1;
            case "Reprendre":
                return 2;
            case "abandon":
                return 3;
            case "help":
                return 4;
        }
        return 0;
    }
    
    public void affiche(){
        int affichagechoix = Choix();
        String toto = "Vous avez choisi ";
        switch (affichagechoix) {
            case 1 :
                System.out.println(toto + "de jouer !");
                // commencer la partie
            case 2 : 
                System.out.println(toto + "de reprendre une partie");
                // montrer les parties sauvegardés
            case 3 :
                System.out.println(toto + "d'abandonner");
                System.out.println("Voulez-vous vraiment abandonner et perdre cette partie ?");
                if(MaSaisie() == "oui"){
                    // abandon
                }else if(MaSaisie() == "non"){
                    // abandon de l'abandon
                }
            case 4 :
                System.out.println(HELP);
        }
    }
    
    public String caseChoisie(){
        int choix1 = 0;
        int choix2 = 0;
        do{
        choix1 = Integer.parseInt(MaSaisie());
        choix2 = Integer.parseInt(MaSaisie());
        
        }while(0 > choix1 -96 && choix1 -96 > 11 && 0 > choix2 && choix2 > 11);
        
        return (choix1 + "," + choix2);
    }
    
}
