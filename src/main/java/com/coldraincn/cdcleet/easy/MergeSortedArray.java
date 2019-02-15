package com.coldraincn.cdcleet.easy;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,7,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 */
public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;//nums1
        int j = 0;//nums2
        while(i<m){
            if(nums1[i]<=nums2[j]){
                i++;
            }else{
                int temp = nums1[i];
                nums1[i] = nums2[j];
                for(int z = 1;z<n;z++){
                     if(temp>nums2[z]){
                         nums2[z-1]=nums2[z];
                     }else{
                         nums2[z]=temp;
                         break;
                     }
                }
                
            }
        }
        for(int o = i;o<nums2.length;o++){
            nums1[o+i] = nums2[o];
        }
        
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,7,0,0,0};
        int[] nums2 = {2,5,6};
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1,nums1.length,nums2,nums2.length);
        for(int i = 0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }
    }
}    