package se.kth.iv1350.sempos.view;

import se.kth.iv1350.sempos.model.Observer;
import se.kth.iv1350.sempos.model.PaymentDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TotalRevenueFileOutput extends Throwable implements Observer {


    private PrintWriter printWriter;

    public TotalRevenueFileOutput(){
        try {
            printWriter = new PrintWriter(new FileWriter("printedTotalRevenue.txt", true));
        } catch (IOException exceptionRevenue) {
            System.out.println("Not possible to print Revenue.");
            exceptionRevenue.printStackTrace();
        }
    }

     @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        StringBuilder revenueThatGetsLogged = new StringBuilder();
        revenueThatGetsLogged.append("The revenue for all sales : ");
        revenueThatGetsLogged.append(saleRevenue.getTotalPaymentByCostumer());
        printWriter.println(revenueThatGetsLogged);
        printWriter.println("\n");

    }





}
