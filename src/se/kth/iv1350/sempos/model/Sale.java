package se.kth.iv1350.sempos.model;
import java.time.LocalDateTime;
import java.util.ArrayList;


/* One sale made in system */
public class Sale {
    private LocalDateTime saleTime;
    private Receipt receipt;
    private ArrayList<Item> listItem;
    private SaleLog saleLog;
    private double runningTotalIncVat;
    private PaymentDTO paymentDTO;
    private double totalVat;
    private CashRegister cashRegister;





    /* Creates new instance and saves time of sale */
    public Sale() {
        setDateAndTimeOfSale();
        receipt = new Receipt(); //double, Item [] DTO, double, double
        //should have a list
        listItem = new ArrayList<Item>();
        cashRegister = new CashRegister();
        runningTotalIncVat = 0;
        totalVat = 0;


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
        totalVat += scanItem.getVatPriceForItem();
        LatestRegisteredItemDTO saleInfo = new LatestRegisteredItemDTO(scanItem,this.runningTotalIncVat, this.totalVat);

        return saleInfo;
    }

    public PaymentDTO addpayment(double paymentByCostumer){

        this.cashRegister = new CashRegister();
        cashRegister.pay(this.runningTotalIncVat, paymentByCostumer);
        return cashRegister.getPaymentInfo();
    }



    public ArrayList<Item> getListItem() {
        return listItem;
    }

    public double getRunningTotalIncVat() {
        return runningTotalIncVat;
    }

    }



