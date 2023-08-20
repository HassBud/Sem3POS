package se.kth.iv1350.sempos.model;

/**
 * Represents the exception that is thrown if an item ID is not in the inventorySystem database
 */
public class InvalidIdentifierOfItemException extends Exception{
    /**
     * The exception that is thrown when an invalid ID is scanned
     * @param exceptionMessage The message that the user sees
     */
    public InvalidIdentifierOfItemException(String exceptionMessage){
        super(exceptionMessage);
    }
}
