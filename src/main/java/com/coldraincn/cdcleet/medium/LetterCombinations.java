package com.coldraincn.cdcleet.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。



示例:

输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();  //使用一个集合来存储所有的字母组合结果
        if (digits == null || digits.length() == 0) return combinations;

        //将号码字母对应关系存储进Map
        HashMap<Character, String[]> map = new HashMap<>() {{    //存储为数组更好操作
            put('2', new String[]{"a", "b", "c"});
            put('3', new String[]{"d", "e", "f"});
            put('4', new String[]{"g", "h", "i"});
            put('5', new String[]{"j", "k", "l"});
            put('6', new String[]{"m", "n", "o"});
            put('7', new String[]{"p", "q", "r", "s"});
            put('8', new String[]{"t", "u", "v"});
            put('9', new String[]{"w", "x", "y", "z"});
        }};

        //定义一个队列来存储所有的组合结果
        Queue<String> queue = new LinkedList<>();
        //遍历Digits，取到对应号码对应的字母数组
        for (int i = 0; i < digits.length(); i++) {
            queue_letterCombinations(queue, map.get(digits.charAt(i)));
        }
        //要求返回List
        for (String s : queue) {
            combinations.add(s);
        }
        return combinations;
    }

    private Queue<String> queue_letterCombinations(Queue<String> queue, String[] letters) {
        //Queue<String> queue = new LinkedList<String>();
        //初始定义的queue一定是空的，所以这时候把第一个号码的字母放入队列
        if (queue.size() == 0) {
            for (String letter : letters) {
                queue.add(letter);
            }
        } else {
            //对于后面到来字母，把queue出队列然后拼接以后进入队列
        int queueLength = queue.size(); //记录本次需要进行出列组合的元素数量
        for (int i = 0; i < queueLength; i++) {
            String s = queue.poll();    //队列头元素出队列
            for (String letter : letters) {
                queue.add(s + letter);  //将出来的队列元素和电话号码对应的字母依次进行拼接并添加进队列
            }
          }
        }
        return queue;
    }
    // private List<String> ans = new ArrayList<>();
    // private Map<Character, char[]> charToCharMap;
    // private int deep;
    // public List<String> letterCombinations(String digits) {
    //     if(digits == null || digits.length() == 0){
    //         return ans;
    //     }

    //     this.deep = digits.length();

    //     initcharToCharMap();

    //     helper(new StringBuilder(), digits, 0);

    //     return ans;
    // }

    // private void initcharToCharMap(){
    //     charToCharMap = new HashMap<>();
    //     charToCharMap.put('2', new char[]{'a', 'b', 'c'});
    //     charToCharMap.put('3', new char[]{'d', 'e', 'f'});
    //     charToCharMap.put('4', new char[]{'g', 'h', 'i'});
    //     charToCharMap.put('5', new char[]{'j', 'k', 'l'});
    //     charToCharMap.put('6', new char[]{'m', 'n', 'o'});
    //     charToCharMap.put('7', new char[]{'p', 'q', 'r', 's'});
    //     charToCharMap.put('8', new char[]{'t', 'u', 'v'});
    //     charToCharMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    // }

    // private void helper(StringBuilder builder, String digits, int index){
    //     if(index == deep){
    //         ans.add(builder.toString());
    //         return;
    //     }

    //     char[] arr = charToCharMap.get(digits.charAt(index));
    //     for(char c: arr){
    //         builder.append(c);
    //         helper(builder, digits, index+1);
    //         builder.deleteCharAt(builder.length()-1);
    //     }
    // }
}
