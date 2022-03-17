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
        return 0;
    }

    @Override
    public String renderWinningConditions() {
        return null;
    }
}
