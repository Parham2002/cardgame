package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Snap extends CardGame{
    Random random = new Random();
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

    public boolean hasWon() {
        for (int i = 1; i < cardsOnTable.size(); i++) {
            if (cardsOnTable.get(i).getSymbol().equals(cardsOnTable.get(i-1).getSymbol())) {
                System.out.println("SNAP! You've won!!");
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }
}
