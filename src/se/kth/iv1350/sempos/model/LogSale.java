package se.kth.iv1350.sempos.model;

import java.util.ArrayList;

public class LogSale {


    private int quantityPurchased;
    private int currentQuantity;
    private int updatedQuantity;


    public LogSale(ItemDTO currentQuantity, Item quantityPurchased){
        this.currentQuantity = currentQuantity.getQuantityInInventory();
        this.quantityPurchased = quantityPurchased.getNumberOfItems();


    }


    public void updateInventory(ReceiptDTO receipt) { //Används ännu inte
        ArrayList<Item> listOfRegisteredItems = receipt.getRecordsOfItems();

        for (int i = 0; i < listOfRegisteredItems.size(); i++) {
            Item item = listOfRegisteredItems.get(i);
            if (item.getItemDTO().getIdentifierOfItem() == receipt.getItemID()) {
                updatedQuantity = currentQuantity - quantityPurchased;
                break;
            }
        }
    }
    public int getQuantityPurchased() {
        return quantityPurchased;
    }
    public int getCurrentQuantity() {
        return currentQuantity;
    }
}
