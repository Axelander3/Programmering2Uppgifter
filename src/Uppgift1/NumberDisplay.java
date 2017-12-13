package Uppgift1;

/**
 * Created by alexander on 2017-11-22.
 */
public class NumberDisplay {

    public static void main(String[] args) {
        NumberDisplay display = new NumberDisplay(60);
        
        System.out.println(display.getValue());
        display.setValue(00);
        System.out.println(display.getDisplayValue());
        display.increment();
        System.out.println(display.getDisplayValue());
    }

    private int limit;
    private int value;

    public NumberDisplay(int maxLimit) {
        value = 0;
        this.limit = maxLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (!(newValue < 0 || newValue > limit)) {
            this.value = newValue;
        }
    }

        public String getDisplayValue() {
        if(value < 10) {
            return "0" + value;
        } else {
            return String.valueOf(value);
        }
    }

    public void increment() {
        if (value >= limit) {
            value = 0;
        } else {
            value++;
        }
    }

}
