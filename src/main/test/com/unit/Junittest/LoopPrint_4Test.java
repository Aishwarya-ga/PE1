package com.unit.Junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopPrint_4Test {
    LoopPrint_4 ob;
    @Before
    public void setUp() throws Exception {
        ob = new LoopPrint_4();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void loopPrint() {
        String expectedValue="122333";
        //Act
        String actualValue = ob.loopPrint(3);
        //assert
        assertEquals(expectedValue,actualValue);


        }

}
