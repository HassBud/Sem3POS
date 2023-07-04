package se.kth.iv1350.sempos.model;


public class Item{


    private int numberOfItems;
    ItemDTO itemDTO;


    public Item(ItemDTO newItemDTO){
        itemDTO = newItemDTO;
        numberOfItems = 0;
    }

    //should have a getIdentifierOfItem/setidentifierOfItem
    //incrementNumberOfItems --> see the new class Item
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }




    //method for increment number of items

    public void incrementNumberOfItems(int quantity) {
        numberOfItems = numberOfItems + quantity;
    }
    //getter for numberOfItems
    public int getNumberOfItems() {
        return numberOfItems;
    }


}