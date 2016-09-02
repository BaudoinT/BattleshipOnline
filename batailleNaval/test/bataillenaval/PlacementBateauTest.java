package bataillenaval;

import org.junit.Test;
import static org.junit.Assert.*;


public class PlacementBateauTest {
    

    @Test
    public void test_placement_dun_bateau_de_3() {
        Plateau p = new Plateau();
        Bateau bat3 = new Bateau(3);
        p.getplateauJ1()[1][1].addBateau(bat3);
        p.getplateauJ1()[1][2].addBateau(bat3);
        p.getplateauJ1()[1][3].addBateau(bat3);
        assertTrue(p.getplateauJ1()[1][1].hasBateau());
        assertTrue(p.getplateauJ1()[1][2].hasBateau());
        assertTrue(p.getplateauJ1()[1][2].hasBateau());
        
    }
    
}
