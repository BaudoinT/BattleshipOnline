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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lalleaul, jedrzejw
 */
public class FileManager {

    private String p = constantes.PATH;
    private String nameGame;
    private long lastModified;
    private String user;

    public FileManager() {
        this.user = System.getProperty("user.name");

    }

    /**
     * Créé un fichier vide nommé par l'utilisateur dnas le dossier public
     *
     * @return
     */
    public String createNewGame() {
        System.out.println("Saisir nom de nouvelle partie : ");
        Scanner scanner = new Scanner(System.in);
        Path f;
        this.nameGame = scanner.nextLine();
        f = Paths.get(this.p, this.nameGame);
        while (Files.exists(f)) {
            System.out.println("La partie existe déjà...\nSaisir nom de nouvelle partie : ");
            this.nameGame = scanner.nextLine();
            f = Paths.get(this.p, this.nameGame);
        }
        System.out.println("Partie crée");
        try {
            Files.createFile(f);
            Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
            perms.add(PosixFilePermission.OWNER_READ);
            perms.add(PosixFilePermission.OWNER_WRITE);
            perms.add(PosixFilePermission.GROUP_READ);
            perms.add(PosixFilePermission.GROUP_WRITE);
            Files.setPosixFilePermissions(f, perms);
        } catch (Exception e) {
            System.out.println("Erreur lors de la lecture : " + e.getMessage());
        }
        //System.out.println(System.currentTimeMillis());
        this.lastModified = this.getUpdateTime();
        return this.nameGame;
    }

    /**
     * Ecrit le texte dans le fichier fileName dans le dossier public
     * @param fileName
     * @param texte
     */
    public void write(String fileName, String texte) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(constantes.PATH + fileName);
            writer.print(texte);

        } catch (Exception ex) {
            Logger.getLogger(FileManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        writer.close();
        this.lastModified = this.getUpdateTime();
    }

    public void read() {
        Gson gson = new Gson();
        try {
            //TODO : Changer Plateau par objet de la partie
            Plateau plateau = gson.fromJson(new FileReader(constantes.PATH + nameGame), Plateau.class);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : " + e.getMessage());
            
        }
    }

    /**
     * Supprime le fichier fileName du dossier public
     *
     * @param fileName
     */
    public void delete(String fileName) {
        new File(constantes.PATH + fileName).delete();
    }

    public long getUpdateTime() {
        return new File(constantes.PATH + nameGame).lastModified();
    }

    public boolean isMyTurn() {
        return this.lastModified != this.getUpdateTime();
    }

    public void writeUser() {
        this.write(nameGame, this.user);
    }
}
