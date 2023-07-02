package se.kth.iv1350.sempos.model;

//stores information about the item; the quantity scanned and the item ID
public class ItemDTO {
    private int identifierOfItem;
    private String nameOfItem;
    private double priceOfItem; //price without tax
    private double vatPriceForItem; // tax price
    private double vat;
    private double priceOfItemIncVat;
    private int quantityInInventory;

    //OBS! För att få in quantity i lager skriver jag in denna
    private int quantity;    //Antal varor i lager

    //constructor for itemDTO
    /*
     *  Creates a new instance.
     *
     * @param quantity number of items.
     * @param itemID identification of a specific item.
     */



    public ItemDTO(int identifierOfItem, String nameOfItem, double priceOfItem, double vat, int quantityInInventory) {
        this.identifierOfItem = identifierOfItem;
        this.nameOfItem = nameOfItem;
        this.priceOfItem = priceOfItem;
        this.vat = vat;
        this.vatPriceForItem = priceOfItem * vat;
        this.priceOfItemIncVat = priceOfItem + this.vatPriceForItem;
        this.quantityInInventory = quantityInInventory;

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
    public int getQuantityInInventory() {
        return quantityInInventory;
    }

    //getter och setter för quantity på lager i inventorySystem | lär ej behövas när vi har getQuantityInInventory
    /*public int getQuanity(){
        return quanity;
    }*/
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


}
