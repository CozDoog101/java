package dependencyinjection;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private static final String FILE_NAME = "application.log";

    @Override
    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)) {
            fileWriter.write(message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Could not write to " + FILE_NAME + ": " + e.getMessage());
        }
    }
}
