package org.example;

import java.util.*;

public class Snap extends CardGame{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

//    private int time = 3;
//    Timer timer = new Timer();
//    TimerTask toDo = new TimerTask() {
//        public void run() {
//            if (time > 0) {
//                System.out.println(time);
//                time--;
//            }
//        }
//    };
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

    public boolean canSnap() {
        for (int i = 1; i < cardsOnTable.size(); i++) {
            if (cardsOnTable.get(i).getSymbol().equals(cardsOnTable.get(i - 1).getSymbol())) {
                return true;
            }
        }
        return false;
    }

    public boolean snap() {
            System.out.println("Type 'SNAP' now! You have 3 seconds!");
            long startTime = System.currentTimeMillis();
            if (scanner.nextLine().equalsIgnoreCase("snap")) {
                if (System.currentTimeMillis() - startTime < 3000) {
                    return true;
                } else {
                    System.out.println("You took too long...");
                    return false;
                }
            } else {
                System.out.println("Wrong input.");
            }
            return false;
   }

    public void hasWon(String playerName, boolean win) {
        if (win) {
            System.out.println(playerName + " wins!!!");
        } else {
            System.out.println(playerName + " has failed.");
        }

    }

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }
}
