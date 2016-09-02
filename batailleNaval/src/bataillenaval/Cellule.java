package bataillenaval;

public class Cellule {

    private boolean toucher = false;
    private Bateau bateau;

    public Cellule() {

    }

    public boolean isToucher() {
        return toucher;
    }

    public boolean setToucher() {
        if (bateau != null && !toucher) {
            bateau.bateauTouche();
            this.toucher = true;
            return true;
        }
        this.toucher = true;
        return false;
    }

    public boolean hasBateau() {
        if (bateau == null) {
            return false;
        }
        return true;
    }

    public void addBateau(Bateau b) {
        bateau = b;
    }

    public boolean bateauCoule() {
        if (bateau != null) {
            return bateau.bateauCoule();
        }
        return false;
    }
}
