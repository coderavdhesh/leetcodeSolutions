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
    public ListNode swapNodes(ListNode head, int k) {
        
        int len = 0;
        ListNode cur = head;
        
        while(cur != null)
        {
            len++;
            cur =cur.next;
        }
        
        int[] arr = new int[len];
        
        cur = head;
        int l =0;
        
        while(cur != null)
        {
            arr[l++] = cur.val;
            cur = cur.next;
        }
        
        int temp = arr[k-1];
        arr[k-1] = arr[ len- k];
        arr[len -k] = temp;
        
        ListNode ansNode = new ListNode(-1);
        ListNode curNode = ansNode;
        
        for(int n : arr)
        {
            curNode.next = new ListNode(n);
            curNode =curNode.next;
        }
        
        return ansNode.next;
    }
}