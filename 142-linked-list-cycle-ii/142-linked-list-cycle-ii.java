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
        ListNode cur = head;
        
        while(cur != null)
        {
            if( !map.containsKey(cur) )
            {
                map.put(cur, index);
                index++;
                cur = cur.next;
            }
            else
                return cur;
        }
        
        return null;
    }
}