package com.coldraincn.cdcleet.easy;

import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 输入: 3
输出: [1,3,3,1]
 */
public class PascalTriangleTwo{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                ret.set(j, ret.get(j) + ret.get(j-1));
            }
            ret.add(1);
        }
        return ret;
    }
}