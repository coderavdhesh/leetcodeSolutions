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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        
        
        ListNode prev = null;
        ListNode curr = list1;
        
        ListNode lastNode_list2 = list2;
        while(  lastNode_list2.next != null )
             lastNode_list2 = lastNode_list2.next;
        
        int index = 0; // i'th node
        
        while( index != b) 
        {
            if( index != a && prev != list2)
                prev = curr;
            else
                prev.next = list2;

            curr = curr.next;
            index++;
        }
        
        if(a == b)
        {
            prev.next = list2;
            lastNode_list2.next = curr.next;
        }
        else
            lastNode_list2.next = curr.next;
        
        return list1;
    }
}