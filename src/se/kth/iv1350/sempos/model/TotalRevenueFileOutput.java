package se.kth.iv1350.sempos.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TotalRevenueFileOutput {


    private PrintWriter printWriter;
    private PaymentDTO saleRevenue;
    private List<SaleObserver> saleSaleObservers = new ArrayList<>();

    public TotalRevenueFileOutput(){
        try {
            printWriter = new PrintWriter(new FileWriter("printedTotalRevenue.txt", true));
        } catch (IOException exceptionRevenue) {
            System.out.println("Not possible to print Revenue.");
            exceptionRevenue.printStackTrace();
        }
    }



    private void calculatedRevenue(){

    }


    public void listedRevenue(PaymentDTO saleRevenue) {

        StringBuilder revenueThatGetsLogged = new StringBuilder();
        revenueThatGetsLogged.append("The revenue for all sales : ");
        revenueThatGetsLogged.append(saleRevenue.getTotalPaymentByCostumer());
        printWriter.println(revenueThatGetsLogged);
        printWriter.println("\n");

    }


}
