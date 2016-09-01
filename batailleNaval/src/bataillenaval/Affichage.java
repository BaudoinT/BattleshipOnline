            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

import java.util.ArrayList;

/**
 *
 * @author collotl
 */
public class Affichage {
    private ArrayList<Cellule[][]> plateaux=new ArrayList<>();

    public Affichage(Cellule[][] plateauJ1, Cellule[][] plateauJ2) {
       plateaux.add(plateauJ1);
       plateaux.add(plateauJ2);
    }

    public void affichagePlateau(int tour) {

        
        for (int j = 0; j < 11; j++) {
            System.out.print(" ___");
        }

        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 11; i++) {
            if (i > 0 && i < 10) {
                System.out.print(i + "  |");
            } else if (i == 10) {
                System.out.print(i + " |");
            } else {
                System.out.print("   |");
            }
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 11; i++) {

            System.out.print("___|");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            System.out.print("| " + ((char) (65 + i)) + " ");

            System.out.print("|\u001B[30;44m");
            for (int x = 0; x < 9; x++) {
                if (plateaux.get(tour)[i][x].hasBateau()) {
                    System.out.print("\u001B[30;43m   \u001B[30;44m|");
                } else if (plateaux.get(tour)[i][x].isToucher() && plateaux.get(tour)[i][x].hadBateau()) {
                    System.out.print("\u001B[30;41m   \u001B[30;44m|");
                } else if (plateaux.get(tour)[i][x].isToucher()) {
                    System.out.print("\u001B[30;47m   \u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m   |");
                }

            }
            if (plateaux.get(tour)[i][9].hasBateau()) {
                System.out.print("\u001B[30;43m   \u001B[30;44m|\u001B[30;47m");
            } else if (plateaux.get(tour)[i][9].isToucher() && plateaux.get(tour)[i][9].hadBateau()) {
                System.out.print("\u001B[30;41m   \u001B[30;44m|\u001B[30;47m");
            }else if (plateaux.get(tour)[i][9].isToucher()) {
                System.out.print("\u001B[30;47m   \u001B[30;44m|\u001B[30;47m");
            } else {
                System.out.print("   |\u001B[30;47m");
            }
            System.out.println();
            System.out.print("|");
            System.out.print("___|");
            for (int j = 0; j < 10; j++) {
                if (plateaux.get(tour)[i][j].hasBateau()) {
                    System.out.print("\u001B[30;43m___\u001B[30;44m|");
                } else if (plateaux.get(tour)[i][j].isToucher() && plateaux.get(tour)[i][j].hadBateau()) {
                    System.out.print("\u001B[30;41m___\u001B[30;44m|");
                }else if (plateaux.get(tour)[i][j].isToucher()) {
                    System.out.print("\u001B[30;47m___\u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m___|");
                }
            }
            System.out.println("\u001B[30;47m");
        }

    }

}
