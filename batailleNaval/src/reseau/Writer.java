/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau;

import bataillenaval.constantes;
import java.io.File;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jedrzejw
 */
public class Writer {

    public void write(String fileName, String texte) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(constantes.PATH + fileName);
            writer.print(texte);

        } catch (Exception ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.close();
    }

    public void delete(String fileName){
       new File(constantes.PATH + fileName).delete();
    }

}
