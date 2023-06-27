package se.kth.iv1350.sempos.model;

import java.util.ArrayList;

/* Represents the created receipt for the sale. Proves the payment for the sale */
public class Receipt {

    private double runningTotal;


    private ArrayList <Item> recordsOfItems;
    private double amountPayed; // inte kopplat till något?
    private double changeBack;
    private String nameOfItem;
    private double priceOfItem;
    private double totalAmountOfSaleIncVAT;

    /* Receipt constructor */
    public Receipt() {
        recordsOfItems = new ArrayList<Item>();
        runningTotal = 0;
        amountPayed = 0;
        //changeBack = amountPayed - runningTotal;
    }
    public Receipt(double runningTotal, double amountPayed, double changeBack){
        this.runningTotal = runningTotal;
        this.amountPayed = amountPayed;
        //this.changeBack = changeBack;
    }
    /* Update receipt */
    public void addItemToReceipt (Item addedItem) { // ska det vara Sale eller Item i som Parameter i argumenten?
       recordsOfItems.add(addedItem);
       runningTotal += addedItem.getItemDTO().getPriceOfItemIncVat();
    }

    public void addChangeBackToReceipt(){
       changeBack  = amountPayed - runningTotal;
    }


    /* Getters for all the attributes */
    public double getRunningTotal() {
        return this.runningTotal;
    }

    public ArrayList<Item> getRecordsOfItems() {
        return recordsOfItems;
    }


}
