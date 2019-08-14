/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andyt
 */
public class TwentyOneGamePlayerTest {
    
    public TwentyOneGamePlayerTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testIsBustedGood(){
        System.out.println("Good test for isBusted");
        TwentyOneGamePlayer p = new TwentyOneGamePlayer("p");
        int set = p.setPoints(22);
        boolean exp = true;
        boolean result = p.isBusted();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testIsBustedBad(){
        System.out.println("Bad test for isBusted");
        TwentyOneGamePlayer p = new TwentyOneGamePlayer("p");
        int set = p.setPoints(10);
        boolean exp = false;
        boolean result = p.isBusted();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testIsBustedBoundary(){
        System.out.println("Boundary test for isBusted");
        TwentyOneGamePlayer p = new TwentyOneGamePlayer("p");
        int set = p.setPoints(21);
        boolean exp = false;
        boolean result = p.isBusted();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testgetPointsGood(){
        System.out.println("Good test for getPoints");
        TwentyOneGamePlayer p = new TwentyOneGamePlayer("p");
        int set = p.setPoints(22);
        int exp = 22;
        int result = p.getPoints();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testreceiveCGood(){
        System.out.println("Good test for receiveC");
        TwentyOneGamePlayer c = new TwentyOneGamePlayer("c");
        int exp = 0;
        int result = c.getPoints();
        assertEquals(exp,result);
        
    }
    
}
