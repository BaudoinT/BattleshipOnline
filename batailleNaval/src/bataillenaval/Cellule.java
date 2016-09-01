package bataillenaval;

public class Cellule {
	
	private int x;
	private int y;
	private boolean toucher = false;
	
	public Cellule(int x, int y, boolean toucher) {
		this.x = x;
		this.y = y;
		this.toucher = toucher;
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
