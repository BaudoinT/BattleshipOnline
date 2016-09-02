package bataillenaval;

public class JeuLocal {
	

	private Plateau plat;
	private Affichage aff;
	private int tourJoueur=0;
	private Jeu jeu;
	
	public void lancerPartie(){

		jeu=new Jeu();
		
		//afhicherPlateau
		plat=new Plateau();
		aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());
		aff.affichagePlateau(0);
		
		System.out.println("Au tour du joueur 1 de placer ses bateaux !");
		jeu.choixBateauAPlacer(tourJoueur);	
		System.out.println("Au tour du joueur 2 de placer ses bateaux !");
		tourJoueur=(tourJoueur++)%2;
		jeu.choixBateauAPlacer(tourJoueur);
                ToucheCoule touche=new ToucheCoule(plat, aff);
                

                do{
		touche.Attaque(tourJoueur);
                tourJoueur=(tourJoueur++)%2;
                }while(!touche.gagne(tourJoueur));

	}
}
