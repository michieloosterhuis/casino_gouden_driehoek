package nl.oosterhuis.slotmachines;

public class HighRoller extends SlotMachine {

    // constructor
    public HighRoller() {
        super(3, "HighRoller");
    }

    // methods
    @Override
    public int getRollPrice() {
        return 10;
    }

    @Override
    public int calculatePayout() {
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.HEART)) {
            return 50;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.CLUB)) {
            return 50;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.SPADE)) {
            return 50;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.STAR)) {
            return 50;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.YINYANG)) {
            return 50;
        }
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return "\n3 x " + Symbol.HEART + " = 50 tokens" +
        "\n3 x " + Symbol.CLUB + " = 50 tokens" +
        "\n3 x " + Symbol.SPADE + " = 50 tokens" +
        "\n3 x " + Symbol.STAR + " = 50 tokens" +
        "\n3 x " + Symbol.YINYANG + " = 50 tokens";
    }
}
