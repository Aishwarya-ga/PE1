package com.stackroute.pe1;

import com.stackroute.pe1.AppendingString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendingStringTest {
    AppendingString appendingString;
    @Before
    public void setUp() throws Exception {
        appendingString = new AppendingString();
    }
    @After
    public void tearDown() throws Exception {
        appendingString = null;
    }
    /* method to test success*/
    @Test
    public void appendSuccess() {
        String expectedValue = "stackrouterouterouterouterouterouteroute";
        //Act
        String actualValue = appendingString.append("stackroute",5);
        //assert
        assertEquals(expectedValue,actualValue);
    }
    /* method to test failure*/
    @Test
    public void appendFailure() {
        String expectedValue = null;
        //Act
        String actualValue = appendingString.append(" ",0);
        //assert
        assertNotEquals(expectedValue,actualValue);
    }
}