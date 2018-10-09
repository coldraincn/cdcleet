package com.coldraincn.cdcleet.easy;
/**
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */

public class ImplementstrStr{
    public int strStr(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();
        if(M==0){
            return 0;
        }
        if(N<M){
            return -2;
        }
        int i,j;
        for(i=0,j=0;i<N&&j<M;i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }else{
                i-=j;
                j=0;
                
            }
        } 
        if(j==M){
            return i-M;
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack="mississippi";
        String needle="issip";
        ImplementstrStr iss=new ImplementstrStr();
        int n=iss.strStr(haystack, needle);
        System.out.println(n);
    }
}