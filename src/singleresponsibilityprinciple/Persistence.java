package singleresponsibilityprinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {

    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream printStream = new PrintStream(filename)) {
                printStream.println(journal.toString());
            }
        }
    }
}
