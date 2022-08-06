package week6CodingPk;

public class Card {

	
	
	
	private int val;
	private String cardName;
	
	public Card(int newVal, String suit) {
		val = newVal;
		
		switch(newVal) {
		case 2: cardName = "Two";
		break;
		case 3: cardName = "Three";
		break;
		case 4: cardName = "Four";
		break;
		case 5: cardName = "Five";
		break;
		case 6: cardName = "Six";
		break;
		case 7: cardName = "Seven";
		break;
		case 8: cardName = "Eight";
		break;
		case 9: cardName = "Nine";
		break;
		case 10: cardName = "Ten";
		break;
		case 11: cardName = "Jack";
		break;
		case 12: cardName = "Queen";
		break;
		case 13: cardName = "King";
		break;
		case 14: cardName = "Ace";
		break;
		
		}
		cardName += " of " + suit;
	}
	public void describe() {
		System.out.printf("Card: %s with value of %d\n", cardName, val);
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public String getName() {
		return cardName;
	}
	public void setName(String cardName) {
		this.cardName = cardName;
	}
	
 }
