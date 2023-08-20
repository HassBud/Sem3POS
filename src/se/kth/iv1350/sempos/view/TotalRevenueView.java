package se.kth.iv1350.sempos.view;

import se.kth.iv1350.sempos.model.PaymentDTO;
import se.kth.iv1350.sempos.model.SaleObserver;
import se.kth.iv1350.sempos.model.ReceiptDTO;


import java.lang.*;



public class TotalRevenueView implements SaleObserver {
    private double totalRev;

    public TotalRevenueView(){
        totalRev = 0;
    }

    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculateTotalRevenue(saleRevenue);
        printTotalRevenue();

    }

    public void calculateTotalRevenue(PaymentDTO saleRevenue){

            totalRev += saleRevenue.getRunningTotal();

    }

    public void printTotalRevenue() {
        System.out.println(" ");
        System.out.println("   *** Total revenue for all sales ***");
        System.out.println("            " + String.format("%.2f",totalRev) + ":-     ");
        System.out.println("*** *** *** *** *** *** *** *** *** *** ***");
        System.out.println(" ");
    }
}


