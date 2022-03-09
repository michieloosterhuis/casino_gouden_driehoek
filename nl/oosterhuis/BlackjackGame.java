package nl.oosterhuis;

import java.util.Scanner;

public class BlackjackGame {

    private Scanner inputScanner;
    private Player player;
    private Player dealer;
    private Deck deck;
    private Player currentPlayer;
    private String move;

    public BlackjackGame() {
        this.inputScanner = new Scanner(System.in);
        this.player = new Player("Player");
        this.dealer = new Player("Dealer");
        this.currentPlayer = player;
        this.deck = new Deck();
    }

    public void playGame() {

        System.out.println("Welkom bij het spel Black Jack!\n");
        player.addCardToHand(deck.getNextCard());
        player.addCardToHand(deck.getNextCard());
        dealer.addCardToHand(deck.getNextCard());

        boolean continuePlaying = true;
        int rounds = 0;
        while (continuePlaying) {

            rounds += 1;
            System.out.println("\n::::::: Speelronde " + rounds + " :::::::\n");
            System.out.println(currentPlayer.getName() + " is aan de beurt.");
            if (!currentPlayer.isStaying()) {
                if (currentPlayer == player) {
                    player.renderHand();
                    move = getMoveFromPlayer();
                    System.out.println("Move: " + move);
                    player.performMove(deck, move);
                    player.renderHand();
                } else {
                    move = getMoveFromDealer(dealer);
                    System.out.println("Move: " + move);
                    dealer.performMove(deck, move);
                }
            }

            if (currentPlayer.isBust() || (player.isStaying() && dealer.isStaying())) {
                renderWinner(player, dealer);
                continuePlaying = false;
            }

            switchPlayer();
        }
    }

    private String getMoveFromPlayer() {
        System.out.print("Hit or Stay? [h/s] ");
        String input = inputScanner.next();
        switch (input) {
            case "h":
                return "hit";
            case "s":
                return "stay";
            default:
                System.out.println("Ongeldige invoer!");
                return getMoveFromPlayer();
        }
    }

    private String getMoveFromDealer(Player dealer) {
        if (dealer.getHandValue() > 17) {
            return "stay";
        } else {
            return "hit";
        }
    }

    private void switchPlayer() {
        if (currentPlayer == player) {
            currentPlayer = dealer;
        } else {
            currentPlayer = player;
        }
    }

    private void renderWinner(Player player, Player dealer) {

        System.out.println("\n----------------------------");

        if (player.isBust()) {
            System.out.println("Player is bust, dealer wins!");
        } else if (dealer.isBust()) {
            System.out.println("Dealer is bust, player wins!");
        } else if (player.getHandValue() > dealer.getHandValue()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

        System.out.println("* Player: " + player.getHandValue());
        System.out.println("* Dealer: " + dealer.getHandValue());
        System.out.println("----------------------------");
    }
}
