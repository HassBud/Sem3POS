package se.kth.iv1350.sempos.view;
import se.kth.iv1350.sempos.model.PaymentDTO;
import se.kth.iv1350.sempos.model.SaleObserver;
import java.lang.*;

/**
 * Allows the user to see the total revenue from all sales
 */
public class TotalRevenueView implements SaleObserver {
    private double totalRev;

    /**
     * Creates a new instance for the total revenue.
     */
    public TotalRevenueView(){
        totalRev = 0;
    }

    /**
     * The method <code>displayRevenue</code> shows the revenue from each sale
     * @param saleRevenue The revenue from the made sale
     */
    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculateTotalRevenue(saleRevenue);
        printTotalRevenue();
    }

    /**
     * The method <code>calculatedTotalRevenue</code> sums up all the revenue from each sale
     * @param saleRevenue The revenue from each made sale
     */
    public void calculateTotalRevenue(PaymentDTO saleRevenue){
        totalRev += saleRevenue.getRunningTotal();
    }

    /**
     * The method <code>printTotalRevenue</code> allows the user to see the revenue from all the sales
     */
    public void printTotalRevenue() {
        System.out.println(" ");
        System.out.println("   *** Total revenue for all sales ***");
        System.out.println("            " + String.format("%.2f",totalRev) + ":-     ");
        System.out.println("*** *** *** *** *** *** *** *** *** *** ***");
        System.out.println(" ");
    }
}


