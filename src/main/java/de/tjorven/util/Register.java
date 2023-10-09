package de.tjorven.util;

import de.tjorven.model.Handler;
import de.tjorven.impl.AddHandler;
import de.tjorven.impl.ListHandler;
import de.tjorven.impl.RemoveHandler;
import de.tjorven.impl.StatsHandler;

import java.util.HashMap;
import java.util.List;

public class Register {

    private final HashMap<String, Handler> handlers = new HashMap<>();

    public Register() {
        add(new AddHandler(this),
                new ListHandler(this),
                new RemoveHandler(this),
                new StatsHandler(this));
    }

    public Register add(Handler... handlers) {
        for (Handler handler : handlers)
            this.handlers.put(handler.getCommand(), handler);
        return this;
    }

    public boolean isRegistered(String command) {
        return get(command) == null;
    }

    public Handler get(String command) {
        return handlers.get(command);
    }

    public List<Handler> getHandlers() {
        return handlers.values().stream().toList();
    }
}
