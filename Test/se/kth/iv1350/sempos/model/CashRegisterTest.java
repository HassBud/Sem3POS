package se.kth.iv1350.sempos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {
    CashRegister testChange;
    PaymentDTO testPayment;
    @BeforeEach
    void setUp() {
        testChange = new CashRegister();
        testPayment = new PaymentDTO(200,50,150);
    }
    @AfterEach
    void tearDown() {
        testChange = null;
        testPayment = null;
    }
    @Test
    void pay() {
        double changeToCostumer = testPayment.getChange();
        testChange.pay(200,50);
        double countedChange = testChange.getPaymentInfo().getChange();
        assertNotEquals(changeToCostumer,countedChange, "Failed to match change");

    }

  //  @Test
  //  void getPaymentInfo() {
  //  }
}