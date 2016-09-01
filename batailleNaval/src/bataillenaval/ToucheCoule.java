/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

public class ToucheCoule {
    Plateau plateau;
    Saisir saisie;
    public ToucheCoule(Plateau plateau,Affichage aff){
       System.out.println("Choisis une case a attaquer: ");
       this.plateau=plateau;
       saisie=new Saisir();
       saisie.choixCase();
       if(plateau.getplateauJ1()[saisie.getLigne()][saisie.getCol()].setToucher()){
           aff.affichagePlateau(0);
           System.out.println("Tu as touché!");
        } else {
           aff.affichagePlateau(0);
           System.out.println("A l'eau!");
       }
    }
}

