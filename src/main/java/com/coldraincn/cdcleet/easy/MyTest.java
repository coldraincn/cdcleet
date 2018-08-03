package com.coldraincn.cdcleet.easy;

public class MyTest{
    public void test(int[] a){
        for(int i=0;i<a.length;i++){
            if(i==2){
                i=i+1;
            }
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        MyTest myTest=new MyTest();
        int[] a={1,2,3,4,5};
        myTest.test(a);
        //System.out.println(myTest);
    }
}