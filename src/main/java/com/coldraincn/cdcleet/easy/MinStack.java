package com.coldraincn.cdcleet.easy;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * 
 * push(x) -- 将元素 x 推入栈中。 pop() -- 删除栈顶的元素。 top() -- 获取栈顶元素。 getMin() --
 * 检索栈中的最小元素。 示例:
 * 
 * MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); --> 返回 -3. minStack.pop();
 * minStack.top(); --> 返回 0. minStack.getMin(); --> 返回 -2.
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinStack {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    ListNode header;
    ListNode min;
    /** initialize your data structure here. */
    public MinStack() {
        
    }

    public void push(int x) {
        if(header==null){
            header=new ListNode(x);
            min=header;
        }else{
            ListNode theNumber = new ListNode(x);
            theNumber.next=header;
            header=theNumber;
            if(x<=min.val){
                min=theNumber;
            }
        }
    }

    public void pop() {
        if(header==null){
            return;
        }
        ListNode pop = header;
        
        header=pop.next;

        if(min.val==pop.val){
            ListNode a = header;
            ListNode remin=header;
            while(a!=null){
                if(a.next!=null&&a.next.val<remin.val){
                    remin=a.next;
                }
                a=a.next;
            }
            min=remin;
        }
        pop=null;
    }

    public int top() {
        return header.val;
    }

    public int getMin() {
        return min.val;
    }

    public static void main(String ...args){
        MinStack minStack = new MinStack(); 
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        //System.out.println(min);
        minStack.pop();
        int top = minStack.top(); 
        System.out.println(top);
        int nextmin=minStack.getMin();
        System.out.println(nextmin);
    }
}