package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome_1Test {
    Palindrome_1 ob;
    @After
    public void tearDown() throws Exception {
       ob = null;
    }

    @Before
    public void setUp() throws Exception {
        ob = new Palindrome_1();

    }

    @Test
    public void TestPalindrome_Success() throws Exception {

        long num_1 = 988889;
        String expectedValue_1 = "number is palindrome and sum of even is greater than 25";
        //Act
        String actualValue_1 = ob.palindrome_1(num_1);
        //Assert
        assertEquals(expectedValue_1,actualValue_1);



        long num_2 = 1234321;
        String expectedValue_2 = "number is palindrome and sum of even is lesser than 25";
        //Act
        String actualValue_2 = ob.palindrome_1(num_2);
        //Assert
        assertEquals(expectedValue_2,actualValue_2);
    }

    @Test
    public void TestPalindrome_Failure() throws Exception {

        long num = 123432;
        String expectedValue = "not a Palidrome";
        //Act
        String actualValue = ob.palindrome_1(num);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
