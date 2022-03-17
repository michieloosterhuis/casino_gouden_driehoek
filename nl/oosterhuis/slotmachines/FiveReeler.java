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
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return null;
    }
}
