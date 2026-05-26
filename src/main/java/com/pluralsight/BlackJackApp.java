package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {

//add main
    public static void main(String[] args) {
        //add my scanner
        Scanner scanner = new Scanner(System.in);

        //enter players names 1 & 2
        System.out.print("Enter player 1 name: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter player 2 name: ");
        String player2Name = scanner.nextLine();

        //add new deck
        Deck deck = new Deck();
        deck.shuffle();
//
         //add players hand for entered names
        Hand player1 = new Hand(player1Name);
        Hand player2 = new Hand(player2Name);

        // add logic to compare hands
        for (int i = 0; i < 2; i++) {
            player1.deal(deck.deal());
            player2.deal(deck.deal());
        }

        //add user hands for each player
        player1.displayHand();
        player2.displayHand();

        //add users score
        int player1Score = player1.getValue();
        int player2Score = player2.getValue();

        //print winners
        System.out.println("\nWinner:");


        //add logic for blackjack game
        if (player1Score > 21 && player2Score > 21) {
            System.out.println("No winner. Both players busted.");
        } else if (player1Score > 21) {
            System.out.println(player2.getPlayerName());
        } else if (player2Score > 21) {
            System.out.println(player1.getPlayerName());
        } else if (player1Score > player2Score) {
            System.out.println(player1.getPlayerName());
        } else if (player2Score > player1Score) {
            System.out.println(player2.getPlayerName());
        } else {
            System.out.println("Tie.");
        }
    }
}

