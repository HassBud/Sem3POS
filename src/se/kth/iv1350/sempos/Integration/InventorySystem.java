package se.kth.iv1350.sempos.Integration;
import se.kth.iv1350.sempos.model.*;

/**
 * Respresents the server where all the store's item IDs are
 */
public class InventorySystem {

    /**
     * Constructor for InventorySystem.
     * */
    public InventorySystem() {
    }

    /**
     *  Hard coded information about each item available in the store. Checks if identifierOfItem
     *  is equal to a specific number. If an item that is scanned has an ID which is not in the database, an error message is displayed.
     *  An error is also displayed if the database cannot be accessed.
     * @param identifierOfItem identifier for a specific item.
     * @return The information of the specific item.
     *  */
    public ItemDTO getItemInformation(int identifierOfItem) throws InvalidIdentifierOfItemException, DatabaseFailureException {
        if (identifierOfItem == 1)
            return new ItemDTO(1, "Äpple", 5, 0.06);
        else if (identifierOfItem == 2)
            return new ItemDTO(2, "Bok", 25, 0.25);
        else if (identifierOfItem == 3)
            return new ItemDTO(3, "Mjölk", 10, 0.12);
        else if (identifierOfItem == 4) {
            throw new DatabaseFailureException("Error can not connect to server. ");
        } else
            throw new InvalidIdentifierOfItemException("Invalid Item-ID for ID: " + identifierOfItem + "\n");
    }

    /** External system receives a receipt with information needed for external system InventorySystem.
     * @param  receipt a receipt that sends to external system.
     */
    public void externalSystemUpdateInventory(ReceiptDTO receipt){

    }


}


