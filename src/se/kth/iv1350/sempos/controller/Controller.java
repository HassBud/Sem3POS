package se.kth.iv1350.sempos.controller;
import se.kth.iv1350.sempos.Integration.AccountingSystem;
import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
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
    private ReceiptDTO receiptDTO;
    private ArrayList<SaleObserver> saleObserversList = new ArrayList<>();



    /**
     *  Starts a new sale. This method must be called first.
     */
    public void startSale() {
        sale = new Sale(saleObserversList);
    }


    /**<code>Controller</code> Creates a new instance-
     * @param inventory The inventory represented by the instance
     **/
    public Controller(InventorySystem inventory) {
        this.inventory = inventory;
        this.accountingSystem = new AccountingSystem();
    }

    /** The <code>LatestRegisteredItemDTO</code> registerItem method fetches information about the item
     * @param identifierOfItem The ID of the item
     * @param quantity The quantity of the item being purchased
     * @return Information about the item and how many is being purchased is stored
     */
    public LatestRegisteredItemDTO registerItem(int identifierOfItem, int quantity) throws InvalidIdentifierOfItemException, DatabaseFailureException {
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
     * The <code>ReceiptDTO</code> getReceipt() method saves the sale info to the receipt
     * @return the receipt added
     */
    public ReceiptDTO getReceipt() {
        return sale.addReceipt();
    }

    /**
     * The <code>addObserverList</code> method adds a new observer to the list
     * @param saleObserver The observer that is added
     */
    public void addToObserverList(SaleObserver saleObserver){
        saleObserversList.add(saleObserver);
    }

    }











