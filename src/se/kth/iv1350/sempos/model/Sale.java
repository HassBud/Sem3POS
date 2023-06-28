package se.kth.iv1350.sempos.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


/* One sale made in system */
public class Sale {
    private LocalDateTime saleTime;
    private Receipt receipt;
    private ArrayList<Item> listItem;
    private SaleLog saleLog;
    private double runningTotalIncVat;
    private double payment;


    /* Creates new instance and saves time of sale */
    public Sale() {
        setDateAndTimeOfSale();
        receipt = new Receipt(); //double, Item [] DTO, double, double
        //should have a list
        listItem = new ArrayList<Item>();
        runningTotalIncVat = 0;
        payment = ;

    }
    /*
    public void updatedReceipt(ArrayList<Item> items){
        listItem = items;
    }*/

    /* Represents time of sale */
    private void setDateAndTimeOfSale() {
        saleTime = LocalDateTime.now();
    }


    /* Adds an Item to the list */
    public LatestRegisteredItemDTO addItem(ItemDTO scanItem) { //go through array, find multiples of an item and add them together.
        for (Item oneItem : listItem) {

            if (oneItem.getItemDTO().getIdentifierOfItem() == scanItem.getIdentifierOfItem()) {
                oneItem.incrementNumberOfItems();
                break;
            }
            else
            {
                Item newItem = new Item(scanItem);
                listItem.add(newItem);
            }
        }

        runningTotalIncVat += scanItem.getPriceOfItemIncVat();
        LatestRegisteredItemDTO saleInfo = new LatestRegisteredItemDTO(scanItem,this.runningTotalIncVat);

        return saleInfo;
    }

    public double addPayment(LatestRegisteredItemDTO finalAmount){
        double addedPayment = finalAmount.getRunningTotalIncVat();
        return addedPayment;
    }



   /* public double createAndCollect(Receipt paymentByCostumer) {
        return saleLog.finalPayment(paymentByCostumer); // är SaleDTO överflödig? Fundering om man kan hämta running total istället.
    }*/

    /*public SaleLog getSaleInformation(Receipt receipt) {
        SaleLog getSaleInfo = new SaleLog(receipt);

        return getSaleInfo;
    } */

    public ArrayList<Item> getListItem() {
        return listItem;
    }

    public double getRunningTotalIncVat() {
        return runningTotalIncVat;
    }

    }



