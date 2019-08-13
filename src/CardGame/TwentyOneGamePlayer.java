package CardGame;

import java.util.ArrayList;

public class TwentyOneGamePlayer extends Player {

    ArrayList<Card> cards;
    int points = 0;
    
    public TwentyOneGamePlayer(String name) {
        super(name);
    }
    
    public void receive(Card card) throws Exception{
        cards.add((NormalCard)card);
        
        //add more code, validation
    }

}