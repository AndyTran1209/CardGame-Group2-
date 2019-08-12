package CardGame;

import java.util.ArrayList;

/*
Deck class
Used to create a deck of given size. Extends the GroupOfCards class.
Contains the dealCard method, which is used to deal cards to players of a game

@author Andy Tran
*/
public class Deck extends GroupOfCards {
    
    // Assigning deck ArrayList to its superclass arraylist
    ArrayList<Card> deck = super.showCards();
    String suit;
    String rep;

    public Deck(int givenSize) {
        //Will set size and create ArrayList in superclass, which is assigned to the deck ArrayList
        super(givenSize);
        
        populate();
        shuffle();
    }
    
    // dealCard method, which is used to deal cards to players
    public Card dealCard()
    {
        // Getting size of the deck/groupofcards
        int size = getSize();
        //Setting size to one less because one card has to be dealt
        super.setSize(size - 1);
        //Returning and removing card at index 0
        return deck.remove(0);
    }
    
    public void populate(){
        /*
        Adding cards to deck arraylist by using for loop and acessing suit 
        and representation enums from normalcard class
        */
        for (NormalCard.Suit s : NormalCard.Suit.values()){
            for (NormalCard.Representation r : NormalCard.Representation.values()){
                suit = String.valueOf(s);
                rep = String.valueOf(r);
                deck.add(new NormalCard(rep, suit));
            }
        }
    }
    
    public void shuffle(){
        for(int i = 0; i < 30; i++)
            super.shuffle();
    }
    
    public int getSize(){
        return super.getSize();
    }
}