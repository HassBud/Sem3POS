package se.kth.iv1350.sempos.model;

/**
 * Represents the item that is scanned into the system
 */
public class Item{

    private int numberOfItems;
    ItemDTO itemDTO;


    /**
     * Item constructor creates new instances representing an Item.
     * @param newItemDTO represents an item with all the information regarding the item.
     * */

    public Item(ItemDTO newItemDTO){
        itemDTO = newItemDTO;
        numberOfItems = 0;
    }

    /**
     * increases number of items with added quantity.
     * @param quantity number of items added.
     */

    public void incrementNumberOfItems(int quantity) {
        numberOfItems = numberOfItems + quantity;
    }

    /**
     * Getter for the attribute itemDTO
     * @return The object with the information about the item
     */
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }

    /**
     * Getter for the attribute numberOfItems
     * @return the amount of the item that has been scanned
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }



}