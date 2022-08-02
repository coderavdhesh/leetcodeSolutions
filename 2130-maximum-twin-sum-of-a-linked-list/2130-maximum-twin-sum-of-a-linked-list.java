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
    public int pairSum(ListNode head) {
        
        int[] arr = new int[length(head)];
        
        ListNode cur = head;
        int i =0;
        
        while( cur != null )
        {
            arr[i++] = cur.val;
            cur = cur.next;
        }
        
        int j= 0;
        int k = arr.length-1;
        int max = 0;
        
        while( j< k)
        {
            max = Math.max(max, arr[j]+arr[k] );
            j++;
            k--;
        }
        return max;
    }
    
    public int length(ListNode head)
    {
        int len =0;
        while( head!= null)
        {
            len++;
            head = head.next;
        }
        return len;
    }
}