/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

import java.util.ArrayList;

public class ToucheCoule {
    
    private ArrayList<Cellule[][]> plateaux=new ArrayList<>();
    private Saisir saisie;
    
    public ToucheCoule(Plateau plateau,Affichage aff){
       plateaux.add(plateau.getplateauJ1());
       plateaux.add(plateau.getplateauJ2());
        System.out.println("Choisis une case a attaquer: ");
       
       saisie=new Saisir();
       saisie.choixCase();
       if(plateau.getplateauJ2()[saisie.getLigne()][saisie.getCol()].setToucher()){
           aff.affichagePlateau(0);
           System.out.println("Tu as touché!");
           // ajout 
        } else {
           aff.affichagePlateau(0);
           System.out.println("A l'eau!");
       }
    }
    
    public boolean gagne(int tour){
        int x=0,y=0;
        boolean bateauVivant=false;
        
        do{
           if(plateaux.get(tour)[x][y].hasBateau())
               bateauVivant = true;
           if(x<10)
               x++;
           else{
               x=0;
               y++;
           }   
        }while((x<10 && y<10) || !bateauVivant);
        return false;
    }
    
}
