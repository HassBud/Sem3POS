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
     * @return the information of the specific item
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

    /** External system receives a receipt with information needed for external system InventorySystem.
     * @param  receipt a receipt that sends to external system.
     */
    public void externalSystemUpdateInventory(ReceiptDTO receipt){

    }


}


