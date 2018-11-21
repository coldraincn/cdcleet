package com.coldraincn.cdcleet.easy;
/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesfromSortedList{
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
       ListNode result=head;
 
       while(head!=null){
           while(head.next!=null&&head.val==head.next.val){
                head.next=head.next.next;
           }
           head=head.next;

       }
       return result;
    }
    public static void main(String[] args){
        RemoveDuplicatesfromSortedList  rdfsl=new RemoveDuplicatesfromSortedList();
        ListNode node1=rdfsl.new ListNode(1);
        ListNode node2=rdfsl.new ListNode(1);
        ListNode node3=rdfsl.new ListNode(2);
        node1.next=node2;
        node2.next=node3;
        ListNode result=rdfsl.deleteDuplicates(node1);
    }
}