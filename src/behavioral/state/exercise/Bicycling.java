package behavioral.state.exercise;

public class Bicycling implements TravelMode {
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
