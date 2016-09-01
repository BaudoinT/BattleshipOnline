import bataillenaval.Cellule;
import static org.junit.Assert.*;

public class TestCellule {
    
    public void test_de_isToucherVrai() {
        Cellule c = new Cellule(true);
	assertTrue(c.isToucher());
		
	}
    public void test_de_istoucherFaux(){
	Cellule c = new Cellule(false);
	assertFalse(c.isToucher());
	}
}
