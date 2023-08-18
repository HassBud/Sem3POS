package se.kth.iv1350.sempos.model;

public interface Observer {

    /**
     * Displays the revenue
     * @param saleRevenue The revenue for Sales
     */

    public void displayRevenue(PaymentDTO saleRevenue);

}
