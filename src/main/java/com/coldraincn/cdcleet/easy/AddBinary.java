package com.coldraincn.cdcleet.easy;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1" 输出: "100" 示例 2:
 * 
 * 输入: a = "1010", b = "1011" 输出: "10101"
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int lengtha = a.length();
        int lengthb = b.length();
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        StringBuilder sb=new StringBuilder();
        int of = 0;
        if (lengtha >= lengthb) {
            for (int i = lengtha-1; i >= 0; i--) {
                
                int x = ca[i] - '0';
                int y=0;
                int j=i-(lengtha-lengthb);
                if (j >= 0) {
                    y = cb[j] - '0';
                }
                int z = x + y + of;
                sb.append(z%2);
                of=z/2;
            }
        }else{
            for (int i = lengthb-1; i >=0; i--) {
           
                int y = cb[i] - '0';
                int x=0;
                int j=i-(lengthb-lengtha);
                if (j >= 0) {
                    x = ca[j] - '0';
                }
                int z = x + y + of;
                sb.append(z%2);
                of=z/2;
            } 
        }
        if(of==1){
            sb.append(1);
        }
        String result=sb.reverse().toString();
        return result;
    }
    public static void main(String[] args){
        String a="11";
        String b="1";
        AddBinary ab=new AddBinary();
        System.out.println(ab.addBinary(a, b));
    }
}