package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Snap snapGame = new Snap();
        Scanner scanner = new Scanner(System.in);
        CardGame cardGame = new CardGame();
        System.out.println("Welcome to this game blah blah");
        System.out.print("Press enter to start the game: ");
        scanner.nextLine();
        cardGame.generateCard();
        cardGame.shuffleDeck();
        int playerTurn = snapGame.randomFirstTurn(2);
        System.out.println(snapGame.listOfPlayers[playerTurn].getPlayerName() + " goes first!");
        System.out.println();
        while (cardGame.getDeckOfCards().size() > 0) {
            snapGame.addToCardsOnTable(cardGame.dealCard());
            System.out.println(snapGame.getCardsOnTable());

            System.out.println("Press enter to take another card and end your turn");
            scanner.nextLine();

        }
    }

}