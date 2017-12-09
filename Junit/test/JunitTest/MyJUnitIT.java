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
public class MyJUnitIT {
    
    public MyJUnitIT() {
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
     * Test of add method, of class MyJUnit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        MyJUnit instance = new MyJUnit();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);

    }
        
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        String s1 = "150";
        String s2 = "25";
        MyJUnit instance = new MyJUnit();
        int expResult = 125;
        int result = instance.subtract(s1, s2);
        assertEquals(expResult, result);

    }
        
    @Test
    public void testMultuply() {
        System.out.println("multiply");
        String s1 = "15";
        String s2 = "3";
        MyJUnit instance = new MyJUnit();
        int expResult = 45;
        int result = instance.multiply(s1, s2);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testDivide() {
        System.out.println("divide");
        String s1 = "45";
        String s2 = "3";
        MyJUnit instance = new MyJUnit();
        int expResult = 15;
        int result = instance.divide(s1, s2);
        assertEquals(expResult, result);

    }
}
