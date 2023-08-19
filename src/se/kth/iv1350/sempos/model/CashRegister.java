package se.kth.iv1350.sempos.model;

/**Represents the cash register in the store.
 *
 */
public class CashRegister {

    private PaymentDTO paymentInfo;

    /**
     * The <code>PaymentDTO</code> pay method calculates change the customer will recieve
     * @param expectedPaymentByCostumer How much money the customer should pay
     * @param totalPayment How much money the customer gives
     * @return The complete transaction
     */
    public PaymentDTO pay(double expectedPaymentByCostumer, double totalPayment){
        double change =  totalPayment - expectedPaymentByCostumer;
        paymentInfo = new PaymentDTO(expectedPaymentByCostumer,totalPayment,change);
        return paymentInfo;

    }

    /**
     * The <code>PaymentDTO</code> getPaymentInfo getter
     * return The complete transaction
     */
    public PaymentDTO getPaymentInfo() {

        return paymentInfo;
    }
}
