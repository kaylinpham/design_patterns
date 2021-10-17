package structural.flyweight.exercise;

import java.util.LinkedList;
import java.util.List;

public class CellAttributeFactory {
    public static List<CellAttributes> cellAttributesList = new LinkedList<>();

    public static CellAttributes getCellAttributes(String fontName, int fontSize, boolean isBold) {
        var requestAttributes = new CellAttributes(fontName, fontSize, isBold);
        for (var cellAttributes : cellAttributesList)
            if (cellAttributes.equals(requestAttributes)) return cellAttributes;

        cellAttributesList.add(requestAttributes);
        return requestAttributes;
    }
}
