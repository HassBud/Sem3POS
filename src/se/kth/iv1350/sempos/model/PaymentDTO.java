package se.kth.iv1350.sempos.model;

public class PaymentDTO {

    private double totalPaymentByCustomer; //Ändrat till totalPaymentByCostumer --> totalPaymentByCustomer
    private double change;
    private double runningTotal;

    /*The constructor PaymentDTO takes the parameters totalPaymentByCustomer, runningTotal, and change.
    * The information gets stored in the variables with the same names. */
    public PaymentDTO(double totalPaymentByCustomer, double runningTotal , double change){
        this.totalPaymentByCustomer = totalPaymentByCustomer;
        this.change = change;
        this.runningTotal = runningTotal;
    }


    public double getTotalPaymentByCostumer() {
        return totalPaymentByCustomer;
    }

    public double getChange() {
        return change;
    }
    public double getRunningTotal() {
        return runningTotal;
    }


}
