package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersTest {
    SortNumbers sortNumbers;
    @Before
    public void setUp() throws Exception {
       sortNumbers = new SortNumbers();
    }

    @After
    public void tearDown() throws Exception {
        sortNumbers = null;
    }

    @Test
    public void sumOfNumbersSuccess() {
        int expectedValue = 4;
        //Act
        int actualValue = sortNumbers.sumOfNumbers(1232);
        //assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void sumOfNumbersFailure(){
        assertNotEquals(" ",0);
    }
}