package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.Integration.InventorySystem;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.model.Sale;
import se.kth.iv1350.sempos.view.View;

/*
* Starts the application. Contains the main method.
* @param args The application does not take any command line parameters.
* */
public class Main {
    public static void main(String[] args){
        Controller contr = new Controller(new InventorySystem(), new Sale()); // ??? är det korrekt att ha new InventorySystem() och new Sale() i controllern??
        View view = new View(contr);
        view.runFakeExecution();

        System.out.println();





    }
}
