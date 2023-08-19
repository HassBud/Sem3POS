package se.kth.iv1350.sempos.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/* One sale made in system */

/**
 * Represents a sale made
 */
public class Sale {
    private LocalDateTime saleTime;  //Ta bort?
    private ReceiptDTO receiptDTO;
    private PaymentDTO totalPayment;
    private ArrayList<Item> listItem;
    private CashRegister cashRegister;
    private double runningTotalIncVat;
    private double totalVat;
    private int quantityOfEachItem;
    private List<SaleObserver> saleObserverArrayList;





    /* Creates new instance and saves time of sale */

    /**
     * Creates a new sale instance
     */
    public Sale(ArrayList observers) {
        //should have a list
        listItem = new ArrayList<Item>();
        this.saleObserverArrayList = observers;
        runningTotalIncVat = 0;
        totalVat = 0;
        quantityOfEachItem = 0;
    }


    /* Adds an Item to the list */

    /**
     *  Adds an item to <code>listItem</code>
     * @param scanItem The <code>ItemDTO</code> item's ID
     * @param quantity How many <code>int</code> of the item is being scanned
     * @return What item is being scanned, how many, the total price including VAT and the total VAT separate.
     */
    public LatestRegisteredItemDTO addItem(ItemDTO scanItem, int quantity)  {
        boolean itemFound = false;
        for (Item oneItem : listItem) {

            if (oneItem.getItemDTO().getIdentifierOfItem()== scanItem.getIdentifierOfItem()) {
                oneItem.incrementNumberOfItems(quantity);
                itemFound = true;
                break;
            }
        }

        if (!itemFound) {
            Item newItem = new Item(scanItem);
            newItem.incrementNumberOfItems(quantity);
            listItem.add(newItem);
        }


        runningTotalIncVat += scanItem.getPriceOfItemIncVat() * quantity;
        totalVat += scanItem.getVatPriceForItem() * quantity;

        LatestRegisteredItemDTO saleInfo = new LatestRegisteredItemDTO(scanItem, runningTotalIncVat, totalVat, quantity);

        return saleInfo;
    }

    /*addPayment adds the amount the customer pays (paymentByCustomer) and sends the information to the cashRegister */

    /**
     * The <code>PaymentDTO</code> addPayment method adds the amount the customer pays to the cash register
     * @param paymentByCostumer How much money the customer pays
     * @return How much money in the cash register after the transaction
     */
    public PaymentDTO addPayment(double paymentByCostumer){

        this.cashRegister = new CashRegister();
        totalPayment = cashRegister.pay(this.runningTotalIncVat, paymentByCostumer);
        callObservers();

        return this.totalPayment;


    }

    /*The information about the purchase the customer made gets stored in receiptDTO */

    /**
     * The <code>ReceiptDTO</code> addReceipt method adds the transaction information to a receipt
     * @return What was sold, when it was sold, and for how much
     */
    public ReceiptDTO addReceipt(){
        PaymentDTO saleInfo = cashRegister.getPaymentInfo();

        this.receiptDTO = new ReceiptDTO(saleInfo,listItem,totalVat);
        //Varför totalVat och inte totalPriceIncVat?
        return this.receiptDTO;
    }


    public void callObservers(){
        for(SaleObserver saleObserver : saleObserverArrayList){
            saleObserver.displayRevenue(totalPayment);
        }

    }

    /**
     * The getter for quantityOfEachItem
     * @return The quantity of the item's being sold
     */
    //Står används ej. Ta bort?
    public int getQuantityOfEachItem() {
        return quantityOfEachItem;
    }

}



