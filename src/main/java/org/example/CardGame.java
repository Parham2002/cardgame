package org.example;

import java.util.ArrayList;

public class CardGame {
    ArrayList<Card> deckOfCards;

    public CardGame(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public void getDeck() {
        for (Card card: deckOfCards) {
            System.out.println(card);
        }
    }
}
