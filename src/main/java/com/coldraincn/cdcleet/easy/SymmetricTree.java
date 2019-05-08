package com.coldraincn.cdcleet.easy;
/**
 * 给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3

 */
public class SymmetricTree{
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
          if(root==null){
              return true;
          }
          return leftAndRight(root.left,root.right);
        
    }
    private boolean leftAndRight(TreeNode left,TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if ((left.val == right.val) && leftAndRight(left.left, right.right) && leftAndRight(left.right, right.left)) {
            return true;
        }
        return false;
    }
}