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



    /**
     * Constructor for ItemDTO. Stores all the info about the item.
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



    /**
     * The getter for the identifierOfItem attribute
     * @return The identifier of item attribute
     */
     public int getIdentifierOfItem(){
        return identifierOfItem;
    }


    /**
     * The getter for the VAT rate attribute
     * @return The item's VAT
     */
    public double getVatPriceForItem() {
        return vatPriceForItem;
    }


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


}
