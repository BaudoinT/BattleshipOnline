/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

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
        FileManager fM = new FileManager();
        Saisir saisie = new Saisir();
        int choix = saisie.choixListe(3);
        if(choix == 1){
             Jeu jeu= new Jeu();
             jeu.lancerPartie();
        }
        else if (choix == 2){
            String gameName = fM.createNewGame();
            //créer plateaux
            //attendre l'autre joueur
            //positionner bateaux
            //Jouer
        }
        else if(choix == 3){
            
        }
       
    }
}
