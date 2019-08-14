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
public class NormalCardTest {
    
    public NormalCardTest() {
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
    public void testgetValueGood(){
        System.out.println("Good test for getValue");
        NormalCard n = new NormalCard("JACK", "SPADES");
        int exp = 10;
        int result = n.getValue();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testgetValueBad(){
        System.out.println("Bad test for getValue");
        NormalCard n = new NormalCard("", "SPADES");
        int exp = -1;
        int result = n.getValue();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testgetValueBoundary(){
        System.out.println("Good test for getValue");
        NormalCard n = new NormalCard("KING", "SPADES");
        int exp = 10;
        int result = n.getValue();
        assertEquals(exp,result);
        
    }
}
