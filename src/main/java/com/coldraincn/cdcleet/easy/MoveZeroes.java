package com.coldraincn.cdcleet.easy;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。

 

示例 1:

输入: nums = [0,1,0,3,12][1,0,0,3,12][1,3,0,0,12][1,3,12,0,0]
输出: [1,3,12,0,0]
示例 2:

输入: nums = [0]
输出: [0]
 

提示:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

进阶：你能尽量减少完成的操作次数吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/move-zeroes
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0,j = 0;
        for(i = 0 ; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length)
        {
            nums[j++] = 0;
        }
    }
    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
