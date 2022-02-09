package com.coldraincn.cdcleet.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。

异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。

 

示例 1:

输入: s = "cbaebabacd", p = "abc"
输出: [0,6]
解释:
起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 示例 2:

输入: s = "abab", p = "ab"
输出: [0,1,2]
解释:
起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 

提示:

1 <= s.length, p.length <= 3 * 104
s 和 p 仅包含小写字母

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-all-anagrams-in-a-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
       
        int s_len = s.length();
        int p_len = p.length();
        if(s_len<p_len){
            return res;
        }
        for(int i = 0; i < s_len-p_len ;i++){
            if(isAnagrams(s.substring(i, i+p_len),p)){
                res.add(i);
            }
        }
        return res;
    }
    private boolean isAnagrams(String s,String p){
        char[] s_char = s.toCharArray();
        Arrays.sort(s_char);
        String s_sort = new String(s_char);
        char[] p_char = s.toCharArray();
        Arrays.sort(p_char);
        String p_sort = new String(p_char);
        return s_sort.equals(p_sort);
    }
    public static void main(String[] args) {
        FindAllAnagramsinaString fa = new FindAllAnagramsinaString();

    }
}
