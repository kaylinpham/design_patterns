package creational.factory.exercise;

public class ArabianScheduler extends Scheduler{
    @Override
    protected Calendar createCalender() {
        return new ArabianCalender();
    }
}
