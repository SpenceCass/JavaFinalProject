package javaFinalProject;

public class Card {
	
	//fields
	int value;
	String name;
	String suit;
	
	//methods
	public Card() {}
	
	//constructor setting the values of the fields
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe () {
		System.out.println("This card is the " + name + " of " + suit + ". It has a value of " + value + ".");	
	}
	
	
	//getters and setters
	
	//getter
	public String getSuit() {
		return suit;
	}
	
	//setter
	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	//getter
	public int getValue() {
		return value;
	}
	
	
	//setter
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	
}