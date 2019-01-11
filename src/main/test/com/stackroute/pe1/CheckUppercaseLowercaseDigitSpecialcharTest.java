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
    /* method to test success*/
    @Test
    public void TestcheckInputSuccess() {
        String expectedValue1 = "capital letter";
        //Act
        String actualValue1 = checkUppercaseLowercaseDigitSpecialchar.checkInput("A");
        //Assert
        assertEquals(expectedValue1,actualValue1);

        String expectedValue2 = "small letter";
        //Act
        String actualValue2 = checkUppercaseLowercaseDigitSpecialchar.checkInput("a");
        //Assert
        assertEquals(expectedValue2,actualValue2);

        String expectedValue3 = "Digit";
        //Act
        String actualValue3 = checkUppercaseLowercaseDigitSpecialchar.checkInput("1");
        //Assert
        assertEquals(expectedValue3,actualValue3);
    }
    /* method to test failure*/
    @Test
    public void TestcheckInput_Failure() {
        String expectedValue1 = "Special character";
        //Act
        String actualValue1 = checkUppercaseLowercaseDigitSpecialchar.checkInput("$");
        //Assert
        assertEquals(expectedValue1,actualValue1);
    }
}