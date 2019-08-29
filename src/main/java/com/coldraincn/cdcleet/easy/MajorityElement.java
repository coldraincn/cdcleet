package com.coldraincn.cdcleet.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。

示例 1:

输入: [3,2,3]
输出: 3
示例 2:

输入: [2,2,1,1,1,2,2]
输出: 2

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/majority-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MajorityElement{
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> aaa = new HashMap<>();
        int maxNum=0;
        int maxCount = 0;
        for(int num:nums){
            int count = aaa.getOrDefault(num, 0);
            int nextCount = count+1;
            aaa.put(num, nextCount);
            if(nextCount>maxCount){
                maxCount=nextCount;
                maxNum=num;
            }
        }
        return maxNum;

    }
    public static void main(String ...args){
        int[] test ={2,2,1,1,1,2,2};
        MajorityElement me = new MajorityElement();
        int result = me.majorityElement(test);
        System.out.println(result);
    }
}