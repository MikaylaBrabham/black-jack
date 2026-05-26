package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    //add array list
    private ArrayList<Card> cards;
    //add players
    private String playerName;

    //add constructors
    public Hand(String playerName) {
        this.playerName = playerName;
        cards = new ArrayList<>();
    }
//add get and setters
    public String getPlayerName() {
        return playerName;
    }

    public void deal(Card card) {
        card.flip();
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    public int getValue() {
        int total = 0;

        for (Card card : cards) {
            total += card.getPointValue();
        }

        return total;
    }
//add ddisplay logic and display out
    public void displayHand() {
        System.out.println("\n" + playerName + "'s hand:");

        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        System.out.println("Total: " + getValue());
    }
}

