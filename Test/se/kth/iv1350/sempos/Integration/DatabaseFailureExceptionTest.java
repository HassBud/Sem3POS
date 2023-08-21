package se.kth.iv1350.sempos.Integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.sempos.model.InvalidIdentifierOfItemException;
import se.kth.iv1350.sempos.model.ItemDTO;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseFailureExceptionTest {

    @Test
    public void dataFaliureException(){
        String exceptionMessage = "Not able to connect to server";
        DatabaseFailureException noConnectionToServer = new DatabaseFailureException(exceptionMessage);
        assertEquals(exceptionMessage, noConnectionToServer.getMessage(), "Not able to connect correctly to server");
    }



}