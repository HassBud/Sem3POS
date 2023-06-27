package se.kth.iv1350.sempos.model;

import java.util.ArrayList;

/* Represents the created receipt for the sale. Proves the payment for the sale */
public class Receipt {




    private ArrayList <Item> recordsOfItems;
    private double amountPayed; // inte kopplat till något?
    private double changeBack;
    private String nameOfItem;
    private double priceOfItem;
    private double totalAmountOfSaleIncVAT;

    /* Receipt constructor */
    public Receipt() {
        recordsOfItems = new ArrayList<Item>();

        amountPayed = 0;
        //changeBack = amountPayed - runningTotal;
    }
    public Receipt( double amountPayed, double changeBack){
        this.amountPayed = amountPayed;
        //this.changeBack = changeBack;
    }
    /* Update receipt */
    public void addItemToReceipt (ArrayList<Item> addedItem) { // ska det vara Sale eller Item i som Parameter i argumenten?
       recordsOfItems.addAll(addedItem);

    }

   

    /* Getters for all the attributes */


    public ArrayList<Item> getRecordsOfItems() {
        return recordsOfItems;
    }


}
