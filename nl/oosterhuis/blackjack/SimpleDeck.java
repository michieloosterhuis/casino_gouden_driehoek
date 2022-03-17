package nl.oosterhuis.blackjack;

import java.util.Arrays;

public class SimpleDeck extends Deck {

    @Override
    public void initialize() {
        cards.clear();

        for (CardSuit cardSuit : Arrays.copyOfRange(cardSuits, 0, 3)) {
            for (CardValue cardValue : cardValues) {
                if (cardValue.getValue() > 2 && cardValue.getValue() < 6) {
                    cards.add(new Card(cardSuit, cardValue));
                    // System.out.println("Added: " + cardSuit.getSymbol() + " " + cardValue.getValue());
                }
            }
        }
    }
}
