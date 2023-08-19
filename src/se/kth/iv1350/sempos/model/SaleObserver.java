package se.kth.iv1350.sempos.model;

public interface SaleObserver {

    /**
     * Displays the revenue
     * @param saleRevenue The revenue for Sales
     */

    public void displayRevenue(PaymentDTO saleRevenue);

}
