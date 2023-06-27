package se.kth.iv1350.sempos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {
private Receipt testReceipt;
private Item testItem;
    @BeforeEach
    void setUp() {
        testReceipt = new Receipt();
        testItem = new Item(new ItemDTO(3,"Mjölk",10,0.12));
    }

    @AfterEach
    void tearDown() {
        testReceipt = null;
        testItem = null;
    }

    @Test
    void addItemToReceipt() {
        double startPrice = testReceipt.getRunningTotal();
        testReceipt.addItemToReceipt(testItem);
        double priceOnReceipt = testReceipt.getRunningTotal();
        assertNotEquals(startPrice,priceOnReceipt, "Failed matched price");
    }
}