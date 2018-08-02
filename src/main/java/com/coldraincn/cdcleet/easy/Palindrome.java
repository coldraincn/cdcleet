package com.coldraincn.cdcleet.easy;

public class Palindrome{
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int number=x;
        int sum=0;
        while(number!=0){
            int temp=number%10;
            sum=sum*10+temp;
            number=number/10;
        }
        
        return sum==x;
    }
    public static void main(String[] args){
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.isPalindrome(1232));
    }
}