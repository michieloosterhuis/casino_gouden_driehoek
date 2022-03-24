package nl.oosterhuis.slotmachines;

import java.util.List;

public class ReelDeck {

    // instance variables
    List<Reel> reels;

    // constructor
    public ReelDeck(List<Reel> reels) {
        this.reels = reels;
    }

    // methods
    public void roll() {
        for (Reel reel : reels) {
            reel.roll();
        }
    }

    public String render() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (Reel reel : reels) {
            stringBuilder.append("| ").append(reel.render()).append(" ");
        }
        stringBuilder.append("|");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public boolean allReelsHaveSymbol(Symbol symbol) {
        for (Reel reel : reels) {
            if (reel.getSymbol() != symbol) return false;
        }
        return true;
    }
}