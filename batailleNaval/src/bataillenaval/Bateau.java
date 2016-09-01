package bataillenaval;

public class Bateau {
	
	private int nbVie;
	
	public Bateau(int longueur){
		nbVie=longueur;
	}
	
	public void bateauCoule(){
		//afficher message
	}
	
	public void bateauTouche(){
		nbVie--;
		//afficher message
		if(nbVie==0){
			bateauCoule();
		}
	}
}