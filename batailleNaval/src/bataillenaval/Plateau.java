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
public class Plateau {

    private Cellule [][] plateauJ1 = new Cellule[10][10];
    private Cellule [][] plateauJ2 = new Cellule[10][10];   
    
    private void initPlateauVide(){
        for(int i =0; i<10;i++){
            for(int j=0;j<10;j++){
                plateauJ1[i][j]=new Cellule(i,j);
                plateauJ2[i][j]=new Cellule(i,j);
            }
        }
    }
}
