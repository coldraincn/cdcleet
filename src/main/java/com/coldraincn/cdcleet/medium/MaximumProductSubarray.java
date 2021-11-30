package com.coldraincn.cdcleet.medium;
/**
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。

 

示例 1:

输入: [2,3,-2,4]
输出: 6
解释: 子数组 [2,3] 有最大乘积 6。
示例 2:

输入: [-2,0,-1]
输出: 0
解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-product-subarray
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[][] dp = new int[nums.length][2];
        //小
        dp[0][0] = nums[0];
        //大
        dp[0][1] = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>=0){
                dp[i][0] = Math.min(dp[i-1][0]*nums[i], nums[i]);
                dp[i][1] = Math.max(nums[i], dp[i-1][1]*nums[i]);
            }else{
                dp[i][0] = Math.min(nums[i], dp[i-1][1]*nums[i]);
                dp[i][1] = Math.max(nums[i], dp[i-1][0]*nums[i]);
            }
 
            
        }
        int max = dp[0][1];
        for(int j = 0;j<nums.length;j++){

                max = Math.max(dp[j][1],max);
            
        }
        return max;
    }
    public static void main(String[] args) {
        var ss = new MaximumProductSubarray();
        int[] a = {0,2};
        var result = ss.maxProduct(a);
        System.out.println(result);
    }
}
