package de.tjorven.model;

import de.tjorven.util.Register;

public abstract class Handler {

    private final String command;

    public Handler(Register register, String command) {
        this.command = command;
        register.add(this);
    }

    public String getCommand() {
        return command;
    }

    abstract public void run(String text, String label, String[] args);

}
