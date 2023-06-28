package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {

    private String itemDescription;
    private double itemPrice;
    private double runningTotalIncVat;
    private double totalVat;


    public LatestRegisteredItemDTO(ItemDTO itemInformation, double currentTotalPrice, double totalVat){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPrice = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = currentTotalPrice;
        this.totalVat = totalVat;


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
}
