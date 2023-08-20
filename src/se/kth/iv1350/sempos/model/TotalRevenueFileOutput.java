package se.kth.iv1350.sempos.model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents the total revenue that is logged in a text file
 */
public class TotalRevenueFileOutput implements SaleObserver{

    private PrintWriter printWriter;
    private double totalRev;


    /**
     * Creates a new instance. The starting value of the total revenue is set to 0.
     * A new text file where the total revenue is logged.
     * If the revenue cannot be logged, an exception is thrown.
     */
    public TotalRevenueFileOutput(){
        totalRev = 0;
        try {
            printWriter = new PrintWriter(new FileWriter("printedTotalRevenue.txt", true));
        } catch (IOException exceptionRevenue) {
            System.out.println("Not possible to print Revenue.");
            exceptionRevenue.printStackTrace();
        }
    }

    /**
     * The method <code>displayRevenue</code> displays how much that has been sold for
     * @param saleRevenue The revenue from each sale
     */
    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculatedRevenue(saleRevenue);
        listedRevenue(totalRev);
    }

    /**
     * The method <code>calculatedRevenue</code> calculates the total revenue
     * @param saleRevenue The revenue from each sale
     */
    private void calculatedRevenue(PaymentDTO saleRevenue){
        totalRev += saleRevenue.getRunningTotal();
    }


    /**
     * The method <code>listedRevenue</code> logs the revenue
     * @param totalRev The total sum of the revenue from each sale
     */
    public void listedRevenue(double totalRev) {

        StringBuilder revenueThatGetsLogged = new StringBuilder();
        revenueThatGetsLogged.append("Total revenue: " );
        revenueThatGetsLogged.append(totalRev);
        printWriter.println(revenueThatGetsLogged);
        printWriter.println("\n");
        printWriter.flush();

    }

}
