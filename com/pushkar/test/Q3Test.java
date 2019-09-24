package com.pushkar.test;

import com.pushkar.stuff.Q3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.AnnotatedArrayType;

public class Q3Test {
    private Q3 q3;
    @Before
    public void setUp(){
        q3 = new Q3();
    }

    @Test
    public void invalidStringsShouldBeCaught(){
        Assert.assertEquals("Invalid input", q3.printInfo("122x!"));
        Assert.assertEquals("Invalid input", q3.printInfo("wow!"));
    }

    @Test
    public void vowelsShouldReturnVowels(){
        Assert.assertEquals("Vowel ", q3.printInfo("a"));
        Assert.assertEquals("Vowel ", q3.printInfo("A"));
        Assert.assertEquals("Vowel Vowel ", q3.printInfo("aA"));
    }

    @Test
    public void consonantsShouldReturnConsonants(){
        Assert.assertEquals("Consonant ", q3.printInfo("t"));
        Assert.assertEquals("Consonant ", q3.printInfo("T"));
        Assert.assertEquals("Consonant Consonant ", q3.printInfo("tS"));
    }
}
