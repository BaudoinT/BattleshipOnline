/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lalleaul
 */
public class FileManager {

    private String p;

    public FileManager(String path) {
        this.p = path;
    }

    public boolean createNewGame() {
        System.out.println("Saisir nom de nouvelle partie : ");
        Scanner scanner = new Scanner(System.in);
        String nomPartie = scanner.nextLine();
        File f = new File(this.p + nomPartie);
        if (!f.exists()) {
            System.out.println("OK");
            try {
                PrintWriter writer = new PrintWriter(this.p + nomPartie);
                writer.close();
            } catch (Exception e) {
                System.out.println("Erreur lors de la lecture : " + e.getMessage());
            }

            return true;
        }

        System.out.println(
                "Cette partie existe déjà...");
        return false;
    }
}
