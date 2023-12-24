package javaFinalFirstTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javaFinalFirstTry.Card.Rank;
import javaFinalFirstTry.Card.Suit;


//create deck
public class Deck {

	private List<Card> cards = new ArrayList<>();
	
	public void shuffle() {
        Collections.shuffle(cards);
	}
	
	public static Deck full() {
		Deck deck = new Deck();
		for (Suit suit: Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.cards.add(new Card(rank,suit));
			}
		}
		
		return deck;
	}
	
//create draw method on deck
	
	public Card draw() {
		if  (Size() == 0) return null;
		Card card = this.cards.remove(0);
		return card;
				
	}
	//append deck
	
	public void append(Deck otherDeck) {
		this.cards.addAll(otherDeck.cards);
		
	}
	//append card
	
	public void append(Card othercard) {
		this.cards.add(othercard);
		
	}
	
	//see last card in deck
	public Card seeLast() {
		return this.cards.get(Size()-1);
	}
	
	//size
	public int Size() {
		return this.cards .size();
	}
}
