package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPrice;
    private double runningTotalIncVat;


    public LatestRegisteredItemDTO(ItemDTO itemInformation, double currentTotalPrice){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPrice = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = currentTotalPrice;

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
}
