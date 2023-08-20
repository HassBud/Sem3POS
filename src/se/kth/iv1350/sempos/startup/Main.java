package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.Integration.InventorySystem;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.view.View;


/**
 * Represents the main method. Starts the application
 */
public class Main {
    /**
     * The <code>void</code> main method starts the application
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Controller contr = new Controller(new InventorySystem());
        View view = new View(contr);
        view.runFakeExecution();


    }
}
