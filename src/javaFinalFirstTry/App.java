package javaFinalFirstTry;

public class App {

	// deal
	public static void deal(Player player1, Player player2, Deck deck) {
		deck.shuffle();
		
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();

		while (deck.Size() > 0) {
			deck1.append(deck.draw());
			deck2.append(deck.draw());
		}
		player1.setDeck(deck1);
		player2.setDeck(deck2);
	}

// turn
	public static boolean turn(Player player1, Player player2) {
		Deck battleDeck1 = new Deck();
		Deck battleDeck2 = new Deck();

		battleDeck1.append(player1.getDeck().draw());
		battleDeck2.append(player2.getDeck().draw());
		try {
			System.out.println(player1.getName()+" played "+battleDeck1.seeLast().getSuit().getSymbol()+battleDeck1.seeLast().getRank().getSymbol());
			System.out.println(player2.getName()+" played "+battleDeck2.seeLast().getSuit().getSymbol()+battleDeck2.seeLast().getRank().getSymbol());
		} catch (Exception e) {
		}
		// if tie
		while (battleDeck1.seeLast() != null && battleDeck2.seeLast() != null
				&& battleDeck1.seeLast().getRank().getValue() == battleDeck2.seeLast().getRank().getValue()) {
			System.out.println("***WAR!***");
			for (int i = 0; i < 4; i++) {
				battleDeck1.append(player1.getDeck().draw());
				battleDeck2.append(player2.getDeck().draw());
			}

			try {
				System.out.println(player1.getName()+" played "+battleDeck1.seeLast().getSuit().getSymbol()+battleDeck1.seeLast().getRank().getSymbol());
				System.out.println(player2.getName()+" played "+battleDeck2.seeLast().getSuit().getSymbol()+battleDeck2.seeLast().getRank().getSymbol());
			} catch (Exception e) {
			}
		}
		System.out.println();

		// if no tie
		if (battleDeck1.seeLast() == null || battleDeck2.seeLast() == null) {
			return false;
		} else if (battleDeck1.seeLast().getRank().getValue() > battleDeck2.seeLast().getRank().getValue()) {
			battleDeck1.append(battleDeck2);
			battleDeck1.shuffle();
			player1.getDeck().append(battleDeck1);
			return true;
		} else {
			battleDeck1.append(battleDeck2);
			battleDeck1.shuffle();
			player2.getDeck().append(battleDeck1);
			return true;
		}

	}

	// play should return a winner of the turn, and then call turn again, then
	// compare deck size to determine who won the game
	public static Player play(Player player1, Player player2) {
		deal(player1, player2, Deck.full());
		while (turn(player1, player2)) {
		}

		if (player1.getDeck().Size() == 0) {
			return player2;
		} else {
			return player1;

		}
	}

	public static void main(String[] args) {
		Player player1= new Player("Sam");
		
		Player player2= new Player("Alex");

//		char c = Deck.full().seeLast().getSuit().getSymbol();
		
//win method
		Player winner= play(player1, player2);
		System.out.println(winner.getName()+" won the game!!");
//deal
//play

	}
}
