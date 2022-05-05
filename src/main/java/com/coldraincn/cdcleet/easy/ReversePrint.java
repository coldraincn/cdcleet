package com.coldraincn.cdcleet.easy;
/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

 

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
 */
public class ReversePrint {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode cur = head;
        ListNode last = null;
        while(cur != null){
            len++;
            ListNode next = cur.next;
            cur.next = last;
            last = cur;
            cur = next;
            
        }
        int[] result = new int[len];
        int i = 0;
        while(last != null){
            result[i] = last.val;
        }
        return result;

    }
}
