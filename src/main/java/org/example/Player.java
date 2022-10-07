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

    public int getPlayerNumber() {
        return playerNumber;
    }

    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }
}
