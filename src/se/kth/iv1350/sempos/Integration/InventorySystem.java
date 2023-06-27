package se.kth.iv1350.sempos.Integration;

import se.kth.iv1350.sempos.model.Item;
import se.kth.iv1350.sempos.model.ItemDTO;
import se.kth.iv1350.sempos.model.Receipt;

import java.util.ArrayList;

/* Skriv här */
public class InventorySystem {
    private Receipt receipt;

    /* Constructor */
    public InventorySystem() {
    }

    /* Hard coded information about each item available in the store */
    public ItemDTO getItemInformation(int identifierOfItem) {
        if (identifierOfItem == 1)
            return new ItemDTO(1, "Äpple", 5, 0.06);
        else if (identifierOfItem == 2)
            return new ItemDTO(2, "Bok", 25,0.25);
        else if (identifierOfItem == 3)
            return new ItemDTO(3, "Mjölk", 10,0.12);
        else
            return null;
    }


    /* Skriv här */
    public void updateInventory() { // skall den vara void eller skall den returnera något??
        ArrayList<Item> items = receipt.getRecordsOfItems();
    }
}


