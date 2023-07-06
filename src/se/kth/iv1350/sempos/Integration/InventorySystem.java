package se.kth.iv1350.sempos.Integration;

import org.junit.platform.engine.support.descriptor.FileSystemSource;
import se.kth.iv1350.sempos.model.*;

import java.util.ArrayList;

/* Skriv här */
public class InventorySystem {

    /**
     * Constructor for InventorySystem
     * */
    public InventorySystem() {
    }

    /**
     *  Hard coded information about each item available in the store.
     * @param identifierOfItem receives information about each item based of the number received.
     * @return
     *  */
    public ItemDTO getItemInformation(int identifierOfItem) {
        if (identifierOfItem == 1)
            return new ItemDTO(1, "Äpple", 5, 0.06);
        else if (identifierOfItem == 2)
            return new ItemDTO(2, "Bok", 25, 0.25);
        else if (identifierOfItem == 3)
            return new ItemDTO(3, "Mjölk", 10, 0.12);
        else
            return null;
    }

    /*
    *  External system receives a receipt with information needed for the inventory update.
    * Note that we should not code external system.
     */
    public void externalSystemUpdateInventory(ReceiptDTO Receipt){

    }


}


