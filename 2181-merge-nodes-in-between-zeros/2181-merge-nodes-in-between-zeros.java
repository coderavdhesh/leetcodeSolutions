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
    public ListNode mergeNodes(ListNode head) {
        
        
        ListNode cur = head;
        ListNode prev= head;
        int sum =0;
        
        while( cur != null )
        {
            if(cur.val == 0 && cur != prev)
            {
                prev.val = sum;
                
                if(cur.next == null)
                    prev.next = null;
                else
                    prev.next = cur;
                
                prev = cur;
                sum = 0;
            }
            else
            {
                sum += cur.val;
            }
            cur = cur.next;
        }
        return head;
    }
}