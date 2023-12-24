package javaFinalFirstTry;

public class Card {
	

	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String getDescription() {
		return this.getSuit().getSymbol()+this.getRank().getSymbol();
	}
	
	public void describe() {
		System.out.print(this.getDescription());
	}
	
	public static enum Suit {
		hearts('\u2665'), diamonds('\u2666'), clubs('\u2663'), spades('\u2660');

		private Suit(char symbol) {
			this.symbol = symbol;
		}

		private char symbol;

		public char getSymbol() {
			return symbol;
		}
	}

	public static enum Rank {
		Ace(14,"A"), 
		King(13,"K"), 
		Queen(12,"Q"), 
		Jack(11,"J"), 
		Ten(10,"10"), 
		Nine(9,"9"), 
		Eight(8,"8"), 
		Seven(7,"7"), 
		Six(6,"6"), 
		Five(5,"5"), 
		Four(4,"4"),
		Three(3,"3"), 
		Two(2,"2");

		public String getSymbol() {
			return symbol;
		}

		private int value;
		private String symbol;
		

		private Rank(int value,String symbol) {
			this.value = value;
			this.symbol = symbol;
		}

		public int getValue() {
			return value;
		}

	}
	
	private Rank rank;
	private Suit suit;
	
	

}
