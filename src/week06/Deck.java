package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	 private List<Card> cards;

	    public Deck() {
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	        for (String suit : suits) {
	            for (int i = 0; i < ranks.length; i++) {
	                cards.add(new Card(i + 2, ranks[i] + " of " + suit));
	            }
	        }
	    }

	    public void shuffle() {
	        Collections.shuffle(cards);
	    }

	    public Card draw() {
	        return cards.remove(0);
	    }
	
}
