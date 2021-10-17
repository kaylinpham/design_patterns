package behavioral.memento;

import behavioral.memento.execise.Document;
import behavioral.memento.execise.DocumentHistory;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

        // DOCUMENT
        var document = new Document();
        var documentHistory = new DocumentHistory();

        document.setContent("haha");
        documentHistory.push(document.createState());

        document.setFontName(20);
        document.setFontSize(16);
        documentHistory.push(document.createState());

        document.setContent("hehe");
        document.restore(documentHistory.pop());
        document.restore(documentHistory.pop());
        System.out.println(document);
    }
}
