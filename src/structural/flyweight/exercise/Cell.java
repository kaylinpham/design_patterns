package structural.flyweight.exercise;

public class Cell {
    private final int row;
    private final int column;
    private String content;
    private CellAttributes attributes;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAttributes(CellAttributes attributes) {
        this.attributes = attributes;
    }

    public void render() {
        System.out.println("(" + row + ", " + column + "): " + content + " is formated " + attributes);
    }
}
