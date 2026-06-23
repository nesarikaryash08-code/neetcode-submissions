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

    int maxDistance =0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        maxHieght( root,-1);
        return maxDistance;
    }
    int maxHieght(TreeNode root,int totalDistance){
        totalDistance++;
        int left = 0;
        int right = 0;
        int temp = 0;
        if(root.left!=null){
             left = maxHieght( root.left,0);
        }
        if(root.right!=null){
             right = maxHieght( root.right,0);
        }
        if(left>right)temp = left;else temp=right;
        if(left+right>maxDistance)maxDistance = left+right;
        return totalDistance+temp;
    }
}
