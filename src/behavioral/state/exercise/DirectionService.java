package behavioral.state.exercise;

public class DirectionService {

    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.calculateEta();
    }

    public Object getDirection() {
        return travelMode.calculateDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

}
