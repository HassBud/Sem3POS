package se.kth.iv1350.sempos.model;

public class CashRegister {

    private PaymentDTO paymentInfo;



    public PaymentDTO pay(double paymentByCostumer, double totalPayment){
        double change =  totalPayment - paymentByCostumer;
        paymentInfo = new PaymentDTO(paymentByCostumer,totalPayment,change);
        return paymentInfo;
    }


    public PaymentDTO getPaymentInfo() {
        return paymentInfo;
    }
}
