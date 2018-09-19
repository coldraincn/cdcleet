package com.coldraincn.cdcleet.easy;
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 
 */
public class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs){
        int length = strs.length;
        if(length==0){
            return "";
        }
        String prefixString = lcpMerge(strs, 0, length-1);
        return prefixString;
    }
  
    public static String lcpMerge(String[] strs,int min,int max){
        if(min==max){
            return strs[min];
        }
        int mid=(max-min)/2;
        String minString=lcpMerge(strs,min,mid+min);
        String maxString=lcpMerge(strs,mid+min+1, max);
        int lengthMin=minString.length();
        int lengthMax=maxString.length();
        
        int minCount=lengthMin;
        if(lengthMin>lengthMax){
            minCount=lengthMax;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<minCount;i++){
            if(minString.charAt(i)!=maxString.charAt(i)){
                break;
            }
            sb.append(minString.charAt(i));
        }
        return sb+"";

    }
    public static void main(String[] args){
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"flcaa","","flcaa","flower"};
        LongestCommonPrefix lcp=new LongestCommonPrefix();
        String prefix=lcp.longestCommonPrefix(strs);
        System.out.println(prefix);

    }
}