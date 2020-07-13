package com.coldraincn.cdcleet.test;

import java.util.ArrayList;
import java.util.List;

public class test{ 
	public static void greet(String word){ 		
		word="Hey!"; 
		System.out.print(word+":");
    }
    public class Parent{
        public void greet(){
            System.out.print("P");
        }
    }
    
    public class Son extends Parent{
        public void greet(){
            System.out.print("S");
        }
    }
	public static void main(String[] args){
        test t = new test();
        List<Parent> list = new ArrayList<Parent>();
		Parent p = t.new Son();
		list.add(p);
		list.get(0).greet();
		//System.out.print(word);
	}
}