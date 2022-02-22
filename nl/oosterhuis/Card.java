package nl.oosterhuis;

public class Card {

    private CardSuit cardSuit;
    private CardValue cardValue;

    public Card(CardSuit cardSuit, CardValue cardValue) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public String render() {
        return cardSuit.getSymbol() + " " +
                cardSuit.getName() + " " +
                cardValue.getName() + " (" +
                cardValue.getValue() + ")";
    }

    public int getValue() {
        return cardValue.getValue();
    }
}
