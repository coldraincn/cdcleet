package com.coldraincn.cdcleet.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

示例:

输入:
[4,3,2,7,8,2,3,1]

输出:
[5,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FANDIAA{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        int len = nums.length;
        for(int i = 0;i<len;i++){
            int tmp=nums[Math.abs(nums[i])-1];
            if(tmp>0){
                nums[Math.abs(nums[i])-1]=-tmp;
            }

        }
        for(int j=0;j<len;j++){
            if(nums[j]>0){
                out.add(j+1);
            }
        }
        return out;

    }

    public static void main(String ... args){
        int[] a = {4,3,2,7,8,2,3,1};

        FANDIAA ff = new FANDIAA();

        
    }
}