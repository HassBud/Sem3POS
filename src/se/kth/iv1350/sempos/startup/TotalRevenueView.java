package se.kth.iv1350.sempos.startup;

import se.kth.iv1350.sempos.model.Observer;
import se.kth.iv1350.sempos.model.PaymentDTO;
import java.lang.*;

import java.util.ArrayList;
import java.util.List;

public class TotalRevenueView implements Observer {
    private List<Observer> saleObservers = new ArrayList<>();



    @Override
    public void displayRevenue(PaymentDTO saleRevenue) {
        System.out.println("The total SALE" + saleRevenue);

    }


    public void calculateTotalRevenue(PaymentDTO saleRevenue){

    }


}


