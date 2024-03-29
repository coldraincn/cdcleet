package com.coldraincn.cdcleet.medium;

import java.util.Arrays;

/*
给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。

换句话说，s1 的排列之一是 s2 的 子串 。

 

示例 1：

输入：s1 = "ab" s2 = "eidbaooo"
输出：true
解释：s2 包含 s1 的排列之一 ("ba").
示例 2：

输入：s1= "ab" s2 = "eidboaoo"
输出：false
 

提示：

1 <= s1.length, s2.length <= 104
s1 和 s2 仅包含小写字母


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutation-in-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1a = new int[26];
        int[] s2a = new int[26];
        int n = s1.length();
        int m = s2.length();
        if (n > m) {
            return false;
        }
        for(int i = 0; i<n;i++){
            ++s1a[s1.charAt(i)-'a']; 
            ++s2a[s2.charAt(i)-'a'];
        }
        if(Arrays.equals(s1a, s2a)){
            return true;
        }
        for(int j = n;j<m;j++){
            ++s2a[s2.charAt(j) - 'a'];
            --s2a[s2.charAt(j - n) - 'a'];
            if (Arrays.equals(s1a, s2a)) {
                return true;
            }
        }
        return false;

    }
}
