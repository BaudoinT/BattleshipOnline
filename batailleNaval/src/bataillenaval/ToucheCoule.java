/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

import java.util.ArrayList;

public class ToucheCoule {

    private ArrayList<Cellule[][]> plateaux = new ArrayList<>();
    private Saisir saisie;
    private Affichage aff;

    public ToucheCoule(Plateau plateau, Affichage aff) {
        plateaux.add(plateau.getplateauJ1());
        plateaux.add(plateau.getplateauJ2());
        saisie = new Saisir();
        this.aff = aff;
    }

    public void Attaque(int tour) {
        aff.affichagePlateau(tour);
        System.out.println("\nA l'autre joueur !\nChoisis une case a attaquer: ");
        saisie.choixCase();
        if (plateaux.get(1 - tour)[saisie.getLigne()][saisie.getCol()].setToucher()) {
            aff.affichagePlateau(tour);
            System.out.println("Tu as touché!");
            // ajout 
        } else {
            aff.affichagePlateau(tour);
            System.out.println("A l'eau!");
        }
        aff.affichagePlateau(tour);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
        
        } 
        }
    
    

    

    public boolean gagne(int tour) {
        int x = 0, y = 0;
        boolean bateauVivant = false;

        do {
            if (plateaux.get(tour)[x][y].hasBateau() && !plateaux.get(tour)[x][y].bateauCoule()) {
                bateauVivant = true;
            }
            if (x < 10) {
                x++;
            } else {
                x = 0;
                y++;
            }
        } while ((x < 10 && y < 10) && !bateauVivant);
        return bateauVivant;
    }

}
