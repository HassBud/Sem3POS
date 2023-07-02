package se.kth.iv1350.sempos.model;

import se.kth.iv1350.sempos.Integration.InventorySystem;

import java.util.ArrayList;

public class LogSale {



    public void updateInventory(ReceiptDTO receiptDTO) { //Används ännu inte
        ArrayList<Item> items = receiptDTO.getRecordsOfItems();


        for (Item item : items)

        {
            ItemDTO itemDTO = item.getItemDTO();
            int identifierOfItem = itemDTO.getIdentifierOfItem();
            int quantityPurchased = item.getNumberOfItems();


            ItemDTO currentInventory = getItemInformation(identifierOfItem); //Hur många som finns på lager


            if (currentInventory != null) {
                int currentQuantity = currentInventory.getQuantityInInventory();/*getNumberOfItems()*/; ////Vi har numberOfItems i LatestRegisteredItemDTO.
                //Är det records of items man hämtar ifrån istället? Eftersom vi har den i ReceiptDTO
                //Vi har även i Item, så väljer därifrån för tillfället
                int updatedQuantity = currentQuantity - quantityPurchased;

                currentInventory.setQuantity(updatedQuantity);//Hårdkoda hur många äpplen kunden köper?
                System.out.println("Quantity in inventory for this item: " + currentInventory.getQuantityInInventory()/*currentStock.getNameOfItem()*/); //Måste vi hårdkoda en inventory? Typ lägga in att vi har 5 äpplen?
            } else {
                System.out.println("This item is not in stock");
            }
        }
    }

    public ItemDTO getItemInformation(int identifierOfItem){
        InventorySystem inventorySystem = new InventorySystem();
        return inventorySystem.getItemInformation(identifierOfItem);
    }
}
