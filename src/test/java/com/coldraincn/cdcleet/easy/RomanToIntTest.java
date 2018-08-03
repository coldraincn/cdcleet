package com.coldraincn.cdcleet.easy;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanToIntTest{
    @Test
    public void testRomanToInt(){
        RomanToInt romanToInt=new RomanToInt();
        assertEquals(3,romanToInt.romanToInt("III"));
        assertEquals(4,romanToInt.romanToInt("IV"));
        assertEquals(9,romanToInt.romanToInt("IX"));
        assertEquals(58,romanToInt.romanToInt("LVIII"));
        assertEquals(1994,romanToInt.romanToInt("MCMXCIV"));
    }
}