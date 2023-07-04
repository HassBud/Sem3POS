package se.kth.iv1350.sempos.model;

//stores information about the item; the quantity scanned and the item ID
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



    public ItemDTO(int identifierOfItem, String nameOfItem, double priceOfItem, double vat) {
        this.identifierOfItem = identifierOfItem;
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
        this.vat = vat;
        this.vatPriceForItem = priceOfItem * vat;
        this.priceOfItemIncVat = priceOfItem + this.vatPriceForItem;

    }

    //should have a getIdentifierOfItem/setidentifierOfItem
    //incrementNumberOfItems --> see the new class Item

     public int getIdentifierOfItem(){
        return identifierOfItem;
    }

    public double getVatPriceForItem() {
        return vatPriceForItem;
    }
    public double getPriceOfItem() {
        return priceOfItem;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }
    public double getPriceOfItemIncVat() {
        return this.priceOfItemIncVat;
    }


    //getter och setter för quantity på lager i inventorySystem | lär ej behövas när vi har getQuantityInInventory
    /*public int getQuanity(){
        return quanity;
    }*/


}
