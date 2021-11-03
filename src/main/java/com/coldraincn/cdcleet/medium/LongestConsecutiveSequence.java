package com.coldraincn.cdcleet.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

请你设计并实现时间复杂度为 O(n) 的算法解决此问题。

 

示例 1：

输入：nums = [100,4,200,1,3,2]
输出：4
解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
示例 2：

输入：nums = [0,3,7,2,5,8,4,6,0,1]
输出：9
 

提示：

0 <= nums.length <= 105
-109 <= nums[i] <= 109

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        Set<Integer> pass = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            sets.add(nums[i]);
        }
        int max = 1;
        for(int i = 0;i<nums.length;i++){
            if(pass.contains(nums[i])){
                continue;
            }
            int curLenth = 1;
            var curMin = nums[i];
            var curPlus = nums[i];
            pass.add(nums[i]);
            while(sets.contains(--curMin)){
                pass.add(curMin);
                curLenth++;
            }
            while(sets.contains(++curPlus)){
                pass.add(curPlus);
                curLenth++;
            }
            max = max >= curLenth ? max : curLenth;

        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {0,3,7,2,5,8,4,6,0,1};
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        var result  = lcs.longestConsecutive(a);
        System.out.println(result);
    }
}
