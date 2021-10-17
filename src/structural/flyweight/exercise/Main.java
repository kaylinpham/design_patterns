package structural.flyweight.exercise;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cell> cells = new LinkedList<>();
        var cell1 = new Cell(10, 9);
        var cell2 = new Cell(18, 10);
        cell1.setContent("Hello World");
        cell1.setAttributes(CellAttributeFactory.getCellAttributes("A", 1, true));
        cell2.setContent("Hehe");
        cell2.setAttributes(CellAttributeFactory.getCellAttributes("A", 1, true));
        cells.add(cell1);
        cells.add(cell2);

        for (var cell : cells) cell.render();
        for (var attributes : CellAttributeFactory.cellAttributesList) System.out.println(attributes);
    }
}
