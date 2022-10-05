package org.example;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    public int compare(Card left, Card right) {
        if (left.getSuit().equals(right.getSuit())) {
            return left.getValue() - right.getValue();
        }
        return left.getSuit().compareTo(right.getSuit());
    }
}
