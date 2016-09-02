/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataillenaval;

/**
 * Contient toute les infos d'une parties à transmetre entre les deux clients
 *
 * @author jedrzejw
 */
public class Partie {

    private String nom, user1, user2;
    private Plateau p;

    public Partie(Plateau p, String nom, String u1, String u2) {
        this.p = p;
        this.nom = nom;
        user1 = u1;
        user2 = u2;
    }

}
