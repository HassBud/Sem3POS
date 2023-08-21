package se.kth.iv1350.sempos.Integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.sempos.model.InvalidIdentifierOfItemException;
import se.kth.iv1350.sempos.model.ItemDTO;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents a test that is run whenever an item is scanned
 */
class InventorySystemTest {
    InventorySystem testItemID;

    /**
     * sets up the test. Initializes the instance of <code>InventorySystem</code>
     */
    @BeforeEach
    void setUp() {
        testItemID = new InventorySystem();
    }

    /**
     * Tears down the test environment.
     */
    @AfterEach
    void tearDown() {
        testItemID = null;
    }

    /**
     * Tests the method <code>getItemInformation</code> and checks so that the scanned item IDs are in the system.
     * @throws InvalidIdentifierOfItemException If the item ID does not exist in the database
     * @throws DatabaseFailureException If the database cannot be contacted
     */
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