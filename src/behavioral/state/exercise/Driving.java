package behavioral.state.exercise;

public class Driving implements TravelMode {
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
