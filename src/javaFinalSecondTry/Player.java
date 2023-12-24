package javaFinalSecondTry;

public class Player {

	private String name;
	private Deck hand = new Deck();
	private int score = 0;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Deck getHand() {
		return hand;
	}
	public void setHand(Deck hand) {
		this.hand = hand;
	}
	public Player(String name) {
		super();
		this.name = name;
	}	
	public void describe(){
		System.out.println(this.name +" "+ score);
		
		for (Card card : this.hand.getCards()) {
			card.describe();
		}
	}
	public Card flip() {
		return this.hand.draw();
	}
	
	public void draw(Deck deck) {
		this.hand.append(deck.draw());
	}
	public void incrementScore() {
		this.score ++;
	}
}
