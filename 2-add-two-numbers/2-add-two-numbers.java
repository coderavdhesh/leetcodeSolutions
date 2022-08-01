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
        
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        int carry = 0;
        
        ListNode ansNode = new ListNode(0);
        ListNode ans = ansNode;
        
        while( cur1 != null && cur2 != null )
        {
            int num = (cur1.val +cur2.val) + carry;
            
            if(num > 9)
            {
                ans.next = new ListNode(num%10);
                carry = num/10;
                ans = ans.next;
            }
            else
            {
                ans.next = new ListNode(num);
                carry = 0;
                ans = ans.next;
            }
            
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        
       
    
        while(cur1 != null)
        {
            int n = cur1.val +carry;
            if(n>9)
            {
                ans.next = new ListNode(n%10);
                ans =ans.next;
                carry = n/10;
            }
            else
            {
                ans.next = new ListNode(n);
                carry = 0;
                ans = ans.next;
            }
            cur1 = cur1.next;
        }
        
        while(cur2 != null)
        {
            int n = cur2.val +carry;
            if(n>9)
            {
                ans.next = new ListNode(n%10);
                ans =ans.next;
                carry = n/10;
            }
            else
            {
                ans.next = new ListNode(n);
                carry = 0;
                ans = ans.next;
            }
            cur2 = cur2.next;
        }
        
        if(carry != 0)
           ans.next = new ListNode(carry);
        
        ansNode = ansNode.next;
        return ansNode;
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}