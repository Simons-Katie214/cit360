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
public class AnotherJunitTestIT {
    
    public AnotherJunitTestIT() {
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
     * Test of moviesToSee method, of class AnotherJunitTest.
     */
    @Test
    public void testMoviesToSee() {
        System.out.println("moviesToSee");
        AnotherJunitTest instance = new AnotherJunitTest();
        String[] expResult = {"Star Wars", "Zookeepers Wife", "Big Hero6"};
        String[] result = instance.moviesToSee();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of placesToGo method, of class AnotherJunitTest.
     */
    @Test
    public void testPlacesToGo() {
        System.out.println("placesToGo");
        AnotherJunitTest instance = new AnotherJunitTest();
        String[] expResult = {"Korea", "Ireland", "Greece", "Japan", "China"};
        String[] result = instance.placesToGo();
        assertArrayEquals(expResult, result);

    }
    
}
