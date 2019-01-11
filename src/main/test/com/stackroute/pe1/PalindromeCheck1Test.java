package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheck1Test {
    PalindromeCheck palindromeCheck;
    @After
    public void tearDown() throws Exception {
       palindromeCheck = null;
    }
    @Before
    public void setUp() throws Exception {
        palindromeCheck = new PalindromeCheck();
    }
    /* method to test success*/
    @Test
    public void TestPalindromeSuccess() throws Exception {
        long num_1 = 988889;
        String expectedValue_1 = "number is palindrome and sum of even is greater than 25";
        //Act
        String actualValue_1 = palindromeCheck.palindrome_1(num_1);
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        //Checking for other successfull inpur
        long num_2 = 1234321;
        String expectedValue_2 = "number is palindrome and sum of even is lesser than 25";
        //Act
        String actualValue_2 = palindromeCheck.palindrome_1(num_2);
        //Assert
        assertEquals(expectedValue_2,actualValue_2);
    }
    /* method to test success*/
    @Test
    public void TestPalindromeFailure() throws Exception {
        long num = 123432;
        String expectedValue = "not a Palidrome";
        //Act
        String actualValue = palindromeCheck.palindrome_1(num);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
