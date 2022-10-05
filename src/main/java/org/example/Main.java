package org.example;

public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.generateCard();
        game.sortDeckInNumberOrder();
        game.getDeck();
        System.out.println("------------");
        game.sortDeckInSuitOrder();
        game.getDeck();
        System.out.println("------------");
        game.shuffleDeck();
        game.getDeck();
    }
}