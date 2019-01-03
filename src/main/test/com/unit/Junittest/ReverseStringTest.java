package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString obj;
    @Before
    public void setUp() throws Exception {
        obj = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void reverse() {
        String expectedValue = "nodnol";
        //Act
        String actualValue = obj.reverse("london");
        //assert
        assertEquals(expectedValue,actualValue);
    }
}