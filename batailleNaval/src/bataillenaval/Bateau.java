package bataillenaval;

public class Bateau {
	
	private int nbVie;
        private boolean coule;
	
	public Bateau(int longueur){
		nbVie=longueur;
	}
	
	public boolean bateauCoule(){
            return coule;
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
			coule = true;
		}
	}
}