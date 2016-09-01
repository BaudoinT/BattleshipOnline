package bataillenaval;

public class Cellule {

	private boolean toucher, hadBateau=false;
	private Bateau bateau;

	public Cellule(boolean toucher) {
		this.toucher = toucher;
	}

	public Cellule(){
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

	public boolean hasBateau(){
		if(bateau==null)
			return false;
		return true;
	}

	public void addBateau(Bateau b){
		bateau=b;
                hadBateau=true;
	}
        
        public boolean hadBateau(){
            return hadBateau;
        }

}
