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

    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        displayString = hours.getDisplayValue() + ":" +  minutes.getDisplayValue();
    }
    public Clock(int hour, int minute){
        hours = new NumberDisplay(24);
        hours.setValue(hour);
        minutes = new NumberDisplay(60);
        minutes.setValue(minute);
        displayString = hours.getDisplayValue() + ":"  + minutes.getDisplayValue();
    }

    public void timeTick() {
        minutes.increment();
        uppdateDisplay();

    }

    public void setTime(int hour, int minute) {
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }

    public String getTime() {
        return displayString;
    }

    private void uppdateDisplay() {
        displayString = hours.getDisplayValue() + ":"  + minutes.getDisplayValue();
    }

}
