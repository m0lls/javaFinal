package javaFinalSecondTry;

public class App {

	// deal
	public static void deal(Player player1, Player player2, Deck deck) {
		deck.shuffle();

		Deck deck1 = new Deck();
		Deck deck2 = new Deck();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

	}

	// play should return a winner of the turn, and then call turn again, then
	// compare deck size to determine who won the game
	public static void play(Player player1, Player player2) {
		deal(player1, player2, Deck.full());
		for (int i =0; i<26; i++) {
			Card card1= player1.flip();
			Card card2= player2.flip();
			if (card1.getRank().getValue()>card2.getRank().getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName()+ " got 1 point");
			
			}else if(card2.getRank().getValue()>card1.getRank().getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName()+ " got 1 point");
			}else {
				System.out.println("There was a tie, no point was awarded.");
			}
			
		}
		
		//final score
		if (player1.getScore()>player2.getScore()){
			System.out.println(player1.getName()+player1.getScore());
		}else if (player2.getScore()>player1.getScore()){
			System.out.println(player2.getName()+player2.getScore());
		}else {
			System.out.println("Draw");
		}
	}

	public static void main(String[] args) {
		Player player1 = new Player("Sam");

		Player player2 = new Player("Alex");


		play(player1, player2);


	}
}
