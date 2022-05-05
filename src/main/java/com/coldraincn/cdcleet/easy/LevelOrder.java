package com.coldraincn.cdcleet.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.namespace.QName;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回：

[3,9,20,15,7]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LevelOrder {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
         TreeNode(int x) { val = x; }
        }
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null){
            return new int[]{};
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            TreeNode node = qu.poll();
            result.add(node.val);
            if(node.left != null){
                qu.offer(node.left);
            }
            if(node.right != null){
                qu.offer(node.right);
            }
        }
        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;

    }
}
