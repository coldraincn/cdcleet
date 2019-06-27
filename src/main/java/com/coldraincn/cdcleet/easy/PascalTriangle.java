package com.coldraincn.cdcleet.easy;

import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class PascalTriangle{
    public List<List<Integer>> generate(int numRows) {
 
        List<List<Integer>> outerList = new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer>  innerList = new ArrayList<>(i+1);
            for(int j = 0;j<=i;j++){
                int nowNum;
                if(j==0||j==i){
                    nowNum=1;
                }else{
                    int lastRight = outerList.get(i-1).get(j-1);
                    int lastLeft = outerList.get(i-1).get(j);
                    nowNum = lastRight+lastLeft;
                }
                
                innerList.add(nowNum);
            }
            outerList.add(innerList);
        }
        return outerList;
        

    }
    public static void main(String[] args) {
        
    } 
}