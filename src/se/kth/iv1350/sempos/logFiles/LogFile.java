package se.kth.iv1350.sempos.logFiles;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class LogFile {
    private PrintWriter printStream;

    public LogFile(){
        try {
            printStream = new PrintWriter(new FileWriter("printedfile.txt"), true);
        } catch (IOException e) {
            System.out.println("Not possible to Log.");
            e.printStackTrace();
        }
    }

    public void logMessage(String message){
        printStream.println(message);
    }

    public void loggedException(Exception exception){
        StringBuilder messageThatGetsLogged = new StringBuilder();
        messageThatGetsLogged.append(", The thrown Exception: ");
        messageThatGetsLogged.append(exception.getMessage());
        printStream.println(messageThatGetsLogged);
        exception.printStackTrace(printStream);
        printStream.println("\n");
    }
}
