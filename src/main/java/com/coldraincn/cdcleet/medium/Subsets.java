package com.coldraincn.cdcleet.medium;
import java.util.ArrayList;
import java.util.List;
/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。

 

示例 1：

输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
示例 2：

输入：nums = [1]
输出：[[],[1]]
 输入：nums = [1,2]
输出：[[],[1],[2],[1,2]]

提示：

1 <= nums.length <= 10
-10 <= nums[i] <= 10
nums 中的所有元素 互不相同

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/subsets
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class  Subsets {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<>());
        for(int num:nums){
            var result_lenth = result.size();
            List<Integer> subList = new ArrayList<Integer>();
            for(int i = 0;i<result_lenth;i++){
                var curList = new ArrayList<>(result.get(i));
                curList.add(num);
                result.add(curList);
            }
        }

        return result;
    }
}
