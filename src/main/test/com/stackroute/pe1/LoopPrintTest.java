package com.stackroute.pe1;

import com.stackroute.pe1.LoopPrint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopPrintTest {
    LoopPrint loopPrint;
    @Before
    public void setUp() throws Exception {
        loopPrint = new LoopPrint();
    }

    @After
    public void tearDown() throws Exception {
        loopPrint = null;
    }

    @Test
    public void loopPrintSuccess(){
        String expectedValue="122333";
        //Act
        String actualValue = loopPrint.loopPrint(3);
        //assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void loopPrintFaiure() {
        assertNotEquals(" ",loopPrint.loopPrint(0));
    }
}



