package com.coldraincn.cdcleet.easy;

class ReverseLinkedList{
     public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
     }
    public ListNode ReverseLinkedList(ListNode head){
        ListNode last  = null;
        ListNode current = head;
        while (current!=null){
            ListNode next = current.next;
            current.next = last;
            last = current;
            current=next;
            

        }
        return last;
    }
}