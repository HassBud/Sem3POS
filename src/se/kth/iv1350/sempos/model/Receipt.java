package se.kth.iv1350.sempos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/* Represents the created receipt for the sale. Proves the payment for the sale */
public class Receipt {




    private ArrayList <Item> recordsOfItems;
    private double amountPayed;
    private double changeBack;
    private String nameOfItem;
    private double priceOfItem;
    private double totalAmountOfSaleIncVAT;
    private double totalVat;
    private LocalDateTime localDateTime;

    /* Receipt constructor */

    public Receipt( PaymentDTO paymentInfo, ArrayList<Item> rec, double totalVat){
        this.amountPayed = paymentInfo.getTotalPaymentByCostumer();
        this.changeBack = paymentInfo.getChange();
        this.recordsOfItems = new ArrayList<>(rec);
        this.totalAmountOfSaleIncVAT = paymentInfo.getRunningTotal();
        this.totalVat = totalVat;
        this.localDateTime = java.time.LocalDateTime.now();

    }


    /* Update receipt */
    public void addItemToReceipt (ArrayList<Item> addedItem) { // ska det vara Sale eller Item i som Parameter i argumenten?
       recordsOfItems.addAll(addedItem);
    }


    /* Getters for all the attributes */


    public ArrayList<Item> getRecordsOfItems() {
        return recordsOfItems;
    }
    public double getAmountPayed() {
        return amountPayed;
    }

    public double getChangeBack() {
        return changeBack;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public double getTotalAmountOfSaleIncVAT() {
        return totalAmountOfSaleIncVAT;
    }
    public double getTotalVat() {
      return totalVat;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }


}
