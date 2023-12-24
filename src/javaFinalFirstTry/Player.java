package javaFinalFirstTry;

public class Player {

	private String name;
	private Deck deck;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Player(String name) {
		super();
		this.name = name;
	}
	
	
}
