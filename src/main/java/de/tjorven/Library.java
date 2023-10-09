package de.tjorven;

import de.tjorven.model.Document;

import javax.print.Doc;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Library {

    private final HashMap<String, Document> content = new HashMap<>();

    public void add(String title, Document document) {
        content.put(title, document);
    }

    public void remove(String title) {
        content.remove(title);
    }

    public List<Document> getByLabel(String label) {
        return content.values().stream().map(document -> {
            for (String documentLabel : document.getLabels()) {
                if (Objects.equals(documentLabel, label))
                    return document;
            };
            return null;
        }).toList();
    }

}
