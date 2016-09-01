package bataillenaval;

public class Jeu {

	//afficher plateau
	Plateau plat=new Plateau();
	Affichage aff=new Affichage(plat.getplateauJ1(),plat.getplateauJ2());
	aff.affichagePlateau();

	//Placement bateau J1


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
		ZoneSaisie position;
		ZoneSaisie sens;
		do{
			System.out.println("Sur quelle case voulez-vous positionner votre bateau ?");
			position = new ZoneSaisie();
			System.out.println("Dans sens voulez-vous mettre votre bateau ?(1: Horizontal ou 2: Vertical");
			sens = new ZoneSaisie();

		}while(verifEtPlacement(longueur, position.getSaisie(), sens.getSaisie(), bateau));
		
		

	}

	public boolean verifEtPlacement(int longueur, String position, String sens, Bateau bateau){
		if(sens.equals("horizontal")){
			int chiffre = position.charAt(1);
			if(chiffre-1+longueur <= 10){
				for(int i=position.charAt(1); i<position.charAt(1)+longueur; i++){
					if(plat.getplateauJ1()[position.charAt(0)-64][i].estBateau()){
						return false;
					}
				}
				for(int i=position.charAt(1); i<position.charAt(1)+longueur; i++){
					plat.getplateauJ1()[position.charAt(0)-64][i].addBateau(bateau);
				}
				return true;
			}
		}else if (sens.equals("vertical")){
			int lettre = position.charAt(0)-64;
			if(lettre-1+longueur <= 10){	
				for(int i=position.charAt(0)-64; i<position.charAt(0)-64+longueur; i++){
					if(plat.getplateauJ1()[i][position.charAt(1)].estBateau()){
						return false;
					}
				}
				for(int i=position.charAt(0)-64; i<position.charAt(0)-64+longueur; i++){
					plat.getplateauJ1()[i][position.charAt(1)].addBateau(bateau);
				}
				return true;
			}
		}else{
			System.out.println("Cette place n'est pas valide !");
			return false;
		}

	}

	//Placement bateau J2


	//J1 joue (annonce touche coule)
	//test partie fini et annonce gagnant
	//J2 joue ---------------------
	//test partie fini et annonce gagnant

	//retour menu

}
