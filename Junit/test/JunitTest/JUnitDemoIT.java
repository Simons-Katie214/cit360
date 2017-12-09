/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author klsim
 */
public class JUnitDemoIT {
    
    public JUnitDemoIT() {
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
     * Test of trueTest method, of class JUnitDemo.
     */
    @Test
    public void testEvenTest() {
        JUnitDemo asft = new JUnitDemo();
        assertTrue(asft.evenTest(4));
    }

    
    @Test
    public void testOddTest(){
        JUnitDemo asft = new JUnitDemo();
        assertFalse(asft.oddTest(3));
    }
}
