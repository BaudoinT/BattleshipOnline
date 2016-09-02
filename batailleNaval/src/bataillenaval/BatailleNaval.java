/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

import com.google.gson.GsonBuilder;
import java.util.logging.Level;
import java.util.logging.Logger;
import reseau.FileManager;

/**
 *
 * @author lalleaul
 */
public class BatailleNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println(constantes.HELP);
        System.out.println("Que voulez vous faire ?");
        System.out.println("1: Jouer en partie local");
        System.out.println("2: Jouer en partie online");
        System.out.println("3: Rejoindre une partie online");
        //FileManager fM = new FileManager();
        Saisir saisie = new Saisir();
        int choix = saisie.choixListe(3);
        if (choix == 1) {
            JeuLocal jeulocal = new JeuLocal();
            jeulocal.lancerPartie();

        } else if (choix == 2) {
            Jeu jeu = new Jeu();
            String gameName = jeu.fM.createNewGame();
            while (!jeu.fM.isMyTurn()) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Attente j2");
                } catch (InterruptedException ex) {
                }
            }
            System.out.println("C'est mon tour");
            Plateau plateau = new Plateau();
            Affichage aff = new Affichage(plateau.getplateauJ1(), plateau.getplateauJ2());
            Partie partie = new Partie(plateau, gameName, System.getProperty("user.name"), "");
            aff.affichagePlateau(0);
            System.out.println("Au tour du joueur 1 de placer ses bateaux !");

            int tourJoueur = 0;
            jeu.choixBateauAPlacer(0, plateau, aff);

            jeu.fM.write(gameName, new GsonBuilder().create().toJson(partie));

            System.out.println("Au tour du joueur 2 de placer ses bateaux !");
            while (!jeu.fM.isMyTurn()) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Attente j2");
                } catch (InterruptedException ex) {
                }
            }

            ToucheCoule touche = new ToucheCoule(plateau, aff);
            do {
                aff.affichagePlateau(0);
                touche.Attaque(0);
                jeu.fM.write(gameName, new GsonBuilder().create().toJson(partie));
                
                while (!jeu.fM.isMyTurn()) {
                    try {
                        Thread.sleep(5000);
                        System.out.println("Attente j2");
                    } catch (InterruptedException ex) {
                    }
                }
                aff.affichagePlateau(0);
            } while (touche.gagne(0));

            
            
            
            
        } else if (choix == 3) {
            Jeu jeu = new Jeu();
            jeu.fM.joinGame();
            System.out.println("Au tour du joueur 1 de placer ses bateaux !");
            while (!jeu.fM.isMyTurn()) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Attente j1");
                } catch (InterruptedException ex) {
                }
            }
            Partie partie;
            partie = jeu.fM.read();
            Plateau plateau = partie.getPlateau();
            Affichage aff = new Affichage(plateau.getplateauJ1(), plateau.getplateauJ2());
            String gameName = partie.getName();
            aff.affichagePlateau(1);
            jeu.choixBateauAPlacer(1, plateau, aff);

            jeu.fM.write(gameName, new GsonBuilder().create().toJson(partie));

            ToucheCoule touche = new ToucheCoule(plateau, aff);
            
            do {
                aff.affichagePlateau(1);
                while (!jeu.fM.isMyTurn()) {
                    try {
                        Thread.sleep(5000);
                        System.out.println("Attente j1");
                    } catch (InterruptedException ex) {
                    }
                }
                touche.Attaque(1);
                jeu.fM.write(gameName, new GsonBuilder().create().toJson(partie));
                aff.affichagePlateau(1);
            } while (touche.gagne(1));
        }

    }
}
