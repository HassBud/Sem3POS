package se.kth.iv1350.sempos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/* Represents the created receipt for the sale. Proves the payment for the sale */
public class ReceiptDTO {




    private ArrayList <Item> recordsOfItems;
    private double amountPaid;
    private double changeBack;
    private double totalAmountOfSaleIncVAT;
    private double totalVat;
    private LocalDateTime localDateTime;


    /* Receipt constructor called ReceiptDTO. It has the parameters paymentInfo, rec, and totalVat.
    * The information from the parameters gets stored in the variables amountPaid, recordsOfItems, and totalVAT.
    * The variables changeBack and totalAmountOfSaleIncVAT also get their information from paymentInfo. */

    public ReceiptDTO(PaymentDTO paymentInfo, ArrayList<Item> rec, double totalVat){
        this.amountPaid = paymentInfo.getTotalPaymentByCostumer(); //Ändrade amountPayed --> amountPaid
        this.changeBack = paymentInfo.getChange();
        this.recordsOfItems = new ArrayList<>(rec);
        this.totalAmountOfSaleIncVAT = paymentInfo.getRunningTotal();
        this.totalVat = totalVat;
        this.localDateTime = java.time.LocalDateTime.now();


    }


    /* Getters for all the attributes */


    public ArrayList<Item> getRecordsOfItems() {
        return recordsOfItems;
    }
    public double getAmountPayed() {
        return amountPaid;
    }

    public double getChangeBack() {
        return changeBack;
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
