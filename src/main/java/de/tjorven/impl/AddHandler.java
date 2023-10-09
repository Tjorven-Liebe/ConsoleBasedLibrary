package de.tjorven.impl;

import de.tjorven.Main;
import de.tjorven.model.Document;
import de.tjorven.model.Handler;
import de.tjorven.util.Register;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddHandler extends Handler {

    public AddHandler(Register register) {
        super(register, "add");
    }

    @Override
    public void run(String text, String label, String[] args) {
        if (!(args.length >= 3)) {
            System.err.println("Syntax: add <title> <body> <labels..>");
            return;
        }
        Main.library.add(args[0], new Document(args[0], args[1]));
    }
}
