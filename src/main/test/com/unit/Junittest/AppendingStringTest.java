package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendingStringTest {
    AppendingString obj;
    @Before
    public void setUp() throws Exception {
        obj = new AppendingString();
    }


    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void append() {
        String expectedValue = "stackrouterouterouterouterouterouteroute";
        //Act
        String actualValue = obj.append("stackroute",5);
        //assert
        assertEquals(expectedValue,actualValue);
    }
}