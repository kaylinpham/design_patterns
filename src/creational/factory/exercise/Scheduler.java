package creational.factory.exercise;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = createCalender();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }

    protected Calendar createCalender() {
        return new GregorianCalendar();
    }
}
