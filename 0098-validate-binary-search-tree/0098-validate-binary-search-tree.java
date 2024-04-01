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
        if(root == null ){
            return true;
        }
        if(root.left != null){
            TreeNode left = root.left;
            if (root.val < left.val)
            {
                return false;
            }
        }
        if(root.right != null){
            TreeNode right = root.right;
            if (root.val >- right.val)
            {
                return false;
            }
        }
        isValidBST(root.left);
        isValidBST(root.right);
        return true;
    }
}