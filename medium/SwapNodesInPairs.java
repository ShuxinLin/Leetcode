// Swap Nodes in Pairs
// https://oj.leetcode.com/problems/swap-nodes-in-pairs/
public class Solution {
    public ListNode swapPairs(ListNode head) {
         if (head == null || head.next == null) return head;
         
         ListNode next = head.next;
         
         head.next = next.next;
         next.next = head;
         head = next;
         
         head.next.next = swapPairs(head.next.next);
         return head;
    }
}