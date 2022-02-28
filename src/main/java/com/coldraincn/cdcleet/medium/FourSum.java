package com.coldraincn.cdcleet.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：

0 <= a, b, c, d < n
a、b、c 和 d 互不相同
nums[a] + nums[b] + nums[c] + nums[d] == target
你可以按 任意顺序 返回答案 。

 

示例 1：

输入：nums = [1,0,-1,0,-2,2], target = 0
输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
示例 2：

输入：nums = [2,2,2,2,2], target = 8
输出：[[2,2,2,2]]
 

提示：

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/4sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
         if (nums == null || nums.length < 4) {
            return result;
        }
         Arrays.sort(nums);
         int length = nums.length;
         for(int i = 0;i<length-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }

            for(int j = i+1;j<length-2;j++){
             
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                int left = j+1;
                int right = length -1;
                while(left < right){
                    int tmp = nums[i]+nums[j]+nums[left]+nums[right];
                    if(tmp == target){
                 
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left<right && nums[left] == nums[left+1]){
                            left++;
                        }
                        left++;
                        while(left<right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    }else if(tmp<target){
                        
                        left++;
                    }else{
                        
                        right--;
                    }
                }
            }
         }
         return result;
    }
}
