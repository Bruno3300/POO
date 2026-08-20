package poo.ads;

public class Counter {
    // Properties
    private int currentValue;

    //Methods
    public void setValue(int value) {
        currentValue = value;
    }

    public void addValue() {
        currentValue++;
    }

    public int getValue() {
        return currentValue;
    }
}
