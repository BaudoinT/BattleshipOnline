package bataillenaval;

public class Jeu {

	Plateau plat;
	//afficher plateau
	public void lancerPartie(){
		plat=new Plateau();
		Affichage aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());
		aff.affichagePlateau(0);

		//Placement bateau J1
	}

	public void choixBateauAPlacer(){
		System.out.println("Vous avez 5 bateaux à placer: ");
		System.out.println("1: Torpilleur (2 cases)");
		System.out.println("2: Contre-torpilleur (3 cases)");
		System.out.println("3: Sous-marin (3 cases)");
		System.out.println("4: Croiseur (4 cases)");
		System.out.println("5: Porte-avion (5 cases)");

		int longueurBat[]=new int[]{2,3,3,4,5};
		String nomBat[]=new String[]{"Torpilleur","Contre-torpilleur","Sous-marin","CroiseurPorte-avion"};

		for(int i=1; i<longueurBat.length; i++){
			System.out.println("Où voulez-vous placer le "+nomBat[i]+" ("+longueurBat[i]+" cases) ?");
			emplacementBateau(longueurBat[i]);
		}
	}

	public void emplacementBateau(int longueur){
		Bateau bateau=new Bateau(longueur);
		Saisie s;
		String position;
		String sens="";
		do{
			System.out.println("Sur quelle case voulez-vous positionner votre bateau ?");
			s = new Saisie();
			s.Choix();
			System.out.println("Dans sens voulez-vous mettre votre bateau ?(1: Horizontal ou 2: Vertical");
			int choixSens=s.Choix();
			if(choixSens==6){
				sens="horizontal";
			}else if(choixSens==7){
				sens="vertical";
			}

		}while(verifEtPlacement(longueur, s.getLigne(), s.getCol(), sens, bateau));



	}

	public boolean verifEtPlacement(int longueur, int posX, int posY, String sens, Bateau bateau){
		if(sens.equals("horizontal")){
			if(posY-1+longueur <= 10){
				for(int i=posY; i<posY+longueur; i++){
					if(plat.getplateauJ1()[posX][i].hasBateau()){
						return false;
					}
				}
				for(int i=posY; i<posY+longueur; i++){
					plat.getplateauJ1()[posX][i].addBateau(bateau);
				}
				return true;
			}
		}else if (sens.equals("vertical")){
			if(posX-1+longueur <= 10){	
				for(int i=posX; i<posX+longueur; i++){
					if(plat.getplateauJ1()[i][posY].hasBateau()){
						return false;
					}
				}
				for(int i=posX; i<posX+longueur; i++){
					plat.getplateauJ1()[i][posY].addBateau(bateau);
				}
				return true;
			}
		}else{
			System.out.println("Cette place n'est pas valide !");
			return false;
		}
		return false;

	}

	//Placement bateau J2


	//J1 joue (annonce touche coule)
	//test partie fini et annonce gagnant
	//J2 joue ---------------------
	//test partie fini et annonce gagnant

	//retour menu

}
