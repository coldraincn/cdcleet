package com.coldraincn.cdcleet.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。

 

示例 1：

输入：n = 3
输出：["((()))","(()())","(())()","()(())","()()()"]
示例 2：

输入：n = 1
输出：["()"]
 

提示：

1 <= n <= 8


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/generate-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        if(n == 0){
            return result;
        }
        dfs("",n,n,result);
        return result;
    }
    private void dfs(String append,int left,int right,List<String> res){
        if (left ==0 && right == 0){
            res.add(append);
        }
        if(left > 0){
            dfs(append + "(", left - 1, right, res);
        }
        if (right > 0 && left < right){
            dfs(append + ")", left, right - 1, res);
        }
    }
    public static void main(String[] args) {
        
    }
}
