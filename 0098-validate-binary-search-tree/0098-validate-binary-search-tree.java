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
    public boolean isValidBST(TreeNode root) {
               return  helper(root,null,null);
    }
    public boolean helper(TreeNode node, Integer minVal, Integer maxVal){
        if(node == null ){
            return true;
        }
        if(maxVal!=null && node.val>=maxVal){
            return false;
        }

        if(minVal!=null && node.val<=minVal) {
            return false;
        }

        boolean left = helper(node.left, minVal, node.val);
        boolean right = helper(node.right, node.val, maxVal);
        return left && right;
    }
}