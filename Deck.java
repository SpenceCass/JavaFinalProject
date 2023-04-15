package javaFinalProject;

import java.util.List;


import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//deck of cards	
	List<Card> cards = new ArrayList<Card>();
	
	
	//making a deck
	public Deck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
		
		for(String suit : suits) {
			int i = 2;
			for (String name : names) {
				Card card = new Card(name, suit, i);
				this.cards.add(card);
				i++;
			}
		}
	}
	
	
	//methods
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	//shuffling the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//drawing a card
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		}
}