package com.stackroute.pe1;

import com.stackroute.pe1.CheckEvenOdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenOddTest {
    CheckEvenOdd checkEvenOdd;
    @Before
    public void setUp() throws Exception {
        checkEvenOdd = new CheckEvenOdd();
    }

    @After
    public void tearDown() throws Exception {
        checkEvenOdd = null;
    }

    @Test
    public void TestCheckEvenOdd_Success() throws Exception {
        String expectedValue_1 = "jerry";
        //Act
        String actualValue_1 = checkEvenOdd.checkEvenOdd(22);
        //Asserts
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "tom";
        //Act
        String actualValue_2 = checkEvenOdd.checkEvenOdd(29);
        //Asserts
        assertEquals(expectedValue_2,actualValue_2);
    }
    @Test
    public void TestCheckEvenOdd_Failure() throws Exception {
        String expectedValue = "not a valid input";
        //Act
        String actualValue = checkEvenOdd.checkEvenOdd(-1);
        //Asserts
        assertEquals("this is number",expectedValue,actualValue);
    }
}