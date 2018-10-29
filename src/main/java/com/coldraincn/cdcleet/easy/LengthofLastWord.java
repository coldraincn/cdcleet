package com.coldraincn.cdcleet.easy;
/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5
 */
public class LengthofLastWord{
    public int lengthOfLastWord(String s) {
            int length = s.length();
            int count=0;
            for(int i=length-1;i>=0;i--){
                char word = s.charAt(i);
                if(word!=' '){
                    count++;
                }else{
                    break;
                }
                if(i==0){
                    count=0;
                }
            }
            return count;
    }
    public static void main(String[] args){
        String s="a";
        LengthofLastWord llw = new LengthofLastWord();
        int n= llw.lengthOfLastWord(s);
        System.out.print(n);
    }
}   
