package de.tjorven.impl;

import de.tjorven.model.Handler;
import de.tjorven.util.Register;

public class ListHandler extends Handler {

    public ListHandler(Register register) {
        super(register, "list");
    }

    @Override
    public void run(String text, String label, String[] args) {
        System.out.println("list");
    }
}
