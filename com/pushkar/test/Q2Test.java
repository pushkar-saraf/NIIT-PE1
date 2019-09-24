package com.pushkar.test;
import com.pushkar.stuff.Q2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2Test{
    private Q2 q2;
    @Before
    public void setup(){
        q2= new Q2();
    }

    @Test
    public void invalidInputShouldReturnInvalidOutput(){
        assertEquals("Invalid input", q2.stuffToPrint(15));
        assertEquals("Invalid input", q2.stuffToPrint(35));
    }

    @Test
    public void evenNumbersShouldReturnJerry(){
        assertEquals("Jerry", q2.stuffToPrint(22));
        assertEquals("Jerry", q2.stuffToPrint(24));
    }

    @Test
    public void oddNumbersShouldReturnTom(){
        assertEquals("Tom", q2.stuffToPrint(21));
        assertEquals("Tom", q2.stuffToPrint(29));
    }

}