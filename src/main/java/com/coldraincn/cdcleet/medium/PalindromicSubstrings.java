package com.coldraincn.cdcleet.medium;
/**
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。

回文字符串 是正着读和倒过来读一样的字符串。

子字符串 是字符串中的由连续字符组成的一个序列。

具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。

 

示例 1：

输入：s = "abc"
输出：3
解释：三个回文子串: "a", "b", "c"
示例 2：

输入：s = "aaa"
输出：6
解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 

提示：

1 <= s.length <= 1000
s 由小写英文字母组成

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/palindromic-substrings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int result = 0;
        for(int i = 0;i<s.length();i++){
            result += innerCount(i, i, s);
            result += innerCount(i, i+1, s);

        }
        return result;
    }
    private int innerCount(int left,int right,String s){
        int count = 0;
        while((left >= 0 && right < s.length()) && (s.charAt(left) == s.charAt(right)) ){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
