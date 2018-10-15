package com.coldraincn.cdcleet.easy;
/**
报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。

注意：整数顺序将表示为一个字符串。

 

示例 1:

输入: 1
输出: "1"
示例 2:

输入: 4
输出: "1211"
 */
public class CountAndSay{
    public String countAndSay(int n) {
        if(n==1){
            return 1+"";
        }
        String last = countAndSay(n-1)+'s';
        int num=1;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<last.length()-1;i++){
             char bar=last.charAt(i);
             char foo=last.charAt(i+1);
             if(bar==foo){
                num+=1;
             }else{
                sb.append(num).append(bar);
                num=1;
             }
             
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int n=4;
        CountAndSay cas=new CountAndSay();
        String result = cas.countAndSay(n);
        System.out.println(result);

    }
}