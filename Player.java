package javaFinalProject;

import java.util.List;
import java.util.ArrayList;

public class Player {

	//fields
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	//methods
	public void describe() {
		System.out.println("This player is " + name + ", the cards in his/her deck are:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	//flip top card
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	//return to deck
	public void draw() {
		Deck deck = new Deck();
		deck.draw();
	}	
	
	//increment score
	public void incrementScore() {
		score = score + 1;
	}
	
}