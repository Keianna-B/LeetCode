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
    public boolean helper(TreeNode node, TreeNode minimum, TreeNode maximum){
        if(node == null ){
            return true;
        }
        if(maximum!=null && node.val>=maximum.val){
            return false;
        }

        if(minimum!=null && node.val<=minimum.val) {
            return false;
        }
        return helper(node.left, minimum, node) && helper(node.right, node, maximum);
    }
}