package com.coldraincn.cdcleet.easy;
/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。

你找到的子数组应是最短的，请输出它的长度。

示例 1:

输入: [2, 6, 4, 8, 10, 9, 15]
输出: 5
解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
说明 :

输入的数组长度范围在 [1, 10,000]。
输入的数组可能包含重复元素 ，所以升序的意思是<=。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SUCS{
    public int findUnsortedSubarray(int[] nums) {
        int min = 0;
        if(nums.length==1){
            return 0;
        }
        int max = nums.length;
        for(int i = 0;i<nums.length;i++){
            int next = i+1;
            min=i;
            if(next == nums.length){
                break;
            }

            if(nums[i]>nums[next]){
                
                break;
            }

        }
        for(int j = nums.length-1;j>=0;j--){
            int last = j-1;
            max=j;
            if(last == -1){
                break;
            }
            if(nums[j]<nums[last]){
               
                break;
            }
        }
        int a=0;
        int b= nums.length;
        for(int i=0;i<nums.length;i++ ){
            a=i;
            if(nums[i]>=nums[min]){
                break;
            }
        }
        for(int j = nums.length-1;j>=0;j--){
            b=j;
            if(nums[j]<=nums[max]){
                break;
            }
        }
        if(nums[a]==nums[b]){
            return 0;
        }
        if(b>a){
            return b-a+1;
        }
        return 0;
        

    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        SUCS sucs = new SUCS();
        int result = sucs.findUnsortedSubarray(nums);
        System.out.println(result);
    }
}