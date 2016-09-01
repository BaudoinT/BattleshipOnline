/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bataillenaval;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gerardc
 */
public class BateauTest {
    
    public BateauTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bateauCoule method, of class Bateau.
     */
    @Test
    public void testBateauCoule() {
        System.out.println("bateauCoule");
        Bateau instance = null;
        boolean expResult = false;
        boolean result = instance.bateauCoule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bateauTouche method, of class Bateau.
     */
    @Test
    public void testBateauTouche() {
        System.out.println("bateauTouche");
        int x = 0;
        int y = 0;
        Bateau instance = null;
        instance.bateauTouche(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
