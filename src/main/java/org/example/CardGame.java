package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        System.out.println(deckOfCards);
    }


    public void getDeck() {
        for (Card card: deckOfCards) {
            System.out.println(card);
        }
    }

    public Card dealCard() {
        return deckOfCards.get(0);
    }

    public void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards);
    }

    public void sortDeckInSuitOrder() {
        Comparator.comparing()
    }

    public ArrayList<Card> shuffleDeck() {
        return null;
    }


}
