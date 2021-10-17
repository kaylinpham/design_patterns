package behavioral.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlight-Heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight-Anchor");
    }
}
