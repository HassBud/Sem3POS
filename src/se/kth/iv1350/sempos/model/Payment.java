package se.kth.iv1350.sempos.model;

public class Payment {

    private double expectedPaymentByCostumer;
    private double changeBackToCostumer;
    private double amountPayedByCostumer;

    public Payment(LatestRegisteredItemDTO expectedPaymentByCostumer, double amountPayedByCostumer){
        this.expectedPaymentByCostumer = expectedPaymentByCostumer.getRunningTotalIncVat();
        this.amountPayedByCostumer = amountPayedByCostumer;

        changeBackToCostumer = amountPayedByCostumer - expectedPaymentByCostumer;
    }

    public Payment(){

    }

    public double getChangeBackToCostumer() {
        return changeBackToCostumer;
    }

    public double getAmountPayedByCostumer() {
        return amountPayedByCostumer;
    }

}
