package bataillenaval;

import java.util.ArrayList;

public class Bateau {

	private boolean coule;
	private Cellule[] emplacement;

	public Bateau(int x, int y, String direction, int longueur){
		coule=false;
		emplacement= new Cellule[longueur];
		for(int i=0; i<longueur;i++){
			emplacement[i]=new Cellule(x, y, false);
			if(direction.equals("vertical")){
				y++;
			}else{
				x++;
			}
		}
	}
	
	public boolean bateauCoule(){
		for(int i=0; i<emplacement.length;i++){
			if(!emplacement[i].isToucher()){
				return false;
			}
		}
		return true;
	}
	
	public void bateauTouche(int x, int y){
		for(int i=0; i<emplacement.length;i++){
			if(emplacement[i].getX()==x && emplacement[i].getY()==y){
				emplacement[i].setToucher(true);
			}
		}
	}
	
}
