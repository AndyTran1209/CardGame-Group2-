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
public class DeckTest {
    
    public DeckTest() {
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
    public void testpopulateGood(){
        System.out.println("Good test for populate");
        Deck d = new Deck(52);
        int exp = 52;
        int result = d.getSize();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testpopulateBad(){
        System.out.println("Bad test for populate");
        Deck d = new Deck(2);
        int exp = 2;
        int result = d.getSize();
        assertEquals(exp,result);
        
    }
    
    @Test
    public void testpopulateBoundary(){
        System.out.println("Boundary test for populate");
        Deck d = new Deck(0);
        int exp = 0;
        int result = d.getSize();
        assertEquals(exp,result);
        
    }
}
