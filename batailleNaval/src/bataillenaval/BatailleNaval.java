/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

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
        System.out.println("Entrez JOUER pour debuter une nouvelle partie.");
        Saisir saisie = new Saisir();
        if(saisie.menu() == 1){
             Jeu jeu= new Jeu();
             jeu.lancerPartie();
        }

       
    }
}
