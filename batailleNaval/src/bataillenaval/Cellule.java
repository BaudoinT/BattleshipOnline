package bataillenaval;

public class Cellule {
	
	private boolean toucher = false;
	private Bateau bateau;

	public Cellule(boolean toucher) {

		this.toucher = toucher;
	}

        public Cellule(int x, int y){
            this(false);
        }
	
	public boolean isToucher() {
		return toucher;
	}
	
	public void setToucher(boolean toucher) {
		this.toucher = toucher;
		if(bateau!=null){
			bateau.bateauTouche();
			bateau=null;
		}
	}
	
	public void addBateau(Bateau b){
		bateau=b;
	}
	
}
