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
        
        public int getValue(){
            switch(this.representation){
                case "ACE": return 1;
                case "TWO": return 2;
                case "THREE": return 3;
                case "FOUR": return 4;
                case "FIVE": return 5;
                case "SIX": return 6;
                case "SEVEN": return 7;
                case "EIGHT": return 8;
                case "NINE": return 9;
                case "TEN": 
                case "JACKS": 
                case "QUEENS": 
                case "KINGS": return 10;
                default: return -1;
            }
        }

}