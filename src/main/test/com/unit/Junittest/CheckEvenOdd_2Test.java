package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenOdd_2Test {
    CheckEvenOdd_2 ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckEvenOdd_2();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestCheckEvenOdd_Success() throws Exception {

        String expectedValue_1 = "jerry";
        //Act
        String actualValue_1 = ob.checkEvenOdd(22);
        //Asserts
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "tom";
        //Act
        String actualValue_2 = ob.checkEvenOdd(29);
        //Asserts
        assertEquals(expectedValue_2,actualValue_2);



    }
    @Test
    public void TestCheckEvenOdd_Failure() throws Exception {

        String expectedValue = "not a valid input";
        //Act
        String actualValue = ob.checkEvenOdd(-1);
        //Asserts
        assertEquals("this is number",expectedValue,actualValue);





    }
}