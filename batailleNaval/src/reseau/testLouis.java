/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import bataillenaval.Affichage;
import bataillenaval.Plateau;
import bataillenaval.constantes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lalleaul
 */
public class testLouis {

    public static void main(String[] args) throws IOException {
        FileManager fM = new FileManager();
        String name = fM.createNewGame();
        System.out.println(fM.getUpdateTime());
        fM.writeUser();
        System.out.println("C'est mon tour?" + fM.isMyTurn());
        System.out.println("On continue?");
        Scanner scanner = new Scanner(System.in);
        String nomFichier = scanner.nextLine();
        System.out.println(fM.getUpdateTime());
        System.out.println("C'est mon tour?" + fM.isMyTurn());
        System.out.println("Nom de fichier : ");
        scanner = new Scanner(System.in);
        nomFichier = scanner.nextLine();
        fM.joinGame();

    }
}
