package com.coldraincn.cdcleet.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
/**
 * 两次循环，时间O(N),空间O(N)
 */
public class TwoSum{
    class Solution {
        public int[] twoSum2(int[] nums, int target) {
            int[] res = new int[2];
            if (nums == null || nums.length < 2)
                return res;
     
            int max = nums[0];
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i])
                    max = nums[i];
                if (min > nums[i])
                    min = nums[i];
            }
     
            int[] index = new int[max - min+1];
            target = target ;
            int other =0;
            for (int i = 0; i < nums.length; i++) {
                    other = target - nums[i];
                    if(other < min || other > max) {
                        continue;
                    }
                if(index[other- min] > 0) {
                    res[0] = index[other -min ]-1;
                    res[1] = i;
                    return res;
                }
                index[nums[i] - min] = i+1;
            }
            return res;
        }
    }
    public int[] twoSum(int[] nums,int target){
        int[] result=new int[2];
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map1.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(map1.containsKey(j)&&map1.get(j)!=i){
                result[0]=map1.get(j);
                result[1]=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=3;
        TwoSum twosum=new TwoSum();
        int[] result2=twosum.twoSum(nums, target);
        System.out.println(Arrays.toString(result2));
    }
}