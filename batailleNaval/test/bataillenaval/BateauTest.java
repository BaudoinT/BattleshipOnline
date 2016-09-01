package bataillenaval;

import org.junit.Test;
import static org.junit.Assert.*;

public class BateauTest {
    
    @Test
    public void test_vie_du_bateau_2_et_3_avec_setvie() {
        Bateau bat = new Bateau(2);
        assertEquals(bat.getVie(), 2);
        bat.setVie(3);
        assertEquals(bat.getVie(), 3);
    }
    
    @Test
    public void test_perte_de_vie_du_bateau(){
        Bateau bat = new Bateau(3);
        bat.setVie(bat.getVie() - 1);
        assertEquals(bat.getVie(), 2);
    }
    
}
