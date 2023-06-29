package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPrice;
    private double runningTotalIncVat;
    private double totalVat;
    private double numberOfItems;


    public LatestRegisteredItemDTO(ItemDTO itemInformation, double currentTotalPrice, double currentTotalVat){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPrice = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = currentTotalPrice;
        this.totalVat = currentTotalVat;
        //this.numberOfItems = quantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getRunningTotalIncVat() {
        return runningTotalIncVat;
    }

    public double getTotalVat() {
        return totalVat;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }
}
