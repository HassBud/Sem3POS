package se.kth.iv1350.sempos.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TotalRevenueFileOutput implements SaleObserver{


    private PrintWriter printWriter;
    private double totalRev;


    public TotalRevenueFileOutput(){
        totalRev = 0;
        try {
            printWriter = new PrintWriter(new FileWriter("printedTotalRevenue.txt", true));
        } catch (IOException exceptionRevenue) {
            System.out.println("Not possible to print Revenue.");
            exceptionRevenue.printStackTrace();
        }
    }

    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculatedRevenue(saleRevenue);
        listedRevenue(totalRev);


    }

    private void calculatedRevenue(PaymentDTO saleRevenue){
        totalRev += saleRevenue.getRunningTotal();
    }



    public void listedRevenue(double totalRev) {

        StringBuilder revenueThatGetsLogged = new StringBuilder();
        revenueThatGetsLogged.append("Total revenue: " );
        revenueThatGetsLogged.append("  ");

        revenueThatGetsLogged.append(totalRev);
        printWriter.println(revenueThatGetsLogged);
        printWriter.println("\n");
        printWriter.flush();

    }

}
