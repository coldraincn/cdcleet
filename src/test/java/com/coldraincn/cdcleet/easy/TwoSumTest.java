package com.coldraincn.cdcleet.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TwoSumTest{
    @Test
    public void testTwosum(){
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] result={0,1};
        TwoSum twosum=new TwoSum();
        int[] result2=twosum.twoSum(nums, target);
        assertEquals(0,result2[0]);
        assertEquals(1,result2[1]);
    }
}