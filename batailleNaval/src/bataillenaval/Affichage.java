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
	private ArrayList<Cellule[][]> plateaux = new ArrayList<>();

	public Affichage(Cellule[][] plateauJ1, Cellule[][] plateauJ2) {
		plateaux.add(plateauJ1);
		plateaux.add(plateauJ2);
	}

	public void affichagePlateau(int tour) {

        System.out.println("\n\nPlateau du joueur adverse");

		this.affichageHautPlateau();


		for (int i = 0; i < 10; i++) {

			System.out.print("| " + ((char) (65 + i)) + " ");

			System.out.print("|\u001B[30;40m");
			for (int x = 0; x < 9; x++) {
				if (plateaux.get(1-tour)[i][x].isToucher() && plateaux.get(1-tour)[i][x].hasBateau()) {
					System.out.print("\u001B[30;41m   \u001B[30;44m|");
				} else if (plateaux.get(1-tour)[i][x].isToucher()) {
					System.out.print("\u001B[30;47m   \u001B[30;44m|");
				} else {
					System.out.print("\u001B[30;44m   |");
				}

			}
			if (plateaux.get(1-tour)[i][9].isToucher() && plateaux.get(1-tour)[i][9].hasBateau()) {
				System.out.print("\u001B[30;41m   \u001B[30;44m|\u001B[30;47m");
			}else if (plateaux.get(1-tour)[i][9].isToucher()) {
				System.out.print("\u001B[30;47m   \u001B[30;44m|\u001B[30;47m");
			} else {
				System.out.print("   |\u001B[30;47m");
			}

			System.out.print("\n|___|");

			for (int j = 0; j < 10; j++) {
				if (plateaux.get(1-tour)[i][j].isToucher() && plateaux.get(1-tour)[i][j].hasBateau()) {
					System.out.print("\u001B[30;41m___\u001B[30;44m|");
				}else if (plateaux.get(1-tour)[i][j].isToucher()) {
					System.out.print("\u001B[30;47m___\u001B[30;44m|");
				} else {
					System.out.print("\u001B[30;44m___|");
				}
			}
			System.out.println("\u001B[30;47m");
		}
		
        System.out.println("\nVotre plateau");
        this.affichageHautPlateau();
        for (int i = 0; i < 10; i++) {

			System.out.print("| " + ((char) (65 + i)) + " ");

            System.out.print("|\u001B[30;40m");
            for (int x = 0; x < 9; x++) {
                if (plateaux.get(tour)[i][x].bateauCoule()) {
                    System.out.print("\u001B[30;42m   \u001B[30;44m|");
                } else if (plateaux.get(tour)[i][x].isToucher() && plateaux.get(tour)[i][x].hasBateau()) {
                    System.out.print("\u001B[30;41m   \u001B[30;44m|");
                } else if (plateaux.get(tour)[i][x].hasBateau()) {
                    System.out.print("\u001B[30;43m   \u001B[30;44m|");
                } else if (plateaux.get(tour)[i][x].isToucher()) {
                    System.out.print("\u001B[30;47m   \u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m   |");
                }



            }
            if (plateaux.get(tour)[i][9].bateauCoule()) {
                System.out.print("\u001B[30;42m   \u001B[30;44m|\u001B[30;47m");
            } else if (plateaux.get(tour)[i][9].isToucher() && plateaux.get(tour)[i][9].hasBateau()) {
                System.out.print("\u001B[30;41m   \u001B[30;44m|\u001B[30;47m");
            } else if (plateaux.get(tour)[i][9].hasBateau()) {
                System.out.print("\u001B[30;43m   \u001B[30;44m|\u001B[30;47m");
            } else if (plateaux.get(tour)[i][9].isToucher()) {
                System.out.print("\u001B[30;47m   \u001B[30;44m|\u001B[30;47m");
            } else {
                System.out.print("   |\u001B[30;47m");
            }

					System.out.print("\n|___|");

            for (int j = 0; j < 10; j++) {
                if (plateaux.get(tour)[i][j].bateauCoule()) {
                    System.out.print("\u001B[30;42m___\u001B[30;44m|");
                } else if (plateaux.get(tour)[i][j].isToucher() && plateaux.get(tour)[i][j].hasBateau()) {
                    System.out.print("\u001B[30;41m___\u001B[30;44m|");
                } else if (plateaux.get(tour)[i][j].hasBateau()) {
                    System.out.print("\u001B[30;43m___\u001B[30;44m|"); 
                } else if (plateaux.get(tour)[i][j].isToucher()) {
                    System.out.print("\u001B[30;47m___\u001B[30;44m|");
                } else {
                    System.out.print("\u001B[30;44m___|");
                }
            }
            System.out.println("\u001B[30;47m");
        }
    }

	private void affichageHautPlateau() {
		for (int j = 0; j < 11; j++) {
			System.out.print(" ___");
		}

		System.out.print("\n|");
		for (int i = 0; i < 11; i++) {
			if (i > 0 && i < 10) {
				System.out.print(i + "  |");
			} else if (i == 10) {
				System.out.print(i + " |");
			} else {
				System.out.print("   |");
			}
		}

		System.out.print("\n|");
		for (int i = 0; i < 11; i++) {

			System.out.print("___|");
		}
		System.out.println();
	}
}
