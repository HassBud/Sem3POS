package se.kth.iv1350.sempos.model;


public class Item{


    private int numberOfItems;
    ItemDTO itemDTO;



   /* public Item(int number, ItemDTO newItemDTO) {

        numberOfItems = number;
        itemDTO = newItemDTO;
    } */
    public Item(ItemDTO newItemDTO){
        itemDTO = newItemDTO;
        numberOfItems = 1;
    }

    //should have a getIdentifierOfItem/setidentifierOfItem
    //incrementNumberOfItems --> see the new class Item
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }



    //method for increment number of items

    public void incrementNumberOfItems(int quantity) {
        numberOfItems++;
    }
    //getter for numberOfItems
    public int getNumberOfItems() {
        return numberOfItems;
    }


}