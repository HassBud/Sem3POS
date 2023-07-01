package se.kth.iv1350.sempos.Integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    void getItemInformation() {
        ItemDTO firstItem = testItemID.getItemInformation(1);
        assertEquals(1,firstItem.getIdentifierOfItem(), "Item Äpple exists");
        ItemDTO secondItem = testItemID.getItemInformation(2);
        assertEquals(2,secondItem.getIdentifierOfItem(), "Item Bok exists");
        ItemDTO thirdItem = testItemID.getItemInformation(3);
        assertEquals(3,thirdItem.getIdentifierOfItem(), "Item Mjölk exists");
        ItemDTO itemNotOnList = testItemID.getItemInformation(5);
        assertNull(itemNotOnList, "No existing Item");

    }
}