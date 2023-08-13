package se.kth.iv1350.sempos.model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Prints error message to a file.
 */

public class Log {
    private PrintWriter log;

    public Log() throws IOException {
        log = new PrintWriter(new FileWriter("errorLog.txt"));
    }

    public void loggedError(String errorMessage){
        log.println(errorMessage);
    }
}
