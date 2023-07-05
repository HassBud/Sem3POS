package se.kth.iv1350.sempos.model;

public class CashRegister {

    private PaymentDTO paymentInfo;


    /*The pay method has the variables paymentByCustomer and totalPayment as parameters.
    * It calculates the difference between what the customer gave as payment and what the item(s) actually cost.
    * The customer gets the difference back as change. */
    public PaymentDTO pay(double paymentByCostumer, double totalPayment){
        double change =  totalPayment - paymentByCostumer;
        paymentInfo = new PaymentDTO(totalPayment,paymentByCostumer,change);
        return paymentInfo;
    }

    /* */
    public PaymentDTO getPaymentInfo() {

        return paymentInfo;
    }
}
