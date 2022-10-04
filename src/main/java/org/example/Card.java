package org.example;

import java.util.ArrayList;

public class Card {
    private final String[] suit = {"U+2665","U+2663","U+2666","U+2660"};
    private final String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public Card dealCard() {
        return null;
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        return null;
    }

    public ArrayList<Card> shuffleDeck() {
        return null;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
