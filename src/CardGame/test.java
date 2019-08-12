/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author andyt
 */
public class test {
    
    public static void main(String[] args){
        Deck deck = new Deck(52);
        for (int i = 0; i <= 15; i++)
        System.out.println(deck.dealCard());
        System.out.println(deck.getSize());
    }
    
    
}
