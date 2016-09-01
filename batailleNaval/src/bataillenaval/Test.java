package bataillenaval;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {
    /**
     * TEST pour l'envoi d'obj
     * @autor TEAM RESEAU
     * @param args 
     */
    public static void main(String[]args){
        Cellule cell = new Cellule(7, 4);
    String cellTest = new GsonBuilder().create().toJson(cell);
    System.out.print(cellTest);
    }
}
