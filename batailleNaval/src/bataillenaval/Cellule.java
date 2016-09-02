package bataillenaval;

public class Cellule {

	private boolean toucher;
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

	public boolean setToucher() {
		this.toucher = true;
		if(bateau!=null && !toucher){
			bateau.bateauTouche();
                        return true;
		}
                return false;
	}

	public boolean hasBateau(){
		if(bateau==null)
			return false;
		return true;
	}
        
	public void addBateau(Bateau b){
		bateau=b;
	}
        
        public boolean bateauCoule(){
             if(bateau!=null)
            return bateau.bateauCoule();
             return false;
        }
}
