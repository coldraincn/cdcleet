package com.coldraincn.cdcleet.easy;

import java.util.HashMap;
import java.util.HashSet;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
       var hm = new HashSet<Integer>();
       for(int i = 0;i<nums.length;i++){
           if(hm.contains(nums[i])){
               return nums[i];
           }
           hm.add(nums[i]);
       }
       return -1;
    }
}
