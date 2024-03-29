package com.coldraincn.cdcleet.medium;
import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

 

示例 1：

输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
示例 2：

输入：nums = [0,1]
输出：[[0,1],[1,0]]
示例 3：

输入：nums = [1]
输出：[[1]]
 

提示：

1 <= nums.length <= 6
-10 <= nums[i] <= 10
nums 中的所有整数 互不相同

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Permutations {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        
        var records = new ArrayList<Integer>();
        getResult(nums,records);
        return result;
    }
    private void getResult(int[] nums,List<Integer> records){
        if(records.size() == nums.length){
            result.add(new ArrayList<>(records));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(records.contains(nums[i])){
                continue;
            }
            records.add(nums[i]);
            getResult(nums, records);
            records.remove(records.size()-1);
        }       

    }
    public static void main(String[] args) {
        var sss = new Permutations();
        int[] aaa = {1,2,3};
        var result = sss.permute(aaa);
        System.out.println(result);
    }
}
