package bataillenaval;

public class JeuLocal {
	

	private Plateau plat;
	private Affichage aff;
	private int tourJoueur;
	private Jeu jeu;
	
	public void lancerPartie(){

		jeu=new Jeu();
		
		//afhicherPlateau
		plat=new Plateau();
		aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());
		aff.affichagePlateau(0);

		tourJoueur=0;
		System.out.println("Au tour du joueur 1 de placer ses bateaux !");
		jeu.choixBateauAPlacer(tourJoueur);	
		System.out.println("Au tour du joueur 2 de placer ses bateaux !");
		tourJoueur=(tourJoueur++)%2;
		jeu.choixBateauAPlacer(tourJoueur);


		//J1 joue (annonce touche coule)
		new ToucheCoule(plat, aff).Attaque(tourJoueur);
                
		//test partie fini et annonce gagnant
		//J2 joue ---------------------
		//test partie fini et annonce gagnant

		//retour menu

	}
}
