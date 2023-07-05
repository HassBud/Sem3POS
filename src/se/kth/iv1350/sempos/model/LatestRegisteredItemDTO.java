package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPriceIncVat;
    private double runningTotalIncVat;
    private double totalVat;
    private int numberOfItems; //Ändrade till int


    /*The constructor LatestRegisteredItemDTO takes the parameters itemInformation, currentTotalPrice, currentTotalVat
    * and quantity. The information gets stored in the variables itemDescription, itemPriceIncVat, runningTotalIncVat
    * totalVat, and numberOfItems respectively */
    public LatestRegisteredItemDTO(ItemDTO itemInformation, double currentTotalPrice, double currentTotalVat, int quantity){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPriceIncVat = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = currentTotalPrice;
        this.totalVat = currentTotalVat;
        this.numberOfItems = quantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPriceIncVat() {
        return itemPriceIncVat;
    }

    public double getRunningTotalIncVat() {
        return runningTotalIncVat;
    }


    public int getNumberOfItems() {
        return numberOfItems;
    } //ändrade till int

}
