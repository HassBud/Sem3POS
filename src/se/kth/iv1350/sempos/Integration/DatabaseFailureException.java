package se.kth.iv1350.sempos.Integration;

/**
 * Represents an exception that is thrown if the system cannot connect to the server
 */
public class DatabaseFailureException extends Exception {

    /**
     * The exception used when the system cannot connect to the server
     * @param exceptionMessage The message that the user sees
     */
    public DatabaseFailureException(String exceptionMessage){
        super(exceptionMessage);
    }

}
