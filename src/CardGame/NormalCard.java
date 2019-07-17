package CardGame;

import ca.sheridancollege.project.*;

public class NormalCard extends Card {

	private String representation;
	private String suit;
        
        public enum Suit {
		Spades, Hearts, Diamonds, Clubs
	}

	public enum Representation {
		ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
		NINE, TEN, JACK, QUEEN, KING
	}

	public NormalCard(String representation, String suit) {
		// TODO - implement NormalCard.NormalCard
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement NormalCard.toString
		throw new UnsupportedOperationException();
	}

	public String getValue() {
		// TODO - implement NormalCard.getValue
		throw new UnsupportedOperationException();
	}


}