package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Snap extends CardGame{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Card> cardsOnTable = new ArrayList<>();
    Player playerOne = new Player("Parham", 1);
    Player playerTwo = new Player("Josie", 2);
    Player[] listOfPlayers = {playerOne, playerTwo};

    public int randomFirstTurn(int numberOfPlayers) {
        return random.nextInt(numberOfPlayers);
    }

    public int switchTurns(int playerTurn) {
        if (playerTurn == 0) {
            playerTurn = 1;
        } else {
            playerTurn = 0;
        }
        return playerTurn;
    }

    public void addToCardsOnTable(Card card) {
        cardsOnTable.add(card);
        if ( cardsOnTable.size() > 3) {
            cardsOnTable.remove(0);
        }
    }

    public boolean canSnap() {
        for (int i = 1; i < cardsOnTable.size(); i++) {
            if (cardsOnTable.get(i).getSymbol().equals(cardsOnTable.get(i - 1).getSymbol())) {
                return true;
            }
        }
        return false;
    }

    public boolean snap() {
            System.out.println("Snap?");
            if (scanner.nextLine().equalsIgnoreCase("snap")) {
                return true;
            }
            return false;
   }

    public void hasWon(String playerName) {
        System.out.println(playerName + " wins!!!");
    }

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }
}
