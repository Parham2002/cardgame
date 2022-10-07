package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private final String[] suit = {"\u2665","\u2663","\u2666","\u2660"};
    private final String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    ArrayList<Card> deckOfCards = new ArrayList<>();

    public void generateCard() {

        for (String suit: suit) {
            for (int i = 0; i < 13; i++) {
                deckOfCards.add(new Card(suit, symbol[i], value[i]));
            }
        }
    }


    public void getDeck() {
        for (Card card: deckOfCards) {
            System.out.println(card);
        }
    }

    public Card dealCard() {
        Card card = null;
        if (deckOfCards.size() > 0) {
            card = deckOfCards.get(0);
            deckOfCards.remove(0);
        }
        return card;

    }

    public void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards);
    }

    public void sortDeckInSuitOrder() {
        Collections.sort(deckOfCards, new SortBySuit());
    }

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }


}
