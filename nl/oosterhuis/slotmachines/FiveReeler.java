package nl.oosterhuis.slotmachines;

public class FiveReeler extends SlotMachine {

    // constructor
    public FiveReeler() {
        super(5, "FiveRoller");
    }

    // methods
    @Override
    public int getRollPrice() {
        return 5;
    }

    @Override
    public int calculatePayout() {
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.HEART)) {
            return 100;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.CLUB)) {
            return 100;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.SPADE)) {
            return 100;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.STAR)) {
            return 100;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.YINYANG)) {
            return 100;
        }
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return "\n5 x " + Symbol.HEART + " = 100 tokens" +
        "\n5 x " + Symbol.CLUB + " = 100 tokens" +
        "\n5 x " + Symbol.SPADE + " = 100 tokens" +
        "\n5 x " + Symbol.STAR + " = 100 tokens" +
        "\n5 x " + Symbol.YINYANG + " = 100 tokens";
    }
}
