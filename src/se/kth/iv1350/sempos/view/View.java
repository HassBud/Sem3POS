package se.kth.iv1350.sempos.view;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.model.ItemDTO;
import se.kth.iv1350.sempos.model.Receipt;

/*
 * Placeholder for real view. Contains hardcoded execution with calls to all system operations in the
 * int the controller
 */

public class View {
    private Controller contr;
    /* Creates a new instance
    * @param contr The controller to use for all calls to other layers. */
    public View(Controller contr){
        this.contr = contr;
    }

    /*
     * Preforms a fake sale, by calling all system operations in the controller
     */
    public void runFakeExecution() {
        contr.startSale();
        System.out.println("A new sale has been started.");
        contr.registerItem(1);
        System.out.println("A new item has been registered: " + contr.registerItem(1));


    }



}
