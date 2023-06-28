package se.kth.iv1350.sempos.model;

import java.util.ArrayList;

/* Represents the created receipt for the sale. Proves the payment for the sale */
public class Receipt {




    private ArrayList <Item> recordsOfItems;
    private double amountPayed;
    private double changeBack;
    private String nameOfItem;
    private double priceOfItem;
    private double totalAmountOfSaleIncVAT;

    /* Receipt constructor */
    public Receipt() {
        recordsOfItems = new ArrayList<Item>();
        //changeBack = amountPayed - runningTotal;
    }
    public Receipt( PaymentDTO paymentInfo, ArrayList<Item> rec){
        this.amountPayed = paymentInfo.getTotalPaymentByCostumer();
        this.changeBack = paymentInfo.getChange();
        this.recordsOfItems = rec;
        this.totalAmountOfSaleIncVAT = paymentInfo.getRunningTotal();
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


}
