/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import bataillenaval.Partie;
import bataillenaval.Plateau;
import com.google.gson.GsonBuilder;

/**
 *
 * @author jedrzejw
 */
public class testwil2 {

    public static void main(String[] args) {
        FileManager fM = new FileManager();
        String gameName = fM.createNewGame();
        Plateau plateau = new Plateau();
        plateau.initPlateauAvecDesTrucs();
        Partie p = new Partie(plateau,gameName,"Will","Eude");
        fM.write(gameName, new GsonBuilder().create().toJson(p));
    }
}
