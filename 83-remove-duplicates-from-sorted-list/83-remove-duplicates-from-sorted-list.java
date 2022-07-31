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
    public ListNode deleteDuplicates(ListNode head) {
        
        if( head == null )
            return null;
        
        ListNode curr = head;
        // ListNode prev = head;
        
        while(curr.next != null)
        {
            if( curr.val == curr.next.val)
            {
                // prev.next = curr.next;
                curr.next = curr.next.next;
            }
            else
            {
                // prev = curr;
                curr = curr.next;
            }
        }
        
        return head;
    }
}