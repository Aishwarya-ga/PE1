package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelConsonantTest {
    CheckVowelConsonant ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckVowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void TestCheckVowelConsonant_Success() {
        String expectedValue_1 = "vowel";
        //Act
        String actualValue_1 = ob.checkVowelConsonant("a");
        //Asserts
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "consonant";
        //Act
        String actualValue_2 = ob.checkVowelConsonant("b");
        //Asserts
        assertEquals(expectedValue_2,actualValue_2);
    }

    @Test
    public void TestCheckVowelConsonant_Failure() {

        String expectedValue = "invalid input";
        //Act
        String actualValue = ob.checkVowelConsonant("1");
        //Asserts
        assertEquals(expectedValue,actualValue);
    }
}