/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reseau;

import bataillenaval.Plateau;
import bataillenaval.constantes;
import com.google.gson.GsonBuilder;
import java.io.File;

/**
 * @author lalleaul
 */
public class test {
 public static void main(String[] args){
     FileManager w = new FileManager();
     Plateau p = new Plateau();
     p.initPlateauAvecDesTrucs();
     w.write("testonsGayment", new GsonBuilder().create().toJson(p));
     System.out.println(new File(constantes.PATH + "testonsGayment").lastModified());
     //w.delete("testonsGayment");
 }
}
