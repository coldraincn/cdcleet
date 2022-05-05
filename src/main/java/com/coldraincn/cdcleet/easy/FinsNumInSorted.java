package com.coldraincn.cdcleet.easy;

public class FinsNumInSorted {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int leftindex = -1;
        int rightindex = -1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                leftindex = mid;
                right = mid - 1;
            }
                
        }
        left = leftindex;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                left = left + 1;
                right = mid;
            }else if(nums[mid] < target){
                left = mid +1;
            
            }else{
                rightindex = mid;
                right = mid -1;
            }
                
        }


        return rightindex-leftindex +1;
    }
}
