package behavioral.memento.execise;

public class DocumentState {
    private final String content;
    private final int fontName;
    private final int fontSize;

    public DocumentState(String content, int fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public int getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
