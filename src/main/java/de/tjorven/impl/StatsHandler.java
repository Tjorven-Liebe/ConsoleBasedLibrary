package de.tjorven.impl;

import de.tjorven.model.Handler;
import de.tjorven.util.Register;

public class StatsHandler extends Handler {

    public StatsHandler(Register register) {
        super(register, "stats");
    }

    @Override
    public void run(String text, String label, String[] args) {
        System.out.println("stats");
    }
}
