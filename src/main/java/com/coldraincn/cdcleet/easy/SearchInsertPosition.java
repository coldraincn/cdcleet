package com.coldraincn.cdcleet.easy;
/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2
示例 2:

输入: [1,3,5,6], 2
输出: 1
示例 3:

输入: [1,3,5,6], 7
输出: 4
示例 4:

输入: [1,3,5,6], 0
输出: 0
 */

public class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high=nums.length - 1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high+1;
        
        
    }
    public static void main(String[] args){
        int[] nums={1,3,5,6};
        int target=7;
        SearchInsertPosition sip=new SearchInsertPosition();
        int n=sip.searchInsert(nums, target);
        System.out.println(n);
    }
}