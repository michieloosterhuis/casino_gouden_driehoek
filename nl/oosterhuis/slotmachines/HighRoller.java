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
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return null;
    }
}
