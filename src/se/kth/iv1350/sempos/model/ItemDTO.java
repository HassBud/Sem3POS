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
        this.vatPriceForItem = priceOfItem * vat;
        this.vat = vat;
        this.priceOfItemIncVat = priceOfItemIncVat;
    }





    //should have a getIdentifierOfItem/setidentifierOfItem
    //incrementNumberOfItems --> see the new class Item

     public int getIdentifierOfItem(){
        return identifierOfItem;
    }

    public void setIdentifierOfItem(int itemID) {
        this.identifierOfItem = itemID;


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
    public double getVat() {
        return vat;
    }
}
