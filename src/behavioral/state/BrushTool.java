package behavioral.state;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }
}
