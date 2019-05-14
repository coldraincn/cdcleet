package com.coldraincn.cdcleet.easy;
/**
 * 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
]
 */
public class BTLPT{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
   }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
           
        List<List<Integer>> btlptList = new LinkedList<List<Integer>>();
        AddLevel(btlptList,root,0);
        return btlptList;
      
        
    }
    private void AddLevel(List<List<Integer>> list, TreeNode root, int level){
        if(root == null) return;
        if(level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        AddLevel(list, root.left, level+1);
        AddLevel(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }

}