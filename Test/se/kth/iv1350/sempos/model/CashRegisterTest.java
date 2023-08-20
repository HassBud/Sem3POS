package se.kth.iv1350.sempos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents tests for the CashRegister class
 */
class CashRegisterTest {
    CashRegister testChange;
    PaymentDTO testPayment;

    /**
     * Sets up the test before the method is executed.
     * Initializes the <code>CashRegister</code> and <code>PaymentDTO</code> test instances
     */
    @BeforeEach
    void setUp() {
        testChange = new CashRegister();
        testPayment = new PaymentDTO(200,50,150);
    }

    /**
     * Tears down the test after the method is executed.
     * Clears the instances
     */
    @AfterEach
    void tearDown() {
        testChange = null;
        testPayment = null;
    }

    /**
     * Tests the <code>pay</code> method where the customer should recieve the difference between the amount
     * they gave versus the price of the item.
     */
    @Test
    void pay() {
        double changeToCostumer = testPayment.getChange();
        testChange.pay(200,50);
        double expectedChange = 200-50;
        assertEquals(changeToCostumer,expectedChange, "Failed to match change");

    }

}