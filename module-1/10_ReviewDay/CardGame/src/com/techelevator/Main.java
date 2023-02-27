package com.techelevator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Game game = new Game();
        Deck newDeck = game.getDeck();

        newDeck.shuffle();

        for(int i = 1; i <= 4; i++){
           Card currentCard = newDeck.dealOne();
          System.out.println( Game.getRankName(currentCard.getRank()) + " of " +  Game.getSuitName(currentCard.getSuit()));

        }
    }
}
