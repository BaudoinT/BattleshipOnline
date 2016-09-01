/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author jedrzejw
 */
public class ObjetBidonTestGson {
  public static void main(final String[] args) {
    public int[][] tab = new int[10][10];
    final GsonBuilder builder = new GsonBuilder();
    final Gson gson = builder.create();

    final int[] entiers = { 1, 2, 3, 4 };
    System.out.println("entiers -> " + gson.toJson(entiers));
    final int[][] valeurs = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println("valeurs -> " + gson.toJson(valeurs));
    final String[] chaines = { "ab", "cd", "ef" };
    System.out.println("chaines -> " + gson.toJson(chaines));
  }
}
