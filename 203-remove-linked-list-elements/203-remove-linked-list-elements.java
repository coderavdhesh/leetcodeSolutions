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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode node = new ListNode(0, head);
        ListNode cur = head;
        ListNode prev = node;
        
        while(cur != null)
        {
            if(cur.val == val)
                prev.next = cur.next;
            else
                prev = cur;
            
            cur = cur.next;
        }
        
        return node.next;
    }
}