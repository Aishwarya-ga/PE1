package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumCheckTest {
    RandomNumCheck randomNumCheck;
    @Before
    public void setUp() throws Exception {
        randomNumCheck = new RandomNumCheck();
    }

    @After
    public void tearDown() throws Exception {
        randomNumCheck = null;
    }

    @Test
    public void TestCheckNumberSuccess() {
        String expectedValue_1 = "Number guessed is lesser";
        //Act
        String actualValue_1 = randomNumCheck.checkNumber(14);
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

        String expectedValue_2 = "Number guessed is greater";
        //Act
        String actualValue_2 = randomNumCheck.checkNumber(31);
        //Assert
        assertEquals(expectedValue_2,actualValue_2);

        String expectedValue_3 = "Number guessed is correct";
        //Act
        String actualValue_3 = randomNumCheck.checkNumber(29);
        //Assert
        assertEquals(expectedValue_3,actualValue_3);
    }
    @Test
    public void TestCheckNumberFailure() {
        String expectedValue_1 = "null";
        //Act
        String actualValue_1 = randomNumCheck.checkNumber(-1);
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

    }
}