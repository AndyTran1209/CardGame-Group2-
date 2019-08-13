package CardGame;

import java.util.ArrayList;

public class TwentyOneGamePlayer extends Player {

    ArrayList<Card> cards;
    int points = 0;
    
    public TwentyOneGamePlayer(String name) {
        super(name);
    }
    
    public void receive(NormalCard card) throws Exception{
        cards.add(card);
        
        //add more code, validation
    }

}