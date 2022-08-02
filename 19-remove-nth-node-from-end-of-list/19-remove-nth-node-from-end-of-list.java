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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        
        if( len == n)
            return head.next;
        
        ListNode curr = head;
        while( len-n > 1)
        {
            curr = curr.next;
            len--;
        }
        
        curr.next = curr.next.next;
        
        return head;
    }
    
    public int length(ListNode head){
        ListNode node = head;
        int len =0;
        while (node!= null)
        {
            len++;
            node = node.next;
        }
        return len;
    }
}