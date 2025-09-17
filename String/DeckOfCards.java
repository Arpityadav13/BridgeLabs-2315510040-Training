package String;

import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        String[][] playerCards = new String[players][n/players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n/players; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] playerCards = distributeCards(deck, n, players);
        if (playerCards == null) {
            System.out.println("Cards cannot be distributed evenly");
            return;
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (String card : playerCards[i]) {
                System.out.println(card);
            }
        }
    }
}

