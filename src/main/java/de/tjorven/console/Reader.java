package de.tjorven.console;

import de.tjorven.util.Register;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

    public Reader(Register register) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            String[] args = text.split(" ");
            String label = args[0];
            String[] regex = getRegex(text);
            regex = Arrays.copyOfRange(regex, 1, regex.length);
            if (register.get(label) != null)
                register.get(label).run(text, label, regex);
        }
    }

    private String[] getRegex(String text) {
        Pattern pattern = Pattern.compile("\"(?:\\.|(\\\\\\\")|[^\\\"\"\\n])*\"|(\\w)*");
        Matcher matcher = pattern.matcher(text);
        List<String> args = new LinkedList<>();
        while (matcher.find()) {
            args.add(matcher.group(0).replace("\"", ""));
        }
        args.removeIf(String::isEmpty);
        return args.toArray(new String[0]);
    }
}
