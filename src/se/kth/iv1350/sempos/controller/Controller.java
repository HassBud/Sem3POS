package se.kth.iv1350.sempos.controller;
import se.kth.iv1350.sempos.Integration.AccountingSystem;
import se.kth.iv1350.sempos.Integration.InventorySystem;
import se.kth.iv1350.sempos.model.*;

import java.util.ArrayList;



/**
* This is the applications only controller. All objects to model pass through here
*
 */
public class Controller {
    private Sale sale;
    private InventorySystem inventory;
    private AccountingSystem accountingSystem;
    private LatestRegisteredItemDTO latestRegisteredItemDTO; //Ta bort?
    private PaymentDTO paymentDTO;  //Ta bort?
    private ReceiptDTO receiptDTO;



    /**
     *  Starts a new sale. This method must be called first.
     */

    public void startSale() {
        sale = new Sale();
    }


    /* Skriv här */
    public Controller(InventorySystem inventory, Sale sale) {
        this.inventory = inventory;
        this.sale = sale;

    }

    /* registerItem takes the parameters identifierOfItem --> (1, 2 or 3) and quantity.
    With this method, the specific item and the quantity is stored in registeredSaleInfo */
    public LatestRegisteredItemDTO registerItem(int identifierOfItem, int quantity) {
        ItemDTO itemInfo = inventory.getItemInformation(identifierOfItem);
        LatestRegisteredItemDTO registeredSaleInfo = sale.addItem(itemInfo, quantity);

        return registeredSaleInfo;
    }

    /**The <code>PaymentDTO</code> pay method send information about the payment to the external systems
     * @param paymentByCostumer The amount the customer pay.
     * @return Information about how much the customer paid gets stored
     */
    public PaymentDTO pay(double paymentByCostumer) {
        PaymentDTO paymentInfo = sale.addPayment(paymentByCostumer);
        inventory.externalSystemUpdateInventory(receiptDTO);
        accountingSystem.externalSystemUpdateAccounting(receiptDTO);
        return paymentInfo;
    }

    /**
     * Saves the sale info to the receipt
     * @return the receipt added
     */
    public ReceiptDTO getReceipt() {
        return sale.addReceipt();
    }


    }











