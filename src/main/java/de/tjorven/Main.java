package de.tjorven;

import de.tjorven.console.Reader;
import de.tjorven.impl.AddHandler;
import de.tjorven.impl.ListHandler;
import de.tjorven.impl.RemoveHandler;
import de.tjorven.impl.StatsHandler;
import de.tjorven.model.Document;
import de.tjorven.util.Register;

import java.io.IOException;
import java.util.List;

public class Main {

    public static Library library;

    public static void main(String[] args) {
        Register register = new Register();
        new Reader(register);
        library = new Library();
    }

}
