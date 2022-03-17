package nl.oosterhuis.blackjack;

public class LowDeck extends Deck {

    @Override
    public void initialize() {
        cards.clear();
        for (CardSuit cardSuit : cardSuits) {
            for (CardValue cardValue : cardValues) {
                cards.add(new Card(cardSuit, cardValue));
                // System.out.println("Added: " + cardSuit.getSymbol() + " " + cardValue.getValue());
            }
        }
    }
}
