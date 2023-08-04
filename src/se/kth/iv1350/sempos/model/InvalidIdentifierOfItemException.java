package se.kth.iv1350.sempos.model;

public class InvalidIdentifierOfItemException extends Exception{
    public InvalidIdentifierOfItemException(){
        super("Item not found. Invalid item ID.");
    }
}
