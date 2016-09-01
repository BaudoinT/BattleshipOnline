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
        Plateau plat=new Plateau();
        Affichage aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());

        System.out.println(constantes.HELP);
        System.out.println("Entrez JOUER pour debuter une nouvelle partie.");
        new Saisie();
     
        aff.affichagePlateau(0);
        Jeu jeu= new Jeu();
        jeu.lancerPartie();
    }
}
