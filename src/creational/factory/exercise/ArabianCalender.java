package creational.factory.exercise;

import java.util.Date;

public class ArabianCalender implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date(Arabian).");
    }
}
