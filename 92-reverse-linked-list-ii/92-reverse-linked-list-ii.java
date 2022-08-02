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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head.next == null)
            return head;
        // if(left == 1 )
        
    
        ListNode deteched_Node = head;
        ListNode prev = null;
        
        while( right > 0)
        {
            prev = deteched_Node;
            deteched_Node = deteched_Node.next;
            right--;
        }
        
        prev.next = null;
        
        ListNode rev_node = head;
        ListNode rev_prev = null;
        
        while(left > 1)
        {
            rev_prev = rev_node;
            rev_node = rev_node.next;
            left--;
        }
        
        ListNode rev = reverse(rev_node);
        if(rev_prev!=null)
            rev_prev.next = rev;
        else
            head = rev;
        rev_node.next = deteched_Node;
        
        return head;
    
    }
    
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        
        while( cur!=null)
        {
            next = cur.next;
            cur.next = prev;
            prev =cur;
            cur =next;
        }
        return prev;
    }
}