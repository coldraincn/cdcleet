package com.coldraincn.cdcleet.easy;

import java.util.Arrays;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

 

示例 1：

输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]
示例 2：

输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]
 

提示：

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums 已按 非递减顺序 排序
 

进阶：

请你设计时间复杂度为 O(n) 的算法解决本问题

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = nums.length - 1;
        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare >= rightSquare){
                results[index] = leftSquare;
                left++;
            }else{
                results[index] = rightSquare;
                right--;
            }
            index--;
        }
        return results;
    }
    public static void main(String[] args) {
        SquaresofaSortedArray ssa = new SquaresofaSortedArray();
        int[] nums = {-7,-3,2,3,11};
        var result = ssa.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
