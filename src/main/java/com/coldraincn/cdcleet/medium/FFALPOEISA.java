package com.coldraincn.cdcleet.medium;

import java.util.Arrays;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

进阶：

你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 

示例 1：

输入：nums = [5,7,7,8,8,10], target = 8
输出：[3,4]
示例 2：

输入：nums = [5,7,7,8,8,10], target = 6
输出：[-1,-1]
示例 3：

输入：nums = [], target = 0
输出：[-1,-1]
 

提示：

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums 是一个非递减数组
-109 <= target <= 109

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FFALPOEISA {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 ){
            return new int[]{-1,-1};
        }if(nums.length == 1 ){
            if(nums[0] == target){
                return new int[]{0,0};
            }else{
            return new int[]{-1,-1};
           }
        }
        int left = 0;
        int right = nums.length - 1;
        int leftIndex = -1;
        int rightIndex = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                leftIndex = mid;
                right = mid - 1;
            }
        }
      
        if(leftIndex == -1){
            return new int[]{-1,-1};
        }
        left = leftIndex;
        right = nums.length - 1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                rightIndex = mid;
                left = mid + 1;
            }
        }

        return new int[]{leftIndex,rightIndex};
    }
    public static void main(String[] args) {
        FFALPOEISA aa = new FFALPOEISA();
        int[] ff = {1};
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        var result = aa.searchRange(nums, target);
        System.out.print(Arrays.toString(result));
    }
}
