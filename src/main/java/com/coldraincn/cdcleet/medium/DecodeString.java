package com.coldraincn.cdcleet.medium;

import java.util.Stack;

/***
 * 给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

 

示例 1：

输入：s = "3[a]2[bc]"
输出："aaabcbc"
示例 2：

输入：s = "3[a2[c]]"
输出："accaccacc"
示例 3：

输入：s = "2[abc]3[cd]ef"
输出："abcabccdcdcdef"
示例 4：

输入：s = "abc3[cd]xyz"
输出："abccdcdcdxyz"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/decode-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DecodeString {
    public String decodeString(String s) {
     var stack = new Stack<Integer>();
     var repeatStack = new Stack<Integer>();
     var sb = new StringBuilder();
     var length = s.length();
     for(int i = 0; i < length;i++){
      if(Character.isDigit(s.charAt(i))){
          repeatStack.push(Integer.valueOf(s.charAt(i)));
          stack.push(sb.length()-1);
          i++;
      }
      if(s.charAt(i) == ']'){
          int start = stack.pop();
          var repeatString = sb.substring(start+1);
          var repeatTime = repeatStack.pop();
          for(int j = 0;j<repeatTime;j++){
            sb.append(repeatString);
          }
          
      }
      sb.append(s.charAt(i));

     }
     return sb.toString();

    }
    public String decodeString2(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("[") != -1) {
            int leftIndex = sb.lastIndexOf("[");
            int rightIndex = sb.indexOf("]", leftIndex);
            String str = sb.substring(leftIndex + 1, rightIndex);
            int i = leftIndex - 1, count = 0, base = 1;
            while (i >= 0 && Character.isDigit(sb.charAt(i))) {
                count += base * (sb.charAt(i) - '0');
                base *= 10;
                i--;
            }
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < count; j++)
                tmp.append(str);
            sb = sb.replace(i + 1, rightIndex + 1, tmp.toString());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        var ss = new DecodeString();
        var result = ss.decodeString("3[a]2[bc]");
        System.out.println(result);
    }
}
