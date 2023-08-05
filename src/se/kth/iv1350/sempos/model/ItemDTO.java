package se.kth.iv1350.sempos.model;

/**
 * Represents all the information about a specific item
 */
public class ItemDTO {
    private int identifierOfItem;
    private String nameOfItem;
    private double priceOfItem; //price without tax
    private double vatPriceForItem; // tax price
    private double vat;
    private double priceOfItemIncVat;


    //constructor for itemDTO
    /*
     *  Creates a new instance.
     *
     * @param quantity number of items.
     * @param itemID identification of a specific item.
     */


    /*Constructor for ItemDTO. Stores all the info about the item */

    /**
     * Creates an ItemDTO instance
     * @param identifierOfItem The unique ID of a specific item
     * @param nameOfItem    The name of the item
     * @param priceOfItem The price of the item
     * @param vat The tax rate for the item
     */
    public ItemDTO(int identifierOfItem, String nameOfItem, double priceOfItem, double vat){
        this.identifierOfItem = identifierOfItem;
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
        this.vat = vat;
        this.vatPriceForItem = priceOfItem * vat;
        this.priceOfItemIncVat = priceOfItem + this.vatPriceForItem;



    }

    //should have a getIdentifierOfItem/setidentifierOfItem
    //incrementNumberOfItems --> see the new class Item

    /*gets the item number (1, 2 or 3) and stores it in identifierOfItem */

    /**
     * The getter for the identifierOfItem attribute
     * @return The identifier of item attribute
     */
     public int getIdentifierOfItem(){
        return identifierOfItem;
    }

    /*gets the VAT for the item and stores it in vatPriceForItem */

    /**
     * The getter for the VAT rate attribute
     * @return The item's VAT
     */
    public double getVatPriceForItem() {
        return vatPriceForItem;
    }

    /*gets the price of the item and stores it in priceOfItem.
    * OBS! VARFÖR STÅR DET ANVÄNDS EJ. RADERA? */

    /**
     * The getter for the price of the item
     * @return The item's price
     */
    public double getPriceOfItem() {
        return priceOfItem;
    }

    /*gets the name of the item and stores it in nameOfItem */

    /**
     * The getter for the name of the item
     * @return The item's name
     */
    public String getNameOfItem() {
        return nameOfItem;
    }

    /*gets the price of the item with VAT included. Stores it in priceOfItemIncVat */

    /**
     * The getter for the total price of the item
     * @return The item's price including the VAT
     */
    public double getPriceOfItemIncVat() {
        return this.priceOfItemIncVat;
    }


    //getter och setter för quantity på lager i inventorySystem | lär ej behövas när vi har getQuantityInInventory
    /*public int getQuanity(){
        return quanity;
    }*/


}
