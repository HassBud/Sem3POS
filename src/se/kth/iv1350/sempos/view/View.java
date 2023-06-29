package se.kth.iv1350.sempos.view;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.model.*;

import java.util.ArrayList;


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

        scanItem(1,2);
        scanItem(2,3);
        scanItem(3,5);
        scanItem(3,1);

        payment(200);

        receipt();
    }

    private void scanItem(int itemIdentifier, int quantity){
        LatestRegisteredItemDTO saleInfo = contr.registerItem(itemIdentifier, quantity);
        System.out.println("A new item has been registered: ");
        System.out.println("Item: " + saleInfo.getItemDescription());
        System.out.println("Price inc. vat: " + saleInfo.getItemPriceIncVat());
        System.out.println("Total Price: " + String.format("%.2f",saleInfo.getRunningTotalIncVat()));
        System.out.println("Quantity: " + saleInfo.getNumberOfItems());
        System.out.println();
    }

    private void payment(double paymentByCostumer){
        System.out.println("Payment has been registered: ");
        PaymentDTO changeInfo = contr.pay(paymentByCostumer);
        System.out.println("Change back: " + changeInfo.getChange());
        System.out.println("Total amount: " + String.format("%.2f",changeInfo.getTotalPaymentByCostumer()));
        System.out.println();
    }
    private void receipt(){

        Receipt receiptInfo = contr.getReceipt();
        System.out.println("Receipt is created: \n" + "Time/Date: " + receiptInfo.getLocalDateTime());
        System.out.println();
        ArrayList<Item> list = receiptInfo.getRecordsOfItems();
        for (int i = 0; i < list.size(); i++) {
            Item extractedItem = list.get(i);
            String itemName = extractedItem.getItemDTO().getNameOfItem();
            double itemPrice = extractedItem.getItemDTO().getPriceOfItemIncVat();
            int itemQuantity = extractedItem.getNumberOfItems();
            System.out.println("Item:  " + itemName + "         Price: " + itemPrice + ":-     " + "        Quantity: " + itemQuantity );
        }

        System.out.println("Running Total:                      " + receiptInfo.getTotalAmountOfSaleIncVAT());
        System.out.println("Total Vat:                          " + String.format("%.2f",receiptInfo.getTotalVat()));
        System.out.println("Amount payed by costumer:           " + receiptInfo.getAmountPayed());
        System.out.println("Change:                             " + String.format("%.2f",receiptInfo.getChangeBack()));

    }

}
