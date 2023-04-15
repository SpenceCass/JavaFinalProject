package javaFinalProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//intro to War
		System.out.println("Welcome to War!" + "\n");
		
		System.out.println("Here are the rules:");
		System.out.println("Each player will flip over the top card in their deck onto the playing field.");
		System.out.println("The player who's card has a higher value will receive a point.");
		System.out.println("If both players cards are of the same value, the result of that round is a draw.");
		
		
		//instantiate a new deck and two players
		System.out.println("\n" + "Let's start the game. Shuffle the deck and deal the cards!");
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		player1.name = "Jerry";
		player2.name = "Samantha";
		
		//shuffle the deck
		deck.shuffle();
		
		//drawing from the deck
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) { 
			player1.hand.add(deck.draw());
			}
			else {
				player2.hand.add(deck.draw());
			}
		}
		
		System.out.println("The cards have been dealt. Begin!" + "\n");
		
		//flip to compete cards
		for (int i = 1; i < 27; i++) {
			System.out.println("Welcome to round " + i + ". Players flip your cards!");
			Card card1 = new Card();
			card1 = player1.flip();
			card1.describe();
			Card card2 = new Card();
			card2 = player2.flip();
			card2.describe();
			
			if (card1.value > card2.value) {
				player1.incrementScore();
				System.out.println(player1.name + " won this round!");
				
			} else if (card2.value > card1.value) {
				player2.incrementScore();
				System.out.println(player2.name + " won this round!");
				
			} else {
				System.out.println("The result of this round is a draw. Onto the next!");
			}
			
			System.out.println("The current score is:");
			System.out.println(player1.score);
			System.out.println(player2.score);
			System.out.println("\n");
		}
		
		//final score
		System.out.println("\n" + "Time to tally up the score and declare a winner!");
		System.out.println(player1.name + "'s score was " + player1.score);
		System.out.println(player2.name + "'s score was " + player2.score);
		
		if (player1.score > player2.score) {
			System.out.println(player1.name + " is the winner!!!");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " is the winner!!!");
		} else {
			System.out.println("The game ended in a draw :-/ you should play again!!");
		}
		
		
		
	}

}