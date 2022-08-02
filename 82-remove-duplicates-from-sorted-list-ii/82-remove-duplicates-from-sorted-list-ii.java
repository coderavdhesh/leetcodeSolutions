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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
            return null;
        
        HashSet<Integer> duplicates = new HashSet<>();
        
        ListNode cur = head;
        while(cur.next != null)
        {
            if(cur.val == cur.next.val)
            {
                duplicates.add(cur.val);
                cur.next = cur.next.next;
            }
            else
            {
                cur = cur.next;
            }
        }
        
        
        System.out.print(duplicates);
    
        while(head != null && duplicates.contains(head.val))
        {
            head = head.next;
        }
        
        if(head == null)
            return null;
        
        cur = head;
        
        while( cur.next != null)
        {
            if(duplicates.contains(cur.next.val))
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}