package org.example;

import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    Player playerOne = new Player(1);

    public void snapGame() {
        CardGame cardGame = new CardGame();
        System.out.println("Welcome to this game blah blah");
        System.out.print("Press enter to start: ");
        scanner.nextLine();
        cardGame.generateCard();
        cardGame.shuffleDeck();
        while (cardGame.deckOfCards.size() > 0) {
            System.out.println("It's your turn!");
            playerOne.addToPlayerDeck(cardGame.dealCard());
            System.out.println("Your deck contains: " + playerOne.getPlayerDeck());
            System.out.println("Press enter to take another card and end your turn");
            scanner.nextLine();

        }

    }

}
