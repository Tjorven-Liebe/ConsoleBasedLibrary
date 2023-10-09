package de.tjorven.model;

import java.util.List;

public class Document {

    private final String title;
    private final String content;
    private final List<String> labels;

    public Document(String title, String content, String... labels) {
        this.title = title;
        this.content = content;
        this.labels = List.of(labels);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<String> getLabels() {
        return labels;
    }
}
