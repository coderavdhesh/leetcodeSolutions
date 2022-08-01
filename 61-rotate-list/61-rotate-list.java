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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
            return null;
        
        ListNode curr = head;
        int len = 1;
        
        while( curr.next != null)
        {
            len++;
            curr = curr.next;
        }
        
        curr.next = head;
        int rotation = len - k%len;// actual rotations
        
        ListNode curHead = head;
        
        while(rotation > 1)
        {
            curHead = curHead.next;
            rotation--;
        }
        
        ListNode ans = curHead.next;
        curHead.next = null;
        
        return ans;
    }
}