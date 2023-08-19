package se.kth.iv1350.sempos.view;

import se.kth.iv1350.sempos.model.PaymentDTO;
import se.kth.iv1350.sempos.model.SaleObserver;
import se.kth.iv1350.sempos.model.ReceiptDTO;


import java.lang.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        totalRev += saleRevenue.getTotalPaymentByCostumer();
    }

    public void printTotalRevenue() {
        System.out.println("   *** Total revenue for all sales ***");
        System.out.println("            " + totalRev + ":-     ");
        System.out.println("*** *** *** *** *** *** *** *** *** *** ***");
    }
}


