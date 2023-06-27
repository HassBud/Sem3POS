package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPrice;
    private double runningTotal;


    public LatestRegisteredItemDTO(ItemDTO itemInformation, double runningTotal){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPrice = itemInformation.getPriceOfItemIncVat();
        this.runningTotal = runningTotal;

    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getRunningTotalIncVat() {
        return runningTotal;
    }
}
