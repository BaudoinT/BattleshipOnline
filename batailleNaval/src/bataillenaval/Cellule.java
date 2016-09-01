package bataillenaval;

public class Cellule {
	
	int x;
	int y;
	boolean toucher;
	
	public Cellule(int x, int y, boolean toucher) {
		this.x = x;
		this.y = y;
		this.toucher = toucher;
	}

        public Cellule(int x, int y){
            this(x,y,false);
        }
        
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isToucher() {
		return toucher;
	}
	
	public void setToucher(boolean toucher) {
		this.toucher = toucher;
	}
	
}
