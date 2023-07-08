package se.kth.iv1350.sempos.model;

/**
 * Represents the item that was scanned
 */
public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPriceIncVat;
    private double runningTotalIncVat;
    private double totalVat;
    private int numberOfItems; //Ändrade till int


    /*The constructor LatestRegisteredItemDTO takes the parameters itemInformation, currentTotalPrice, currentTotalVat
    * and quantity. The information gets stored in the variables itemDescription, itemPriceIncVat, runningTotalIncVat
    * totalVat, and numberOfItems respectively */

    /**
     * Creates a LatestRegisteredItemDTO instance
     * @param itemInformation The item's name
     * @param currentTotalPrice The summed up total of every item that's currently been scanned
     * @param currentTotalVat The summed up total VAT of every item that's currently been scanned
     * @param quantity How many of each item that's been scanned
     */
    public LatestRegisteredItemDTO(ItemDTO itemInformation, double currentTotalPrice, double currentTotalVat, int quantity){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPriceIncVat = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = currentTotalPrice;
        this.totalVat = currentTotalVat;
        this.numberOfItems = quantity;
    }

    /**
     * The getter for the item description
     * @return The item's name
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * The getter for the item's price including VAT attribute
     * @return The item's price including the VAT rate
     */
    public double getItemPriceIncVat() {
        return itemPriceIncVat;
    }

    /**
     * The getter for the running total including VAT attribute
     * @return The current total including VAT
     */
    public double getRunningTotalIncVat() {
        return runningTotalIncVat;
    }


    /**
     * The getter for the numberOfItems attribute
     * @return How many examples of the item that has been scanned
     */
    public int getNumberOfItems() {
        return numberOfItems;
    } //ändrade till int

}
