package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int randomFirstTurn(int numberOfPlayers) {
        return random.nextInt(numberOfPlayers)+1;
    }

    public void snapGame() {
        CardGame cardGame = new CardGame();
        System.out.println("Welcome to this game blah blah");
        System.out.print("Enter the number of players: ");
        int playerNum = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Player> playerList = Player.createPlayer(playerNum);
        cardGame.generateCard();
        cardGame.shuffleDeck();
        System.out.println("Player " + randomFirstTurn(playerNum)+ " goes first!");
        System.out.println(playerList);
        System.out.println();
        while (cardGame.getDeckOfCards().size() > 0) {
//            playerOne.addToPlayerDeck(cardGame.dealCard());
//            System.out.println("Your deck contains: " + playerOne.getPlayerDeck());
//            if (playerOne.hasWon()) {
//                break;
//            }
            System.out.println("Press enter to take another card and end your turn");
            scanner.nextLine();

        }

    }

}
