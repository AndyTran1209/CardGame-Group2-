package CardGame;

public class NormalCard extends Card {

	private String representation;
	private String suit;
        
        public enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS
	}

	public enum Representation {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
		NINE, TEN, JACK, QUEEN, KING
	}

	public NormalCard(String representation, String suit) {
		this.representation = representation;
                this.suit = suit;
	}

	public String toString() {
		return this.representation + " of " + this.suit;
	}

	public String getRep() {
            
            return this.representation;
	}
        
        public String getSuit(){
            return this.suit;
        }
        


}