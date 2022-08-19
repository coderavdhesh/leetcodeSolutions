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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        counting(root, map);
        
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int key : map.keySet()){
            if( map.get(key) == max)
                list.add(key);
        }
        
        int[] arr = new int[list.size()];
        
        for(int i =0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
    
    public void counting(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null)
            return;
        
        map.put(root.val, map.get(root.val)== null ? 1 : map.get(root.val)+1);
        
        counting(root.left, map);
        counting(root.right, map);
    }
    
}