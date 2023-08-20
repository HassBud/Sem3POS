package se.kth.iv1350.sempos.logFiles;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Where the information about sales are written
 */
public class LogFile {
    private PrintWriter printStream;

    /**
     * Creates a new instance of the LogFile class. Writes info about sales to a log.
     * Throws an exception if it is not possible to log the info
     */
    public LogFile(){
        try {
            printStream = new PrintWriter(new FileWriter("printedfile.txt"), true);
        } catch (IOException logException) {
            System.out.println("Not possible to Log to File.");
            logException.printStackTrace();
        }
    }

    /**
     * The method <code>loggedException</code> is responsible to log any exceptions that has been thrown
     * @param exception What type of exception that was thrown
     */
    public void loggedException(Exception exception){
        StringBuilder messageThatGetsLogged = new StringBuilder();
        messageThatGetsLogged.append("The thrown Exception: ");
        messageThatGetsLogged.append(exception.getMessage());
        printStream.println(messageThatGetsLogged);
        exception.printStackTrace(printStream);
        printStream.println("\n");
    }
}
