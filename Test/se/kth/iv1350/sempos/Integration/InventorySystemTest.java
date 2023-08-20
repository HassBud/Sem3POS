package se.kth.iv1350.sempos.Integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.sempos.model.InvalidIdentifierOfItemException;
import se.kth.iv1350.sempos.model.ItemDTO;

import static org.junit.jupiter.api.Assertions.*;

class InventorySystemTest {
    InventorySystem testItemID;

    @BeforeEach
    void setUp() {
        testItemID = new InventorySystem();
    }
    @AfterEach
    void tearDown() {
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

    }
}