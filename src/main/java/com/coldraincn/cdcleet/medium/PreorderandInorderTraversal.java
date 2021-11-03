package com.coldraincn.cdcleet.medium;
/**
 * 给定一棵树的前序遍历 preorder 与中序遍历  inorder。请构造二叉树并返回其根节点。

 

示例 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
示例 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 

提示:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder 和 inorder 均无重复元素
inorder 均出现在 preorder
preorder 保证为二叉树的前序遍历序列
inorder 保证为二叉树的中序遍历序列

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import com.coldraincn.cdcleet.easy.BTLOT.TreeNode;

public class PreorderandInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recur(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode recur(int[] preoder,int preLeft,int preRight,int[] inorder,int intLeft,int intRight){
        if(intLeft>intRight){
            return null;
        }
 
        TreeNode  mid = new TreeNode(preoder[preLeft]);
        int intCur = -1;
        for(int i = intLeft;i<=intRight;i++){
            if(preoder[preLeft] == inorder[i]){
                intCur = i;
                break;
            }
        }
        int halfLengh = intCur - intLeft;
        mid.left = recur(preoder, preLeft+1, preRight+halfLengh, inorder, intLeft, intCur-1);
        mid.right = recur(preoder, preLeft+halfLengh+1, preRight, inorder, intCur+1, intRight);
        return mid;
    }
}
