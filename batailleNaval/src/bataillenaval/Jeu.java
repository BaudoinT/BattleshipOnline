package bataillenaval;

public class Jeu {

	private Plateau plat;
	private Affichage aff;
	int tourJoueur;
	
	public void lancerPartie(){

		//afhicherPlateau
		plat=new Plateau();
		aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());
		aff.affichagePlateau(0);

		tourJoueur=0;
		choixBateauAPlacer(tourJoueur);
		tourJoueur=(tourJoueur+1)%2;
		choixBateauAPlacer(tourJoueur);


		//J1 joue (annonce touche coule)
		new ToucheCoule(plat, aff).Attaque(tourJoueur);
                
		//test partie fini et annonce gagnant
		//J2 joue ---------------------
		//test partie fini et annonce gagnant

		//retour menu

	}


	public void choixBateauAPlacer(int tour){
		System.out.println("Au tour du joueur "+tourJoueur+1+" de placer ses bateaux !");

		System.out.println("Vous avez 5 bateaux à placer: ");
		System.out.println("1: Torpilleur (2 cases)");
		System.out.println("2: Contre-torpilleur (3 cases)");
		System.out.println("3: Sous-marin (3 cases)");
		System.out.println("4: Croiseur (4 cases)");
		System.out.println("5: Porte-avion (5 cases)");

		int longueurBat[]=new int[]{2,3,3,4,5};
		String nomBat[]=new String[]{"Torpilleur","Contre-torpilleur","Sous-marin","Croiseur","Porte-avion"};

		for(int i=0; i<longueurBat.length; i++){
			System.out.println("Où voulez-vous placer le "+nomBat[i]+" ("+longueurBat[i]+" cases) ?");
			emplacementBateau(longueurBat[i]);
			aff.affichagePlateau(tour);
		}
	}

	public void emplacementBateau(int longueur){
		Bateau bateau=new Bateau(longueur);
		Saisir s;
		String sens="";
		do{
			System.out.println("Sur quelle case voulez-vous positionner votre bateau ?");
			s = new Saisir();
			s.choixCase();
			System.out.println("Dans sens voulez-vous mettre votre bateau ?(1: Horizontal ou 2: Vertical)");
			int choixSens=s.choixListe(2);
			if(choixSens==1){
				sens="horizontal";
			}else if(choixSens==2){
				sens="vertical";
			}

		}while(!verifEtPlacement(longueur, s.getLigne(), s.getCol(), sens, bateau));



	}

	public boolean verifEtPlacement(int longueur, int posX, int posY, String sens, Bateau bateau){
		if(sens.equals("horizontal")){
			if(posY+longueur <= 10){


				if(tourJoueur==0){
					for(int i=posY; i<posY+longueur; i++){
						if(plat.getplateauJ1()[posX][i].hasBateau()){
							System.out.println("Le bateau ne peut pas être placé ici, recommencez !");
							return false;
						}
					}
					for(int i=posY; i<posY+longueur; i++){
						plat.getplateauJ1()[posX][i].addBateau(bateau);
					}
				}else if(tourJoueur==1){
					for(int i=posY; i<posY+longueur; i++){
						if(plat.getplateauJ2()[posX][i].hasBateau()){
							System.out.println("Le bateau ne peut pas être placé ici, recommencez !");
							return false;
						}
					}
					for(int i=posY; i<posY+longueur; i++){
						plat.getplateauJ2()[posX][i].addBateau(bateau);
					}
				}
				return true;
			}
		}else if (sens.equals("vertical")){
			if(posX+longueur <= 10){	

				if(tourJoueur==0){
					for(int i=posX; i<posX+longueur; i++){
						if(plat.getplateauJ1()[i][posY].hasBateau()){
							return false;
						}
					}
					for(int i=posX; i<posX+longueur; i++){
						plat.getplateauJ1()[i][posY].addBateau(bateau);
					}
				}else if(tourJoueur==1){
					for(int i=posX; i<posX+longueur; i++){
						if(plat.getplateauJ2()[i][posY].hasBateau()){
							return false;
						}
					}
					for(int i=posX; i<posX+longueur; i++){
						plat.getplateauJ2()[i][posY].addBateau(bateau);
					}
				}
				return true;
			}
		}else{
			System.out.println("Cette place n'est pas valide !");
			return false;
		}
		return false;

	}
}
