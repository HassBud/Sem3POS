package se.kth.iv1350.sempos.model;

/**
 * Represents the information about the payment
 */
public class PaymentDTO {

    private double totalPaymentByCustomer;
    private double change;
    private double runningTotal;

    /**The constructor PaymentDTO takes the parameters totalPaymentByCustomer, runningTotal, and change.
     * The information gets stored in the variables with the same names.
     * @param totalPaymentByCustomer the payment by the customer represented by the instance.
     * @param runningTotal the running total for the hole purchase represented by the instance.
     * @param change the change that the customer gets back represented by the instance.
     * */
    public PaymentDTO(double totalPaymentByCustomer, double runningTotal , double change){
        this.totalPaymentByCustomer = totalPaymentByCustomer;
        this.change = change;
        this.runningTotal = runningTotal;
    }

    /**
     * Getters for all the attributes.
     */

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
