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
    public int maxDepth(TreeNode root) {
        return getMaxDepth( root,0,0);
    }
    int getMaxDepth(TreeNode root,int height,int totalHeight){
        if(root==null){
            if(height>totalHeight){
                return height;
            }
            return totalHeight;
        }
        height++;
        totalHeight = getMaxDepth( root.left, height, totalHeight);
        totalHeight = getMaxDepth( root.right, height, totalHeight);
        return totalHeight;
    }
}
