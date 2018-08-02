package com.coldraincn.cdcleet.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ReverseTest{
    @Test
    public void testReverse(){
        Reverse reverse=new Reverse();
        assertEquals(321,reverse.reverse(123));
        assertEquals(-321,reverse.reverse(-123));
        assertEquals(21,reverse.reverse(120));
    }
}