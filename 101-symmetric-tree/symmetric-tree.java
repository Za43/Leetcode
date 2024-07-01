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
    public boolean isSymmetric(TreeNode root) {
        return subTreeSym(root.left, root.right);
    }

    public boolean subTreeSym(TreeNode lefty, TreeNode righty){
        if (lefty == null || righty == null){
            if (lefty == null && righty == null){
                return true;
            }
            return false;
        }
        return ((lefty.val == righty.val) && subTreeSym(lefty.left, righty.right) && subTreeSym(lefty.right, righty.left));
    }
}