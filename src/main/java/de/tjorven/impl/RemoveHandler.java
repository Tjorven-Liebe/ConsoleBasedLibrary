package de.tjorven.impl;

import de.tjorven.model.Handler;
import de.tjorven.util.Register;

public class RemoveHandler extends Handler {

    public RemoveHandler(Register register) {
        super(register, "remove");
    }

    @Override
    public void run(String text, String label, String[] args) {
        System.out.println("remove");
    }
}
