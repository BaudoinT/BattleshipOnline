/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

import java.util.Scanner;
import reseau.FileManager;

/**
 *
 * @author laffileh
 */
public class ZoneSaisie {

    public String gameName = "";
    public FileManager fileManager = new FileManager();
    private boolean inGame = false;

    public ZoneSaisie() {
        Scanner zoneSaisie = new Scanner(System.in);
        System.out.println("Zone de saisie: ");
        String recup = zoneSaisie.nextLine();

        if (recup.equalsIgnoreCase("help")) {
            System.out.println(constantes.HELP);
        } else if (inGame) {
            if (recup.equalsIgnoreCase("abandon")) {
                System.out.println("Voulez vous abandoner?(oui/non)");
                recup = zoneSaisie.nextLine();
                if (recup.equalsIgnoreCase("oui")) {
                    System.out.println("Vous avez abandoné");
                    fileManager.delete(gameName);
                } else {
                    System.out.println("Retour au jeu"); // a enlever
                    // retour au jeu
                }
            } else if ((recup.charAt(0) >= 'A' && recup.charAt(0) <= 'J')
                    && (recup.charAt(1) >= '1' && recup.charAt(1) <= '9')) {
                //action touché/coulé/a l'eau
            }
        } else {
            //not in game (menu)
            if (recup.equalsIgnoreCase("JOUER")) {
                inGame = true;
                fileManager.createNewGame();
                //lancement de la partie
            } else if (recup.equalsIgnoreCase("CHARGER")) {
                // reprise partie sauvegardée
                System.out.println("Pas encore implémenté");

            } else {
                System.out.println("Ce que vous avez saisi n'est pas valide!");
            }
        }
    }
}
