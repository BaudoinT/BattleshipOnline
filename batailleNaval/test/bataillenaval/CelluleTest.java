package bataillenaval;

import org.junit.Test;
import static org.junit.Assert.*;


public class CelluleTest {
    
   @Test
    public void test_de_isToucherVrai() {
        Cellule c = new Cellule(true);
	assertTrue(c.isToucher());

    }
    @Test
    public void test_de_istoucherFaux(){
	Cellule c = new Cellule(false);
	assertFalse(c.isToucher());
    }
}
