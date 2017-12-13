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

    /**
     * konstruktor för numberdisplay
     *
     * @param maxLimit är det största som nummret som kan visas
     */
    public NumberDisplay(int maxLimit) {
        value = 0;
        this.limit = maxLimit;
    }

    /**
     * returnerar värdet för nummret
     *
     * @return som ett heltal
     */
    public int getValue() {
        return value;
    }

    /**
     * Sätter ett nytt värde på nummret
     *
     * @param newValue det nya värdet som nummret ska vara
     */
    public void setValue(int newValue) {
        if (!(newValue < 0 || newValue > limit)) {
            this.value = newValue;
        }
    }

    /**
     * Gör livet enklare med klockan senare så den alltid är tvåsiffrig
     * @return värdet på nummret som ett tvåsiffrigt
     */
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return String.valueOf(value);
        }
    }

    /**
     * Lägger till ett på displayen
     */
    public void increment() {
        if (value >= limit) {
            value = 0;
        } else {
            value++;
        }
    }

}
