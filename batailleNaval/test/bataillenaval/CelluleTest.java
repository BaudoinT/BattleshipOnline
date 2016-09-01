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
public class CelluleTest {
    
    public CelluleTest() {
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
     * Test of isToucher method, of class Cellule.
     */
    @Test
    public void testIsToucher() {
        System.out.println("isToucher");
        Cellule instance = null;
        boolean expResult = false;
        boolean result = instance.isToucher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setToucher method, of class Cellule.
     */
    @Test
    public void testSetToucher() {
        System.out.println("setToucher");
        boolean toucher = false;
        Cellule instance = null;
        instance.setToucher(toucher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
