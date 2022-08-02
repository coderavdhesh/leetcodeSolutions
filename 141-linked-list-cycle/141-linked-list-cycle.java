/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> container = new HashSet<>();
        
        ListNode dummy = head;
        
        while(dummy != null)
        {
            if( !container.contains(dummy) )
                container.add(dummy);
            else
                return true;
            
            dummy = dummy.next;
        }
        
        return false;
        
    }
}