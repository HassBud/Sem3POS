package se.kth.iv1350.sempos.controller;
import se.kth.iv1350.sempos.Integration.AccountingSystem;
import se.kth.iv1350.sempos.Integration.InventorySystem;
import se.kth.iv1350.sempos.model.*;


/*
* This is the applications only controller. All objects to model pass through here
* */
public class Controller {
    private Sale sale;
    private InventorySystem inventory;
    private AccountingSystem accountingSystem;

    /* Starts a new sale. This method must be called first.*/
    public void startSale() {
        sale = new Sale();
    }


    /* Skriv här */
    public Controller(InventorySystem inventory, Sale sale) {
        this.inventory = inventory;
        this.sale = sale;
    }

    /* Skriv här */
    public LatestRegisteredItemDTO registerItem(int identifierOfItem) {
        ItemDTO itemInfo = inventory.getItemInformation(identifierOfItem);
        LatestRegisteredItemDTO registeredSaleInfo = sale.addItem(itemInfo);

        return registeredSaleInfo;
    }

    /* Payment by costumer */
 /*   public double pay(Receipt paymentByCostumer) { // varför är pay aldrig använd?

        return sale.createAndCollect(paymentByCostumer);

    }*/

   /* public void accountingInfo(){
        accountingSystem.deliverInformationToAccounting();
    }
    public void inventoryInfo(){
        inven*/


    /* Skriv här */
    public double endSale() {
        return 0;
    }

}


