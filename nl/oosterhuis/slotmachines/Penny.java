package nl.oosterhuis.slotmachines;

public class Penny extends SlotMachine {

    // constructor
    public Penny() {
        super(3, "Penny");
    }

    // methods
    @Override
    public int getRollPrice() {
        return 1;
    }

    @Override
    public int calculatePayout() {
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.HEART)) {
            return 10;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.CLUB)) {
            return 10;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.SPADE)) {
            return 10;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.STAR)) {
            return 10;
        }
        if (this.getReelDeck().allReelsHaveSymbol(Symbol.YINYANG)) {
            return 10;
        }
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return "\n3 x " + Symbol.HEART + " = 10 tokens" +
        "\n3 x " + Symbol.CLUB + " = 10 tokens" +
        "\n3 x " + Symbol.SPADE + " = 10 tokens" +
        "\n3 x " + Symbol.STAR + " = 10 tokens" +
        "\n3 x " + Symbol.YINYANG + " = 10 tokens";
    }
}
