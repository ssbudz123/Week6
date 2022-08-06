package week6CodingPk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class Deck {

	
	List<Card> cards = new ArrayList<Card>();
	List<String> suits = Arrays.asList("Clubs", "Spades", "Hearts", "Diamonds");
	
	public Deck() {
		for (int a = 2; a < 15; a++) {
			for (String suit : suits) {
				cards.add(new Card(a, suit));
	}
	}
	}
	public void shuffle()	 {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}
}
