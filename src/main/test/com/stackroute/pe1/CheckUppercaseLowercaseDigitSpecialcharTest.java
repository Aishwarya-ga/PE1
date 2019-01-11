package com.stackroute.pe1;

import com.stackroute.pe1.CheckUppercaseLowercaseDigitSpecialchar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckUppercaseLowercaseDigitSpecialcharTest {
    CheckUppercaseLowercaseDigitSpecialchar checkUppercaseLowercaseDigitSpecialchar;
    @Before
    public void setUp() throws Exception {
        checkUppercaseLowercaseDigitSpecialchar = new CheckUppercaseLowercaseDigitSpecialchar();
    }

    @After
    public void tearDown() throws Exception {
        checkUppercaseLowercaseDigitSpecialchar = null;
    }

    @Test
    public void TestcheckInput_Success() {
        String expectedValue_1 = "capital letter";
        //Act
        String actualValue_1 = checkUppercaseLowercaseDigitSpecialchar.checkInput("A");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "small letter";
        //Act
        String actualValue_2 = checkUppercaseLowercaseDigitSpecialchar.checkInput("a");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_3 = "Digit";
        //Act
        String actualValue_3 = checkUppercaseLowercaseDigitSpecialchar.checkInput("1");
        //Assert
        assertEquals(expectedValue_3,actualValue_3);


    }
    @Test
    public void TestcheckInput_Failure() {
        String expectedValue_1 = "Special character";
        //Act
        String actualValue_1 = checkUppercaseLowercaseDigitSpecialchar.checkInput("$");
        //Assert
        assertEquals(expectedValue_1,actualValue_1);


    }
}