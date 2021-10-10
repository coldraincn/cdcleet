 package com.coldraincn.cdcleet.medium;
// /**
//  * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

// 示例 1：

// 输入: "babad"
// 输出: "bab"
// 注意: "aba" 也是一个有效答案。
// 示例 2：

// // 输入: "cbbd"
// 输出: "bb"

// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//  */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
       var length = s.length();
       var lp = "";
       for(int i = 0;i<length;i++){
            for(int j = length;j>i;j--){
                if(isPalindrome(s.substring(i, j)) && lp.length()<=j-i){
                    lp = s.substring(i,j);
                }
            }
       }
       return lp;
    }
    public  boolean isPalindrome(String a){
        var len = a.length();
        var start = 0;
        var last = len-1;
        while(start < last){
            if(a.charAt(start) != a.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public boolean isPalindromic(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) {
        var sss =new LongestPalindrome();
        var aaa = "cbbd";
        var result = sss.longestPalindrome(aaa);
        System.out.println(result);
    }
}
