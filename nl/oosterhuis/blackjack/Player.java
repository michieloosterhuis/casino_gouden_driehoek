package nl.oosterhuis.blackjack;

public class Player {

    private Hand hand;
    private boolean isStaying;
    private String name;

    public Player(String name) {
        this.hand = new Hand();
        this.isStaying = false;
        this.name = name;
    }

    public void performMove(Deck deck, String move) {
        switch (move) {
            case "hit":
                addCardToHand(deck.getNextCard());
                break;
            case "stay":
                isStaying = true;
        }
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public boolean isStaying() {
        return isStaying;
    }

    public boolean isBust() {
        if (getHandValue() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public int getHandValue() {
        return hand.getTotalValue();
    }

    public void renderHand() {
        System.out.println(hand.render());
    }

    public String getName() {
        return name;
    }
}
