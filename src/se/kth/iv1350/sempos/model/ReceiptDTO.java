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

    /**
     * Receipt constructor creates new instances representing the Receipt.
     * Receives information from objects that gets stored in the attributes for the class
     * @param paymentInfo represents the total payment done by customer and the change the customer gets back.
     * @param listWithAllScannedItems represents a new instance with all scanned items for the purchase.
     * @param totalVat represents a new instance with the total vat for the hole purchase.
     * */

    public ReceiptDTO(PaymentDTO paymentInfo, ArrayList<Item> listWithAllScannedItems, double totalVat){
        this.amountPaid = paymentInfo.getTotalPaymentByCostumer();
        this.changeBack = paymentInfo.getChange();
        this.recordsOfItems = new ArrayList<>(listWithAllScannedItems);
        this.totalAmountOfSaleIncVAT = paymentInfo.getRunningTotal();
        this.totalVat = totalVat;
        this.localDateTime = java.time.LocalDateTime.now();


    }


    /**
     *  Getters for the attributes
     *  */


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
