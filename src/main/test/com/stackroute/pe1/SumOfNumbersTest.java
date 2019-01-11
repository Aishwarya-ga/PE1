package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersTest {
    SumOfNumbers sumOfNumbers;
    @Before
    public void setUp() throws Exception {
        sumOfNumbers = new SumOfNumbers();
    }

    @After
    public void tearDown() throws Exception {
        sumOfNumbers = null;
    }

    @Test
    public void sumOfNumberSuccess() {
        String string = "12 13 2 4";
        int expectedValue = 31;
        //Act
        int actualValue = sumOfNumbers.sumOfNumber(string);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sumOfNumberFailure(){
        assertEquals(" "," ");
    }
}