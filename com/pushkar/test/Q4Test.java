package com.pushkar.test;

import com.pushkar.stuff.Q4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q4Test {
    private Q4 q4;
    @Before
    public void setUp(){
        q4 = new Q4();
    }

    @Test
    public void resultShouldBeCorrect(){
        Assert.assertEquals("1", q4.printStuff(1));
        Assert.assertEquals("122", q4.printStuff(2));
    }
}
