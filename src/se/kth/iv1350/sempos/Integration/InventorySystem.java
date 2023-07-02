package se.kth.iv1350.sempos.Integration;

import org.junit.platform.engine.support.descriptor.FileSystemSource;
import se.kth.iv1350.sempos.model.Item;
import se.kth.iv1350.sempos.model.ItemDTO;
import se.kth.iv1350.sempos.model.ReceiptDTO;

import java.util.ArrayList;

/* Skriv här */
public class InventorySystem {
    private ReceiptDTO receiptDTO;

    /* Constructor */
    public InventorySystem() {
    }

    /* Hard coded information about each item available in the store */
    public ItemDTO getItemInformation(int identifierOfItem) {
        if (identifierOfItem == 1)
            return new ItemDTO(1, "Äpple", 5, 0.06, 100);
        else if (identifierOfItem == 2)
            return new ItemDTO(2, "Bok", 25, 0.25, 100);
        else if (identifierOfItem == 3)
            return new ItemDTO(3, "Mjölk", 10, 0.12,100);
        else
            return null;
    }


    /* Skriv här */
    //public void updateInventory() { // skall den vara void eller skall den returnera något??
    //ArrayList<Item> items = receiptDTO.getRecordsOfItems();
    //}
    public void updateInventory(ReceiptDTO receiptDTO) { //Används ännu inte
        ArrayList<Item> items = receiptDTO.getRecordsOfItems();


        for (Item item : items)

        {
            ItemDTO itemDTO = item.getItemDTO();
            int identifierOfItem = itemDTO.getIdentifierOfItem();
            int quantityPurchased = item.getNumberOfItems();


            ItemDTO currentInventory = getItemInformation(identifierOfItem); //Hur många som finns på lager


            if (currentInventory != null) {
                int currentQuantity = itemDTO.getQuantityInInventory();/*getNumberOfItems()*/; ////Vi har numberOfItems i LatestRegisteredItemDTO.
                //Är det records of items man hämtar ifrån istället? Eftersom vi har den i ReceiptDTO
                //Vi har även i Item, så väljer därifrån för tillfället
                int updatedQuantity = currentQuantity - quantityPurchased;

                currentInventory.setQuantity(updatedQuantity); //Hårdkoda hur många äpplen kunden köper?
                System.out.println("Quantity in inventory for this item: " + currentInventory.getQuantityInInventory()/*currentStock.getNameOfItem()*/); //Måste vi hårdkoda en inventory? Typ lägga in att vi har 5 äpplen?
            } else {
                System.out.println("This item is not in stock");
            }
        }
    }
}


