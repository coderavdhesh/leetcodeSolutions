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
    public ListNode detectCycle(ListNode head) {
        
        HashMap<ListNode, Integer> map = new HashMap<>();
        
        int index = 0;
        
        while(true)
        {
            if(head == null)
                return null;
            
            if( !map.containsKey(head) )
            {
                map.put(head, index);
                index++;
                head = head.next;
            }
            else
                return head;
        }
    }
}