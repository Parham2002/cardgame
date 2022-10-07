package org.example;

import java.util.ArrayList;

public class Player {

    private int playerId;
    private ArrayList<Card> playerDeck = new ArrayList<>();


    public Player(int playerId) {
        this.playerId = playerId;
    }
    public static ArrayList<Player> createPlayer(int numberOfPlayers) {
        ArrayList<Player> playerList = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(i);
            playerList.add(player);
        }
        return playerList;
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



    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }

    public int getPlayerId() {
        return playerId;
    }
}
