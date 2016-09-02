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
		
		System.out.println("Au tour du joueur 1 de placer ses bateaux !");
		jeu.choixBateauAPlacer(tourJoueur, plat, aff);	
		System.out.println("Au tour du joueur 2 de placer ses bateaux !");
		tourJoueur=(tourJoueur+1)%2;

		jeu.choixBateauAPlacer(tourJoueur, plat, aff);


		//J1 joue (annonce touche coule)

	
                ToucheCoule touche=new ToucheCoule(plat, aff);

                

                do{
		touche.Attaque(tourJoueur);
                tourJoueur=(tourJoueur+1)%2;
                }while(touche.gagne(tourJoueur));
                System.out.println("Félicitations, le joueur "+(tourJoueur+1)+" à gagné !");

	}
}
