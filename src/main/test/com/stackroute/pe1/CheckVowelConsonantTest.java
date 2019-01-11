package com.stackroute.pe1;

import com.stackroute.pe1.CheckVowelConsonant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelConsonantTest {
    CheckVowelConsonant checkVowelConsonant;
    @Before
    public void setUp() throws Exception {
        checkVowelConsonant = new CheckVowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        checkVowelConsonant = null;
    }
    /* method to test success*/
    @Test
    public void TestCheckVowelConsonantSuccess() {
        String expectedValue_1 = "vowel";
        //Act
        String actualValue_1 = checkVowelConsonant.checkVowelConsonant("a");
        //Asserts
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "consonant";
        //Act
        String actualValue_2 = checkVowelConsonant.checkVowelConsonant("b");
        //Asserts
        assertEquals(expectedValue_2,actualValue_2);
    }
    /* method to test failure*/
    @Test
    public void TestCheckVowelConsonantFailure() {
        String expectedValue = "invalid input";
        //Act
        String actualValue = checkVowelConsonant.checkVowelConsonant("1");
        //Asserts
        assertEquals(expectedValue,actualValue);
    }
}