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
    public int pairSum(ListNode head) {

        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        
        while( slow!=null )
        {
            max = Math.max(max, slow.val+fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        
        return max;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
}