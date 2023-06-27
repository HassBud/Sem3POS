package se.kth.iv1350.sempos.model;

public class LatestRegisteredItemDTO {
    private String itemDescription;
    private double itemPrice;
    private double runningTotalIncVat;


    public LatestRegisteredItemDTO(ItemDTO itemInformation, double runningTotalIncVat){
        this.itemDescription = itemInformation.getNameOfItem();
        this.itemPrice = itemInformation.getPriceOfItemIncVat();
        this.runningTotalIncVat = runningTotalIncVat;

    }
}
