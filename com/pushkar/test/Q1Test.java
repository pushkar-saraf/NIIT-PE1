package com.pushkar.test;

import com.pushkar.stuff.Q1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test{
    private Q1 q1;

    @Before
    public void setUp(){
        this.q1 = new Q1();
    }

    @Test
    public void palindromesShouldReturnTrue(){
        assertTrue(q1.checkIfPalindrome(12321));
        assertTrue(q1.checkIfPalindrome(121));
        assertTrue(q1.checkIfPalindrome(1));
    }

    @Test
    public void nonPalindromesShouldReturnFalse(){
        assertFalse(q1.checkIfPalindrome(12));
        assertFalse(q1.checkIfPalindrome(1234));
        assertFalse(q1.checkIfPalindrome(50));
    }

    @Test
    public void resultShouldBeValid(){
        assertFalse("less than 25", q1.isGt25(1656));
        assertTrue("greater than 25", q1.isGt25(18181818));
        assertFalse("zero", q1.isGt25(103050));
    }
}