package CardGame;

import ca.sheridancollege.project.*;
import java.util.ArrayList;

public class Deck extends GroupOfCards {
    
    ArrayList<Card> deck = super.showCards();

    public Deck(int givenSize) {
        super(givenSize);
    }
}