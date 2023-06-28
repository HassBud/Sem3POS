package se.kth.iv1350.sempos.model;

public class PaymentDTO {

    private double totalPaymentByCostumer;
    private double totalVat;
    private double change;
    private double runningTotal;

    public PaymentDTO(double totalPaymentByCostumer, double runningTotal , double change){
        this.totalPaymentByCostumer = totalPaymentByCostumer;
        this.change = change;
        this.runningTotal = runningTotal;
    }

    public double getTotalPaymentByCostumer() {
        return totalPaymentByCostumer;
    }

    public double getTotalVat() {
        return totalVat;
    }

    public double getChange() {
        return change;
    }
    public double getRunningTotal() {
        return runningTotal;
    }


}
