package org.example;

import java.util.ArrayList;

public class Player {
    private int playerNumber;
    private ArrayList<Card> playerDeck = new ArrayList<>();

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public ArrayList<Card> addToPlayerDeck(Card card) {
        playerDeck.add(card);
        return playerDeck;
    }

    public boolean hasWon() {
        for (int i = 1; i < playerDeck.size(); i++) {
            if (playerDeck.get(i).getSymbol().equals(playerDeck.get(i-1).getSymbol())) {
                System.out.println("SNAP! You've won!!");
                return true;
            }
        }
        return false;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }
}
