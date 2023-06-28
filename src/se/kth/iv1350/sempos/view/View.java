package se.kth.iv1350.sempos.view;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.model.*;

import java.util.Arrays;


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

        scanItem(1);
        scanItem(2);
        scanItem(1);

        payment(200);
        printReceipts();




    }

    private void scanItem(int itemIdentifier){
        LatestRegisteredItemDTO saleInfo = contr.registerItem(itemIdentifier);
        System.out.println("A new item has been registered: ");
        System.out.println("Item: " + saleInfo.getItemDescription());
        System.out.println("Price: " + saleInfo.getItemPrice());
        System.out.println("Total Price: " + String.format("%.2f",saleInfo.getRunningTotalIncVat()));
        System.out.println();
    }

    private void payment(double paymentByCostumer){
        System.out.println("Payment has been registered: ");
        PaymentDTO changeInfo = contr.pay(paymentByCostumer);
        System.out.println("Change back: " + changeInfo.getChange());
        System.out.println("Total amount: " + String.format("%.2f",changeInfo.getTotalPaymentByCostumer()));
        System.out.println();
    }
    private void printReceipts(){

        Receipt receiptInfo = contr.printReceipt();
        System.out.println("Receipt is printed: " + receiptInfo);
    }




}
