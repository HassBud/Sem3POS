package se.kth.iv1350.sempos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
import se.kth.iv1350.sempos.Integration.InventorySystem;

import static org.junit.jupiter.api.Assertions.*;

class InvalidIdentifierOfItemExceptionTest {
    InvalidIdentifierOfItemException testException;
    InventorySystem testItemID;

    @BeforeEach
    void setUp() {
        String exceptionMessage = "Testing exception for invalid ID";
        testException = new InvalidIdentifierOfItemException(exceptionMessage);
        testItemID = new InventorySystem();
    }

    @AfterEach
    void tearDown() {
        testException = null;
        testItemID = null;
    }

    @Test
    void getItemInformation() throws InvalidIdentifierOfItemException, DatabaseFailureException {
        ItemDTO firstItem = testItemID.getItemInformation(1);
        assertEquals(1,firstItem.getIdentifierOfItem(), "Item ID does not match");
        ItemDTO secondItem = testItemID.getItemInformation(2);
        assertEquals(2,secondItem.getIdentifierOfItem(), "Item ID does not match");
        ItemDTO thirdItem = testItemID.getItemInformation(3);
        assertEquals(3,thirdItem.getIdentifierOfItem(), "Item ID does not match");
        String exceptionMessage = "Testing exception for invalid ID";
        assertEquals(exceptionMessage, testException.getMessage(), "Item ID is not existing.");
    }
}