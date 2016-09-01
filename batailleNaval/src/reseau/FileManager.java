/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import bataillenaval.constantes;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lalleaul, jedrzejw
 */
public class FileManager {

    private String p = constantes.PATH;

    /**
     * Créé un fichier vide nommé par l'utilisateur dnas le dossier public
     *
     * @return
     */
    public String createNewGame() {
        System.out.println("Saisir nom de nouvelle partie : ");
        Scanner scanner = new Scanner(System.in);
        File f= null;
        do {
            String nomPartie = scanner.nextLine();
            f = new File(this.p + nomPartie);
            if (!f.exists()) {
                System.out.println("OK");
                try {
                    PrintWriter writer = new PrintWriter(this.p + nomPartie);
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Erreur lors de la lecture : " + e.getMessage());
                }

                return nomPartie;
            }
            System.out.println("Cette partie existe déjà...");
        }while (f.exists());
        return "";
    }

    /**
     * Ecrit le texte dans le fichier fileName dans le dossier public
     *
     * @param fileName
     * @param texte
     */
    public void write(String fileName, String texte) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(constantes.PATH + fileName);
            writer.print(texte);

        } catch (Exception ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.close();
    }

    /**
     * Supprime le fichier fileName du dossier public
     *
     * @param fileName
     */
    public void delete(String fileName) {
        new File(constantes.PATH + fileName).delete();
    }
}
