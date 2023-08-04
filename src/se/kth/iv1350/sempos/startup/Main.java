package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
import se.kth.iv1350.sempos.Integration.InventorySystem;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.model.InvalidIdentifierOfItemException;
import se.kth.iv1350.sempos.model.Sale;
import se.kth.iv1350.sempos.view.View;

/*
* Starts the application. Contains the main method.
* @param args The application does not take any command line parameters.
* */

/**
 * Represents the main method. Starts the application
 */
public class Main {
    /**
     * The <code>void</code> main method starts the application
     * @param args
     */
    public static void main(String[] args) throws InvalidIdentifierOfItemException, DatabaseFailureException {
        Controller contr = new Controller(new InventorySystem(), new Sale()); // ??? är det korrekt att ha new InventorySystem() och new Sale() i controllern??
        View view = new View(contr); //Ändrar jag till controller ist för contr försvinner typo. Chatgpt blir glad också
        view.runFakeExecution();

        System.out.println();


    }
}
