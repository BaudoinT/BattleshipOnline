/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import bataillenaval.constantes;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author lalleaul
 */
public class testLouis {
    public static void main(String[] args) {
        FileManager fM = new FileManager();
        fM.createNewGame();
        System.out.println(System.getProperty("user.name"));
    }
}
