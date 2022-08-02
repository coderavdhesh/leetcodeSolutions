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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode rev_l1 = reverse(l1);
        ListNode rev_l2 = reverse(l2);
        
        int carry = 0;
        int sum =0;
        
        ListNode ansNode = new ListNode(0);
        ListNode ans_cur = ansNode;
        
        while( rev_l1 != null || rev_l2!= null || carry > 0)
        {
            sum = 0;
            if(rev_l1 != null)
            {
                sum += rev_l1.val;
                rev_l1 = rev_l1.next;
            }
            if(rev_l2 != null)
            {
                sum += rev_l2.val;
                rev_l2 = rev_l2.next;
            }
            sum += carry;
            
            ans_cur.next = new ListNode(sum%10);
            ans_cur = ans_cur.next;
            carry = sum/10;
        }
        return reverse(ansNode.next);
    }
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(cur != null)
        {
            next =cur.next;
            cur.next = prev;
            prev = cur;
            cur =next;
        }
        return prev;
    }
}