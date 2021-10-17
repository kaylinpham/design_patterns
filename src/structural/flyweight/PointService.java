package structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(10, 9, iconFactory.getPointIcon(PointType.CAFE)));
        points.add(new Point(18, 10, iconFactory.getPointIcon(PointType.RESTAURANT)));

        return points;
    }
}
