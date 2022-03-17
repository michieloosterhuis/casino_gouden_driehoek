package nl.oosterhuis.blackjack;

public class Card {

    private CardSuit cardSuit;
    private CardValue cardValue;

    public Card(CardSuit cardSuit, CardValue cardValue) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public String render() {
        return cardSuit.getSymbol() + " " +
                cardValue.getName();
    }

    public int getValue() {
        return cardValue.getValue();
    }
}
