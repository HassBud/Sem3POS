package se.kth.iv1350.sempos.model;
import java.time.LocalDateTime;
import java.util.ArrayList;


/* One sale made in system */
public class Sale {
    private LocalDateTime saleTime;
    private Receipt receipt;
    private ArrayList<Item> listItem;
    private SaleLog saleLog;
    private PaymentDTO paymentDTO;
    private CashRegister cashRegister;
    private double runningTotalIncVat;
    private double totalVat;
    private int quantity;







    /* Creates new instance and saves time of sale */
    public Sale() {
        //should have a list
        listItem = new ArrayList<Item>();
        runningTotalIncVat = 0;
        totalVat = 0;
        quantity = 0;



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
    public LatestRegisteredItemDTO addItem(ItemDTO scanItem) {
        boolean itemFound = false;
        int numberOfItems = quantity;

        for (Item oneItem : listItem) {
            if (oneItem.getItemDTO().getIdentifierOfItem()==(scanItem.getIdentifierOfItem())) {
                oneItem.incrementNumberOfItems();
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            Item newItem = new Item(scanItem);
            listItem.add(newItem);
        }

        runningTotalIncVat += scanItem.getPriceOfItemIncVat();
        totalVat += scanItem.getVatPriceForItem();


        LatestRegisteredItemDTO saleInfo = new LatestRegisteredItemDTO(scanItem, runningTotalIncVat, totalVat);

        return saleInfo;
    }


    public PaymentDTO addPayment(double paymentByCostumer){

        this.cashRegister = new CashRegister();
        cashRegister.pay(this.runningTotalIncVat, paymentByCostumer);
        return cashRegister.getPaymentInfo();
    }
    public Receipt addReceipt(){
        PaymentDTO saleInfo = cashRegister.getPaymentInfo();

        this.receipt = new Receipt(saleInfo,listItem,totalVat,quantity);

        return this.receipt;
    }


    public ArrayList<Item> getListItem() {
        return listItem;
    }


    }



