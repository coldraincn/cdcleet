package com.coldraincn.cdcleet.medium;
import java.util.HashMap;
/**]
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

进阶：你能尝试使用一趟扫描实现吗？

 

示例 1：


输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]
示例 2：

输入：head = [1], n = 1
输出：[]
示例 3：

输入：head = [1,2], n = 1
输出：[1]
 

提示：

链表中结点的数目为 sz
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class RemoveNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        var hash = new HashMap<Integer,ListNode>();
        ListNode now = head;
        int i = 0;
        while(now != null){
            hash.put(i, now);
            i++;
            now = now.next;
        }
        int deleteIndex = i - n;
        
        if(deleteIndex == 0){
            ListNode de = head;
            head =  head.next;
            de = null;
            
        }else if(deleteIndex == i - 1){
            ListNode de = hash.get(deleteIndex);
            de = null;
        }else{
            ListNode de = hash.get(deleteIndex);
            ListNode last = hash.get(deleteIndex - 1);
            ListNode next = hash.get(deleteIndex + 1);
            last.next = next;
            de = null;
        }
       return head;
    }
}