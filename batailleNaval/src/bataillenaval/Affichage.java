            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

/**
 *
 * @author collotl
 */
public class Affichage {

    private Cellule[][] plateauJ1;
    private Cellule[][] plateauJ2;

    public Affichage(Cellule[][] plateauJ1, Cellule[][] plateauJ2) {
        this.plateauJ1 = plateauJ1;
        this.plateauJ2 = plateauJ2;
    }

    public void affichagePlateau() {
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
                if (plateauJ1[i][x].hasBateau()) {
                    System.out.print("\u001B[30;43m   \u001B[30;44m|");
                } else if (plateauJ1[i][x].isToucher() && plateauJ1[i][x].hadBateau()) {
                    System.out.print("\u001B[30;41m   \u001B[30;44m|");
                } else if (plateauJ1[i][x].isToucher()) {
                    System.out.print("\u001B[30;47m   \u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m   |");
                }

            }
            if (plateauJ1[i][9].hasBateau()) {
                System.out.print("\u001B[30;43m   \u001B[30;44m|\u001B[30;47m");
            } else if (plateauJ1[i][9].isToucher() && plateauJ1[i][9].hadBateau()) {
                System.out.print("\u001B[30;41m   \u001B[30;44m|\u001B[30;47m");
            }else if (plateauJ1[i][9].isToucher()) {
                System.out.print("\u001B[30;47m   \u001B[30;44m|\u001B[30;47m");
            } else {
                System.out.print("   |\u001B[30;47m");
            }
            System.out.println();
            System.out.print("|");
            System.out.print("___|");
            for (int j = 0; j < 10; j++) {
                if (plateauJ1[i][j].hasBateau()) {
                    System.out.print("\u001B[30;43m___\u001B[30;44m|");
                } else if (plateauJ1[i][j].isToucher() && plateauJ1[i][j].hadBateau()) {
                    System.out.print("\u001B[30;41m___\u001B[30;44m|");
                }else if (plateauJ1[i][j].isToucher()) {
                    System.out.print("\u001B[30;47m___\u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m___|");
                }
            }
            System.out.println("\u001B[30;47m");
        }

    }

}
