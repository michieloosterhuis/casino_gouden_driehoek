package nl.oosterhuis;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private int totalValue;

    public Hand() {
        this.cards = new ArrayList<>();
        this.totalValue = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getTotalValue() {
        totalValue = 0;
        for (Card card : cards) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    public String render() {
        String[] renderedCards = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            renderedCards[i] = cards.get(i).render();
        }
        String newLine = System.getProperty("line.separator");
        return String.join(newLine, renderedCards);
    }
}
