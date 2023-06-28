package se.kth.iv1350.sempos.model;

public class PaymentDTO {

    private double totalPrice;
    private double totalVat;
    private double change;
    private double runningTotal;

    public PaymentDTO(double totalPrice, double runningTotal , double change){
        this.totalPrice = totalPrice;
        this.change = change;
        this.runningTotal = runningTotal;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalVat() {
        return totalVat;
    }

    public double getChange() {
        return change;
    }



}
