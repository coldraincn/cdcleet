package com.coldraincn.cdcleet.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。

 

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]
 

提示：

1 <= nums.length <= 105
k 的取值范围是 [1, 数组中不相同的元素的个数]
题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
 

进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/top-k-frequent-elements
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            if(map.containsKey(num)){
                int origin = map.get(num);
                map.put(num, origin+1);
            }else{
                map.put(num, 1);
            }
        }
        PriorityQueue<Integer> qu = new PriorityQueue<>((a,b) ->map.get(a) - map.get(b));
        for(int key:map.keySet()){
            if(qu.size()<k){
                qu.add(key);
            }else{
                if(map.get(qu.peek()) < map.get(key)){
                    qu.poll();
                    qu.add(key);
                }
            }
        }
        int[] result = new int[k];
        for(int i = 0;i<k;i++){
            result[i] = qu.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentElements tfe = new TopKFrequentElements();
        int[] a = {1,1,1,2,2,3};
        var result = tfe.topKFrequent(a, 2);
        System.out.println(Arrays.toString(result));
    }
}
