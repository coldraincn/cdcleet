package com.coldraincn.cdcleet.easy;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode resultNode=new ListNode(0);
        ListNode head=resultNode;
        
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                resultNode.next=l2;
                l2=l2.next;
               
            }else{
                resultNode.next=l1;
                l1=l1.next;
            }
            resultNode=resultNode.next;
        }
        if(l1==null){
            resultNode.next=l2;
        }else if(l2==null){
            resultNode.next=l1;
        }
        return head.next;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args){
        System.out.println("result.val");
        MergeTwoSortedLists mtsl=new MergeTwoSortedLists();
        ListNode node1=mtsl.new ListNode(1);
        node1.next=mtsl.new ListNode(2);
        node1.next.next=mtsl.new ListNode(4);

        ListNode node2=mtsl.new ListNode(1);
        node2.next=mtsl.new ListNode(3);
        node2.next.next=mtsl.new ListNode(4);

        ListNode result=mtsl.mergeTwoLists(node1, node2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}