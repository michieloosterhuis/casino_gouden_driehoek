package nl.oosterhuis.slotmachines;

import java.util.ArrayList;

public abstract class SlotMachine {

    // instance variables
    private int numberOfReels;
    private String name;
    private ReelDeck reelDeck;

    // constructor
    public SlotMachine(int numberOfReels, String name) {
        this.numberOfReels = numberOfReels;
        this.name = name;
        ArrayList<Reel> reels = new ArrayList<>();
        for (int i = 0; i < numberOfReels; i++) {
            reels.add(new Reel());
        }
        this.reelDeck = new ReelDeck(reels);
    }

    // getters
    public int getNumberOfReels() {
        return numberOfReels;
    }

    public String getName() {
        return name;
    }

    public ReelDeck getReelDeck() {
        return reelDeck;
    }

    // methods
    public void renderIntro() {
        System.out.println("Je speelt op de \"" + name + "\" fruitautomaat.");
        System.out.println(renderWinningConditions());
    }

    public int roll() {
        reelDeck.roll();
        return calculatePayout();
    }

    public String render() {
        return reelDeck.render();
    }

    public abstract int getRollPrice();

    public abstract int calculatePayout();

    public abstract String renderWinningConditions();

}
