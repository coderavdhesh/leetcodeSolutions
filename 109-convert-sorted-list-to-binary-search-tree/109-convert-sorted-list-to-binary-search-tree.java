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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        int len = length(head);
        int[] arr = new int[len];
        ListToArray(head, arr, 0);
        
        return ArrayToBST(arr, 0, len-1);
        
    }
    
    public int length(ListNode node){
        
        if(node == null) return 0;
        
        ListNode cur = node;
        int count = 0;
        
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    
    public void ListToArray(ListNode node, int[] arr, int idx){
        if(node == null)
            return;
        
        ListNode cur = node;
        
        while(cur != null){
            arr[idx++] = cur.val;
            cur = cur.next;
        }
    }
    
    public TreeNode ArrayToBST(int[] arr, int start, int last){
        if(start > last)
            return null;
        
        int mid = last + (start - last)/2;
        TreeNode tree = new TreeNode(arr[mid]);
        
        tree.left = ArrayToBST(arr, start, mid-1);
        tree.right = ArrayToBST(arr, mid+1, last);
        
        return tree;
    }
}