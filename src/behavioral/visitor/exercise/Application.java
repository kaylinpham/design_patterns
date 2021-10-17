package behavioral.visitor.exercise;

import java.util.LinkedList;
import java.util.List;

public class Application {
    private List<File> files = new LinkedList<>();

    public void addPlugin(File file) {
        files.add(file);
    }

    public void execute(Plugin plugin) {
        for (var file : files) file.execute(plugin);
    }
}
