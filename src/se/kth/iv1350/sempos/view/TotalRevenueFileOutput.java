package se.kth.iv1350.sempos.view;

import se.kth.iv1350.sempos.model.Observer;
import se.kth.iv1350.sempos.model.PaymentDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TotalRevenueFileOutput implements Observer {



    private double totalRev;
    private PrintWriter printWriter;

    public TotalRevenueFileOutput(double totalRev){
        this.totalRev = totalRev;
        try {
            printWriter = new PrintWriter(new FileWriter("printedTotalRevenue.txt", true));
        } catch (IOException exceptionRevenue) {
            System.out.println("Not possible to print Revenue.");
            exceptionRevenue.printStackTrace();
        }
    }

    @Override
    public void displayRevenue(PaymentDTO totalRevenue) {
        totalRevenue(totalRevenue);
    }

    public void totalRevenue(PaymentDTO totalRevenue){
        this.totalRev = totalRevenue.getTotalPaymentByCostumer();
    }

}
