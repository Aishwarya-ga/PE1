package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString;
    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        reverseString = null;
    }

    @Test
    public void reverseSuccess() {
        String expectedValue = "nodnol";
        //Act
        String actualValue = reverseString.reverse("london");
        //assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void reverseFailure(){
        assertEquals(" ", reverseString.reverse(" "));
    }
}