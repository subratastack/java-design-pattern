package singleresponsibilityprinciple;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        Journal journal = new Journal();
        journal.addEntry("I ate breakfast today.");
        journal.addEntry("I wrote a java program.");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "C:\\temp\\journal.txt";
        persistence.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
