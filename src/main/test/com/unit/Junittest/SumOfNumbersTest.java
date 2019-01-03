package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersTest {
    SumOfNumbers obj;
    @Before
    public void setUp() throws Exception {
        obj = new SumOfNumbers();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void sumOfNumber() {
        String string = "12 13 2 4";
        int expectedValue = 31;
        //Act
        int actualValue = obj.sumOfNumber(string);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}