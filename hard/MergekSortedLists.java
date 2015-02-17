// Merge k Sorted Lists
// https://oj.leetcode.com/problems/merge-k-sorted-lists/
public class Solution {
    public static class MyComparator implements Comparator<ListNode> {
        public int compare(ListNode n1, ListNode n2){
            return n1.val - n2.val;
        }
    }
    
    // Merge k Sorted Lists
    // http://leetcode.com/onlinejudge#question_23
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.isEmpty()) return null;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(), new MyComparator());
        for(ListNode n : lists)
            if (n != null) pq.add(n);
            
        ListNode head = null, prev = null;
        
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            
            if (node.next != null) pq.offer(node.next);
            
            if (head == null) head = node;
            else prev.next = node;
            
            prev = node;
        }
        
        return head;
    }
}