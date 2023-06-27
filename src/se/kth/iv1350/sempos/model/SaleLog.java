package se.kth.iv1350.sempos.model;

/* Stores information about the sale */
public class SaleLog {
    private Receipt receipt;

    /* Gets sale information from the receipt */
    public SaleLog(Receipt receipt) {
    this.receipt = receipt;
    }





    /* Presents final payment for customer.  */
    public double finalPayment(Receipt runningTotal) {
        return runningTotal.getRunningTotal();
    } //?? ANvänds när?


    /* Getters */
   /* public String getNameOfItem() {
        return nameOfItem;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public double getTotalAmountOfSaleIncVAT() {
        return totalAmountOfSaleIncVAT;
    }

    */
}

