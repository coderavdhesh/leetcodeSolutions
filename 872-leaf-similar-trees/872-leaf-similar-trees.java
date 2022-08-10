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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        tree1(root1,list1);
        tree1(root2, list2);
        
        return list2.equals(list1);
    }
    public void tree1(TreeNode tree, ArrayList<Integer> list){
        
        if( tree == null )
            return;
        
        tree1(tree.left, list);
        tree1(tree.right, list);
        
        if( tree.left == null && tree.right == null)
            list.add(tree.val);
    }
}