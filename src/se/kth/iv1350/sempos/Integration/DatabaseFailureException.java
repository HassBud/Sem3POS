package se.kth.iv1350.sempos.Integration;

public class DatabaseFailureException extends Exception{

    public DatabaseFailureException(){
        super("ERROR: Cannot connect to server. Item not registered.");
    }
}
