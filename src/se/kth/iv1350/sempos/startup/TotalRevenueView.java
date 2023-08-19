package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.model.PaymentDTO;
import se.kth.iv1350.sempos.model.SaleObserver;
import se.kth.iv1350.sempos.model.ReceiptDTO;


import java.lang.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalRevenueView implements SaleObserver {
    private Map<String, Double> totalRevenueForAllSales = new HashMap<>();
    private List<Double> revenueArrayList = new ArrayList<>();



    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculateTotalRevenue(saleRevenue);
        printTotalRevenue();

    }

    public void calculateTotalRevenue(PaymentDTO saleRevenue){
        double calculateRevenueForAllSales =+ saleRevenue.getTotalPaymentByCostumer();
        revenueArrayList.add(calculateRevenueForAllSales); // Testar med ArrayList.
        totalRevenueForAllSales.put("Total revenue: ", calculateRevenueForAllSales); // Testar med HashMap

    }

    public void printTotalRevenue() {
        System.out.println("This is the total Revenue for all the sales made: " + totalRevenueForAllSales);
        System.out.println("This is the total Revenue for all the sales made: " + revenueArrayList);
    }
}


