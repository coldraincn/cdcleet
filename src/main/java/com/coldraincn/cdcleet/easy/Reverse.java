package com.coldraincn.cdcleet.easy;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123 输出: 321 示例 2:
 * 
 * 输入: -123 输出: -321 示例 3:
 * 
 * 输入: 120 输出: 21 注意:
 * 
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31, 2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */

public class Reverse {
    public int reverse(int x) {

        int length;
        int number = x;
        int sum = 0;
        int temp = 0;
        if (x >= 0) {
            length = String.valueOf(x).length();
        } else {
            length = String.valueOf(x).length() - 1;
        }

        for (int i = 0; i < length; i++) {
            temp = number % 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && temp > 7))
                return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && temp < -8))
                return 0;
            sum = sum * (int) Math.pow(10, 1) + temp;

            number = number / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(-123));
    }

}