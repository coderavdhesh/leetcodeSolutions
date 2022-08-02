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
    public ListNode partition(ListNode head, int x) {
        
        ListNode ansNode = new ListNode(0);
        ListNode ans = ansNode;
        
        ListNode cur = head;
        
        while(cur != null)
        {
            if(cur.val < x)
            {
                ans.next = new ListNode(cur.val);
                ans = ans.next;
            }
            
            cur = cur.next;
        }
        cur = head;
        while(cur != null)
        {
            if(cur.val >= x)
            {
                ans.next = new ListNode(cur.val);
                ans = ans.next;
            }
            
            cur = cur.next;
        }
        
        return ansNode.next;
    }
}