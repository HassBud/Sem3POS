package se.kth.iv1350.sempos.view;

import se.kth.iv1350.sempos.model.Observer;
import se.kth.iv1350.sempos.model.PaymentDTO;
import se.kth.iv1350.sempos.model.Sale;

public class TotalRevenueView implements Observer {
    @Override
    public void Sale(PaymentDTO saleInfo) {
        PaymentDTO totalRevenueForEachSale = saleInfo;

    }
}
