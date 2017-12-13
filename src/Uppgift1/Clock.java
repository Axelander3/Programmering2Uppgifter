package Uppgift1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by alexander on 2017-11-22.
 */
public class Clock {

    public static void main(String[] args) {
        Clock c = new Clock();
        System.out.println(c.getTime());
        c.timeTick();
        System.out.println(c.getTime());
        c.timeTick();
        System.out.println(c.getTime());
    }

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    /**
     * Konstruktor för klockan utan parametrar, som sätter klockan på 00:00
     */
    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    /**
     * Konstrukor där du anger tiden på klockan
     *
     * @param hour   vilken timme klockan ska stå på
     * @param minute vilken minut klockan ska stå på
     */
    public Clock(int hour, int minute) {
        hours = new NumberDisplay(24);
        hours.setValue(hour);
        minutes = new NumberDisplay(60);
        minutes.setValue(minute);
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    /**
     * ändrar klockan med +1 minut.
     */
    public void timeTick() {
        minutes.increment();
        uppdateDisplay();

    }

    /**
     * Sätter tiden till den angivna
     *
     * @param hour   Vad det ska vara för timme
     * @param minute Vad det ska vara för minut
     */
    public void setTime(int hour, int minute) {
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }

    /**
     * Skickar tillbaka klockan som en fyrasiffrig display.
     *
     * @return Klockans värde som xx:xx format
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Uppdaterar klockans display med värdet för minut och timme med ett : emellan.
     */
    private void uppdateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

}
