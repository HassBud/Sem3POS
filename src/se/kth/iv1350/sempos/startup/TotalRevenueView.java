package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.model.Observer;
import se.kth.iv1350.sempos.model.PaymentDTO;


import java.lang.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalRevenueView implements Observer {
    private Map<String, Double> totalRevenueForAllSales = new HashMap<>();
    private List<Double> revenueArrayList = new ArrayList<>();



    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        calculateTotalRevenue(saleRevenue);
        ;
    }

    public void calculateTotalRevenue(PaymentDTO saleRevenue){
        double calculateRevenueForAllSales =+ saleRevenue.getTotalPaymentByCostumer();
        revenueArrayList.add(calculateRevenueForAllSales); // Testar med ArrayList.
        totalRevenueForAllSales.put("Total revenue: ", calculateRevenueForAllSales); // Testar med HashMap

    }
}


