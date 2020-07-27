package com.coldraincn.cdcleet.medium;
/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。

示例:

输入: [10,9,2,5,3,7,101,18]
输出: 4 
解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
说明:

可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
你算法的时间复杂度应该为 O(n2) 。
进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length ==1){
            return 1;
        }
        int dp[] = new int[nums.length];
        dp[0] = 1;
        int maxsum=1;
        for(int i = 1;i<nums.length;i++){
            int max = 0;
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    max =Math.max(dp[j], max) ;
                }
            }
            dp[i] = max+1;
            maxsum = Math.max(maxsum,dp[i]);
            
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {4,10,4,3,8,9};
        var lis = new LongestIncreasingSubsequence();
        var result = lis.lengthOfLIS(nums);
        System.out.println(result);
    }
}