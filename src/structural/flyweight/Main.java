package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        var iconFactory = new PointIconFactory();
        var service = new PointService(iconFactory);
        var points = service.getPoints();
        for (var point : points) point.draw();
    }
}
