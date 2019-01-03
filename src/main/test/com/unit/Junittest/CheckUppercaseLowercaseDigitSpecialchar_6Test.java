package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckUppercaseLowercaseDigitSpecialchar_6Test {
    CheckUppercaseLowercaseDigitSpecialchar_6 ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckUppercaseLowercaseDigitSpecialchar_6();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestcheckInput_Success() {
        String expectedValue_1 = "capital letter";
        //Act
        String actualValue_1 = ob.checkInput("A");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "small letter";
        //Act
        String actualValue_2 = ob.checkInput("a");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_3 = "Digit";
        //Act
        String actualValue_3 = ob.checkInput("1");
        //Assert
        assertEquals(expectedValue_3,actualValue_3);


    }
    @Test
    public void TestcheckInput_Failure() {
        String expectedValue_1 = "Special character";
        //Act
        String actualValue_1 = ob.checkInput("$");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);


    }
}