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
    public int getDecimalValue(ListNode head) {
        
        ListNode head2 = reverse(head);
        ListNode cur = head2;
        int i = 0;
        int digit = 0;
        while(cur != null)
        {
            digit += (cur.val * Math.pow(2,i++) );
            cur = cur.next;
        }
        return digit;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode next = null;
        ListNode previous = null;
        
        while( curr != null )
        {
            next = curr.next ;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        
        return previous;
    }
}