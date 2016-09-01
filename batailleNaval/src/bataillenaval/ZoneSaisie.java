/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

import java.util.Scanner;

/**
 *
 * @author laffileh
 */
public class ZoneSaisie {
    public static void main(String[] args){
    Scanner zoneSaisie = new Scanner(System.in);
    System.out.println("Zone de saisie: ");
    String recup = zoneSaisie.nextLine();
        if(recup.equals("abandon")){
            System.out.println("Voulez vous abandoner?(oui/non)");
            recup = zoneSaisie.nextLine();
            if(recup.equals("oui")){
                System.out.println("Vous avez abandoné"); //a enlever
                // abandon, destruction du fichier
            }else{
                System.out.println("retour au jeu"); // a enlever
                // retour au jeu
            }
        }
        else if(recup.equals("help")){
            System.out.println("Vous avez ouvert l'aide");//a enlever
            // ouvrir l'aide 
        }
        else if( (recup.charAt(0)>='A' && recup.charAt(0)<='J') 
              && (recup.charAt(1)>='1' && recup.charAt(1)<='9')){
            //action touché/coulé/a l'eau
        }
        else{
            System.out.println("Ce que vous avez saisit n'est pas valide!");
        }
    }   
}
