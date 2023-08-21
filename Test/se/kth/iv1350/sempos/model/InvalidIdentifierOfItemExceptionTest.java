package se.kth.iv1350.sempos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.sempos.Integration.DatabaseFailureException;
import se.kth.iv1350.sempos.Integration.InventorySystem;

import static org.junit.jupiter.api.Assertions.*;

class InvalidIdentifierOfItemExceptionTest {

    InventorySystem inventory;
@Test
    public void InvalidIdentifier(){
    String exceptionMessage = "Item ID not valid";
    InvalidIdentifierOfItemException noValidID = new InvalidIdentifierOfItemException(exceptionMessage);
    assertEquals(exceptionMessage,noValidID.getMessage(), "The Item ID does not exist. ");


}


}