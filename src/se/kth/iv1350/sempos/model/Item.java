package se.kth.iv1350.sempos.model;

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
     * Getter for the attribute.
     */

    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }



}