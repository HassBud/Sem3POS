package se.kth.iv1350.sempos.model;
import java.time.LocalDateTime;
import java.util.ArrayList;


/* One sale made in system */
public class Sale {
    private LocalDateTime saleTime;
    private Receipt receipt;
    private ArrayList<Item> listItem;

    private CashRegister cashRegister;
    private double runningTotalIncVat;
    private double totalVat;








    /* Creates new instance and saves time of sale */
    public Sale() {
        //should have a list
        listItem = new ArrayList<Item>();
        runningTotalIncVat = 0;
        totalVat = 0;
    }


    /* Adds an Item to the list */
    public LatestRegisteredItemDTO addItem(ItemDTO scanItem, int quantity) {
        boolean itemFound = false;

        for (Item oneItem : listItem) {
            if (oneItem.getItemDTO().getIdentifierOfItem()==(scanItem.getIdentifierOfItem())) {
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



    public PaymentDTO addPayment(double paymentByCostumer){

        this.cashRegister = new CashRegister();
        cashRegister.pay(this.runningTotalIncVat, paymentByCostumer);
        return cashRegister.getPaymentInfo();
    }
    public Receipt addReceipt(){
        PaymentDTO saleInfo = cashRegister.getPaymentInfo();

        this.receipt = new Receipt(saleInfo,listItem,totalVat);

        return this.receipt;
    }


    }



