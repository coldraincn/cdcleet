package com.coldraincn.cdcleet.medium;

import javax.swing.plaf.multi.MultiTextUI;

/**
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。

在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。

给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的索引，否则返回 -1 。

 

示例 1：

输入：nums = [4,5,6,7,0,1,2], target = 0
输出：4
示例 2：

输入：nums = [4,5,6,7,0,1,2], target = 3
输出：-1
示例 3：

输入：nums = [1], target = 0
输出：-1
 

提示：

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
nums 中的每个值都 独一无二
nums 肯定会在某个点上旋转
-10^4 <= target <= 10^4
 

进阶：你可以设计一个时间复杂度为 O(log n) 的解决方案吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class  SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length==0)return -1;
        if(nums.length==1){
            if(nums[0]==target)return 0;
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        while(left<=right){
            int mid=(right-left)/2+left;
            if (mid==nums.length-1 || nums[mid] > nums[mid + 1]){
                index = mid+1;
                break;
            }else if(nums[left]<=nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(target>=nums[0]){

            left=0;
            right=index-1;
        }else{
            left=index;
            right=nums.length-1;
        }
   
        while(left<=right){
       
            int mid=(right-left)/2+left;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    private int bsearch(int[] nums,int first,int end,int target){
        if(target > nums[end] || target < nums[first] || end < first){
            return -1;
        }
        int mid = (first + end)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){

            return bsearch(nums, first, mid-1, target);
        }else{
            return bsearch(nums, mid+1, end, target);
        }
    }

    // private int mixSearch(int[] nums,int first,int end,int target){
    //     if(end < first){
    //         return -1;
    //     }
    //     int mid = (first + end)/2;
    //     if(nums[mid] == target){
    //         return mid;
    //     }if(nums[mid] > target){
    //         if(nums[first] < nums[mid]){
    //             return mixSearch(nums, first, mid-1, target);
    //         }else if(nums[first] < target){
    //             return 
    //         }
    //     }
    // }
}
