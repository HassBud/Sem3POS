package se.kth.iv1350.sempos.view;
//import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
import se.kth.iv1350.sempos.controller.Controller;
import se.kth.iv1350.sempos.logFiles.LogFile;
import se.kth.iv1350.sempos.model.*;
import se.kth.iv1350.sempos.startup.TotalRevenueView;

import java.util.ArrayList;


/*
 * Placeholder for real view. Contains hardcoded execution with calls to all system operations in the
 * int the controller
 */

public class View{
    private Controller contr;
    private LogFile logFile;





    /** Creates a new instance
    * @param contr The controller to use for all calls to other layers.
     */
    public View(Controller contr)  throws Exception {
        this.contr = contr;
        this.logFile = new LogFile();
        contr.addToObserverList(new TotalRevenueView());


    }

    /**
     * The <code>void</code> runFakeExecution method performs a fake sale, by calling all system operations in the controller
     */
    public void runFakeExecution(){

       try {
           contr.startSale();
           System.out.println("A new sale has been started. \n");
           scanItem(5,1);
           scanItem(2, 1);
           scanItem(4, 2);


           payment(200);

           receipt();

       }
       catch (Exception exception){
           logFile.loggedException(exception);
           System.out.println(exception.getMessage());
       }

    }

    /*The item gets scanned and recognized through the parameter itemIdentifier. Thanks to this parameter, the program
    * can get all relevant information via the getters. */

    /**
     * The <code>void</code> scanItem method represents the scanning of an item that's being sold
     * @param itemIdentifier The unique ID of the item
     * @param quantity How many of the item that's being sold
     */
    private void scanItem(int itemIdentifier, int quantity) {
       try {
           LatestRegisteredItemDTO saleInfo = contr.registerItem(itemIdentifier, quantity);

           System.out.println("A new item has been registered: ");
           System.out.println("Item: " + saleInfo.getItemDescription());
           System.out.println("Price inc. vat: " + saleInfo.getItemPriceIncVat());
           System.out.println("Total Price: " + String.format("%.2f", saleInfo.getRunningTotalIncVat()));
           System.out.println("Quantity: " + saleInfo.getNumberOfItems());
           System.out.println();
       }
       catch (InvalidIdentifierOfItemException exception) {
           System.out.println(exception.getMessage());
       }
       catch (DatabaseFailureException exception) {
           logFile.loggedException(exception);
           System.out.println(exception.getMessage());
       }
    }
    /*H}                                                                                        ow much the customer gives as payment. Set to 200 by default.  */

    /**
     * The <code>void</code> payment method represents how much the customer gives as payment and how much change they should receive
     * @param paymentByCostumer The amount the customer gives as payment
     */
    private void payment(double paymentByCostumer){
            System.out.println("Payment has been registered: ");
            PaymentDTO changeInfo = contr.pay(paymentByCostumer);
            System.out.println("Change back: " + String.format("%.2f", changeInfo.getChange()));
            System.out.println("Total amount: " + String.format("%.2f", changeInfo.getTotalPaymentByCostumer()));
            System.out.println();
    }

    /*A list is created with the quantity of each item, the name of the items, the items' prices including VAT,
    * as well as the time of the sale */

    /**
     * The <code>void</code> receipt method represents all the information about the sale that is being printed on the receipt
     * The name of the item, how many was sold, how much for each unique item ID, the total including tax
     */
    private void receipt(){

        ReceiptDTO receiptDTOInfo = contr.getReceipt();
        System.out.println("Receipt is created: \n" + "Time/Date: " + receiptDTOInfo.getLocalDateTime());
        System.out.println();
        ArrayList<Item> list = receiptDTOInfo.getRecordsOfItems();
        for (int i = 0; i < list.size(); i++) {
            Item extractedItem = list.get(i);
            String itemName = extractedItem.getItemDTO().getNameOfItem();
            double itemPrice = extractedItem.getItemDTO().getPriceOfItemIncVat();
            int itemQuantity = extractedItem.getNumberOfItems();
            System.out.println("Item:  " + itemName + "         Price: " + itemPrice + ":-     " + "        Quantity: " + itemQuantity );
        }

        System.out.println("Running Total:                      " + String.format("%.2f", receiptDTOInfo.getTotalAmountOfSaleIncVAT()));
        System.out.println("Total Vat:                          " + String.format("%.2f", receiptDTOInfo.getTotalVat()));
        System.out.println("Amount payed by costumer:           " + receiptDTOInfo.getAmountPayed());
        System.out.println("Change:                             " + String.format("%.2f", receiptDTOInfo.getChangeBack()));

    }

    
}
