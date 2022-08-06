package week6CodingPk;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		Player playerOne = new Player("One");
		Player playerTwo = new Player("Two");
		
		deck.shuffle();
		
	for (int a = 0; a < 52; a++) {
		if (a % 2 == 0) {
			playerOne.draw(deck);
		} else {
			playerTwo.draw(deck);
		}
	}
	for (int a = 0; a < 15; a++) {
		// If I iterate this for loop 26 times, it allows the int to be a value up to 26, which isn't 
		// applicable because the highest value a card can hold in this case is 14, or the ace.
		// Making sure this is set to <15 only allows cards to be pulled within the cases that I've set.
		Card playerOneCard = playerOne.flip();
		Card playerTwoCard = playerTwo.flip();
		if (playerOneCard.getVal() > playerTwoCard.getVal()) {
			playerOne.incrementScore();
		} else if (playerTwoCard.getVal() > playerOneCard.getVal()) {
			playerTwo.incrementScore();
		}
	}
	System.out.printf("PlayerOne score = %d\n", playerOne.getScore());
	System.out.printf("PlayerTwo score = %d\n", playerTwo.getScore());
	
	if (playerOne.getScore() > playerTwo.getScore()) {
		System.out.println("PlayerOne wins this match.");
	} else if (playerTwo.getScore() > playerOne.getScore()) {
		System.out.println("PlayerTwo wins this match.");
	} else {
		System.out.println("This match is a draw.");
	}
	}

}
