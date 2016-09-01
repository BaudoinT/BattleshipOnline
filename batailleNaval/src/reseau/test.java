/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reseau;

import bataillenaval.Plateau;
import com.google.gson.GsonBuilder;

/**
 *
 * @author lalleaul
 */
public class test {
 public static void main(String[] args){
     Writer w = new Writer();
     Plateau p = new Plateau();
     p.initPlateauAvecDesTrucs();
     w.write("testonsGayment", new GsonBuilder().create().toJson(p));
     w.delete("testonsGayment");
 }
}
