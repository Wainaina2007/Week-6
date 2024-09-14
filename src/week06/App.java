package week06;

public class App {

	public static void main(String[] args) {
		
		 Deck deck = new Deck();
	        deck.shuffle();

	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        // Deal 52 cards to players or Draw cards
	        for (int i = 0; i < 52; i++) {
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

	        // Play the game or flip cards and compare
	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();

	            System.out.println(player1.getName() + " flips: " + card1.getName());
	            System.out.println(player2.getName() + " flips: " + card2.getName());

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println(player1.getName() + " wins this round.");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println(player2.getName() + " wins this round.");
	            } else {
	                System.out.println("It's a tie! No points awarded.");
	            }
	        }

	        // Determine the winner or Print Score
	        System.out.println("\nFinal Scores:");
	        System.out.println(player1.getName() + ": " + player1.getScore());
	        System.out.println(player2.getName() + ": " + player2.getScore());

	        if (player1.getScore() > player2.getScore()) {
	            System.out.println(player1.getName() + " wins the game!");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println(player2.getName() + " wins the game!");
	        } else {
	            System.out.println("It's a draw!");
	        }

	}

}
