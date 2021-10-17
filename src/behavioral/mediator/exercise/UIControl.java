package behavioral.mediator.exercise;

import java.util.LinkedList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new LinkedList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var eventHandler : eventHandlers) eventHandler.handle();
    }
}
