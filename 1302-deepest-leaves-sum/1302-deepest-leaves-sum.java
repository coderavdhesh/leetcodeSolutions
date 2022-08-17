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
    public int deepestLeavesSum(TreeNode root) {
        
        int dpth = depth(root);
        ArrayList<Integer> list = new ArrayList<>();
        levelSum(root, 1, dpth,list);
        int sum = 0;
        
        for( int i =0 ; i< list.size(); i++){
            sum += list.get(i);
        }
        
        return sum;
    }
    public void levelSum(TreeNode root,int curLevel, int dpth, ArrayList<Integer> list){
        
        if(root == null)
            return;
        
        if( curLevel == dpth)
        {
            list.add(root.val);
        }
        
        levelSum(root.left,curLevel+1, dpth, list);
        levelSum(root.right,curLevel+1, dpth, list);
        
    }
    public int depth(TreeNode tree){
        if(tree == null)
            return 0;
        
        int l = depth(tree.left);
        int r = depth(tree.right);
        
        return 1+ Math.max(l,r);
    }
}