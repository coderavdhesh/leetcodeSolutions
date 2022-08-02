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
        
        ListNode ansNode = new ListNode(0);
        ListNode ans = ansNode;
        
        ListNode cur = head;
        int sum =0;
        
        while( cur != null )
        {
            if(cur.val == 0)
            {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            }
            else
            {
                sum += cur.val;
            }
            cur = cur.next;
        }
        return ansNode.next.next;
    }
}