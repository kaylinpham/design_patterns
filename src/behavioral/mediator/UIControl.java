package behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new LinkedList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void removeObserver(EventHandler eventHandler) {
        eventHandlers.remove(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers) observer.handle();
    }
}
