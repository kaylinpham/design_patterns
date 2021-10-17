package structural.flyweight.exercise;

import java.util.Objects;

public class CellAttributes {
    private final String fontName;
    private final int fontSize;
    private final boolean isBold;

    public CellAttributes(String fontName, int fontSize, boolean isBold) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CellAttributes)) return false;
        CellAttributes that = (CellAttributes) o;
        return isBold == that.isBold && Objects.equals(fontName, that.fontName) && fontSize == that.fontSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontName, fontSize, isBold);
    }

    @Override
    public String toString() {
        return "[" + fontName + ", " + fontSize + ", " + (isBold ? "bold" : "not bold") + "]";
    }
}
