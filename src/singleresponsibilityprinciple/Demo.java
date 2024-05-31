package singleresponsibilityprinciple;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        Journal journal = new Journal();
        journal.addEntry("I ate breakfast today.", Journal.Category.PERSONAL);
        journal.addEntry("I wrote a java program.", Journal.Category.WORK);
        System.out.println(journal);

        // Persist the file into journal.txt using the new Persistence class
        Persistence persistence = new Persistence();
        String filename = "C:\\temp\\journal.txt";
        persistence.saveToFile(journal, filename, true);

        // Open the saved file using notepad.
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
