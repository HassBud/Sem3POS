package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPriceIncVat;
    private double runningTotalIncVat;
    private double totalVat;
    private double numberOfItems;



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


    public double getNumberOfItems() {
        return numberOfItems;
    }

}
