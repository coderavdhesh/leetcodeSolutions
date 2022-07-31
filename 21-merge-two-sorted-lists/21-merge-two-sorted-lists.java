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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        while(list1 != null)
        {
            heap.offer(list1.val);
            list1 = list1.next;
        }
        while(list2 != null)
        {
            heap.offer(list2.val);
            list2 = list2.next;
        }
        
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
    
        while(!heap.isEmpty())
        {
            curr.next = new ListNode(heap.poll());
            curr = curr.next;
        }
        ans = ans.next;
        
        return ans;
    }
}