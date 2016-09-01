package bataillenaval;

public class Bateau {
	
	private int nbVie;
	
	public Bateau(int longueur){
		nbVie=longueur;
	}
	
	public void bateauCoule(){
		//afficher message
	}
        
        public int getVie(){
            return this.nbVie;
        }
        
        public void setVie(int a){
            this.nbVie = a;
        }
	
	public void bateauTouche(){
		nbVie--;
		//afficher message
		if(nbVie==0){
			bateauCoule();
		}
	}
}