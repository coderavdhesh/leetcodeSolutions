/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null)
            return null;
        
        ListNode curr = head;
        
        while( curr != null)
        {
            int data = curr.val;
            
            if(curr.next != null)
            {
                curr.val = curr.next.val;
                curr = curr.next;
            }
            
            curr.val = data;
            
            curr = curr.next;
        }
        
        return head;
    }
}