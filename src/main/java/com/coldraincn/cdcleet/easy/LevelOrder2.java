package com.coldraincn.cdcleet.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

[
  [3],
  [9,20],
  [15,7]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LevelOrder2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
     TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> qu = new LinkedList<>();
      
        
        if(root == null){
            return result;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            List<Integer> inner = new ArrayList<>();
            for(int i = 0;i<len;i++){
                TreeNode tn = qu.poll();
                inner.add(tn.val);
                if(tn.left != null){
                    qu.offer(tn.left);
                }
                if(tn.right != null){
                    qu.offer(tn.right);
                }
            }
            result.add(inner);
        }

        return result;
    }
}
