package singleresponsibilityprinciple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private int count = 0;
    private Category category;

    public enum Category {
        PERSONAL, WORK
    }

    public void addEntry(String text, Category category) {
        entries.add((++count) + ": " + category + " - " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
