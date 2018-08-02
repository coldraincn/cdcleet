package com.coldraincn.cdcleet.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PalindromeTest{
    @Test
    public void testPalindrome(){
        Palindrome palindrome=new Palindrome();
        assertEquals(false,palindrome.isPalindrome(-12321));
        assertEquals(true,palindrome.isPalindrome(12321));
        assertEquals(false,palindrome.isPalindrome(123));
    }
}